package com.telidu.advice;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ErrorDetails {
	private String message;
	private LocalDateTime datetime;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	@Override
	public String toString() {
		return "ErrorDetails [message=" + message + ", datetime=" + datetime + "]";
	}
	public ErrorDetails(String message, LocalDateTime datetime) {
		super();
		this.message = message;
		this.datetime = datetime;
	}
	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
