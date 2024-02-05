package day0118;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;

public class SwingQuiz_11 extends JFrame implements ActionListener{
	
	Container cp;
	JTextField text;
	JLabel lbl1, lblResult;
	JButton[] btn = new JButton[6];
	String[] btnLabel = {"Red", "Green", "Blue", "Magenta", "Gray", "Yellow"};
	Color[] btnColors = {Color.red, Color.green, Color.blue, Color.magenta, Color.gray, Color.yellow};
	
	public SwingQuiz_11(String title) {
		super(title);
		
		cp = this.getContentPane();
		
		this.setBounds(300, 100, 600, 300);
		cp.setBackground(new Color(245,185,185));
		initDesign();
		this.setVisible(true);
	}
	
	public void initDesign() {
		// Panel은 기본이 FlowLayout
		JPanel panel = new JPanel();
		panel.setBackground(Color.orange);
		
		this.add(panel, BorderLayout.NORTH); // 프레임의 상단에 패널배치
		
		// 버튼 생성
		for(int i = 0; i<btn.length;i++) {
			// 버튼 6개 생성
			btn[i] = new JButton(btnLabel[i]);
			
			// 버튼 6개에 각각의 버튼 색상 변경(btnColors)
			btn[i].setBackground(btnColors[i]);
			
			// 버튼 6개에 이벤트 추가
			btn[i].addActionListener(this);
			
			// panel에 버튼 6개 추가 
			panel.add(btn[i]);
		}
		
		lblResult = new JLabel("안녕하세요", JLabel.CENTER);
		lblResult.setBounds(20, 170, 250, 60);
		lblResult.setFont(new FontUIResource("", Font.BOLD, 25)); // 글꼴 변경
		this.add(lblResult);
		
		
	}
	


	public static void main(String[] args) {
		
		new SwingQuiz_11("숙제");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object ob = e.getSource();
		
		for(int i = 0; i<btn.length;i++) {
			if(ob == btn[i]) {
				lblResult.setForeground(btnColors[i]);
			}
		}
		
		
		
	}

}
