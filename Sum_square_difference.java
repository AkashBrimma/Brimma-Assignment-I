/*6. The sum of the squares of the first ten natural numbers is,
        1^2+2^2+3^2 … + 10^2 = 385
        The square of the sum of the first ten natural numbers is,
        (1 + 2 + 3 + … + 10)^2 = 3025
        Hence the difference between the sum of the squares of the first ten natural numbers
        and the square of the sum is 3025 - 385 = 2640.
        Find the difference between the sum of the squares of the first one hundred natural
        numbers and the square of the sum.
        Ans: 25164150*/

public class Sum_square_difference {
    public static void main(String[] args){
        int sum1=0;
        int sum2=0;
        for(int i=1; i<=100; i++){
            sum1+=i*i;
            sum2+=i;
        }
        sum2*=sum2;
        System.out.println(sum2-sum1);
    }
}
