public class SpecialNumber {
    public static void main(String[]args){
        //Special number= Sum of the digits plus product of digits equals to the digit itself
        //59=5+9+5X9 is a special number
        int n=59;
        int m=n;
        int sum=0,prod=1;
        while (n!=0){
            int d=n%10;
            sum=sum+d; prod=prod*d;
            n/=10;
        }
        if (sum+prod==m)
            System.out.println(m+" is a special number");
        else
            System.out.println(m+" is not a special number");
    }
}
