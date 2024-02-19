package com.diworksdev.webproj5.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	/**
	 * JDBCドライバー名
	 */
	private static String driverName = "com.mysql.jdbc.Driver";
	
	/**
	 * データベース接続URL
	 */
	private static String url = "jdbc:mysql://localhost/testdb";
	/**
	 * データ接続ユーザー名
	 */
	private static String user = "root";
	/**
	 * データ接続パスワード
	 */
	private static String passsword = "root";
	
	public Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url, user, passsword);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
