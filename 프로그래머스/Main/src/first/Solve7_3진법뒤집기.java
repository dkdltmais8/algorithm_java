package first;

public class Solve7_3���������� {

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
//        	3�� ���� ���ϱ�(�Ǽ���)
        	double multiple = Math.pow(3,i);
        	int Imultiple = (int)multiple;
//        	���ڿ����� i���� ���� ��������
        	char nowNum = store.charAt(i);
//        	System.out.println(nowNum);
//        	System.out.println(multiple);
//        	�ؿ� �� ���� �Ȱ��� ���
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
