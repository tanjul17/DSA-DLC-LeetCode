class Solution {
    public double[] convertTemperature(double c) {
        double [] res =  new double [2];
        res[0] = c + 273.15;
        res[1] = c * 1.80 + 32.00;
        return res;
    }
}