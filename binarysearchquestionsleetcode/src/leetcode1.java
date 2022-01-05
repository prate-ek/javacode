import java.io.PrintStream;
import java.sql.SQLOutput;

public class leetcode1 {
//    Given a characters array letters that is sorted in non decreasing order and a character target return the smallest character in the array that is larger than the target
//   exact same approach as ceiling of no.
    /* ignore the target = what we are looking for
     */
public static void main(String[] args) {
    char[] letters={'c','f','j'};
    char target='a';
    char ans=nextGreatestLetter(letters,target);



}
    public static char nextGreatestLetter(char[] letters, char target){
    int start=0;
    int end=letters.length-1;
    while(start<=target){
        int mid=start+(end-start)/2;
        if (target<letters[mid]){
            end=mid-1;
        }else{
            start=mid+1;
        }
    }
    return letters[start%letters.length];
    }
}
