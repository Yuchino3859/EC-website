package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.MasterItemDetailsDTO;
import com.internousdev.ecsite.util.DBConnector;

public class MasterItemDetailsDAO {

	private DBConnector db =new DBConnector();
	private Connection con=db.getConnection();
	List <MasterItemDetailsDTO>masterItemDetailsDTOList=new ArrayList<MasterItemDetailsDTO>();

	public List<MasterItemDetailsDTO> select(int id){
		String sql="SELECT * FROM item_info_transaction where id= ?";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
	        ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
		while(rs.next()){
			MasterItemDetailsDTO dto=new MasterItemDetailsDTO();
			dto.setId(rs.getInt("id"));
			dto.setItemName(rs.getString("item_name"));
    		dto.setItemPrice(rs.getString("item_price"));
    		dto.setItemStock(rs.getString("item_stock"));
    		dto.setInsert_date(rs.getString("insert_date"));
    		masterItemDetailsDTOList.add(dto);
    	}

		}catch(SQLException e){
		    e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
        return masterItemDetailsDTOList;

}
}



