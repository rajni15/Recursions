package Recursion;
//Print x^n (stack height=logn).
public class Seventh {
    public static int printNumber(int x,int n){
        if (n==0){ //base case1
            return 1;

        }
        if(x==0){  //base case 2
            return 0;
        }
        if (n%2==0){  //even element
            return printNumber(x,n/2)*printNumber(x,n/2);
        }
        else { //odd element
            return printNumber(x,n/2)*printNumber(x,n/2)*x;
        }

    }
    public static void main(String[] args) {
       int x=2;
       int n=5;
       int ans=printNumber(x,n);
       System.out.println(ans);
    }
}
