package com.lowes.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lowes.beans.Address;

public class AddressCRUD {
	public int getMaximumAddressID(Connection con) throws SQLException {
		PreparedStatement prs = con.prepareStatement("SELECT max(aid) as max_aid from address");
		ResultSet r = prs.executeQuery();
		while (r.next()) 
			return r.getInt("max_aid");
		return 0;
	}
	
	public boolean create(Connection con, Address addr) throws SQLException {
		PreparedStatement prs = con.prepareStatement("insert into address values(?, ?, ?, ?);");
		
		prs.setInt(1, addr.getAddrId());
		prs.setString(2, addr.getStreet());
		prs.setString(3, addr.getCity());
		prs.setString(4, addr.getState());
		prs.execute();
		return false;
	}
	
	public List<Address> retrieve(Connection con) throws SQLException {
		PreparedStatement prs = con.prepareStatement("SELECT * from address;");
		ResultSet r = prs.executeQuery();
		List<Address> addr = new ArrayList<Address>();
		while (r.next()) {
			Address ad = new Address(r.getInt("aid"), r.getString("street"), r.getString("city"), r.getString("state"));
			addr.add(ad);
		}
		return addr;		
	}
	
	public boolean update(Connection con, int aid, String state) throws SQLException {
		PreparedStatement prs = con.prepareStatement("UPDATE address set state=? where aid=?;");
		prs.setString(1, state);
		prs.setInt(2, aid);
		prs.execute();
		return true;
	}
	
	public boolean delete(Connection con, int aid) throws SQLException {
		PreparedStatement prs = con.prepareStatement("DELETE from address where aid=?;");
		prs.setInt(1, aid);
		prs.execute();
		return true;
	}
}