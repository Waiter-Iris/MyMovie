package com.yztc.mymovie.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * History entity. @author MyEclipse Persistence Tools
 */

public class History implements java.io.Serializable {

	// Fields

	private BigDecimal historyId;
	private Video video;
	private Users users;
	private ManagerVideo managerVideo;
	private Date historyDate;
	private String historyPlaytime;
	private BigDecimal historyStatus;

	// Constructors

	/** default constructor */
	public History() {
	}

	/** full constructor */
	public History(Video video, Users users, ManagerVideo managerVideo,
			Date historyDate, String historyPlaytime, BigDecimal historyStatus) {
		this.video = video;
		this.users = users;
		this.managerVideo = managerVideo;
		this.historyDate = historyDate;
		this.historyPlaytime = historyPlaytime;
		this.historyStatus = historyStatus;
	}

	// Property accessors

	public BigDecimal getHistoryId() {
		return this.historyId;
	}

	public void setHistoryId(BigDecimal historyId) {
		this.historyId = historyId;
	}

	public Video getVideo() {
		return this.video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public ManagerVideo getManagerVideo() {
		return this.managerVideo;
	}

	public void setManagerVideo(ManagerVideo managerVideo) {
		this.managerVideo = managerVideo;
	}

	public Date getHistoryDate() {
		return this.historyDate;
	}

	public void setHistoryDate(Date historyDate) {
		this.historyDate = historyDate;
	}

	public String getHistoryPlaytime() {
		return this.historyPlaytime;
	}

	public void setHistoryPlaytime(String historyPlaytime) {
		this.historyPlaytime = historyPlaytime;
	}

	public BigDecimal getHistoryStatus() {
		return this.historyStatus;
	}

	public void setHistoryStatus(BigDecimal historyStatus) {
		this.historyStatus = historyStatus;
	}

}