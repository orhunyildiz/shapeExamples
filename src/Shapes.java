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
        System.out.println("|||||||||||||||||||||||||||");
        shapes.drawFilledRectangleWithArray(10,5);
        System.out.println("|||||||||||||||||||||||||||");
        shapes.drawVoidRectangleWithArray(10, 5);
        System.out.println("|||||||||||||||||||||||||||");
        shapes.drawRightTriangleWithArray(5);
        System.out.println("|||||||||||||||||||||||||||");
        shapes.drawEquilateralTriangleWithArray(5);

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
                if (i == 1) {
                    System.out.print("*");
                    break;
                }
                else if (j <= (2 * i) - 1)
                    System.out.print("*");
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

    public void drawFilledRectangleWithArray(int row, int column) {
        char[][] chars = new char[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                chars[i][j] = '*';
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(chars[i][j]);
            }
            System.out.println();
        }
    }

    public void drawVoidRectangleWithArray(int row, int column) {
        char[][] chars = new char[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0 || i == row - 1)
                    chars[i][j] = '*';
                else {
                    if (j == 0 || j == column - 1)
                        chars[i][j] = '*';
                    else
                        chars[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(chars[i][j]);
            }
            System.out.println();
        }
    }

    public void drawRightTriangleWithArray(int height) {
        int column = (2 * height) - 1;
        char[][] chars = new char[height][column];
        int count = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < column; j++) {
                if (j < count)
                    chars[i][j] = '*';
                else
                    chars[i][j] = ' ';
            }
            count += 2;
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(chars[i][j]);
            }
            System.out.println();
        }
    }

    public void drawEquilateralTriangleWithArray(int height) {
        int column = (2 * height) - 1;
        int tmp = (column - 1) / 2;
        char[][] chars = new char[height][column];
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= column; j++) {
                if (i != height) {
                    if (j <= tmp || j >= (i * 2) + tmp)
                        chars[i - 1][j - 1] = ' ';
                    else
                        chars[i - 1][j - 1] = '*';
                }
                else
                    chars[i - 1][j - 1] = '*';
            }
            tmp--;
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(chars[i][j]);
            }
            System.out.println();
        }
    }

}