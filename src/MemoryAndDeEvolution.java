import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MemoryAndDeEvolution {
	
	/*
	 * http://codeforces.com/contest/712/problem/C
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		sc = new StringTokenizer("");
		out = new PrintWriter(System.out);
		int[] tr = new int[3];
		int x = nxtInt();
		Arrays.fill(tr, x);
		int target = nxtInt();
		int count = 0;
		while(tr[2] != target) {
			tr[2] = Math.max(target ,-tr[0]+tr[1]+1);
			count++;
			Arrays.sort(tr);
		}
		int count2 = 0;
		while(tr[0] != x) {
			tr[0] = Math.min(x ,tr[2]+tr[1]-1);
			count2++;
			Arrays.sort(tr);
		}
		out.println(Math.min(count,count2));
		out.close();

	}
	
	static BufferedReader br;
	static StringTokenizer sc;
	static PrintWriter out;

	static String nxtTok() throws IOException {
		while (!sc.hasMoreTokens()) {
			String s = br.readLine();
			if (s == null)
				return null;
			sc = new StringTokenizer(s.trim());
		}
		return sc.nextToken();
	}

	static int nxtInt() throws IOException {
		return Integer.parseInt(nxtTok());
	}

	static long nxtLng() throws IOException {
		return Long.parseLong(nxtTok());
	}

	static double nxtDbl() throws IOException {
		return Double.parseDouble(nxtTok());
	}

	static int[] nxtIntArr(int n) throws IOException {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nxtInt();
		return a;
	}

	static long[] nxtLngArr(int n) throws IOException {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nxtLng();
		return a;
	}

	static char[] nxtCharArr() throws IOException {
		return nxtTok().toCharArray();
	}

}
