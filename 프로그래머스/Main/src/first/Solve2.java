package first;

import java.util.Arrays;

public class Solve2 {

	public static void main(String[] args) 
	{
		int[] numbers = {1,2,4,2,5};
		solution(numbers);
	}
	public static int[] solution(int[] numbers) 
	{
        int[] answer = {};
        int[] ans = numbers;
        int[] res = new int[25];
        int cnt = 0;
        for (int i=0; i<ans.length;i++)
        {
        	for (int j=0;j<ans.length;j++)
        	{
        		if (i==j) continue;
        		res[cnt] = ans[i]+ans[j];
        		cnt++;
        	}
            
        }

        System.out.println(res);
        return answer;
		
	}
	
}
