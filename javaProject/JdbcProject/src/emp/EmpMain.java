package emp;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EmpMain extends JFrame implements ActionListener{
	JButton btnAdd, btnDel, btnUpdate, btnList;
	EmpDbModel dbModel = new EmpDbModel();
	
	public EmpMain() {
		super("EmpMain");
		this.setBounds(200, 100, 400, 400);
		initDesign();
		this.setVisible(true);
	}
	
	public void initDesign() {
		this.setLayout(new GridLayout(2, 2));
		btnAdd = new JButton("등록");
		btnDel = new JButton("삭제");
		btnUpdate = new JButton("수정");
		btnList = new JButton("목록");
		
		this.add(btnAdd);
		this.add(btnDel);
		this.add(btnUpdate);
		this.add(btnList);
		
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnList.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if(ob==btnAdd) {
			System.out.println("add");
		} else if(ob ==btnDel) {
			System.out.println("del");	
		} else if(ob ==btnUpdate){
			System.out.println("update");
		} else if(ob ==btnList){
			System.out.println("list");
		}
		
	}
	
	public static void main(String[] args) {

	}

	

}
