package code.inflearn;

import java.util.Scanner;
public class no05 {
	
	public int solution(int n) {	//인스턴스 메소드기 때문에(static이 아닌) main에서 객체 생성해서 호출해야한다.
		int answer= 0;
		int[] ch = new int[n+1];	//인덱스번호가 n번까지 생겨야해서 n+1길이만큼 만든다.
		for(int i=2;i<=n;i++) {		//0,1은 소수에 포함 안되니까 2부터 시작
			if(ch[i]==0) {
				answer++;
				for(int j=i;j<=n;j=j+i) {	//j가 i의 배수를 돌아야하니까 i씩 증가
					ch[j]=1;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no05 T = new no05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}

