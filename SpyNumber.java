public class SpyNumber {
    public static void main(String[]args){
        //Spy number= The sum of the digits equals the product of the digits
        //123=1+2+3=1X2X3 is a spy number
        int n=123;
        int m=n;
        int sum=0,prod=1;
        while (n!=0){
            int d=n%10;
            sum+=d;
            prod*=d;
            n=n/10;
        }
        if (prod==sum)
            System.out.println(m+ " is a spy number");
        else
            System.out.println(m+ " is not a spy number");
    }
}
