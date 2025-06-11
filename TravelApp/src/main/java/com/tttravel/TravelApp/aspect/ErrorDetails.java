package com.tttravel.TravelApp.aspect;

import java.time.LocalDateTime;

public class ErrorDetails {
	private String msg;
	private LocalDateTime datetime;
	public ErrorDetails(String msg, LocalDateTime datetime) {
		super();
		this.msg = msg;
		this.datetime = datetime;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	@Override
	public String toString() {
		return "ErrorDetails [msg=" + msg + ", datetime=" + datetime + "]";
	}
}
