import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LuckyNumbers {
    static int numDigits;
    static long num ;
    static long min = (long) Math.pow(10, 20);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader x = new InputStreamReader(System.in);
		BufferedReader rd = new BufferedReader(x);
		String s = rd.readLine();
		numDigits = s.length();
		num = Long.parseLong(s);
        getLucky(0, 0, 0);
        System.out.println(min);
	}
	static void getLucky(long current ,  int four , int seven){
		if(four == seven && current >= num){
			if(current < min){
				min = current;
			}
			return;
		}
		if(four+seven > numDigits+2){
			return;
		}
		getLucky(current*10+4, four+1, seven);
		getLucky(current*10+7, four, seven+1);
		
	}

}
