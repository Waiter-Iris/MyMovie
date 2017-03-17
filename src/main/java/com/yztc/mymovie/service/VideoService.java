package com.yztc.mymovie.service;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yztc.mymovie.dao.VideoDao;
import com.yztc.mymovie.entity.Video;

@Service("videoService")
public class VideoService extends HttpServlet {
	@Autowired
	private VideoDao videoDao;

	public boolean save(Video video, String veido_path, String ffmpeg_path) {
		// ��ͼ
		File file = new File(veido_path);
		if (!file.exists()) {
			System.err.println("·��[" + veido_path + "]��Ӧ����Ƶ�ļ�������!");
			return false;
		}
		List<String> commands = new java.util.ArrayList<String>();
		commands.add(ffmpeg_path);
		commands.add("-i");
		commands.add(veido_path);
		commands.add("-y");
		commands.add("-f");
		commands.add("image2");
		commands.add("-ss");
		commands.add("8");// ������������ý�ȡ��Ƶ������ʱ�Ļ���
		// commands.add("-t");
		// commands.add("0.001");
		commands.add("-s");
		commands.add("700x525");
		commands.add(veido_path.substring(0, veido_path.lastIndexOf("."))
				+ ".jpg");
		try {
			ProcessBuilder builder = new ProcessBuilder();
			builder.command(commands);
			builder.start();
			System.out.println("��ȡ�ɹ�");
			
			String vn=  video.getVideoName();
			String imgFileName = vn.substring(0,vn.lastIndexOf("."))+".jpg";
			System.out.println(imgFileName);
			// ��ӵ�video
			video.setVideoImg("/MyMovie/video/"+imgFileName);

			videoDao.save(video);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	

}
