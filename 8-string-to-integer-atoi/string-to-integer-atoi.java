public class Solution {
    public int myAtoi(String s) {
        int index = 0;
        int n = s.length();
        
        // Skip leading whitespace
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }
        
        if (index >= n) {
            return 0;
        }
        
        // Determine sign
        int sign = 1;
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }
        
        // Skip leading zeros after sign
        while (index < n && s.charAt(index) == '0') {
            index++;
        }
        
        long result = 0;
        boolean hasDigits = false;
        
        // Process digits
        for (; index < n; index++) {
            char c = s.charAt(index);
            if (!Character.isDigit(c)) {
                break;
            }
            hasDigits = true;
            int digit = c - '0';
            result = result * 10 + digit;
            
            // Check for overflow
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && result > (long) Integer.MAX_VALUE + 1) {
                return Integer.MIN_VALUE;
            }
        }
        
        if (!hasDigits) {
            return 0;
        }
        
        return (int) (sign * result);
    }
}