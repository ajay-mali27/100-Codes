// package J_6_PrimeNumber;

public class PrimeNum {

    public static void main(String[] args) {
        int num = 11;
        int temp=0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {   
                temp=temp+1;
            
            }
        }
            if (temp >=1) {
                System.out.println("Not a Prime Number");
            } 
            
            else{
                System.out.println("Prime Number");
            }
        

    }
}
