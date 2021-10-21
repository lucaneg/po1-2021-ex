class Number {
    private final int n;  
    
    Number(int n) {
        this.n = n;
    }
    
    int get() {
        return this.n;
    }
    
    Number add(Number other) {
        return new Number(this.n + other.n);
    }
}