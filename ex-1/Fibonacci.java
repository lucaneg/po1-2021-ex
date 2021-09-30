class Fibonacci {
    private int last1; 
    private int last2; 
    private int index;
    
    Fibonacci() {
        last1 = 1;
        last2 = 1;
        index = -1;
    }
    
    int next() {
        index++;
        if (index < 2)
            return 1;
        int next = last1 + last2;
        last2 = last1;
        last1 = next;
        return next;
    }
}