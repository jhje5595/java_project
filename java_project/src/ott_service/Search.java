package ott_service;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Search extends JFrame{
	public Search(ArrayList<MovieInfo> L) {
		super("Search Result");
		String movie_title = JOptionPane.showInputDialog("Enter Movie Title");
		for(int i=0;i<L.size();i++) {
			if(movie_title.equals(L.get(i).title)) {
				int index = i;
				JPanel searchPanel = new JPanel();
				JButton like_btn = new JButton("like 👍");
				String path = "src/img/"+movie_title+".jpg";
				ImageIcon icon = new ImageIcon(path);
				String info = "<html> <br>Title : "+L.get(i).title+"<br>Director : "+L.get(i).movie_director+"<br>Release : "+L.get(i).release_day+"<br>Genre : "+L.get(i).genre+"</html>";
				JLabel imageLabel = new JLabel(info,icon,SwingConstants.CENTER);
				imageLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
				imageLabel.setHorizontalTextPosition(SwingConstants.CENTER);
				
				setSize(300,550);
				this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				this.setContentPane(searchPanel);  
				this.setVisible(true);
				
				searchPanel.add(imageLabel);
				searchPanel.add(like_btn);
				
				like_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						L.get(index).is_liked++;
					}
					
				});
				break;
			}
		}
	}
	

}
