package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class MasterItemCreateCompleteDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
    private DateUtil date=new DateUtil();
    private String sql="INSERT INTO item_info_transaction(item_name,item_price,item_stock,insert_date)VALUES(?,?,?,?)";

    public void createItem(String itemName,String itemPrice,String itemStock)throws SQLException{

    	try{
    		PreparedStatement ps=con.prepareStatement(sql);
    		ps.setString(1, itemName);
    		ps.setString(2, itemPrice);
    		ps.setString(3, itemStock);
    		ps.setString(4, date.getDate());

    		ps.execute();
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally{
    		con.close();
    	}
    }
}
