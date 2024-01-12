package Recursion;
//Print x^n(stack height=n).
public class Sixth {
    public static int printNumber(int x,int n){
       if (n==0){ //base case1
            return 1;

        }
        if(x==0){  //base case 2
            return 0;
        }
        int xPower1=printNumber(x,n-1);
        int xPown=x*xPower1;
        return xPown;
    }
    public static void main(String[] args) {
         int x=2;
         int n=5;
        int ans= printNumber(x,n);
        System.out.println(ans);
    }
}
