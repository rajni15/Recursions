package Recursion;
//Move all 'x' to the end of the string.
//time complexity 0(2n) final 0(n)
public class MoveElement {
    public static void printMove(String str,int idx,int count,String newString){
        if (idx==str.length()){
            for (int i = 0; i < count; i++) {
                newString +='x';
            }
            System.out.println(newString);
            return;
        }
        char currChar= str.charAt(idx);
        if (currChar=='x'){
            count++;
            printMove(str,idx+1,count,newString);
        }else {
            newString+=currChar;
            printMove(str,idx+1,count,newString);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        printMove(str,0,0,"x");
    }
}
