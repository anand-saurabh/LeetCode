class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        Map<Integer, Set<Integer>>
            courseMap = new HashMap();
        
        int row = prerequisites.length;
        for (int i = 0; i < row; i++)
        {
            
            for (int j = 0; j < 2; j++)
            {
                if(courseMap.containsKey(prerequisites[i][1]))
                {
                    Set<Integer> courses = courseMap.get(prerequisites[i][1]);
                    while(!courses.isEmpty())
                    {
                        Set<Integer>
                            temp = new HashSet();
                        for (int cours : courses)
                        {
                            if(cours == prerequisites[i][0])
                            {
                                return false;
                            }
                            if(courseMap.containsKey(cours))
                            {
                                temp.addAll(courseMap.get(cours));
                            }
                        }
                        courses = temp;
                    }
                        
                }
                if(courseMap.containsKey(prerequisites[i][0]))
                {
                    Set<Integer>
                        cour = courseMap.get(prerequisites[i][0]);
                    cour.add(prerequisites[i][1]);
                    courseMap.put(prerequisites[i][0], cour);
​
                }
                else
                {
                    Set<Integer>
                        cour = new HashSet();
                    cour.add(prerequisites[i][1]);
                    courseMap.put(prerequisites[i][0], cour);
                }
            }
        }
        return true;
    }
}
