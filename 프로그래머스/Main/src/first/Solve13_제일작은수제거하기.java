package first;

import java.util.ArrayList;
import java.util.List;

public class Solve13_제일작은수제거하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,2,1};
		int[] arr1 = {10};
		solution(arr);
		solution(arr1);
	}
	public static List<Integer> solution(int[] arr) {
        int min = arr[0];
        int min_idx = 0;
        List<Integer> answer = new ArrayList<Integer>();
        for (int i=0;i<arr.length;i++)
        {
        	answer.add(arr[i]);
        	if (min>arr[i])
        	{
        		min = arr[i];
        		min_idx = i;
        	}
//        	System.out.println(min);
        }
        answer.remove(min_idx);
        if (answer.isEmpty())
        {
        	answer.add(-1);
        }
//        System.out.println(answer);
        return answer;
    }
}
