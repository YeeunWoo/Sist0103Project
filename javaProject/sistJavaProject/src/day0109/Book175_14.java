package day0109;

import java.util.Scanner;

public class Book175_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inwon, total = 0;
		String[] name;
		int[] score, rank;
		double avg;
		
		System.out.print("몇 명?");
		inwon = Integer.parseInt(sc.nextLine());
		
		// 인원수만큼 배열로 할당
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];
		
		// 인원수만큼 데이터 입력
		for(int i = 0; i<inwon;i++) {
			System.out.print(i+"번지 이름: ");
			name[i] = sc.nextLine();
			System.out.print(i+"번지 점수: ");
			//score[i] = sc.nextInt();
			score[i] = Integer.parseInt(sc.nextLine());
			total += score[i];
		}
		
		// 등수 구하기
		for(int i = 0; i<inwon;i++) {
			rank[i] = 1;
			
			for(int j = 0; j<inwon;j++) {
				// 비교되는 대상 점수가 더 높으면 i번지의 등수를 1증가시킨다.
				if(score[i]<score[j])
					rank[i]++;
			}
		}
		
		avg = (double)total/inwon;
		
		System.out.println("번호\t이름\t점수\t등수");
		System.out.println("==============================\n");
		
		for(int i = 0; i<inwon;i++) {
			System.out.println(i+1+"\t"+name[i]+"\t"+score[i]+"\t"+rank[i]);
		}
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		
	}

}
