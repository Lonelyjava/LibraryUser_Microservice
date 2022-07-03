package com.lib.user.demo.response;

public class ApiResponse {

	private String responseMessgae;
	private int responseCode;
	private boolean responseError;
	private Object data;

	public String getResponseMessgae() {
		return responseMessgae;
	}

	public void setResponseMessgae(String responseMessgae) {
		this.responseMessgae = responseMessgae;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public boolean isResponseError() {
		return responseError;
	}

	public void setResponseError(boolean responseError) {
		this.responseError = responseError;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
