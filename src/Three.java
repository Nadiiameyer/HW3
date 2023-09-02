public class Three {
    public static void printChristmasTree(int height) {
        for (int i = 1; i <= height; i++) {

            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                if (k % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        int height = 5;
        printChristmasTree(height);
    }
}

