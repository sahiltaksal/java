public class Swap_Number {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping the value A: " + a);
        System.out.println("Before swapping the value B: " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping the value A: " + a);
        System.out.println("After swapping the value B: " + b);

    }
}