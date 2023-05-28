class Solution {
    public int solution(int number, int limit, int power) {
         int result = 0;

        for (int i = 1; i <= number; i++) {
            int answer = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) answer++;
                else if (i % j == 0) answer +=2;
            }

            result += answer > limit ? power : answer;
        }

        return result;
    }
}