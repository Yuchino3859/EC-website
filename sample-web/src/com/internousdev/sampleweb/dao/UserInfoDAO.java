package com.internousdev.sampleweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.sampleweb.dto.UserInfoDTO;
import com.internousdev.sampleweb.util.DBConnector;

public class UserInfoDAO {
    public int createUser(String familyName,String firstName,String familyNameKana,String firstNameKana,String sex,String email,String loginId,String password){
    DBConnector db=new DBConnector();
    Connection con=db.getConnection();
    int count=0;
    String sql="insert into user_info(user_id,password,family_name,first_name,family_name_kana,"
    		+"first_name_kana,sex,email,status,logined,regist_date,update_date)"
            +"values(?,?,?,?,?,?,?,?,?,?,now(),0)";

    try{
    	PreparedStatement ps=con.prepareStatement(sql);
    	ps.setString(1, loginId);
    	ps.setString(2, password);
    	ps.setString(3, familyName);
    	ps.setString(4,firstName);
    	ps.setString(5,familyNameKana);
    	ps.setString(6, firstNameKana);
    	ps.setString(7,sex);
    	ps.setString(8, email);
    	ps.setInt(9, 0);
    	ps.setInt(10, 1);
    	count=ps.executeUpdate();
    }catch(SQLException e){
    	e.printStackTrace();
    }
    try{
    	con.close();
    }catch(SQLException e){
    	e.printStackTrace();
    }
    return count;
}


public boolean isExistsUserInfo(String loginId,String password){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();
	boolean result=false;
	String sql="select count(*) as count from user_info where user_id=? and password=?";
    try{
    	PreparedStatement ps=con.prepareStatement(sql);
    	ps.setString(1, loginId);
    	ps.setString(2, password);
    	ResultSet rs=ps.executeQuery();
    	while(rs.next()){
    		if(rs.getInt("count")>0){
    			result=true;
    		}
    	}

    }catch(SQLException e){
    	e.printStackTrace();
    }
    try{
    	con.close();
    }catch(SQLException e){
    	e.printStackTrace();
    }
    return result;
}

public UserInfoDTO getUserInfo(String loginId,String password){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();
	UserInfoDTO userInfo=new UserInfoDTO();
	String sql="select * from user_info where user_id=? and password=?";

	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, loginId);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
		    userInfo.setId(rs.getInt("id"));
		    userInfo.setUserId(rs.getString("user_id"));
		    userInfo.setPassword(rs.getString("password"));
		    userInfo.setFamilyName(rs.getString("family_name"));
		    userInfo.setFirstName(rs.getString("first_name"));
		    userInfo.setFamilyNameKana(rs.getString("family_name_kana"));
		    userInfo.setFirstNameKana(rs.getString("first_name_kana"));
            userInfo.setSex(rs.getInt("sex"));
            userInfo.setEmail(rs.getString("email"));
            userInfo.setStatus(rs.getString("status"));
            userInfo.setLogined(rs.getInt("logined"));
            userInfo.setRegistDate(rs.getDate("regist_date"));
            userInfo.setUpdateDate(rs.getDate("update_date"));
		}

	    }catch(SQLException e){
	    	e.printStackTrace();
	    }
	    try{
	    	con.close();
	    }catch(SQLException e){
	    	e.printStackTrace();
	    }
	    return userInfo;
}

public UserInfoDTO getUserInfo(String loginId){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();
	UserInfoDTO userInfo=new UserInfoDTO();
	String sql="select * from user_info where user_id=?";

	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, loginId);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
		    userInfo.setId(rs.getInt("id"));
		    userInfo.setUserId(rs.getString("user_id"));
		    userInfo.setPassword(rs.getString("password"));
		    userInfo.setFamilyName(rs.getString("family_name"));
		    userInfo.setFirstName(rs.getString("first_name"));
		    userInfo.setFamilyNameKana(rs.getString("family_name_kana"));
		    userInfo.setFirstNameKana(rs.getString("first_name_kana"));
            userInfo.setSex(rs.getInt("sex"));
            userInfo.setEmail(rs.getString("email"));
            userInfo.setStatus(rs.getString("status"));
            userInfo.setLogined(rs.getInt("logined"));
            userInfo.setRegistDate(rs.getDate("regist_date"));
            userInfo.setUpdateDate(rs.getDate("update_date"));
		}

	    }catch(SQLException e){
	    	e.printStackTrace();
	    }
	    try{
	    	con.close();
	    }catch(SQLException e){
	    	e.printStackTrace();
	    }
	    return userInfo;
}

public int resetPassword(String loginId,String password){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();
	String sql="update user_info set password=? where user_id=?";
    int result=0;
    try{
    	PreparedStatement ps=con.prepareStatement(sql);
    	ps.setString(1, password);
    	ps.setString(2, loginId);
    	result=ps.executeUpdate();
    }catch(SQLException e){
    	e.printStackTrace();
    }
    try{
    	con.close();
    }catch(SQLException e){
    	e.printStackTrace();
    }
    return result;
}

public int login(String loginId,String password){
	DBConnector db=new DBConnector();
    Connection con=db.getConnection();
    int result=0;
    String sql="update user_info set logined=1 where user_id=? and password=?";
    try{
    	PreparedStatement ps=con.prepareStatement(sql);
    	ps.setString(1, loginId);
    	ps.setString(2, password);
    	result=ps.executeUpdate();
    }catch(SQLException e){
    	e.printStackTrace();
    }
    try{
    	con.close();
    }catch(SQLException e){
    	e.printStackTrace();
    }
    return result;
}

public int logout(String loginId){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();
	int result=0;
	String sql="update user_info set logined=0 where user_id=?";
    try{
    	PreparedStatement ps=con.prepareStatement(sql);
    	ps.setString(1, loginId);
    	result=ps.executeUpdate();
    }catch(SQLException e){
	    e.printStackTrace();
    }
    try{
	    con.close();
    }catch(SQLException e){
    	e.printStackTrace();
    }
    return result;
}

public String concealPassword(String password){
	int beginIndex=0;
	int endIndex=1;
	if(password.length()>1){
	    endIndex=2;
	}
	StringBuilder strBuild=new StringBuilder("****************");

	String concealPassword=strBuild.replace(beginIndex, endIndex, password.substring(beginIndex,endIndex)).toString();
	return concealPassword;
   }
}
