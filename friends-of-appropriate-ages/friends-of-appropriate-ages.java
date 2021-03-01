class Solution {
    
        public int numFriendRequests(int[] ages) {
        int[] count = new int[121];
        for (int age: ages) count[age]++;

        int ans = 0;
        for (int ageA = 0; ageA <= 120; ageA++) {
            int countA = count[ageA];
            for (int ageB = 0; ageB <= 120; ageB++) {
                int countB = count[ageB];
                if (ageA * 0.5 + 7 >= ageB) continue;
                if (ageA < ageB) continue;
                if (ageA < 100 && 100 < ageB) continue;
                ans += countA * countB;
                if (ageA == ageB) ans -= countA;
            }
        }

        return ans;
    }
    /*
    public int numFriendRequests(int[] ages) {
        
        int ans = 0;
        int len = ages.length;
        int a;
        int b;
        for (int i = 0; i < len; i++)
        {
            a = ages[i];
            for (int j = i + 1; j < len; j++)
            {
                b = ages[j];
                if(!((b > 100 && a < 100)|| b <= 0.5 * a + 7 || b > a ))
                {
                    ans++;
                }  
                
                 if(!((a > 100 && b < 100) || a <= 0.5 * b + 7 || a > b))
                {
                    ans++;
                }  
            }
        }
        return ans;
    }
    */
}