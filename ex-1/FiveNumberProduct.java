class Multiplier {
    private final int first;
    private final int second;
    private final int third;
    private final int fourth;
    private final int fifth;
    private final int result;
    
    Multiplier(int first) {
        this(first, 1, 1, 1, 1);
    }
    
    Multiplier(int first, int second) {
        this(first, second, 1, 1, 1);
    }
    
    Multiplier(int first, int second, int third) {
        this(first, second, third, 1, 1);
    }
    
    Multiplier(int first, int second, int third, int fourth) {
        this(first, second, third, fourth, 1);
    }
    
    Multiplier(int first, int second, int third, int fourth, int fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.result = first * second * third * fourth * fifth;
    }
    
    int getResult() {
        return this.result;
    }
}