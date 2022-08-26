public class DuckNumber {
    public static void main(String[]args){
        //Duck number= A number that contains 0 in it.
        //203, 340 are duck numbers
        int n=340;
        int m=n;
        int count=0;
        while (n!=0){
            int d=n%10;
            if (d==0){
                count++;
            }
            n=n/10;
        }
        if(count!=0)
            System.out.println(m+" is a duck number");
        else
            System.out.println(m+" is not a duck number");
    }
}
