class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        answer = answer.replaceAll("[.]{2,}", ".");
        answer = answer.replaceAll("^[.]|[.]$", "");

        if(answer.isEmpty()) {
            answer += "a";
        }

        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }

        if(answer.length() <= 2) {
            char lastChar = answer.charAt(answer.length()-1);
            while(answer.length() < 3) {
                answer += lastChar;
            }
        }

        return answer;
    }
}