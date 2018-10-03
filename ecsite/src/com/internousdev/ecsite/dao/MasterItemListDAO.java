package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.MasterItemListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class MasterItemListDAO {

	private DBConnector db=new DBConnector();
    private Connection con=db.getConnection();
    List<MasterItemListDTO> masterItemListDTO=new ArrayList<MasterItemListDTO>();

    public List<MasterItemListDTO> select(){
        String sql=
    			"SELECT * FROM item_info_transaction";

    	try{
    		PreparedStatement ps=con.prepareStatement(sql);
    		ResultSet rs=ps.executeQuery();

    	while(rs.next()){
    		MasterItemListDTO dto=new MasterItemListDTO();
    		dto.setItemId(rs.getString("id"));
    		dto.setItemName(rs.getString("item_name"));
    		dto.setItemPrice(rs.getString("item_price"));
    		dto.setItemStock(rs.getString("item_stock"));
    		dto.setInsert_date(rs.getString("insert_date"));
    		masterItemListDTO.add(dto);
    	}

    	}catch(SQLException e){
    		e.printStackTrace();
    	}try{
    		con.close();

    	} catch (SQLException e) {
			e.printStackTrace();
    	}
    	return masterItemListDTO;
    }
}