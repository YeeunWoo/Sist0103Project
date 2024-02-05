package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;

public class SwingTextF_10 extends JFrame {

	Container cp;
	JTextField tfNum1, tfNum2;
	JButton btnAdd, btnMinus, btnGob, btnNanum;
	JLabel lblNum1, lblNum2, lblResult;

	public SwingTextF_10() {
		super("텍스트필드문제");

		cp = this.getContentPane();

		this.setBounds(700, 100, 300, 300);
		cp.setBackground(new Color(245, 185, 185));
		setDesign();
		this.setVisible(true);
	}

	public void setDesign() {
		this.setLayout(null);
		lblNum1 = new JLabel("숫자1");
		lblNum2 = new JLabel("숫자2");

		lblNum1.setBounds(20, 20, 50, 30);
		this.add(lblNum1);

		lblNum2.setBounds(20, 60, 50, 30);
		this.add(lblNum2);

		tfNum1 = new JTextField();
		tfNum1.setBounds(80, 20, 80, 30);
		this.add(tfNum1);

		tfNum2 = new JTextField();
		tfNum2.setBounds(80, 60, 80, 30);
		this.add(tfNum2);

		btnAdd = new JButton("+");
		btnAdd.setBounds(40, 110, 50, 50);
		this.add(btnAdd);

		btnMinus = new JButton("-");
		btnMinus.setBounds(90, 110, 50, 50);
		this.add(btnMinus);

		btnGob = new JButton("*");
		btnGob.setBounds(140, 110, 50, 50);
		this.add(btnGob);

		btnNanum = new JButton("/");
		btnNanum.setBounds(190, 110, 50, 50);
		this.add(btnNanum);


		lblResult = new JLabel("결과 나오는 곳...");
		lblResult.setBounds(20, 170, 250, 60);
		lblResult.setBorder(new TitledBorder("결과확인"));
		lblResult.setFont(new FontUIResource("", Font.BOLD, 25)); // 글꼴 변경
		this.add(lblResult);

		// 익명내부클래스
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Object ob = e.getSource();

				int num1 = Integer.parseInt(tfNum1.getText().trim());
				int num2 = Integer.parseInt(tfNum2.getText().trim());

				int result = num1 + num2;
				String s = num1 +"+"+num2+"="+result;
				lblResult.setText(s);

			}
		});

		btnMinus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int num1 = Integer.parseInt(tfNum1.getText().trim());
				int num2 = Integer.parseInt(tfNum2.getText().trim());

				int result = num1 - num2;
				String s = num1 +"-"+num2+"="+result;
				lblResult.setText(s);
			}

		});

		btnGob.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int num1 = Integer.parseInt(tfNum1.getText().trim());
				int num2 = Integer.parseInt(tfNum2.getText().trim());

				int result = num1 * num2;
				String s = num1 +"*"+num2+"="+result;
				lblResult.setText(s);
			}

		});

		btnNanum.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int num1 = Integer.parseInt(tfNum1.getText().trim());
				int num2 = Integer.parseInt(tfNum2.getText().trim());

				int result = num1 / num2;
				String s = num1 +"/"+num2+"="+result;
				lblResult.setText(s);
			}

		});
	}

	public static void main(String[] args) {
		new SwingTextF_10();
	}
}
