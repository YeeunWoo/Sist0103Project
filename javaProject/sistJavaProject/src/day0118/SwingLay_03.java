package day0118;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingLay_03 extends JFrame {
	
	Container cp;
	JButton btn1;

	public SwingLay_03(String title) {
		
		super(title);
		
		cp = this.getContentPane();
		
		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(245,185,185));
		
		// 버튼생성
		btn1 = new JButton("버튼1");
		
		// 프레임에 버튼추가
		// 프레임은 기본이 BorderLayout
		// 이 경우는 위치 지정이 필수
		
		this.add("North",btn1); // 첫 글자 대문자
		
		this.add("South",new JButton("아래쪽"));
		this.add("West",new JButton("오른쪽"));
		this.add("East",new JButton("왼쪽"));
		this.add("Center",new JButton("가운데"));
		
		// 버튼1에 속성 추가
		btn1.setBackground(Color.green);
		btn1.setForeground(Color.red);
		
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {

		new SwingLay_03("기본레이아웃");

	}

}
