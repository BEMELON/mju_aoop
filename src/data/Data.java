package data;

import data.dto.C19DTO;

public class Data {
	//DB�� ������ ���� DB��ü, CSV�б�, ���⸦ ���� CSV��ü
	private Database db;
	private CSV csv;
	
	//������
	public Data() {
		db = new Database();
		csv = new CSV();
	}
	
	//�����͸� �������� ���� �޼����
	public int getCountryCount(String filter) {
		return 0;
	}
	public C19DTO getC19Data(String filter) {
		return new C19DTO();
	}
}