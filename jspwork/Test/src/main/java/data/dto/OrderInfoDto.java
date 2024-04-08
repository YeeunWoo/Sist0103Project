package data.dto;

public class OrderInfoDto {
	
	private String proNum;
    
	private int orderDetailSu;
    
	/* DB로부터 꺼내올 값 */
    private String bookName;
    
    private int bookPrice;
    
    private double bookDiscount;
    
	/* 만들어 낼 값 */
    private int salePrice;
    
    private int totalPrice;
    
    private int point;
    
    private int totalPoint;
}
