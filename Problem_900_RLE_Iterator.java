//900. RLE Iterator
class RLEIterator {

    int A[];
    public RLEIterator(int[] Arr) {
        A = new int[Arr.length];
        this.A = Arr;
    }
    
    public int next(int n) {
        int i = 0;
        int len = A.length;
        while(i < len)
        {
            if(A[i] >= n)
            {
                A[i] = A[i] - n;
                n = 0;
                return A[i+1];
            }
            else
            {
                n = n - A[i];
                A[i] = 0;
            }
            i += 2;
        }
        if(n != 0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
        
    }
}

/**
 * Your RLEIterator object will be instantiated and called as such:
 * RLEIterator obj = new RLEIterator(A);
 * int param_1 = obj.next(n);
 */