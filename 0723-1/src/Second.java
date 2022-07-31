import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		int num1; //정수형 num1 변수 선언
		int num2; //정수형 num2 변수 선언
		int sum; //결과 값 저장하는 변수 선언
		
		
		sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
		
		sum = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + sum);
		
		sum = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + sum);
		
		sum = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + sum);
			
		int num1, num2;
		int result;
		
		// 문자 혹은 숫자를 입력받기 위해 Scanner 클래스를 사용한다.
		Scanner sc= new Scanner(System.in); 
		//sc : Scanner의 객체, new 연산자는 객체를 만들어 준다.
		//뒤에 Scanner : 생성자(객체를 초기화시켜준다.)
		//즉 sc = new Scanner(System.in)
		//자바에서는 객체가 만들어지기 위해서는 new 생성자()를 사용해야한다.
		//생성자는 클래스의 이름과 같다. Scanner -> Scanner : 이유는 초기화 때문에 이름이 같다
		//(System.in) -> 시스템안으로 데이터를 입력하겠다는 뜻.
		
		
		System.out.print("첫 번쟤 정수를 입력해주세요 : ");
		num1 = sc.nextInt(); // 정수형 입력 선언
		System.out.print("두 번쟤 정수를 입력해주세요 : ");
		num2 = sc.nextInt();
		
		result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		*/
		
		int num1 = 100, num2 = 500;
		int result = num1 + num2;
		
		System.out.printf("%05d와 %05d의 합의 결과는 %05d입니다.\n", num1,num2,result);
		// "%d" -> 서식지정자 , "%5d" -> 5음절로 빈공간 띄어 출력 , "%05d" -> 빈공간 0으로 출력
		// 100  -> 매개 변수 혹은 값
		
		// %d : 정수, %f : 실수, %c : 문자, %s : 문자열
		
		System.out.printf("%f\n", 123.45); //모든 언어의실수는 소숫점 6자리까지 표현
		System.out.printf("%7.1f\n", 123.45);
		
	}
}
