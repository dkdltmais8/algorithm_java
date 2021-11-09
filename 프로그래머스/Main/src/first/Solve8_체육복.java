package first;

import java.util.Arrays;

public class Solve8_Ã¼À°º¹ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		solution(5,lost,reserve);
	}
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n];
        for (int i=0;i<lost.length;i++)
        {
        	student[lost[i]-1] = 0; 
        }
        for (int i=0;i<reserve.length;i++)
        {
        	student[reserve[i]-1] = 2;
        }
        System.out.println(Arrays.toString(student));
        for (int i=0;i<student.length-1;i++)
        {
        	if (student[i]==2 && student[i+1]==0)
        	{
        		student[i] = 1;
        		student[i+1] =1;
        	}
        }
        for (int i=student.length-1;i>0;i--)
        {
        	if (student[i]==2 && student[i-1]==0)
        	{
        		student[i] = 1;
        		student[i-1] =1;
        	}
        }
        
        System.out.println(Arrays.toString(student));
        return answer;
    }
}
