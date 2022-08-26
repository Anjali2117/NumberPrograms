public class KrishnaMurtiNumber {
    public static void main(String[]args){
        //KM number= Sum of factorial of digits is equal to the number itself
        //145=1!+4!+5!=145 is a KM number
        int n=145;
        int m=n;
        int sum=0;
        while (n!=0){
            int d=n%10;
            int fact=1;
            for(int i=1;i<=d;i++) {
                fact = fact * i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if (sum==m)
            System.out.println(m+" is a KrishmaMurti number.");
        else
            System.out.println(m+" is not a KrishnaMurti number.");
    }
}
