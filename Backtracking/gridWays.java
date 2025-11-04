public class gridWays {
    // Method 1
    // This takes time complexity of O(2^(n+m)), won't work of take longer time for larger values of n, m.
    public static int ways(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){ // destination to destination
            return 1;
        } else if(i==n || j==m){ // if boundary is crosses
            return 0;
        }

        int right = ways(i+1, j, n, m);
        int down = ways(i, j+1, n, m);

        return right+down;
    }

    // Method 2
    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    // Mathematical method to solve in linear time O(n+m).
    public static int ways_LinearTym(int n, int m){
        int ways = calculateFactorial((n-1)+(m-1))/(calculateFactorial(n-1)*calculateFactorial(m-1));
        return ways;
    }

    // Main block
    public static void main(String[] args) {
        int n=3, m=3;
        System.out.println(ways(0, 0, n, m));
        System.out.println(ways_LinearTym(n, m));

    }
}
