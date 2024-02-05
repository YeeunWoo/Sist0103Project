package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingImageIcon_06 extends JFrame implements ActionListener{
	
	Container cp;
	
	// 이미지 아이콘 가져온다
	ImageIcon icon1 = new ImageIcon("C:\\sist0103\\image\\swingimage\\an07.gif");
	ImageIcon icon2 = new ImageIcon("C:\\sist0103\\image\\swingimage\\leftDown.gif");
	ImageIcon icon3 = new ImageIcon("C:\\sist0103\\image\\swingimage\\leftRollover.gif");
	ImageIcon icon4 = new ImageIcon("C:\\sist0103\\image\\swingimage\\chick.gif");
	ImageIcon icon5 = new ImageIcon("C:\\sist0103\\image\\swingimage\\brown-line.gif");

	JButton btn1, btn2, btn3, btn4;
	
	public SwingImageIcon_06(String title) {
		super(title);
		
		cp = this.getContentPane();
		
		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(245,185,185));
		initDesign();
		this.setVisible(true);
	}
	
	public void initDesign() {
		// 2행 2열
		this.setLayout(new GridLayout(2, 2));
		btn1 = new JButton("hello",icon1);
		
		btn1.setHorizontalTextPosition(JButton.CENTER); // 텍스트 가로 위치
		btn1.setVerticalTextPosition(JButton.BOTTOM); // 텍스트 세로 위치
		btn1.addActionListener(this);
		this.add(btn1);
	
		btn1.setRolloverIcon(icon2);
		btn1.setPressedIcon(icon3);
		
		// 버튼2
		btn2 = new JButton("..", icon2);
		btn2.addActionListener(this);
		this.add(btn2);
		
		// 버튼3
		btn3 = new JButton("..", icon5);
		btn3.addActionListener(this);
		this.add(btn3);
		
		// 버튼 4
		btn4 = new JButton("안녕", icon4);
		btn4.addActionListener(this);
		this.add(btn4);
		
	}
	public static void main(String[] args) {
		
		new SwingImageIcon_06("스윙시작");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if(ob == btn1) {
			JOptionPane.showMessageDialog(this, "1 버튼 클릭");
		} else if(ob == btn2) {
			JOptionPane.showMessageDialog(this, "2 버튼 클릭");
		} else if(ob == btn3) {
			JOptionPane.showMessageDialog(this, "3 버튼 클릭");
		} else if(ob == btn4) {
			JOptionPane.showMessageDialog(this, "4 버튼 클릭");
		}
		
	}

}
