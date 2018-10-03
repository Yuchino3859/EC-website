package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.MasterItemListDAO;
import com.internousdev.ecsite.dto.MasterItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterItemListAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private List<MasterItemListDTO> masterItemListDTOList = new ArrayList<MasterItemListDTO>();

	public String execute() {
		String result=ERROR;
	    MasterItemListDAO dao =new MasterItemListDAO();
	    masterItemListDTOList=dao.select();
	    if(masterItemListDTOList.size()>0){
	    	session.put("masterItemListDTOList", masterItemListDTOList);
	        result=SUCCESS;
	    }else{
	    	result=ERROR;
	    }
		return result;
	}



	@Override public void setSession(Map<String, Object> session) {
		this.session = session;
		}

		public Map<String,Object>getSession(){
			return session;
		}


}
