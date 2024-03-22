import java.util.Scanner;
public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner input = new Scanner(System.in);
		System.out.println("정수1을 입력하세요: ");
		num1 = input.nextInt();
		System.out.println("정수2를 입력하세요: ");
		num2 = input.nextInt();
		if(num1>num2) 
			System.out.println(num1);
		else
			System.out.println(num2);
	}

}
