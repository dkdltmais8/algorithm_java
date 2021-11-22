package first;

public class Solve10_문자열정수변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("1234"));
		System.out.println(solution("-1234"));
		
		
	}

    public static int solution(String s) {
        int answer = 0;
        // String ans = "";
        // for (int i=0;i<s.length();i++)
        // {
        //     ans += s.charAt(i);
        // }
        // System.out.println(ans);
        // answer = int ans;
        // answer = Integer.parseInt(ans);
        answer = Integer.parseInt(s);
        return answer;
    }
	

}
