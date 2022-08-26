public class NeonNumber {
    public static void main(String[]args){
        //Neon number= Sum of digits of square of the number is equal to the number itself
        //9=9X9=81=8+1=9
        int n=9;
        int m=n;
        n=n*n;
        int sum=0;
        while (n!=0){
            int d=n%10;
            sum+=d;
            n/=10;
        }
        if (sum==m)
            System.out.println(m+ " is a Neon number");
        else
            System.out.println(m+" is not a Neon number");
    }
}
