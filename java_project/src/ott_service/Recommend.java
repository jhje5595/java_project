package ott_service;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;

public class Recommend extends JFrame{
	private JPanel rcPanel = new JPanel(new GridLayout(3,3));
	private JButton btn_genre1 = new JButton("SF");
	private JButton btn_genre2 = new JButton("Drama");
	private JButton btn_genre3 = new JButton("Romance");
	private int select = 0;
	
	public Recommend(ArrayList<MovieInfo> L) {
		super("Genre Recommendation");
		this.setContentPane(rcPanel);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(300,200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		
		btn_genre1.addActionListener(new ActionListener(){ // When click List button
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("SF");
				JPanel p1 = new JPanel();
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				frame.setSize(400,300);
				String movieList = "";
				for(int i=0;i<L.size();i++) {
					if(btn_genre1.getText().equals(L.get(i).genre)) {
						movieList += L.get(i).title+" | "+L.get(i).genre;
						movieList += "<br>";
					}
				}
				JLabel label1 = new JLabel("<html>"+movieList+"</html>");
				frame.add(p1);
				p1.add(label1);
				
				frame.setVisible(true);
				
			}
		});
		
		btn_genre2.addActionListener(new ActionListener(){ // When click List button
			public void actionPerformed(ActionEvent e) {
				JFrame frame2 = new JFrame("Drama");
				JPanel p2 = new JPanel();
				frame2.setSize(400,300);
				String movieList = "";
				for(int i=0;i<L.size();i++) {
					if(btn_genre2.getText().equals(L.get(i).genre)) {
						movieList += L.get(i).title+" | "+L.get(i).genre;
						movieList += "<br>";
					}
				}
				JLabel label2 = new JLabel("<html>"+movieList+"</html>");
				frame2.add(p2);
				p2.add(label2);
				
				frame2.setVisible(true);
				
			}
		});
		btn_genre3.addActionListener(new ActionListener(){ // When click List button
			public void actionPerformed(ActionEvent e) {
				JFrame frame3 = new JFrame("Romance");
				JPanel p3 = new JPanel();
				frame3.setSize(400,300);
				String movieList = "";
				for(int i=0;i<L.size();i++) {
					if(btn_genre3.getText().equals(L.get(i).genre)) {
						movieList += L.get(i).title+" | "+L.get(i).genre;
						movieList += "<br>";
					}
				}
				JLabel label3 = new JLabel("<html>"+movieList+"</html>");
				frame3.add(p3);
				p3.add(label3);
				
				frame3.setVisible(true);
				
			}
		});
	
		
		System.out.println(btn_genre1.getText());
		rcPanel.add(btn_genre1);
		rcPanel.add(btn_genre2);
		rcPanel.add(btn_genre3);
		
		
		
	}

}
