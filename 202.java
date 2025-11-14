import java.util.HashSet;
import java.util.Set;

class Solution {
    private Set<Integer> seen = new HashSet<>();

    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        if (seen.contains(n)) {
            return false;
        }
        seen.add(n);

        int result = 0;
        while (n > 0) {
            int digit = n % 10;
            result += digit * digit;
            n /= 10;
        }
        return isHappy(result);
    }
}
