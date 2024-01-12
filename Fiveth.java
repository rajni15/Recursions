package Recursion;
//Print the Fibonacci sequence till nth term
public class Fiveth {

    public static void printNumber(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printNumber(b,c,n-1);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        printNumber(0,1,n-1);

    }
}
