package Recursion;
//Print Number from 5 to 1.
public class First {
    public static void printnumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printnumber(n-1);
    }
    public static void main(String[] arg){
        int n=5;
        printnumber(n);
    }
}