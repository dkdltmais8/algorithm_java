package first;

public class Solve4_���￡���輭��ã�� {
	public static void main(String[] args) {
		solution(["Jane", "Kim"]);
	}
	public static String solution(String[] seoul) {
        String answer = "";
        for (int i=0;i<seoul.length;i++) {
        	if (seoul[i].equals("Kim")) {
        		answer = "�輭���� "+i+"�� �ִ�";
        		System.out.print("0");
        	}
        }
        return answer;
    }
}
