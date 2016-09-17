package com.yjx.smarthome.action;

import com.opensymphony.xwork2.ActionSupport;
import com.yjx.smarthome.service.BaseService;

public class TestAction extends ActionSupport {

	private BaseService us=null;
	private void setUs(BaseService us){
		this.us = us;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}

	
}
