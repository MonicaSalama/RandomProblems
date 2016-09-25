import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class CompleteTheWord {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String s = rd.readLine();
		System.out.println(getNice(s));

	}

	static String getNice(String str) {
		if (str.length() < 26)
			return "-1";
		int startIndex = 0, shift = 65;
		boolean flag = false;
		int[] lastIndex = new int[26];
		Arrays.fill(lastIndex, -1);
		for (int i = 0; i < str.length(); i++) {
			int c = (int) str.charAt(i) - shift;
			if (str.charAt(i) == '?'){
				
			}
			else if (lastIndex[c] < startIndex) {
				lastIndex[c] = i;

			} else {
				startIndex = lastIndex[c] + 1;
				lastIndex[c] = i;

			}

			if ( (i - startIndex + 1) == 26) {
				flag = true;
				break;
			}
		}

		if (!flag)
			return "-1";

		ArrayList<Character> l = new ArrayList<>();

		for (int i = 0; i < lastIndex.length; i++) {
			if (lastIndex[i] < startIndex)
				l.add((char) (i + shift));
		}
		StringBuilder st = new StringBuilder("");
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '?') {
				if (i >= startIndex && i < (startIndex + 26)) {
					st.append(l.get(index));
					index++;
				} else {
					st.append("A");
				}
			} else
				st.append(str.charAt(i));
		}
		return st.toString();
	}

}
