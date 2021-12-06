import java.util.Scanner;
/*
* Project java 
* Print a number as input and if the number is negative, write a minus on the second line
*  
*
* @By-Kongchan
*
*/
public class inputNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = sc.nextInt();
        if(number<0){
            System.out.println(number+"\n Minus");
        }else{
            System.out.println("Number : "+number);
        }
    }
}
