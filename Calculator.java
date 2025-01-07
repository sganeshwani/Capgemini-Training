import java.util.*;
public class Calculator {
public static int add(int x, int y) {
return x + y;
}
public static int subtract(int x, int y) {
return x - y;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
System.out.println("the sum is: " + add(x, y));
System.out.println("the difference is: " + subtract(x, y));
}
}