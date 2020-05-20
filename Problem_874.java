// Problem: 874. Walking Robot Simulation

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0;
        int y = 0;
        boolean increaseY = true;
        boolean decreaseX = false;
        boolean decreaseY = false;
        boolean increaseX = false;
        
        List<Integer>
            points;
        Map<Integer, List<Integer>>
            map = new HashMap();
        
        for (int i = 0; i < obstacles.length; i++)
        {
                if(map.containsKey(obstacles[i][0]))
                {
                    points = map.get(obstacles[i][0]);
                    points.add(obstacles[i][1]);
                    
                    map.put(obstacles[i][0], points);
                }
            else
            {
                points = new ArrayList();
                points.add(obstacles[i][1]);
                map.put(obstacles[i][0], points);
 
            }
                
        }
        for (int i = 0; i < commands.length; i++)
        {
            if(commands[i] >= 1)
            {
                if(increaseY)
                {
                     y = y + commands[i];
                    if(checkObstacles(map, x, y))
                    {
                        y = y - commands[i];
                        return x*x + y*y;
                    }
                    
                }
                else if(decreaseX)
                {
                    x -= commands[i];
                    if(checkObstacles(map, x, y))
                    {
                        x = x + commands[i];
                        return x*x + y*y;

                    }
                
                }
                else if(increaseX)
                {
                    x += commands[i];
                     if(checkObstacles(map, x, y))
                    {
                        x = x - commands[i];
                        return x*x + y*y;

                    }

                }
                
                else
                {
                    y -= commands[i];
                    if(checkObstacles(map, x, y))
                    {
                        y = y + commands[i];
                        return x*x + y*y;
                        

                    }

                }
            }
            else if(commands[i]  == -1)
            {
                if(increaseY)
                {
                    increaseX = true;
                    increaseY = false;
                }
                else if (increaseX)
                {
                    decreaseY = true;
                    increaseX = false;
                    
                }
                else if (decreaseX)
                {
                    increaseY = true;
                    increaseX = false; 
                }
                
                else if (decreaseY)
                {
                    decreaseX = true;
                    decreaseY = false;
                }
            }
            else
            {
                
                if(increaseY)
                {
                    decreaseX = true;
                    increaseY = false;
                }
                else if (increaseX)
                {
                    increaseY = true;
                    increaseX = false;
                    
                }
                else if (decreaseX)
                {
                    decreaseY = true;
                    increaseX = false; 
                }
                
                else if (decreaseY)
                {
                    increaseX = true;
                    decreaseY = false;
                }  
            } 
        }
        return x*x + y*y;
    }
        
        boolean checkObstacles(Map<Integer, List<Integer>> map, int x, int y)
        {
            List<Integer> points = new ArrayList();
            if(map.containsKey(x))
            {
                points = map.get(x);
                for (int i = 0; i < points.size(); i++)
                {
                    if(y == points.get(i))
                    {
                        return true;
                    }
                }  
            }
            return false;
        }
}