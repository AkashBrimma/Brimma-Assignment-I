/*12. The sequence of triangle numbers is generated by adding the natural numbers. So
        the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first
        ten terms would be:
        1, 3, 6, 10, 15, 21, 28, 36, 45, 55, …
        Let us list the factors of the first seven triangle numbers:
        1: 1
        3: 1,3
        6: 1,2,3,6
        10: 1,2,5,10
        15: 1,3,5,15
        21: 1,3,7,21
        28: 1,2,4,7,14,28
        We can see that 28 is the first triangle number to have over five divisors.
        What is the value of the first triangle number to have over five hundred divisors?
        Ans: 76576500*/

public class Highly_divisible_triangular_number {
        public static int triangleNum(int n) {
            int sum=0;
            for (int i = 0; i <=n ; i++) {
                sum+=i;
            }
            return sum;
        }
        public static void main(String[] args) {
            int num = 0;
            int j = 0;
            int divisors = 0;
            int size = 500;
            while(divisors <= size) {
                divisors = 0;
                j++;
                num = triangleNum(j);
                for (int i = 1; i <= Math.sqrt(num); i++){
                    if (num % i == 0) divisors++;
                }
                divisors*=2;
            }
            System.out.println(num);
        }
    }
