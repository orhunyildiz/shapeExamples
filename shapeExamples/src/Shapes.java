public class Shapes {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.drawFilledRectangle(10, 5);
        System.out.println("|||||||||||||||||||||||||||");
        shapes.drawVoidRectangle(10, 5);
        System.out.println("|||||||||||||||||||||||||||");
        shapes.drawRightTriangle(7);
        System.out.println("|||||||||||||||||||||||||||");
        shapes.drawEquilateralTriangle(7);
    }

    public void drawFilledRectangle(int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("*");
                if (j == column - 1)
                    System.out.println();
            }
        }
    }

    public void drawVoidRectangle(int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0 || i == row - 1)
                    System.out.print("*");
                else {
                    if (j == 0 || j == column - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void drawRightTriangle(int height) {
        int column = (2 * height) - 1;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= column; j++) {
                if (j != (2 * i) - 1)
                    System.out.print("*");
                else if (i == 1) {
                    System.out.print("*");
                    break;
                }
                else
                    break;
            }
            System.out.println();
        }
    }

    public void drawEquilateralTriangle(int height) {
        int column = (2 * height) - 1;
        int tmp = (column - 1) / 2;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= column; j++) {
                if (i != height) {
                    if (j <= tmp || j >= (i * 2) + tmp)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
                else
                    System.out.print("*");
            }
            tmp--;
            System.out.println();
        }
    }
}