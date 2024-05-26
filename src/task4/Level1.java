package task4;

public class Level1 {
    public static int artificial_muscle_fibers(int[] arr) {
        byte[] bitArray = new byte[8192];
        int duplicateCount = 0;
        for (int num : arr) {
            int index = num - 1;
            int byteIndex = (index * 2) / 8;
            int bitOffset = (index * 2) % 8;
            int currentBits = (bitArray[byteIndex] >> bitOffset) & 3;
            if (currentBits == 1) {
                duplicateCount++;
                bitArray[byteIndex] |= (2 << bitOffset);
                continue;
            }
            if (currentBits == 0)
                bitArray[byteIndex] |= (1 << bitOffset);
        }
        return duplicateCount;
    }
}