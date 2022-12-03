package ott_service;

import javax.swing.*;
import java.util.*;

public class Top5 extends JFrame{
	private JPanel mainPanel = new JPanel();
	private JLabel mainLabel = new JLabel("abc");
	
	public Top5(ArrayList<MovieInfo> L) {
		super("Top 5 Movie");
		this.setContentPane(mainPanel);
		this.setSize(500,500);
		this.setVisible(true);
		String movieList = "";
		for(int i=0;i<L.size();i++) { //sort
			for(int j=i+1;j<L.size();j++) {
				if(L.get(i).is_liked < L.get(j).is_liked) {
					Collections.swap(L, i, j);
				}
			}
		}
	
		for(int i=0;i<5;i++) {
			movieList += i+1+" "+L.get(i).title+"  ♥ "+L.get(i).is_liked+"<br>";
		}
		mainLabel.setText("<html>"+movieList+"</html>");
		
		
		mainPanel.add(mainLabel);
		
		
	}

}
