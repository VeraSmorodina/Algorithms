package task8;

public class Level1 {
    public static String army_communication_matrix(int n, int[][] matrix) {
        int array1Len, array2Len, array3Len, array4Len;
        array1Len = array2Len = array3Len = array4Len = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 && j == 0) {
                    array1Len += matrix[0][0];
                    continue;
                }
                if (i == 0 && j == n - 1) {
                    array2Len += matrix[i][j];
                    continue;
                }
                if (i == n - 1 && j == 0) {
                    array3Len += matrix[i][j];
                    continue;
                }
                if (i == n - 1 && j == n - 1) {
                    array4Len += matrix[i][j];
                    continue;
                }

                if (i == 0 && j != n - 1) {
                    array1Len += matrix[i][j];
                    array2Len += matrix[i][j];
                    continue;
                }
                if (i == n - 1 && j != 0) {
                    array3Len += matrix[i][j];
                    array4Len += matrix[i][j];
                    continue;
                }
                if (j == 0) {
                    array1Len += matrix[i][j];
                    array3Len += matrix[i][j];
                    continue;
                }
                if (j == n - 1) {
                    array2Len += matrix[i][j];
                    array4Len += matrix[i][j];
                    continue;
                }
                array1Len += matrix[i][j];
                array2Len += matrix[i][j];
                array3Len += matrix[i][j];
                array4Len += matrix[i][j];
            }
        }
        if (array1Len >= array2Len && array1Len >= array3Len && array1Len >= array4Len)
            return "0 0 " + (n - 1);
        if (array2Len >= array1Len && array2Len >= array3Len && array2Len >= array4Len)
            return "1 0 " + (n - 1);
        if (array3Len >= array1Len && array3Len >= array2Len && array3Len >= array4Len)
            return "0 1 " + (n - 1);
        return "1 1 " + (n - 1);
    }
}