package first;

public class Solve14_시저암호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution("asdasd",2);
	}
	
    public static String solution(String s, int n) {
        String answer = "";
        for (int i=0; i<s.length();i++)
        {
            if (90>=(int)s.charAt(i) && (int)s.charAt(i)>=65)
            {
                if ((int)s.charAt(i)+n > 90)
                {
                    answer += (char)((int)s.charAt(i)+n-26);
                }
                else
                {
                    answer += (char)((int)s.charAt(i)+n);

                }
            }
            else if (122 >= (int)s.charAt(i) && (int)s.charAt(i) >= 97)
            {
                if ((int)s.charAt(i)+n > 122)
                {
                    answer += (char)((int)s.charAt(i)+n-26);
                }
                else
                {
                    answer += (char)((int)s.charAt(i)+n);

                }
            }
            if (s.charAt(i) == (' '))
            {
                answer += ' ';
                continue;
            }
        }
        System.out.println(answer);
        return answer;
    }

}
