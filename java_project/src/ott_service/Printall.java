package ott_service;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import ott_service.MovieInfo;

public class Printall extends JFrame{
	ArrayList<String> list = new ArrayList<String>();
	public Printall(ArrayList<MovieInfo> MovieList) {
		super("현재 상영 목록들");
		JPanel printPanel = new JPanel(new BorderLayout());
		JLabel listLabel = new JLabel();
		this.setContentPane(printPanel);
		
	}
	

}
