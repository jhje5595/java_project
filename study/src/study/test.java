package study;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;

public class mbti extends JFrame{
	   
    public mbti() {
    	super("16 personalities");
 
       // * 프레임 생성 * //
    	
        setSize(350, 300); // 크기 설정
        setLocationRelativeTo(null); // 화면 가운데 배치
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 닫을 때 종료 설정
        getContentPane().setLayout(null); // 레이아웃 설정

        // * 판넬 생성 * //
        JPanel panel = new JPanel();
        panel.setBackground(Color.green);
        panel.setPreferredSize(new Dimension(300,100));
        this.setContentPane(panel);
        
        JLabel label = new JLabel("This is ");
        
        // * 버튼 생성 * //
        JButton btn = new JButton("start");
        
        btn.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e) {
              JOptionPane.showMessageDialog(btn, e, getTitle(), ABORT, null);
           }
        });
        
        panel.add(label);
        panel.add(btn);
 
        //frm.pack();
        setVisible(true); 


    }
   
    public static void main(String[] args) {
           new mbti();
       }
   
}
