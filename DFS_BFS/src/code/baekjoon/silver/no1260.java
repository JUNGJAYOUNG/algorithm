package code.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//������ķ� ����
public class no1260 {
	//�Լ����� ����� ������(���������� ����)
	static int graph[][];
	static boolean[] visited;
	static int n,m,v;	//n ��������, m ��������, v Ž��������������ȣ
	
	public static void dfs(int start) {	//���
		visited[start] = true;
		System.out.print(start+" ");
		for(int j=1;j<n+1;j++) {
			if(graph[start][j] == 1 && !visited[j]) {
				dfs(j);	//���� ã�� ��ΰ� ���࿡ ������ �ٸ� ��ΰ� ������ �ٷ� ���� ������ �̵���Ű�� ���࿡ ������ �ٽ� ��Ŀ�ؼ�(���) ���ƿ��� ���.
			}
		}
	}
	
	public static void bfs(int start) {	//ť
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		visited[start] = true;
		//�湮�� ��ġ�� �˾ƾ��ϴϱ�, �װ��� üũ�ϱ� ���ؼ� visited�� �ʿ�.
		while(!q.isEmpty()) {
			int temp = q.poll();
			//ù��° �湮�� ��ġ�� ���ֱ�� �Ѵ�.
			System.out.print(temp + " ");
			
			for(int k=1;k<=n;k++) {
				if(graph[temp][k] == 1 && !visited[k]) {
					q.offer(k);
					visited[k] = true;
				}
			}	
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s," ");		
		n = Integer.parseInt(st.nextToken());	//��������
		m = Integer.parseInt(st.nextToken());	//��������
		v = Integer.parseInt(st.nextToken());	//Ž������������ȣ
		
		graph = new int[n+1][n+1];	
		for(int i=0;i<m;i++) {
			String edge = br.readLine();	//������ �����ϴ� �� ������ ��ȣ
			StringTokenizer st1 = new StringTokenizer(edge," ");
			int a = Integer.parseInt(st1.nextToken());
			int b = Integer.parseInt(st1.nextToken());
			graph[a][b]=1;	//���� �����
			graph[b][a]=1;
		}
		
		visited = new boolean[n+1];
		Arrays.fill(visited, false);
		dfs(v);
		System.out.println();
		Arrays.fill(visited, false);
		bfs(v);
	}

}
