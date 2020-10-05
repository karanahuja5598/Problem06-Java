package cd.get.ready.algorithms;

public class Fibonacci {
    public int getFibonacciValue(int n){
        if (n <= 1)
            return n;
        return getFibonacciValue(n-1) + getFibonacciValue(n-2);
    }
}
