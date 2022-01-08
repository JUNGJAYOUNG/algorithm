package code.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class no08 {
	
	public String solution(String str) {	//인스턴스 메소드기 때문에(static이 아닌) main에서 객체 생성해서 호출해야한다.
		String answer="NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp= new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) {
			answer="YES";
		}
		return answer;
		
		/*
		String answer="";
		String reverse="";
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(Character.isAlphabetic(arr[i])) {
				answer+=arr[i];
			}	
		}
		
		StringBuilder sb = new StringBuilder(answer);
		reverse = sb.reverse().toString();
		
		if(answer.equalsIgnoreCase(reverse)) {
			answer="YES";
		}else {
			answer="NO";
		}
		return answer;
		*/
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no08 T = new no08();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
