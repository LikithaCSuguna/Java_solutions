class Solution {
    
    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static int nextPrime(int n) {
        int num = n + 1;
        // Keep checking until we find a prime
        while (true) {
            if (isPrime(num)) {
                return num;
            }
            num++;
        }
    }
}
