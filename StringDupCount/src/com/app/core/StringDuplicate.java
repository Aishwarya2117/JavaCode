package com.app.core;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HelloWorld";
		
		int i, j;
		boolean [] visited=new boolean[s.length()];
		
		for (i = 0; i < s.length() - 1; i++) {
			if(visited[i]) continue;
			int cnt = 1;
			for (j = i + 1; j < s.length() ; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					cnt++;
					visited[j]=true;
				}
			}
			if(cnt>1)
			{
				System.out.println(s.charAt(i) + "=" + cnt);
				
			}
			
			cnt = 0;

		}
	}

}
