package task2.countDiv;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.solution(6,11,2);

        int solution1 = solution.solution(6,11,2);

        System.out.println(solution1);

    }

    public int solution(int a, int b, int k) {

        if (a % k > 0)
            return (b - (a - a % k)) /k;
        if (a % k == 0)
            return (b - a) /k + 1;
        return 0;
    }
}
