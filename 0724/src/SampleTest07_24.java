import java.util.Scanner;

// 연산자, 강제 형변환
public class SampleTest07_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int num1 = 2, num2 = 3, num3 = 4; // 정수형 변수 선언 및 초기화
		int result1, result2, result3;
		float result4; //실수형 변수 선언

		result1 = num1 + num2 - num3;
		System.out.printf("%d + %d - %d = %d\n" , num1,num2,num3,result1);

		result2 = num1 + num2 * num3; //연산자 우선 순위 
		System.out.printf("%d + %d * %d = %d\n" , num1,num2,num3,result2);
		
		result4 = num1 * num2 / (float)num3; // 강제 형 변환
		System.out.printf("%d + %d * %d = %f\n" , num1,num2,num3,result4);
		
		result2 = num3 / num2; // 몫 구하기
		System.out.printf("%d / %d 의 몫은 %d입니다.\n" , num3,num2,result2);
		
		result3 = num3 % num2; // 나미저 구하기
		System.out.printf("%d / %d 의 나머지는 = %d입니다.\n" , num3,num2,result3);
		
		
		int num = 10; 
		
		num++;// num = num + 1, num +=1
		System.out.printf("a++==> %d\n", num);
		
		num--;// num = num + 1, num +=1
		System.out.printf("a--==> %d\n", num);
		
		num +=5;// num = num + 5
		System.out.printf("num +=5 ==> %d\n", num);
		
		
		// 증감 연산자 (++,--)
		
		int num = 10, num1;
		
		num1 = num++; //선 연산 후 증가
		System.out.printf("%d\n", num1);
		
		num1 = ++num; //선 증가 후 연산
		System.out.printf("%d\n", num1);
		
		
		//관계 연산자
		
		int num1 = 100, num2 = 200;
		
		System.out.printf("%d == %d는 %s입니다.\n",num1,num2, num1==num2);
		System.out.printf("%d != %d는 %s입니다.\n",num1,num2, num1!=num2);
		System.out.printf("\n");
		System.out.printf("%d = %d는 %d입니다.\n",num1,num2, num1=num2);
		System.out.printf("%d = %d는 %s입니다.\n",num1,num2, num1=num2);
		
		
		
		//논리 연산자
		// &&(and) , || (or) , !(not)
		
		int num = 99;
		
		System.out.printf("AND 연산자 : %s\n", (num >= 100) && (num <= 200));
		System.out.printf("OR 연산자 : %s\n", (num >= 100) || (num <= 200));
		System.out.printf("not 연산자 : %s\n", !(num == 100));
		
		
		
		int num = 99;
		
		if(num>100) {
			System.out.println("참입니다");
		    System.out.println("참입니다1");
		}
		else {
			System.out.println("거짓입니다");
			System.out.println("거짓입니다1");
		}
		
		
		//값을 입력받아서 정수,홀수 구분하기
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		num = sc.nextInt(); //정수 입력 받을 수 있게 해주는 메서드
		
		if(num % 2 == 0)
			System.out.println("짝수입니다.\n");
		else
			System.out.println("홀수입니다.\n");
		
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
		
		num = sc.nextInt();
		
		if(num >= 90)
			System.out.printf("A학점입니다.");
		else if(num >= 80)
			System.out.printf("B학점입니다.");
		else if(num >= 70)
			System.out.printf("C학점입니다.");
		else if(num >= 60)
			System.out.printf("D학점입니다.");
		else
			System.out.printf("F학점입니다.");
		
		
		
		
		int num, num1;
		int result,result1,result2,result3;
		char operator;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력해 주세요 : ");
		num = sc.nextInt();
		
		System.out.print("계산할 연산자를 입력해 주세요 : ");
		operator = sc.next().charAt(0);
		
		System.out.print("두 번째 정수를 입력해 주세요 : ");
		num1 = sc.nextInt();
		
		result = num + num1;
		result1 = num - num1;
		result2 = num * num1;
		result3 = num / num1;
		 
		
		if(operator == '+')
			System.out.printf("%d + %d = %d 입니다.",num,num1,result);
		else if(operator == '-')
			System.out.printf("%d - %d = %d 입니다.",num,num1,result1);
		else if(operator == '*')
			System.out.printf("%d * %d = %d 입니다.",num,num1,result2);
		else if(operator == '/')
			System.out.printf("%d / %d = %d 입니다.",num,num1,result3);
		else
			System.out.printf("등록되지않은 연산자입니다.");
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.printf("1~4 중에 하나를 선택해 주세요 : ");
		
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.printf("1번 메뉴를 선택하셨군요.\n");
			break;
		case 2:
			System.out.printf("2번 메뉴를 선택하셨군요.\n");
			break;
		case 3:
			System.out.printf("3번 메뉴를 선택하셨군요.\n");
			break;
		case 4:
			System.out.printf("4번 메뉴를 선택하셨군요.\n");
			break;
		default : 
			System.out.printf("잘못 선택하셨습니다.\n");
			
		}
		
		
		System.out.printf("처음으로 해보는 for문");
		System.out.printf("처음으로 해보는 for문");
		System.out.printf("처음으로 해보는 for문");
		System.out.printf("처음으로 해보는 for문");
		System.out.printf("처음으로 해보는 for문");
		
		
		for(int i=0;i<=4;i++) {
			System.out.printf("처음으로 해보는 for문\n");
		}

	
		int sum = 0; // 변수는 선언과 동시에 초기화를 해주어야 한다.
		
		for(int i=1;i<=10;i++) {
			
			sum = sum + i;
		}
		System.out.printf("1부터 10까지의 합은 %d입니다.\n",sum);
		
		
		 예제) Scanner class 이용해서
		1부터 입력한 수까지의 합을 구하는 프로그램 작성 
		
		
		int num,sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("1부터 더할 끝값을 입력하세요 : ");
		num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			
			sum = sum + i;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.\n",num,sum);
		
		
		
		예제 ) Scanner class 이용해서
		원하는 구구단을 입력받아 구구단 출력하는 프로그램 작성 
		
		int num1,hex = 0;
		Scanner sc1 = new Scanner(System.in);
		
		System.out.printf("원하는 구구단의 단수를 입력하세요 : ");
		num1 = sc1.nextInt();
		
		for(int i=1;i<=9;i++) {
			hex = num1*i;
			System.out.printf("%d X %d = %2d\n",num1,i,hex);
			
		}
		
		
		
		int i, j;
		for(i = 2; i <= 9; i++) {
			for(j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n",i, j, i * j);
			}
			System.out.printf("\n");
		}
		
		
		int i = 0;
		for(i = 0; i <5; i++) {
			System.out.printf("for문으로 작업하는 내용\n");
		}
		
		
		int i = 0;
		while(i < 5) {
			System.out.printf("while문으로 작업하는 내용\n");
			i++;
		}
		
		
		
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			sum = sum+i;
			i++;
		}
			System.out.printf("1부터 10까지의 합은 %d입니다.",sum);
			
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		for( ; ; ) {// 무한 루프 식
			System.out.printf("첫 번째 정수 입력 : ");
			num1 = sc.nextInt();
			System.out.printf("두 번째 정수 입력 : ");
			num2 = sc.nextInt();
			
			System.out.printf("%d + %d = %d\n", num1,num2,num1+num2);  //Ctrl + Z : 강제종료
		}
		
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		while(true) {// 무한 루프 식 C언어 while(1)
			System.out.printf("첫 번째 정수 입력 : ");
			num1 = sc.nextInt();
			System.out.printf("두 번째 정수 입력 : ");
			num2 = sc.nextInt();
			
			System.out.printf("%d + %d = %d\n", num1,num2,num1+num2);  //Ctrl + Z : 강제종료
			
			
    
		//문제 ] 1부터 100까지의 합을 구하는 프로그램에서 최초로 1000이 넘는 위치의 숫자는 무엇인지 찾는 프로그램 작성
		
		int i = 0;
		int sum = 0;
		
		for(i=0;i<=100;i++) {
			sum = sum+i;
			if(sum>=1000) 
			break;
		 }
		
			System.out.printf("1000이 넘는 위치의 최초의 숫자는 : %d\n", i);
			
		
	    Scanner sc = new Scanner(System.in);
	    int a, b, c, d;
	    int sum = 0;
	    
	    System.out.printf("1번째 정수 입력 : ");
	    a = sc.nextInt();
	    System.out.printf("2번째 정수 입력 : ");
	    b = sc.nextInt();
	    System.out.printf("3번째 정수 입력 : ");
	    c = sc.nextInt();
	    System.out.printf("4번째 정수 입력 : ");
	    d = sc.nextInt();
	    
	    sum = a + b + c + d;
	    
	    System.out.printf("합은 : %d\n", sum);
	    
	    
		
		Scanner sc = new Scanner(System.in);
		
		int[] aa = new int[4];
		int sum = 0;
		
		System.out.printf("1번째 정수 입력 : ");
	    aa[0] = sc.nextInt();
	    System.out.printf("2번째 정수 입력 : ");
	    aa[1] = sc.nextInt();
	    System.out.printf("3번째 정수 입력 : ");
	    aa[2] = sc.nextInt();
	    System.out.printf("4번째 정수 입력 : ");
	    aa[3] = sc.nextInt();
	    
	    sum = aa[0]+aa[1]+aa[2]+aa[3];
	    
	    System.out.printf("합은 : %d\n", sum);
	    
	    
		
		
Scanner sc = new Scanner(System.in);
		
		int[] aa = new int[10];
		int sum = 0;
		int i;
		
		for(i=0;i<=9;i++) {
			System.out.printf("%d번째 정수 입력 : ",i+1);
			aa[i] = sc.nextInt();
			sum = sum + aa[i];
		}
	    System.out.printf("배열의 총합은 : %d\n", sum);
	    
	    
		int aa[] = { 10,20,30,40 }; // 배열 선언과 동시에 초기화
		int bb[] = new int[] {10,20,30}; //(2)
		
		int cc[]; // 배열만 선언 (3)
		cc = new int[] {10,20}; //(3)
		
		int[] dd = new int[1]; //(4)
		dd[0] = 100; //(4)
		
		
		int i;
		
		for(i=0 ; i <4; i ++) {
			System.out.printf("aa[%d] : %d\n", i, aa[i]);
		}
		System.out.printf("\n");
		
		for(i=0 ; i <3; i ++) {
			System.out.printf("bb[%d] : %d\n", i, bb[i]);
		}
		System.out.printf("\n");
		
		for(i=0 ; i <2; i ++) {
			System.out.printf("cc[%d] : %d\n", i, cc[i]);
		}
		System.out.printf("\n");
		
		for(i=0 ; i <1; i ++) {
			System.out.printf("dd[%d] : %d\n", i, dd[i]);
		}
		System.out.printf("\n");
		
		
		int aa[]= {10,20,30,40};
		int len, size; // len => 배열의 길이값, size => 배열의 전체 크기(byte) 계산
		
		len = aa.length; // 배열의 개수(길이값) 계산
		size = len * Integer.BYTES; // 배열의 전체 크기 계산

		System.out.printf("배열 aa[의] 길이값은 %d 입니다.\n", len);
		System.out.printf("배열 aa[의] 전체크기는 %d바이트 입니다.\n", size);
		
		
		// 문자열의 길이값 ==> length()
		String str = "java programing"; //str은 String 클래스의 참조 변수이다.
		int len;
		
		len = str.length();
		
		System.out.printf("문자열 : %s\n", str); // 문자열 출력
		System.out.printf("문자열 길이 : %d\n", len); // 문자열 길이 출력
		
		
		//a ===> ^ 변경
		
		
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("문자열을 입력 : ");
		str = sc.nextLine();  // 문자열을 키보드로부터 입력받는다.
		
		System.out.printf("문자열 출력 : ");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a')
				System.out.printf("%c",'^');
			else
				System.out.printf("%c",str.charAt(i));
		}
		
		// 대문자, 소문자 로 변경 ==> toUpperCase(), toLowerCase()
		String str = "한글 한글 ABCD efgh";
		
		System.out.println("문자열 출력 :[" + str + "]");
		System.out.println("대문자로 출력 : " + str.toUpperCase());
		System.out.println("소문자로 출력 : " + str.toLowerCase());
		
		
		String str1 = "Java Programming";
		String str2 = "Java Programming";
		String str3 = new String("Java Programming");
		
		System.out.println("문자열 str1 출력 :[" + str1 + "]");
		System.out.println("문자열 str2 출력 :[" + str2 + "]");
		System.out.println("문자열 str3 출력 :[" + str3 + "]\n");
		
		System.out.println("str1 == str2는 : \t" + (str1 == str2)); // True
		System.out.println("str1.equals(str2)는 : \t" + str1.equals(str2)); // True
		System.out.println("str1 == str3는 : \t" + (str1 == str3)); // False
		System.out.println("str1.equals(str3)는 : \t" + str1.equals(str3)); // False
		// equals() = 문자열이 같은지를 물어보는것
		// == : 문자열과 가리키는 주소도 같은지를 물어본다.
		
		문제1) 입력한 두 숫자 사이의 합을 구하는 프로그램을 작성하시오
		단, 원하는 배수를 입력하여 합을 구하는 프로그램
		
		출력 예]
				시작값을 입력하시오 : 10
				끝 값을 입력하시오 : 100
				배수를 입력하시오 : 5
				
		
		int start,end;
		int num,i;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("시작값을 입력하시오 : ");
		start = sc.nextInt();
		System.out.printf("끝값을 입력하시오 : ");
		end = sc.nextInt();
		System.out.printf("배수를 입력하시오 : ");
		num = sc.nextInt(); 
		
		i = start;
		while(i <=end) {
			if(i % num == 0)
				sum = sum + i;
			
			i++;
		}
		
		System.out.printf("%d부터 %d 사이의 %d의 배수의 합은 : %d\n 입니다.",start,end,num,sum);
		
		
		문제 2) 입력한 문자열의 대문자 및 소문자 그리고 숫자가 몇개인지 세는 프로그램을 작성하시오

		출력 예]
		  문자열을 입력 : java proGram 154
		*/
		 
		Scanner sc = new Scanner(System.in);
		String str;
		char ch;
		int upper_count = 0, lower_count = 0, number_count = 0;
		int i;
		
		System.out.printf("문자열을 입력 : ");
		str = sc.nextLine(); // 문자열 입력
		// Java Programming
		i = 0;
		do {
			ch =str.charAt(i);// 문자열에서 한 글자씩 추출
			
			if(ch >= 'A' && ch <= 'Z')
				upper_count++;
			
			if(ch >= 'a' && ch <= 'z')
				lower_count++;
			
			if(ch >= '0' && ch <= '9')
				number_count++;
			
			i++;
		}while(i<str.length());
		
		System.out.printf("대문자 %d개, 소문자 %d개, 숫자 %d개입니다.\n",upper_count, lower_count, number_count);
		  
		  
  }
}
















