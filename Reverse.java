package Recursion;
//Print a string in reverse.
public class Reverse {
    public static void printReverse(String s,int idx){

        if (idx == 0) {
            System.out.println(s.charAt(idx));
            return;
        }
        System.out.print(s.charAt(idx));
        printReverse(s,idx-1);
    }
    public static void main(String[] args) {
        String s="abcd";
        printReverse(s,s.length()-1);
    }
}
