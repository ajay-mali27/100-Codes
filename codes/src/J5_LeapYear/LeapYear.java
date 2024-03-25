package J5_LeapYear;
import java.util.Scanner;
public class LeapYear {

    public static void main(String[] args) {
//        Leap Year= 4 years
//        February= 29;
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter The Year to check whether  it is leap year or not.");
        int year=SC.nextInt();

//        2000 to 2100
//        1,4,8,12,16,20,24,28,32,36,40,44,48,52

if(year %4==0 && 100%4 !=0){
    System.out.println("It is a Leap Year");
}
else if(year % 400 == 0){
    System.out.println("It is a Leap Year");
}
else {
    System.out.println("Not a Leap Year");
}
//        year % 400 == 0

    }
}

