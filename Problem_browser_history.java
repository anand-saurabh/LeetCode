class BrowserHistory {
    
    Stack<String>
        forward;
    Stack<String>
        back;

    public BrowserHistory(String homepage) {
       forward = new Stack();
        back = new Stack();
        forward.push(homepage);
    
    }
    
    public void visit(String url) {
        forward.push(url);
        back = new Stack();
        
    }
    
    public String back(int steps) {
        while (steps > 0 && forward.size() > 1)
        {
            String temp = forward.pop();
            back.add(temp);
            steps--;
        }
        return forward.peek(); 
    }
    
    public String forward(int steps) {
         while (steps > 0 && back.size() > 0)
        {
            String temp = back.pop();
            forward.add(temp);
            steps--;
        }
        
        return forward.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */