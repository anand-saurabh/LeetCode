//Problem : 1331. Rank Transform of an Array
class Solution {
     public int[] arrayRankTransform(int[] arr) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> current = map.getOrDefault(arr[i], new ArrayList<>());
            current.add(i);
            map.put(arr[i], current);
        }
        int rank = 1;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> currentList = entry.getValue();
            for(int i: currentList)  arr[i] = rank;
            rank++;
        }
        return arr;
    }
}