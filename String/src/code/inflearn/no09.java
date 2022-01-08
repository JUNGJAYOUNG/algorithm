package code.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class no09 {
	
	public int solution(String str) {	//인스턴스 메소드기 때문에(static이 아닌) main에서 객체 생성해서 호출해야한다.
		
		int answer = 0;
		for(char x:str.toCharArray()) {
			if(x>=48 && x<=57) {
				answer = answer*10+(x-48);
			}
		}
		return answer;
		/*
		String answer = "";

		for(char x: str.toCharArray()) {
			if(Character.isDigit(x)) {
				answer += x;
			}	
		}
		return Integer.parseInt(answer);
		*/
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no09 T = new no09();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
