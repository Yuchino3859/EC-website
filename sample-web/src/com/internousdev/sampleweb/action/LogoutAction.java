package com.internousdev.sampleweb.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sampleweb.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware{
    private String categoryId;
    private Map<String,Object>session;

    public String execute(){
    String result=ERROR;
    UserInfoDAO userInfoDao=new UserInfoDAO();
    String loginId=String.valueOf(session.get("loginId"));
	boolean savedLoginId=Boolean.valueOf(String.valueOf(session.get("savedLoginId")));
	int count=userInfoDao.logout(loginId);
	if(count>0){
		session.clear();
		session.put("savedLoginId", savedLoginId);
		session.put("loginId", loginId);
		result=SUCCESS;
	}
	return result;
  }
  public String getCategoryId(){
	  return categoryId;
  }
  public void setCategoryId(String categoryId){
	  this.categoryId=categoryId;
  }
  public Map<String,Object>getSession(){
	  return session;
  }
  public void setSession(Map<String,Object>session){
	  this.session=session;
  }

}
