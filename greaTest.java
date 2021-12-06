public class greaTest {
/*
* Project java The Greatest Common Divisor of two numbers
* 
*
* @By-Kongchan
*
*/
    public static void main(String[] args) {
        int x = 12, y = 18, sum = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0)
                sum = i;
        }
        System.out.print(x + "," + y + " = " + sum);
    }
}