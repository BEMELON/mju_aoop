package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import data.dto.C19DTO;

public class Database {
	//�����ͺ��̽� Connection
	private Connection con;
	//DB���� ���
	private static final String DB_DRIVER_CLASS = "org.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://�ּ�:��Ʈ/�����ͺ��̽�";
	private static final String DB_USERNAME = "����";
	private static final String DB_PASSWORD = "�н�����";
	
	//������
	public Database() {
		con = null;
	}
	
	//DB����
	public boolean conncetDB() {
		try {
			Class.forName(DB_DRIVER_CLASS);
			con = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	//insertData
	public void insertC19Data() {
		
	}
	public void insertCGIData() {
		
	}
	//selectData
	public ArrayList<C19DTO> selectC19Data(String sql){
		return new ArrayList<C19DTO>();
	}
}
