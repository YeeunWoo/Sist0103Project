package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingBtnEvent_05 extends JFrame implements ActionListener {
	
	Container cp;
	JButton btn1, btn2;
	public SwingBtnEvent_05(String title) {
		super(title);
		
		cp = this.getContentPane();
		
		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(245,185,185));
		initDesign();
		this.setVisible(true);
	}
	
	public void initDesign() {
		this.setLayout(new FlowLayout());
		
		btn1 = new JButton("◀");
		btn2 = new JButton("▶");
		
		// 버튼 색상
		btn1.setBackground(Color.magenta);
		btn2.setBackground(Color.LIGHT_GRAY);
		
		// 글자 색상
		btn1.setForeground(Color.white);
		btn2.setForeground(Color.red);
		
		// 이벤트객체
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		// 프레임에 추가
		this.add(btn1);
		this.add(btn2);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if(ob == btn1) {
			JOptionPane.showMessageDialog(this, "왼쪽 버튼 클릭");
		} else if(ob == btn2) {
			JOptionPane.showMessageDialog(this, "오른쪽 버튼 클릭");
		}
		
	}

	public static void main(String[] args) {
		
		new SwingBtnEvent_05("버튼이벤트5");
		
	}

}
