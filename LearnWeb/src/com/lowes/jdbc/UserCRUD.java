package com.lowes.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lowes.beans.Address;
import com.lowes.beans.User;

public class UserCRUD {

	public int getMaxUserID(Connection con) throws SQLException {
		PreparedStatement prs = con.prepareStatement("SELECT max(uid) as max_uid from user");
		ResultSet r = prs.executeQuery();
		while (r.next())
			return r.getInt("max_uid");
		return 0;
	}

	public boolean create(Connection con, User user) throws SQLException {

		PreparedStatement prs = con.prepareStatement("insert into user values(?, ?, ?, ?, ?);");
		// System.out.println(user.getAddress().getAddrId());
		prs.setInt(1, user.getUserId());
		prs.setString(2, user.getUserName());
		prs.setString(3, user.getUserMail());
		prs.setString(4, user.getContactNumber());
		if (user.getAddress() != null)
			prs.setObject(5, user.getAddress().getAddrId());
		else
			prs.setString(5, null);

		prs.execute();
		return true;
	}
	
	public List<User> retrieveOneUserInfo(Connection con,int userId) throws SQLException {
		
		PreparedStatement prs = con.prepareStatement("SELECT * from user where uid=?;");
		prs.setInt(1, userId);
		
		ResultSet r = prs.executeQuery();
		List<User> users = new ArrayList<>();
		User u = null;
		while (r.next()) {
				u = new User(userId, r.getString("uname"), r.getString("umail"), r.getString("contactno"),
						null);
				//System.out.println(u);
			}
		users.add(u);
		return users;
	}
	
	
	public List<User> retrieve(Connection con) throws SQLException {

		PreparedStatement prs = con.prepareStatement("SELECT * from user;");
		ResultSet r = prs.executeQuery();
		List<User> users = new ArrayList<User>();
		while (r.next()) {
			User u = null;
			if (r.getString("addr") == null) {
				u = new User(r.getInt("uid"), r.getString("uname"), r.getString("umail"), r.getString("contactno"),
						(Address) r.getObject("addr"));
				//System.out.println(u);
			} else {
				int addr = r.getInt("addr");
				prs = con.prepareStatement("SELECT * from address where aid=?;");
				prs.setInt(1, addr);
				ResultSet re = prs.executeQuery();
				while (re.next()) {
					Address address = new Address(re.getInt("aid"), re.getString("street"), re.getString("city"),
							re.getString("state"));
					u = new User(r.getInt("uid"), r.getString("uname"), r.getString("umail"), r.getString("contactno"),
							address);
				}
			}
			users.add(u);
		}
		return users;
	}

	public boolean update(Connection con, int uid, String fieldValue, String fieldName, int parameter)
			throws SQLException {

		PreparedStatement prs = con.prepareStatement("UPDATE user set " + fieldName + "=? where uid=?;");
		prs.setString(1, fieldValue);
		prs.setInt(2, uid);
		ResultSet r = prs.executeQuery();
		
		return true;
	}
	
	public boolean updateUser(Connection con, User user)
			throws SQLException {

		PreparedStatement prs = con.prepareStatement("UPDATE user set uname=?,umail=?,contactno=? where uid=?;");
		prs.setString(1,user.getUserName());
		prs.setString(2, user.getUserMail());
		prs.setString(3, user.getContactNumber());
		prs.setInt(4, user.getUserId());
		prs.execute();
		return true;
	}

	public boolean delete(Connection con, int userId) throws SQLException {
		PreparedStatement prs = con.prepareStatement("delete from user where uid = ?");
		prs.setInt(1, userId);
		prs.executeQuery();
		return true;
	}

}
