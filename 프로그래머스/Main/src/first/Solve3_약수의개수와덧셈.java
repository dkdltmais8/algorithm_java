package first;

public class Solve3_¾à¼öÀÇ°³¼ö¿Íµ¡¼À {
	public static void main(String[] args) {
		solution(13,17);
	}
	
	public static int solution(int left, int right)
		{
        int answer = 0;
        for (int i=left;i<right+1;i++)
        {
        	if (check(i)%2==0)
        	{
        		answer += i;
        	}
        	else {
        		answer -= i;
        	}
        }
        System.out.print(answer);
        return answer;
	    }
	public static int check(int num)
	{
		int cnt = 0;
		for (int i=1; i<num+1;i++) {
			if (num%i==0)
				cnt += 1;
		}
		return cnt;
	}
	
}
