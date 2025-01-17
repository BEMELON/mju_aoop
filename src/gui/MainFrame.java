package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class MainFrame extends JFrame {

	// val
	private JPanel contentPane;
	private InformPanel informPanel;
	private OverviewPanel overviewPanel;
	
	
	public static void main(String[] args) {
		
	}
	public MainFrame() {
		setTitle("FreshmanTravel");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new BorderLayout(5, 5));
		setContentPane(contentPane);
		
		this.overviewPanel = new OverviewPanel();
		this.informPanel = new InformPanel();
		
		this.contentPane.add(this.informPanel, BorderLayout.WEST);
		this.contentPane.add(this.overviewPanel, BorderLayout.CENTER);
	}	
}
