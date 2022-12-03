package ott_service;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

import com.sun.tools.javac.Main;

import java.util.*;
import ott_service.Printall;

public class Service extends JFrame{
	static ArrayList<MovieInfo> movieList = new ArrayList<MovieInfo>();
	private JPanel mainPanel = new JPanel(new GridLayout(4,2));
	private JButton popular_btn = new JButton("TOP 5");
	private JButton recommend_btn = new JButton("Genre Recommend");
	private JButton search_btn = new JButton("Movie Search");
	private JButton list_btn = new JButton("Now Playing"); 
	
	private ImageIcon icon = new ImageIcon("src/img/movie.png"); // 잠깐 보류
	private JLabel image = new JLabel(null,icon,SwingConstants.CENTER);
	
	public Service() {
		super("OTT Recommendation Service");
		this.setContentPane(mainPanel);
		
		mainPanel.add(popular_btn);
		mainPanel.add(recommend_btn);
		mainPanel.add(search_btn);
		mainPanel.add(list_btn);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		popular_btn.addActionListener(new ActionListener(){ // When click Top 5 button

			public void actionPerformed(ActionEvent e) {
				new Top5(movieList);
			}
		});
		
		
		list_btn.addActionListener(new ActionListener(){ // When click List button

			public void actionPerformed(ActionEvent e) {
				new Printall(movieList);
			}
		});
		
		recommend_btn.addActionListener(new ActionListener(){ // When click Genre button

			public void actionPerformed(ActionEvent e) {
				new Recommend(movieList);
			}
		});
		search_btn.addActionListener(new ActionListener(){ // When click Search button

			public void actionPerformed(ActionEvent e) {
				new Search(movieList);
			}
		});
	} //Constructor Finish

	
	public static void main(String[] args) throws IOException { // main method
		try {
			File file = new File ("/Users/yeonjun/Desktop/java_project/movie_list.txt");   //  /Users/yeonjun/Desktop/java_project/movie_list.txt-> mac , C:/Users/jhje5/Desktop/java_project/movie_list.txt -> window
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
		Service sv = new Service();
	}
}
