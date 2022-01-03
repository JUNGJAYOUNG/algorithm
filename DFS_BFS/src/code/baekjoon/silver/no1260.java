package code.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//인접행렬로 구현
public class no1260 {
	//함수에서 사용할 변수들(전역변수로 선언)
	static int graph[][];
	static boolean[] visited;
	static int n,m,v;	//n 정점개수, m 간선개수, v 탐색시작할정점번호
	
	public static void dfs(int start) {	//재귀
		visited[start] = true;
		System.out.print(start+" ");
		for(int j=1;j<n+1;j++) {
			if(graph[start][j] == 1 && !visited[j]) {
				dfs(j);	//내가 찾은 경로가 만약에 더깊이 다른 경로가 있으면 바로 다음 곳으로 이동시키고 만약에 없으면 다시 리커해서(재귀) 돌아오는 방식.
			}
		}
	}
	
	public static void bfs(int start) {	//큐
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		visited[start] = true;
		//방문한 위치는 알아야하니까, 그것을 체크하기 위해서 visited이 필요.
		while(!q.isEmpty()) {
			int temp = q.poll();
			//첫번째 방문한 위치는 빼주기로 한다.
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
		n = Integer.parseInt(st.nextToken());	//정점개수
		m = Integer.parseInt(st.nextToken());	//간선개수
		v = Integer.parseInt(st.nextToken());	//탐색시작정점번호
		
		graph = new int[n+1][n+1];	
		for(int i=0;i<m;i++) {
			String edge = br.readLine();	//간선이 연결하는 두 정점의 번호
			StringTokenizer st1 = new StringTokenizer(edge," ");
			int a = Integer.parseInt(st1.nextToken());
			int b = Integer.parseInt(st1.nextToken());
			graph[a][b]=1;	//간선 양방향
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
