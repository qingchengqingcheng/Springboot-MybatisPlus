package com.springbootmybatisplus.demo.common.web;

public class BaseResponse {
	
    private String message = "success";
    
    private int code = 1;

    public BaseResponse() {
		super();
	}
    
    public BaseResponse(int code) {
    	super();
    	this.code = code;
	}
    
    public BaseResponse(int code, String message) {
		super();
		this.message = message;
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
