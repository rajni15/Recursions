package Recursion;
// Print all the Subsequences of a string.
// time compexity 0(2^n)
public class SubSequences {
    public static void subsequence(String str,int idx,String newString){

        if (idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
//        to be
        subsequence(str,idx+1,newString+currChar);

//        not to be
        subsequence(str,idx+1,newString);
    }
    public static void main(String[] args) {
        String str="abc";
        subsequence(str,0,"");
    }
}
