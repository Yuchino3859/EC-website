package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class UserCreateCompleteDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
    private DateUtil date=new DateUtil();
    private String sql="INSERT INTO login_user_transaction(login_id,login_pass,user_name,is_master,insert_date)VALUES(?,?,?,?,?)";

    public void createUser(String loginUserId,String loginPassword,String userName)throws SQLException{

    	try{
    		PreparedStatement ps=con.prepareStatement(sql);
    		ps.setString(1, loginUserId);
    		ps.setString(2, loginPassword);
    		ps.setString(3, userName);
    		ps.setString(4, "0");
    		ps.setString(5, date.getDate());

    		ps.execute();
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally{
    		con.close();
    	}
    }
}
