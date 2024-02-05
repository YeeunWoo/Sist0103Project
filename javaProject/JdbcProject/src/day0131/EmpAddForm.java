package day0131;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class EmpAddForm extends JFrame implements ActionListener {

	JTextField tfName, tfGender, tfDept, tfPosition, tfAddr, tfPay, tfEmail;
	JLabel lblPhoto;
	String imageName;
	JButton btnImage, btnInsert;

	// db모델 생성
	EmpDbModel model = new EmpDbModel();

	// 내부클래스
	PhotoDraw photoDraw = new PhotoDraw();

	public EmpAddForm() {
		super("상품 추가폼");
		this.setBounds(200, 100, 400, 350);
		initDesign();
		this.setVisible(true);	
	}

	public void initDesign() {
		this.setLayout(null);

		JLabel lbl1 = new JLabel("이름");
		lbl1.setBounds(30, 10, 60, 30);
		this.add(lbl1);

		tfName = new JTextField();
		tfName.setBounds(110, 10, 100, 30);
		this.add(tfName);

		JLabel lbl2 = new JLabel("사진선택");
		lbl2.setBounds(30, 60, 60, 30);
		this.add(lbl2);

		btnImage = new JButton("사진선택");
		btnImage.setBounds(110, 60, 100, 30);
		this.add(btnImage);
		btnImage.addActionListener(this);

		//이미지추가
		photoDraw.setBounds(250, 10, 80, 90);
		this.add(photoDraw);

		//이미지명
		lblPhoto = new JLabel("이미지명");
		lblPhoto.setBorder(new LineBorder(Color.pink));
		lblPhoto.setBounds(20, 120, 300, 30);
		this.add(lblPhoto);

		//급여
		JLabel lbl3 = new JLabel("급여");
		lbl3.setBounds(30, 160, 70, 30);
		this.add(lbl3);

		tfPay = new JTextField();
		tfPay.setBounds(110, 160, 70, 30);
		this.add(tfPay);

		//부서
		JLabel lbl4 = new JLabel("부서");
		lbl4.setBounds(30, 200, 70, 30);
		this.add(lbl4);

		tfDept = new JTextField();
		tfDept.setBounds(110, 200, 70, 30);
		this.add(tfDept);

		//직급
		JLabel lbl5 = new JLabel("직급");
		lbl5.setBounds(30, 240, 70, 30);
		this.add(lbl5);

		tfPosition = new JTextField();
		tfPosition.setBounds(110, 240, 70, 30);
		this.add(tfPosition);

















		//db추가버튼
		btnInsert = new JButton("DB추가");
		btnInsert.setBounds(250, 250, 100, 30);
		btnInsert.addActionListener(this);
		this.add(btnInsert);

	}

	// 내부클래스 --> 이미지 삽입을 위해
	class PhotoDraw extends Canvas{

		@Override
		public void paint(Graphics g) {
			super.paint(g);

			if(imageName!=null) {
				Image image = new ImageIcon(imageName).getImage();
				g.drawImage(image, 10, 10, 60, 70, this);
			}

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		if(ob==btnImage) {
			FileDialog dlg = new FileDialog(this, "이미지 가져오기", FileDialog.LOAD);
			dlg.setVisible(true);

			// 취소 누르면 메서드 종료
			if(dlg.getDirectory()==null)
				return;
			// 이미지명 얻기
			imageName = dlg.getDirectory() + dlg.getFile();

			// 라벨에 이미지명 출력
			lblPhoto.setText(imageName);

			// 이미지 출력
			photoDraw.repaint();

		} else if (ob == btnInsert) {
			// ShopDto 생성
			EmpDto dto = new EmpDto();

			// dto에 4개의 데이터 넣기
			dto.setName(tfName.getText());
			dto.setPhoto(imageName);
			dto.setPay(Integer.parseInt(tfPay.getText()));

			// db모델에서 insert메서드 호출
			model.insertEmp(dto);

			// 현재창 닫기
			this.setVisible(false);
		}

	}

}
