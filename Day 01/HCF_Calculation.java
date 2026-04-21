import java.util.Scanner;
public class HCF_Calculation {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter two numbers: ");
int a = sc.nextInt();
int b = sc.nextInt();
int x = a, y = b;
while (y != 0) {
int temp = y;
y = x % y;
x = temp;
}
System.out.println("HCF: " + x);
sc.close();
}
}
