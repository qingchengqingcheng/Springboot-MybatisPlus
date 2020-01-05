package com.springbootmybatisplus.demo.common.web;

public class RestResponseHelper {

	public static <T>RestResponse<T>  success( Integer i ){
		return new RestResponse<T>(1,"success");
	}
	
	public static <T>RestResponse<T>  success(T data){		
		return new RestResponse<T>(data);	
	}
	
	public static <T>RestResponse<T>  error(){		
		return new RestResponse<T>(0,"error");	
	}
	
	public static <T>RestResponse<T>  error(String message){		
		return new RestResponse<T>(0,message);	
	}
}
