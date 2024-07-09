class Solution {
    public double averageWaitingTime(int[][] customers) {
        int currentTime = 0;
        double totalWaitingTime = 0.0;
        
        for (int i = 0; i < customers.length; i++) {
            if (currentTime < customers[i][0]) {
                currentTime = customers[i][0];
            }
            currentTime += customers[i][1];
            totalWaitingTime += (currentTime - customers[i][0]);
        }
        
        return totalWaitingTime / customers.length;
    }
}
