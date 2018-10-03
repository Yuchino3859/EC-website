package com.internousdev.sampleweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.sampleweb.dto.DestinationInfoDTO;
import com.internousdev.sampleweb.util.DBConnector;

public class DestinationInfoDAO {

	public int insert(String userId,String familyName,String firstName,String familyNameKana,String firstNameKana,
			String email,String telNumber,String userAddress){
		    DBConnector db=new DBConnector();
		    Connection con=db.getConnection();
		    int count=0;
		    String sql="insert into destination_info(user_id,family_name,first_name,family_name_kana,first_name_kana,email,tel_number,user_address,regist_date,update_date)"
		              +"values(?,?,?,?,?,?,?,?,now(),'0000-01-01')";
		    try{
		    	PreparedStatement ps=con.prepareStatement(sql);
		    	ps.setString(1, userId);
		    	ps.setString(2, familyName);
		    	ps.setString(3, firstName);
		    	ps.setString(4, familyNameKana);
		    	ps.setString(5, firstNameKana);
		    	ps.setString(6, email);
		    	ps.setString(7, telNumber);
		    	ps.setString(8,userAddress);
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

	public List<DestinationInfoDTO> getDestinationInfo(String loginId) throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<DestinationInfoDTO> destinationInfoList = new ArrayList<DestinationInfoDTO>();

		String sql = "SELECT id, family_name, first_name, family_name_kana, first_name_kana, user_address, tel_number, email FROM destination_info WHERE user_id = ?";

		try {
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				DestinationInfoDTO destinationInfo = new DestinationInfoDTO();
				destinationInfo.setId(rs.getInt("id"));
				destinationInfo.setFamilyName(rs.getString("family_name"));
				destinationInfo.setFirstName(rs.getString("first_name"));
				destinationInfo.setFamilyNameKana(rs.getString("family_name_kana"));
				destinationInfo.setFirstNameKana(rs.getString("first_name_kana"));
				destinationInfo.setUserAddress(rs.getString("user_address"));
				destinationInfo.setEmail(rs.getString("email"));
				destinationInfo.setTelNumber(rs.getString("tel_number"));
				destinationInfoList.add(destinationInfo);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return destinationInfoList;
	}

}
