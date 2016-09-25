import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MemoryAndTrident {

	/*
	 * http://codeforces.com/contest/712/problem/B
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		sc = new StringTokenizer("");
		out = new PrintWriter(System.out);
		String str = br.readLine().trim();
		out.println(solution(str));
		out.close();
	}
	
	static int solution(String str) {	
		int ud = 0 , rl = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			switch (c) {
			case 'U':
				ud++;
				break;
			case 'D':
				ud--;
				break;
			case 'L':
				rl--;
				break;
			case 'R':
				rl++;
				break;
			}

		}
		int num = Math.abs(ud) + Math.abs(rl);
		if(num % 2 == 0)
			return num/2;
		return -1;
	
	}

	static BufferedReader br;
	static StringTokenizer sc;
	static PrintWriter out;

}
