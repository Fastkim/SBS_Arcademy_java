import java.util.Scanner;

public class MethodSample {
	/*static int coffee_machine(int button) {
		System.out.printf("1.뜨거운 물을 준비\n");
		System.out.printf("2.컵을 준비\n");
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int coffee;
		
		System.out.printf("좋아하는 커피의 종류는(1. 블랙, 2, 에스프레소, 3. 라떼)\n");
		coffee = sc.nextInt();
		
		System.out.printf("1.뜨거운 물을 준비\n");
		System.out.printf("2.컵을 준비\n");
		
		switch(button) {
		case 1:
			System.out.printf("1.블랙 커피를 탄다\n");
			break;
			
		case 2:
			System.out.printf("2.에스프레소 탄다\n");
			break;
			
		case 3:
			System.out.printf("3.라떼 커피를 탄다\n");
			break;
			
		default:
			System.out.printf("잘못입력하셨군요");
			
		}
		System.out.printf("4.물을 붓는다.\n");
		System.out.printf("5.맛있게 마신다.\n");
		
		return 0; // 결과값을 돌려준다.
	}
	
		switch(coffee) {
		case 1:
			System.out.printf("1.블랙 커피를 탄다\n");
			break;
			
		case 2:
			System.out.printf("2.에스프레소 탄다\n");
			break;
			
		case 3:
			System.out.printf("3.라떼 커피를 탄다\n");
			break;
			
		default:
			System.out.printf("잘못입력하셨군요");
			
		}
		System.out.printf("4.물을 붓는다.\n");
		System.out.printf("5.맛있게 마신다.\n");
		

		Scanner sc = new Scanner(System.in);
		int coffee;
		int read;
		
		System.out.printf("좋아하는 커피의 종류는(1. 블랙, 2, 에스프레소, 3. 라떼)\n");
		coffee = sc.nextInt();
		
		read = coffee_machine(coffee);
		
	}
*/

	
	static int plus(int v1, int v2) {
		int result; // 지역변수 (메서드 혹은 함수가 가지고 있는 변수)
		result = v1 + v2;
		return result;
		
	}
	
	public static void main(String[] args) {
		int sum;
		sum = plus(100,200);
		System.out.printf("합의 결과는 : %d\n", sum);
	}
}
