package Recursion;
//Find the 1st & last occurance of an element in string.
public class FindElement {
    public static int first = -1;
    public static int last = -1;
    public static void findString(String str,int idx,char element) {
        if (idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar==element){
            if (first == -1){
                first = idx;
            }else {
                last = idx;
            }
        }
        findString(str,idx+1,element);
    }
    public static void main(String[] args) {
       String str="abaacdaefaah";
        char a;
        findString(str,0,'a');
    }
}