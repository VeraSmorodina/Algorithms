package task6;

public class Level1 {
    public static int[] TRC_sort(int[] trc) {
        sort(trc, 0, trc.length - 1, 0);
        return trc;
    }

    private static void sort(int[] trc, int low, int high, int mid) {
        if (mid > high)
            return;
        if (trc[mid] == 0) {
            swapTwoElements(trc, low, mid);
            sort(trc, low + 1, high, mid + 1);
        }
        if (trc[mid] == 1) {
            sort(trc, low, high, mid + 1);
        }
        if (trc[mid] == 2) {
            swapTwoElements(trc, mid, high);
            sort(trc, low, high - 1, mid);
        }
    }

    private static void swapTwoElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}