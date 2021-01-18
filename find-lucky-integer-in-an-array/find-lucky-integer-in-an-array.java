class Solution {
    public int findLucky(int[] arr) {
    Map<Integer, Integer> numToFrequency = new HashMap<>();
    for (int num : arr) { // calculate frequency for each number
        numToFrequency.put(num, numToFrequency.getOrDefault(num, 0) + 1);
    }
    int max = -1;
    for (int num : numToFrequency.keySet()) { // go over all of the numbers in the map
        if (num == numToFrequency.get(num)) { // number which has a frequency equal to its value
            max = Math.max(max, num); // keep the max value
        }
    }
    return max; // if no such number is found return -1
}
}
