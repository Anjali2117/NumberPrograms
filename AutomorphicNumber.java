public class AutomorphicNumber {
    public static void main(String[]args){
        //Automorphic number= Number is contained in the last digits of its square
        //25=25X25=625. 25 is contained in 625. Hence, automorphic number
        int n=11;
        int m=n;
        int square=n*n;
        int count=0;
        while (n!=0){
            int d=n%10; int d1=square%10;
            if (d!=d1)
                count=1;
            n=n/10; square=square/10;
        }
        if (count==0) {
            System.out.println(m + " is an automorphic number");
        }
        else {
            System.out.println(m + " is not an automorphic number");
        }
    }
}
