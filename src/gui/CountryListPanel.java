package gui;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class CountryListPanel extends BasicPanel {
	private String[] dummyList = {"test", "test", "test", "test", "test", "test",
			 "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test"
			 , "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test"};
	public CountryListPanel() {
		this.setLayout(new BorderLayout());
		JList temp = new JList(this.dummyList);
		this.add(new JScrollPane(temp), BorderLayout.CENTER);
	}
	
}
