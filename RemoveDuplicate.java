package Recursion;
// Remove duplicates in a string.
//Time compelexity 0(n)
public class RemoveDuplicate {
    public static boolean[] map=new boolean[26];
    public static void printRemoveDuplicates(String str,int idx,String newString) {

        if (idx==str.length()){
            System.out.println(newString);
            return;
        }
    char currChar=str.charAt(idx);
        if (map[currChar - 'a']) {
           printRemoveDuplicates(str,idx+1,newString);
        }else {
            newString += currChar;
            boolean b=map[currChar - 'a'] == true;
            printRemoveDuplicates(str,idx+1,newString);
        }
    }
    public static void main(String[] args) {
         String str="abbccda";
         printRemoveDuplicates(str,0," ");
    }
}
