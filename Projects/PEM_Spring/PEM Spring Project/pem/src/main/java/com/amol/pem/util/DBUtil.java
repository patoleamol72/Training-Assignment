package com.amol.pem.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBUtil {

	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Context ctx = null;

	public Connection getConnection() {
		try {
			ctx = new InitialContext();
		
		Context initContext  = (Context)ctx.lookup("java:/comp/env");
        DataSource ds = (DataSource)initContext.lookup("jdbc/pem");
		
		con = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
		
	}

	
	public Statement createStatement() {
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	public ResultSet executeStatement(String sql) {
		try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public PreparedStatement createPreparedStatement(String sql) {
		try {
			pstmt = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	
	public void closeStatement() {
		try {
			stmt.close();
			closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closePreparedStatement() {
		try {
			pstmt.close();
			closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
}
}
