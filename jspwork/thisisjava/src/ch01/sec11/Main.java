package ch01.sec11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 세 개의 숫자를 입력받음
            long A = scanner.nextLong();
            long B = scanner.nextLong();
            long C = scanner.nextLong();

            // 입력 범위 확인
            if (A < 1 || A > Math.pow(10, 12) || B < 1 || B > Math.pow(10, 12) || C < 1 || C > Math.pow(10, 12)) {
                System.out.println("입력이 유효하지 않습니다.");
                return; // 프로그램 종료
            }

            // A, B, C를 더하여 결과를 계산
            long sum = A + B + C;

            // 결과 출력
            System.out.println(sum);

        } catch (Exception e) {
            System.out.println("입력이 유효하지 않습니다.");
        } finally {
            // 스캐너 닫기
            scanner.close();
        }
    }
}

