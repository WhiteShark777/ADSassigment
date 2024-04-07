    import java.util.*;

    public class Main {
        public static void main(String[] args) {
            // Problem 1
            int[] arr1 = {10, 1, 32, 3, 45};
            System.out.println(findMin(arr1));

            // Problem 2
            int[] arr2 = {3, 2, 4, 1};
            System.out.println(findAverage(arr2));

            // Problem 3
            System.out.println(isPrime(7) ? "Prime" : "Composite");
            System.out.println(isPrime(10) ? "Prime" : "Composite");

            // Problem 4
            System.out.println(factorial(5));

            // Problem 5
            System.out.println(fibonacci(5));
            System.out.println(fibonacci(17));

            // Problem 6
            System.out.println(power(2, 10));

            // Problem 7
            printPermutations("IOX", "");

            // Problem 8
            System.out.println(isAllDigits("123456") ? "Yes" : "No");
            System.out.println(isAllDigits("123a12") ? "Yes" : "No");

            // Problem 9
            System.out.println(binomialCoefficient(2, 1));
            System.out.println(binomialCoefficient(7, 3));

            // Problem 10
            System.out.println(gcd(32, 48));
            System.out.println(gcd(10, 7));
        }

        // Problem 1
        public static int findMin(int[] arr) {
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        }

        // Problem 2
        public static double findAverage(int[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return (double) sum / arr.length;
        }

        // Problem 3
        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        // Problem 4
        public static int factorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }

        // Problem 5
        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }

        // Problem 6
        public static int power(int a, int n) {
            if (n == 0) {
                return 1;
            } else {
                return a * power(a, n - 1);
            }
        }

        // Problem 7
        public static void printPermutations(String str, String ans) {
            if (str.length() == 0) {
                System.out.println(ans);
                return;
            }
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String ros = str.substring(0, i) + str.substring(i + 1);
                printPermutations(ros, ans + ch);
            }
        }

        // Problem 8
        public static boolean isAllDigits(String s) {
            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            return true;
        }

        // Problem 9
        public static int binomialCoefficient(int n, int k) {
            if (k == 0 || k == n) {
                return 1;
            }
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }

        // Problem 10
        public static int gcd(int a, int b) {
            if (b == 0) {
                return a;
            } else {
                return gcd(b, a % b);
            }
        }
    }
