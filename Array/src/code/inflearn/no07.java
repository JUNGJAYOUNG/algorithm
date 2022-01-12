package code.inflearn;

import java.util.Scanner;
public class no07 {
	
	public int solution(int n, int[] arr) {	//인스턴스 메소드기 때문에(static이 아닌) main에서 객체 생성해서 호출해야한다.
		int[] answer=new int[n];
		int sum=0;
		if(arr[0]==1) {
			answer[0]=1;
		}else {
			answer[0]=0;
		}
		
		for(int i=1;i<n;i++) {
			if(arr[i]==0) {
				answer[i]=0;
			}else {
				answer[i]=1;
				if(answer[i-1]>=1) {
					answer[i]=answer[i-1]+1;
				}
			}		
		}
		for(int i=0;i<n;i++) {
			sum+=answer[i];
		}
		return sum;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		no07 T = new no07();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		System.out.println(T.solution(n,arr));
		
	}
}

