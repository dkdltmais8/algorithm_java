package first;

import java.util.Arrays;

public class Solve8_Ã¼À°º¹ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lost = {2,4};
		int[] reserve = {3};
		solution(5,lost,reserve);
	}
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i=0;i<lost.length;i++)
        {
        	for (int j=0;j<reserve.length;j++)
        	{
        		if (lost[i]==reserve[j])
        		{
        			lost[i]=reserve[j] = -1;
        			answer++;
        			break;
        		}
        	}
        }
        for (int i=0;i<lost.length;i++)
        {
        	for (int j=0;j<reserve.length;j++)
        	{
        		if (lost[i]==reserve[j]-1 || lost[i]==reserve[j]+1 )
        		{
        			lost[i]=reserve[j] = -1;
        			answer++;
        			break;
        		}
        	}
        }
        return answer;
    }
}
