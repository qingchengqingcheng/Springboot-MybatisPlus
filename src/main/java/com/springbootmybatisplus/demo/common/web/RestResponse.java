package com.springbootmybatisplus.demo.common.web;

public class RestResponse<T> extends BaseResponse{

	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public RestResponse() {
		super();
	}
	
	public RestResponse(T data) {
		super();
		this.data = data;
	}

	
	public RestResponse(int code, T data) {
		super(code);
		this.data = data;
	}
	
	public RestResponse(int code, String msg) {
		super(code,msg);
	}
	
	public RestResponse(int code, String msg, T data) {
		super(code,msg);
		this.data = data;
	}
	

}
