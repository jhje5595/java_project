package ott_service;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

import com.sun.tools.javac.Main;

import java.util.*;



class MovieInfo{
	String title = null;
	String movie_director = null;
	String release_day = null; 
	String genre = null;
	int is_liked = 0;
	
	public MovieInfo(String t,String d,String r,String g) { // init movie_info
		this.title = t;
		this.movie_director = d;
		this.release_day = r;
		this.genre = g;
	}
}


public class Service extends JFrame{
	private JPanel mainPanel = new JPanel(new GridLayout(4,2));
	private JButton popular_btn = new JButton("TOP 5");
	private JButton recommend_btn = new JButton("Genre Recommend");
	private JButton search_btn = new JButton("Movie Search");
	private JButton list_btn = new JButton("전체 출력");
	private ImageIcon icon = new ImageIcon("../img/movie.png");
	
	public void paint(Graphics g) {
		
	}
	
	public Service() {
		super("OTT Recommendation Service");
		this.setContentPane(mainPanel);
		mainPanel.add();
		mainPanel.add(popular_btn);
		mainPanel.add(recommend_btn);
		mainPanel.add(search_btn);
		mainPanel.add(list_btn);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) throws IOException { // main method
		ArrayList<MovieInfo> movieList = new ArrayList<MovieInfo>();
		try {
			File file = new File ("/Users/yeonjun/Desktop/movie_list.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(fileReader);
		
			String line = "";
			while ((line = bufReader.readLine()) != null) {
				String tmp[] = line.split("-");
				movieList.add(new MovieInfo(tmp[0],tmp[1],tmp[2],tmp[3]));
			}
			
			fileReader.close();	
			
		}catch (FileNotFoundException e) {
            e.getStackTrace();
		}
		System.out.println(movieList.get(1).title);
		Service sv = new Service();
	}
}
