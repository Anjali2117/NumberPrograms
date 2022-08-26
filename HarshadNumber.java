public class HarshadNumber {
    public static void main(String[]args){
        //Harshad number= The number is divisible by the sum of the digits
        //156=1+5+6=12. 156 is divisible by 12. Hence, it is a harshad number
        int n=156;
        int m=n;
        int sum=0;
        while (n!=0){
            int d=n%10;
            sum+=d;
            n/=10;
        }
        if((m%sum)==0)
            System.out.println(m+" is a harshad number");
        else
            System.out.println(m+" is not a harshad number");
    }
}
