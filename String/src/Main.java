import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	
	public int[] solution(String str, char c) {	//�ν��Ͻ� �޼ҵ�� ������(static�� �ƴ�) main���� ��ü �����ؼ� ȣ���ؾ��Ѵ�.
		int[] answer= new int[str.length()];	//�迭 ����
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
				answer[i]=Math.min(answer[i], p);	//�������� p�߿��� �������� ����
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
