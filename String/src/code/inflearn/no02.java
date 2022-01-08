package code.inflearn;

import java.util.*;
public class no02 {
	
	public String solution(String str) {	//인스턴스 메소드기 때문에(static이 아닌) main에서 객체 생성해서 호출해야한다.
		String answer = "";
		for(char x: str.toCharArray()) {
			if(x>=97 && x<=122) {	//소문자면
				answer += (char)(x-32);	//대문자로 변환
			}else {
				answer += (char)(x+32);
			}
			/*
			if(Character.isLowerCase(x)) {	//Character.클래스 안의 isLowerCase()메소드 이용		
				answer+=Character.toUpperCase(x);	//answer String이니까 +=로 누적
			}else {
				answer+=Character.toLowerCase(x);
			}	
			*/
		}		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		no02 T = new no02();
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
	
		System.out.print(T.solution(str));
	}

}

