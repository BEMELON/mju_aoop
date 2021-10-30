package gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;

public class FilterPanel extends BasicPanel {
	final private String[] categori = {"����", "����", "��ȭ", "����", "�ڷγ�"};
	final private String[] region = {"�ƽþ�", "������ī", "�Ƹ޸�ī", "����"};
	final private String[] weather = {"����", "����", "����", "�߿�"};
	final private String[] faith = {"�̽���", "���縯", "���ű�", "��α�", "����"};
	
	private List<String> list;
	private List<JButton> btnList;
	
	private GridBagLayout gbl_panel;
	
	public FilterPanel() {
		this.list = new ArrayList<String>(Arrays.asList(this.categori));
		this.btnList = new ArrayList<JButton>();
		//System.out.print(list);
		
		this.gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		this.setLayout(gbl_panel);
		drawBtn();
	
	}
	
	public void drawBtn() {
		// ��ư ����
		for(JButton btn : this.btnList) 
			this.remove(btn);
		
		GridBagConstraints gbcList[] = new GridBagConstraints[list.size()];
		
		// ��ư ����
		for (int i = 0; i < this.list.size(); i++) {
			JButton temp = new JButton(this.list.get(i));
			temp.setPreferredSize(new Dimension(200, 50));
			this.btnList.add(temp);
			gbcList[i] = new GridBagConstraints();
			gbcList[i].insets = new Insets(0, 0, 5, 0);
			gbcList[i].gridx = 0;
			gbcList[i].gridy = i;

			this.add(temp, gbcList[i]);
		}
	}
}
