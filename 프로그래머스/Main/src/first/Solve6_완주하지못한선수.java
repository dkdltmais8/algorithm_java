package first;

import java.util.Arrays;
import java.util.HashMap;

public class Solve6_완주하지못한선수 {

	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		solution(participant,completion);

	}
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        String now = "";
        HashMap<String,Integer> codes = new HashMap<String, Integer>();
        
        for (int i=0; i<participant.length;i++)
        {
        	now = participant[i];
        	if (codes.containsKey(now)) {
        		codes.put(now,codes.get(now)+1);
        	}
        	else
        	{
        		codes.put(participant[i],1);
        	}
        }
        for (int i=0; i<completion.length;i++)
        {
        	now = completion[i];
        	if (codes.containsKey(now)) {
        		codes.put(now,codes.get(now)-1);
        	}
        	else
        	{
        		answer = now;
        	}
        }
        if (answer.isEmpty())
        {
        	for (String key : codes.keySet())
        	{
        		if (codes.get(key).equals(1))
        		{
        			answer = key;
        		}
        	}
        }
        
        return answer;
    }
}
