import java.util.Scanner;
public class Palindrome {
    static int isPalindrome(String str,int start,int end)
    {
        if(start>end)
        {
            return 1;
        }
        if(str.charAt(start)!=str.charAt(end))
        {
            return 0;
        }
        start++;
        end--;
        return isPalindrome(str,start,end);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        int n=str.length();
        int start=0;
        int end=n-1;
        System.out.println(isPalindrome(str,start,end));
    }
}
