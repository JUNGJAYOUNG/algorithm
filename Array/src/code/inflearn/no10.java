package code.inflearn;

import java.util.Scanner;
public class no10 {
	
	public int solution(int n, int[][] a) {	//인스턴스 메소드기 때문에(static이 아닌) main에서 객체 생성해서 호출해야한다.
		int answer=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(a[i][j]>a[i+1][j] && a[i][j]>a[i-1][j] && a[i][j]>a[i][j+1] && a[i][j]>a[i][j-1]) {
					answer++;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no10 T = new no10();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		int[][] arr = new int[n+2][n+2];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=5;j++) {		
				arr[i][j]= kb.nextInt();
			}	
		}
		System.out.println(T.solution(n, arr));
	}
}
