import java.util.Scanner;
public class Lec3Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		int num = input.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				System.out.println(num-i);
		}

	}

}
//이거