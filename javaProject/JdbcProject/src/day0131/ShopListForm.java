package day0131;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

// 시퀀스  상품명  수량  단가  총금액 --> 출력
// 테이블에서 상품을 클릭하면 우측에 이미지 나오게 Canvas내내부클래스 구현
public class ShopListForm extends JFrame {
	
	ShopDbModel dbModel = new ShopDbModel();
	ImageDraw draw = new ImageDraw(); // 이미지 출력을 위한 내부클래스
	String imageName;
	DefaultTableModel model; // 테이블
	JTable table;
	Vector<ShopDto> list;
	
	public ShopListForm() {
		super("상품 리스트폼");
		this.setBounds(200, 100, 700, 400);
		initDesign();
		this.setVisible(true);
	}
	
	public void initDesign() {
		this.setLayout(null);
		
		
		list = dbModel.getAllSangpums(); // db로부터 목록 얻기
		String[] title = {"No.","상품명","수량","단가","총금액","구입일"};
		model = new DefaultTableModel(title, 0);
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		js.setBounds(10, 10, 500, 300);
		this.add(js);
		
		draw.setBounds(520, 50, 160, 220); // 이미지 위치
		this.add(draw);		
		
		this.dataWrite(); // 데이터를 출력해 주는 메서드
		
		// 출력된 데이터 이벤트 --> 익명내부클래스
		table.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				// 행번호 얻기
				int row = table.getSelectedRow(); 
				
				// list에서 row에 해당하는 dto를 꺼내 이미지명을 얻기
				imageName = list.get(row).getPhoto();
				
				// 이미지 나오게하는 메서드 호출
				draw.repaint();
				super.mouseClicked(e);
			}
		
		});
	
	}
	// 데이터를 출력해 주는 메서드
	public void dataWrite() {
		// 테이블 기존 데이터 삭제
		model.setRowCount(0);
		
		// 테이블에 데이터 추가
		for(ShopDto dto: list) {
			Vector<String> data = new Vector<String>();
			
			data.add(dto.getNum());
			data.add(dto.getSangpum());
			data.add(String.valueOf(dto.getSu()));
			data.add(String.valueOf(dto.getDan()));
			data.add(String.valueOf(dto.getSu()*dto.getDan()));
			data.add(String.valueOf(dto.getGuipday()));
			
			// 테이블 모델에 데이터 추가
	        model.addRow(data);
			
		}
	}
	
	// 내부 클래스
	class ImageDraw extends Canvas{
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			
			if(imageName!=null) {
				Image image = new ImageIcon(imageName).getImage();
				g.drawImage(image, 0, 0, 160, 200, this);
			}
		}
	}
	
	public static void main(String[] args) {
		new ShopListForm();
	}
}
