package first;

public class Solve11_Æò±Õ±¸ÇÏ±â {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,5,10};
		System.out.println(solution(arr));
	}
	public static double solution(int[] arr) {
        double answer = 0;
        for (int i:arr)
        {
            answer += i;
        }
        answer = answer/arr.length;
        // System.out.println(answer);
        return answer;
    }
}
