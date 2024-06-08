package task8;

public class Level1 {
    public static void main(String[] args) {
        int[][] ar = {
                {1, 9, 2, 3},
                {4, 8, 5, 6},
                {9, 7, 9, 2},
                {9, 9, 9, 0}
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
        };
        System.out.println(army_communication_matrix(4, ar));
    }

    public static String army_communication_matrix(int n, int[][] matrix) {
        int array1Len, array2Len, array3Len, array4Len;
        array1Len = array2Len = array3Len = array4Len = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {


                System.out.println("Значение " + matrix[i][j]);

                if (i == 0 && j == 0) {
                    array1Len += matrix[0][0];
                    System.out.println("array1Len " + array1Len);
                    continue;
                }
                if (i == 0 && j == n - 1) {
                    array2Len += matrix[i][j];
                    System.out.println("array2Len " + array2Len);
                    continue;
                }
                if (i == n - 1 && j == 0) {
                    array3Len += matrix[i][j];
                    System.out.println("array3Len " + array3Len);
                    continue;
                }
                if (i == n - 1 && j == n - 1) {
                    array4Len += matrix[i][j];
                    System.out.println("array4Len " + array4Len);
                    continue;
                }


                if (i == 0 && j != n - 1) {
                    array1Len += matrix[i][j];
                    array2Len += matrix[i][j];

                    System.out.println("array1Len " + array1Len);
                    System.out.println("array2Len " + array2Len);
                    continue;
                }
                if (i == n - 1 && (j != 0 || j != n - 1)) {
                    array3Len += matrix[i][j];
                    array4Len += matrix[i][j];

                    System.out.println("array3Len " + array1Len);
                    System.out.println("array4Len " + array2Len);
                    continue;
                }
                if ((i != 0 || i != n - 1) && j == 0) {
                    array1Len += matrix[i][j];
                    array3Len += matrix[i][j];

                    System.out.println("array1Len " + array1Len);
                    System.out.println("array3Len " + array3Len);
                    continue;
                }
                if ((i != 0 || i != n - 1) && j == n - 1) {
                    array2Len += matrix[i][j];
                    array4Len += matrix[i][j];

                    System.out.println("array2Len " + array2Len);
                    System.out.println("array4Len " + array4Len);
                    continue;
                }
//                if (i == n - 1 && (j != 0 || j != n - 1)) {
//                    array3Len += matrix[i][j];
//                    array4Len += matrix[i][j];
//
//                    System.out.println("array3Len " + array1Len);
//                    System.out.println("array4Len " + array2Len);
//                    continue;
//                }
//                if ((i != 0 || i != n - 1) && (j != 0 || j != n - 1)) {
                    array1Len += matrix[i][j];
                    array2Len += matrix[i][j];
                    array3Len += matrix[i][j];
                    array4Len += matrix[i][j];

                    System.out.println("array1Len " + array1Len);
                    System.out.println("array2Len " + array2Len);
                    System.out.println("array3Len " + array3Len);
                    System.out.println("array4Len " + array4Len);
                    continue;
//                }

            }
        }
        System.out.println();
        System.out.println("array1Len " + array1Len);
        System.out.println("array2Len " + array2Len);
        System.out.println("array3Len " + array3Len);
        System.out.println("array4Len " + array4Len);

        if (array1Len >= array2Len && array1Len >= array3Len && array1Len >= array4Len) {
            System.out.println("array1Len");
            return "0 0 " + (n - 1);
        }

        if (array2Len >= array1Len && array2Len >= array3Len && array2Len >= array4Len) {
            System.out.println("array2Len");
            return "1 0 " + (n - 1);
        }

        if (array3Len >= array1Len && array3Len >= array2Len && array3Len >= array4Len) {
            System.out.println("array3Len");
            return "0 1 " + (n - 1);
        }

//        if (array4Len >= array1Len || array4Len >= array2Len || array4Len >= array3Len)
        System.out.println("array4Len");
        return "1 1 " + (n - 1);
    }
}
