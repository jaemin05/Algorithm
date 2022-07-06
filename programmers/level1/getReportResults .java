class Solution {
    public int solution(String s) {
        String[] answer = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < answer.length; i++) {
            s = s.replaceAll(answer[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}