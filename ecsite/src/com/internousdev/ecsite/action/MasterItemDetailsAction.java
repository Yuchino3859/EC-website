package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.MasterItemDetailsDAO;
import com.internousdev.ecsite.dto.MasterItemDetailsDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterItemDetailsAction extends ActionSupport implements SessionAware {
	private String id;
	private String itemId;
	private String pageNo;
	public Map<String, Object> session;
	private List<MasterItemDetailsDTO> masterItemDetailsDTOList = new ArrayList<MasterItemDetailsDTO>();

	public String execute() {
		String result=ERROR;
	    MasterItemDetailsDAO dao =new MasterItemDetailsDAO();
	    System.out.println(itemId);
	    masterItemDetailsDTOList=dao.select(Integer.parseInt(itemId));

//	    masterItemDetailsDTOList=dao.select(Integer.parseInt(id));
	    if(masterItemDetailsDTOList.size()>0){
	    	session.put("masterItemDetailsDTOList", masterItemDetailsDTOList);
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



		public String getPageNo() {
			return pageNo;
		}



		public void setPageNo(String pageNo) {
			this.pageNo = pageNo;
		}



		public String getId() {
			return id;
		}



		public void setId(String id) {
			this.id = id;
		}



		public String getItemId() {
			return itemId;
		}



		public void setItemId(String itemId) {
			this.itemId = itemId;
		}




}
