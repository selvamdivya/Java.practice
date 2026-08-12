public class Largestnum {
    public static void main(String[] args){
        int a = 10;
        int b = 25;
        int c = 15;

        if (a > b && a > c)
            System.out.println("Largestnum = " + a);
        else if (b > c)
            System.out.println("Largestnum = " + b);
        else
            System.out.println("Largestnum = " + c);

    }
    
}
