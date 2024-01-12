package Recursion;

//Print Factorial of number n.
public class Fourth {

    public static int printNumber(int n){

        if (n == 1||n==0) {
            return 1;

        }
        int fact_num =printNumber(n-1);
        int fact_n=n*fact_num;
        return fact_n;
    }
    public static void main(String[] args) {
      int n =5;
       int ans=printNumber(n);
       System.out.println(ans);
    }
}
