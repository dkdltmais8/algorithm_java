package first;
import java.util.*;
public class Solve5_2016³â {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(5,24);
	}
	public static String solution(int a, int b) {
        String answer = "";
        int cnt = 0;
        String[] name = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        for (int i=0;i<a;i++) {
        	for (int j=0;j<month[i];j++) {
        		cnt++;
        		if (i==(a-1) && j ==(b-1)) {
        			break;
        		}
        		
        	}
        }
        answer = name[(cnt-1)%7];
        System.out.print(answer);
        return answer;
    }

}
