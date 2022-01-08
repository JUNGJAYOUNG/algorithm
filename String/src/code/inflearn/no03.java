package code.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class no03 {
	
	public String solution(String str) {	//인스턴스 메소드기 때문에(static이 아닌) main에서 객체 생성해서 호출해야한다.
		String answer = "";
		int max=0, pos;
		
		while((pos=str.indexOf(' '))!=-1) {
			String tmp = str.substring(0,pos);
			int len = tmp.length();
			if(len>max) {
				max=len;
				answer=tmp;
			}
			str=str.substring(pos+1);
		}
		/*
		String[] arr = str.split(" ");
		for(String x : arr) {
			if(max < x.length()) {
				max = x.length();
				answer = x;
			}		
		}*/
		if(str.length()>max) {
			answer = str;
		}
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no03 T = new no03();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
	}

}
