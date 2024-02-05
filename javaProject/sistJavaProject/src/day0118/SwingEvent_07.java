package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEvent_07 extends JFrame {
	
	Container cp;
	JButton btn1, btn2;
	
	public SwingEvent_07(String title) {
		super(title);
		
		cp = this.getContentPane();
		
		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(245,185,185));
		initDesign();
		this.setVisible(true);
	}
	
	public void initDesign() {
		/* 
		 * Flow레이아웃으로 버튼 2개 생성
		 * 버튼 색상 그레이로 변경, 버튼 색상 그린으로 변경
		 */
		
		this.setLayout(new FlowLayout());
		
		btn1 = new JButton("(´。＿。｀)");
		btn2 = new JButton("♨_♨");
		
		this.add(btn1);
		this.add(btn2);
		
		// 버튼1 생성 및 이벤트 주기(익명내부클래스 형식)
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//getContentPane().setBackground(Color.gray);
				cp.setBackground(Color.gray);
			}
		});
		
		// 버튼2
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				cp.setBackground(Color.yellow);
			}
		});
	}

	public static void main(String[] args) {
		
		new SwingEvent_07("스윙시작");
		
	}

}
