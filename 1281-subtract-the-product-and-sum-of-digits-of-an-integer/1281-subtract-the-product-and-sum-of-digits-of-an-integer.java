class Solution {
    public int subtractProductAndSum(int n) {
        String s = Integer.toString(n);
        int a[] = new int [s.length()];
        for(int i = 0;i<s.length();i++){
            a[i] = s.charAt(i)-'0';
        }
        int digit_sum = 0;
        int product_sum = 1;
        for(int i = 0;i<a.length;i++){
            digit_sum += a[i];
            product_sum *= a[i];
        }
        return product_sum - digit_sum;
    }
}