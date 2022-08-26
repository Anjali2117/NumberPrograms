public class PalindromeNumber {
    public static void main(String[] args){
        //Palindrome number= If the reverse of a number is equal to the actual number
        // 272=(reversed)272 is a palindrome number
        int n=272;
        int m=n;
        int sum=0;
        //The while loop for reversing the number
        while (n!=0){
            int d=n%10;
            sum=sum*10+d;
            n=n/10;
        }

        //The if statement to check for palindrome number
        if(sum==m)
            System.out.println(m+" is a palindrome number.");
        else
            System.out.println(m+ " is not a palindrome number");
    }
}
