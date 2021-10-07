/**
* A class that represent an integer number that can be added to another one.
*
* @author Luca Negrini
*/
class Number {
    
    /**
    * The internal number contained in this instance.
    */
    private final int n;
    
    /**
    * Builds a new instance of Number holding the given integer.
    * 
    * @param n the integer number to hold
    */
    Number(int n) {
        this.n = n;
    }
    
    /**
    * Yields the integer number contained in this Number.
    * 
    * @return the integer number
    */
    int get() {
        return this.n;
    }
    
    /**
    * Yields a new Number instance obtained by adding this with the given one.
    * The new instance is created holding an integer value corresponding to the
    * sum of the integers contained in {@code this} and {@code other}.
    * 
    * @param other the number to add to this one
    *
    * @return a new number instance containing the sum of {@code this} and {@code other}
    */
    Number add(Number other) {
        return new Number(this.n + other.n);
    }
}
