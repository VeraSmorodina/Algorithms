package task7;

public class Level1 {
    public static int[] matrix(int n, int m, int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[0];
        int[] result = new int[m * n];
        int index = 0;
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                result[index++] = matrix[top][i];
            top++;

            for (int i = top; i <= bottom; i++)
                result[index++] = matrix[i][right];
            right--;

            if (top > bottom) break;
            for (int i = right; i >= left; i--)
                result[index++] = matrix[bottom][i];
            bottom--;

            if (left > right) break;
            for (int i = bottom; i >= top; i--)
                result[index++] = matrix[i][left];
            left++;
        }
        return result;
    }
}