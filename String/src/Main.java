import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	
	public int[] solution(String str, char c) {	//인스턴스 메소드기 때문에(static이 아닌) main에서 객체 생성해서 호출해야한다.
		int[] answer= new int[str.length()];	//배열 선언
		int p = 1000;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				p=0;
				answer[i]=p;
			}else {
				p++;
				answer[i]=p;
			}
		}
		p=1000;
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)==c) {
				p=0;
			}else {
				p++;
				answer[i]=Math.min(answer[i], p);	//기존값과 p중에서 작은값을 대입
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		
		for(int x: T.solution(str, c)) {
			System.out.println(x + " ");
		}
	}
}
