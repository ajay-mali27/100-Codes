package J4_GratestOfTwoNumber;

public class GratestNum {

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;


        if(a >b && a >c){
            System.out.println("A is Bigger than B and C");
        }

        else if (b> a && b>c){
            System.out.println("B is Greater Than A and C");
        }

        else if (c >a && c>b) {
            System.out.println("C is Bigger than A and B");

        }
        else {
            System.out.println("Something Went Wrong");
        }
    }
}
