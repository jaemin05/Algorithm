import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        int i;
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(i=0; i<completion.length; i++) {
            if(!completion[i].equals(participant)) {
                break;
            }
        }
        return participant[i];
    }
}