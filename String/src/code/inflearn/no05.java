package code.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class no05 {
	
	public String solution(String str) {	//인스턴스 메소드기 때문에(static이 아닌) main에서 객체 생성해서 호출해야한다.
		String answer="";
		char[] s= str.toCharArray();
		int lt=0,rt=str.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(s[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(s[rt])) {
				rt--;
			}else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer=String.valueOf(s);
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no05 T = new no05();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}

