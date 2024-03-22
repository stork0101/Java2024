import java.util.Scanner;
public class Int2Hwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
				
		System.out.print("정수를 입력하시오: ");
		int number = input.nextInt();
		
		switch(number) {
		case 1:
			System.out.print("하나\n");
			break;
		case 2:
			System.out.print("둘\n");
			break;
		default:
			System.out.print("관련없음\n");
			break;
			//순차구조이기 때문에 해당하는 값 모두 실행시킴 그러므로 break를 넣어줘야함
		}
	}

}
