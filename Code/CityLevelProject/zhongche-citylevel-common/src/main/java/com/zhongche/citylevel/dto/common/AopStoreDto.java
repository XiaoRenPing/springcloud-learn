package com.zhongche.citylevel.dto.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhongche.citylevel.utils.RedisCacheManager;


public class AopStoreDto {

	public AopStoreDto(HttpServletRequest request, HttpServletResponse response, RedisCacheManager redisCacheManager,
			String token) {
		super();
		this.request = request;
		this.response = response;
		this.redisCacheManager = redisCacheManager;
		this.token = token;
	}
	private HttpServletRequest request; 
	private HttpServletResponse response;
	private RedisCacheManager redisCacheManager;
	private String token;
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public HttpServletResponse getResponse() {
		return response;
	}
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	public RedisCacheManager getRedisCacheManager() {
		return redisCacheManager;
	}
	public void setRedisCacheManager(RedisCacheManager redisCacheManager) {
		this.redisCacheManager = redisCacheManager;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
}
