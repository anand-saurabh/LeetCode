class Solution {
    private double[] probabilities;
    
    public Solution(int[] w) {
        double sum = 0;
        this.probabilities = new double[w.length];
        for(int weight : w)
            sum += weight;
        for(int i = 0; i < w.length; i++){
            w[i] += (i == 0) ? 0 : w[i - 1];
            probabilities[i] = w[i]/sum; 
        }
    }
     
    public int pickIndex() {
        return Math.abs(Arrays.binarySearch(this.probabilities, Math.random())) - 1;
    }
}