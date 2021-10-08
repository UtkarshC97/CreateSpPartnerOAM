package com.fedpartner.model;

public class ApplicationError {
	private String status;
	private String message;
	public ApplicationError() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApplicationError(String status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ApplicationError [status=" + status + ", message=" + message + "]";
	}

	

}
