package com.internousdev.ecsite.dto;

public class LoginDTO {
	public String loginId;
	public String loginPassword;
	public String userName;
	public String master;
	private boolean loginFlg=false;

	public String getLoginId(){
		return loginId;
	}

	public void setLoginId(String loginId){
		this.loginId=loginId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName=userName;
	}

	public String getMaster(){
		return master;
	}

    public void setMaster(String master){
    	this.master=master;
    }

	public boolean getLoginFlg(){
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg){
		this.loginFlg=loginFlg;
	}


}
