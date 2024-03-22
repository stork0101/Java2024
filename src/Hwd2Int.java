import java.util.Scanner;
public class Hwd2Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
				
		System.out.print("한글을 입력하시오: ");
		String hwd = input.next(); //문자열(String)은 next로 받는다.
		
		switch(hwd) {
		case "하나":
			System.out.print(1);
			break;
		case "첫번째":
			System.out.print(1);
			break;
		case "일":
			System.out.print(1);
			break;
		case "둘","이","두번째": //이렇게 작성해도 된다고함
			System.out.print(2);
			break;
		default:
			System.out.print("관련없음\n");
			break;
			//순차구조이기 때문에 해당하는 값 모두 실행시킴 그러므로 break를 넣어줘야함
		}
	}

}
