import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String n = sc.next();

        String rev = new StringBuilder(n).reverse().toString();

        if (n.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}