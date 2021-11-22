package first;

public class Solve9_두정수사이의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numa = 3;
		int numb = 5;
		solution(numa,numb);
	}
	public static long solution(int a, int b) {
        long answer = 0;
        if (a > b)
        {
        	int temp = b;
        	b = a;
        	a = temp;
        	
        }
        for (int i=a; i<b+1;i++)
        {
        	answer+=i;
        }
        return answer;
    }

}
