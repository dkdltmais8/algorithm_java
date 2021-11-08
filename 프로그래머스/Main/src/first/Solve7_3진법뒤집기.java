package first;

public class Solve7_3진법뒤집기 {

	public static void main(String[] args) {
		solution(45);

	}
	public static int solution(int n) {
        int answer = 0;
        String store = ""; 
        while (n>0)
        {
        	int nam = n%3;
        	n = n/3;
        	store = nam+store;
        }
        for (int i=0; i<store.length();i++)
        {
//        	System.out.println(store);
//        	3의 제곱 구하기(실수형)
        	double multiple = Math.pow(3,i);
        	int Imultiple = (int)multiple;
//        	문자열에서 i번쨰 문자 가져오기
        	char nowNum = store.charAt(i);
//        	System.out.println(nowNum);
//        	System.out.println(multiple);
//        	밑에 두 줄이 똑같은 기능
        	int now = nowNum-'0';
//        	System.out.println(now);
//        	Character.getNumericValue(nowNum);
        	int nowAnswer = now*Imultiple;
//        	System.out.println(nowAnswer);
        	answer += nowAnswer;
//        	System.out.println(answer);
        }
        
//        System.out.println(store);
        return answer;
    }
}
