package J7_ReverseNumber;

public class ReverseNumber {
    public static void main(String[] args) {
       int input=345;
       int rev=0;

       while (input >0)
       {
           rev=(rev*10)+input%10;
           input=input/10;
       }
        System.out.println(rev);
    }
}
