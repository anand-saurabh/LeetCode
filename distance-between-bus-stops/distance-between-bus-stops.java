class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        
        int simplePath = 0;
        int roundPath = 0;
        int len = distance.length;
        int i = start;
        while(i != destination)
        {
            simplePath += distance[i];
            i = (i + 1) % len;
            
        }
        while (i != start)
        {
            roundPath += distance[i];
            i = (i + 1) % len; 
        }
        //System.out.print("simple" + simplePath + "round" + roundPath);
        return simplePath > roundPath?roundPath:simplePath;
        
    }
}
