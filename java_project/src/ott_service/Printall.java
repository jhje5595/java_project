package ott_service;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import ott_service.MovieInfo;

public class Printall extends JFrame{
	public Printall(ArrayList<MovieInfo> L) {
		super("Now Playing");
		JPanel printPanel = new JPanel();
		JLabel mainLabel = new JLabel("");
		
		String movie = "";
		for(int i=0;i<L.size();i++) {
			movie += (i+1)+" "+L.get(i).getData()+"<br>";
		}
		mainLabel.setText("<html>"+movie+"</html>");
		
		printPanel.add(mainLabel);
		
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(500,400);
		setVisible(true);
		this.setContentPane(printPanel);
		
	}
	

}
