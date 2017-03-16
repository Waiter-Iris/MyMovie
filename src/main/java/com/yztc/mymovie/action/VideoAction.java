package com.yztc.mymovie.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.omg.PortableInterceptor.SUCCESSFUL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.yztc.mymovie.entity.Users;
import com.yztc.mymovie.entity.Video;
import com.yztc.mymovie.entity.Vtype;
import com.yztc.mymovie.service.VideoService;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.beans.*;
import java.util.Random;

@Controller
@Scope("prototype")
public class VideoAction extends ActionSupport {
	@Autowired
	VideoService videoService;

	private File video;
	private String videoContentType;// 封装上传文件类型
	private String videoFileName;// 封装上传文件名

	public File getVideo() {
		return video;
	}

	public void setVideo(File video) {
		this.video = video;
	}

	public String getVideoContentType() {
		return videoContentType;
	}

	public void setVideoContentType(String videoContentType) {
		this.videoContentType = videoContentType;
	}

	public String getVideoFileName() {
		return videoFileName;
	}

	public void setVideoFileName(String videoFileName) {
		this.videoFileName = videoFileName;
	}

	/*public class ProgressMonitorDemo extends JPanel implements ActionListener,
			PropertyChangeListener {
		private ProgressMonitor progressMonitor;
		private JButton startButton;
		private JTextArea taskOutput;
		private Task task;

		class Task extends SwingWorker<Void, Void> {
			@Override
			public Void doInBackground() {
				Random random = new Random();
				int progress = 0;
				setProgress(0);
				try {
					Thread.sleep(1000);
					while (progress < 100 && !isCancelled()) {
						// Sleep for up to one second.
						Thread.sleep(random.nextInt(1000));
						// Make random progress.
						progress += random.nextInt(10);
						setProgress(Math.min(progress, 100));
					}
				} catch (InterruptedException ignore) {
				}
				return null;
			}

			@Override
			public void done() {
				Toolkit.getDefaultToolkit().beep();
				startButton.setEnabled(true);
				progressMonitor.setProgress(0);
			}
		}

		public ProgressMonitorDemo() {
			super(new BorderLayout());

			// Create the demo's UI.
			startButton = new JButton("Start");
			startButton.setActionCommand("start");
			startButton.addActionListener(this);

			taskOutput = new JTextArea(5, 20);
			taskOutput.setMargin(new Insets(5, 5, 5, 5));
			taskOutput.setEditable(false);

			add(startButton, BorderLayout.PAGE_START);
			add(new JScrollPane(taskOutput), BorderLayout.CENTER);
			setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		}

		*//**
		 * Invoked when the user presses the start button.
		 *//*
		public void actionPerformed(ActionEvent evt) {
			progressMonitor = new ProgressMonitor(ProgressMonitorDemo.this,
					"Running a Long Task", "", 0, 100);
			progressMonitor.setProgress(0);
			task = new Task();
			task.addPropertyChangeListener(this);
			task.execute();
			startButton.setEnabled(false);
		}

		*//**
		 * Invoked when task's progress property changes.
		 *//*
		public void propertyChange(PropertyChangeEvent evt) {
			if ("progress" == evt.getPropertyName()) {
				int progress = (Integer) evt.getNewValue();
				progressMonitor.setProgress(progress);
				String message = String.format("Completed %d%%.\n", progress);
				progressMonitor.setNote(message);
				taskOutput.append(message);
				if (progressMonitor.isCanceled() || task.isDone()) {
					Toolkit.getDefaultToolkit().beep();
					if (progressMonitor.isCanceled()) {
						task.cancel(true);
						taskOutput.append("Task canceled.\n");
					} else {
						taskOutput.append("Task completed.\n");
					}
					startButton.setEnabled(true);
				}
			}

		}

		*//**
		 * Create the GUI and show it. For thread safety, this method should be
		 * invoked from the event-dispatching thread.
		 *//*
		private void createAndShowGUI() {
			// Create and set up the window.
			JFrame frame = new JFrame("ProgressMonitorDemo");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			// Create and set up the content pane.
			JComponent newContentPane = new ProgressMonitorDemo();
			newContentPane.setOpaque(true); // content panes must be opaque
			frame.setContentPane(newContentPane);

			// Display the window.
			frame.pack();
			frame.setVisible(true);
		}
*/
		public String uploadVideo() throws Exception {

			try {
				// 1 获取当前项目的文件路径
				ServletContext servletContext = ServletActionContext
						.getServletContext();
				String dir = servletContext.getRealPath("video/"
						+ videoFileName);
				System.out.println(dir + "============================");
				// 2 保存文件的地址
				FileOutputStream fos = new FileOutputStream(dir);
				// 3 读取文件上传
				FileInputStream fis = new FileInputStream(video);
				// 拷贝内容到新文件
				byte[] buffer = new byte[1024];
				int len = 0;
				while ((len = fis.read(buffer)) > 0) {
					fos.write(buffer, 0, len);
				}
				fos.flush();
				fos.close();
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
				return ERROR;
			}

			Video video = new Video();
			Users user = new Users();
			user.setUserId(new BigDecimal(1));
			video.setUsers(user);
			video.setVideoAddress("/MyMovie/video/" + videoFileName);
			video.setVideoDate(new Date());
			video.setVideoName(videoFileName);
			video.setVideoStatus(new BigDecimal(0));
			Vtype vtype = new Vtype();
			vtype.setVtypeId(new BigDecimal(1));
			video.setVtype(vtype);
			ServletContext sc = ServletActionContext.getServletContext();
			String basePath = sc.getRealPath("/video/" + videoFileName);

			/*javax.swing.SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					createAndShowGUI();
				}
			});*/

			videoService.save(video, basePath,
					"D:\\ffmpeg\\ffmpeg\\bin\\ffmpeg.exe");

			return SUCCESS;
		}

	}

