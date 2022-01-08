package code.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class no06 {
	
	public String solution(String str) {	//인스턴스 메소드기 때문에(static이 아닌) main에서 객체 생성해서 호출해야한다.
		String answer="";
		for(int i=0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i))==i) {	//indexOf함수는 가장 먼저 나온 인덱스를 반환하니까 charAt한거의 인덱스랑 결과가 다르면 중복됐다는 의미
				answer += str.charAt(i);
			}
			/*
			if(answer.indexOf(str.charAt(i))==-1) {
				answer+=str.charAt(i);
			}
			*/
		}		
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no06 T = new no06();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
