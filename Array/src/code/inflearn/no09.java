package code.inflearn;

import java.util.Scanner;
public class no09 {
	
	public int solution(int n, int[][] arr) {	//인스턴스 메소드기 때문에(static이 아닌) main에서 객체 생성해서 호출해야한다.
		int answer=0;
		int x1=0;	//왼쪽 대각선 합
		int x2=0;	//오른쪽 대각선 합
		int sumx =0; //두 대각선의 합
		int sum;
		int sum1, sum2;
		//각 행의 합
		for(int i=0;i<n;i++) {
			sum1=sum2=0;
			for(int j=0;j<n;j++) {
				sum1+=arr[i][j];
				sum2+=arr[j][i];
			}
			answer=Math.max(answer, sum1);	//둘 중 더 큰값 비교 Math.max()함수 사용
			answer=Math.max(answer, sum2);
		}
		
		//왼쪽 대각선의 합
		sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i][i];
		}
		answer=Math.max(answer, sum);
		//오른쪽 대각선의 합
		sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i][n-1-i];
		}
		answer=Math.max(answer, sum);
		
		return answer;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no09 T = new no09();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {		
				arr[i][j]= kb.nextInt();
			}	
		}
		System.out.println(T.solution(n, arr));
	}
}

