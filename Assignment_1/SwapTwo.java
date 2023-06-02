public class SwapTwo {

    public static void main(String[] args) {

        int x = 5;
        int y = 4;

        y = y + x;
        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }

}
