package codewars.level7;

import java.util.Arrays;

public class MinimumInArray {

    public static int minValue(int[] values) {
        Arrays.sort(values);
        int sizeTheResultArray = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] == values[i - 1] || values[i] > 9) {
                sizeTheResultArray++;
            }
        }
        int[] resultArray = new int[values.length - sizeTheResultArray];
        int indexInResultArray = 0;
        if (resultArray.length > 1) {
            resultArray[indexInResultArray] = values[0];
            indexInResultArray++;
        }
        Arrays.sort(resultArray);
        int helpToChangeIndex = resultArray[resultArray.length - 1];
        for (int number : values) {
            int index = Arrays.binarySearch(resultArray, number);
            if ((index < 0) && (number <= 9)) {
                resultArray[indexInResultArray] = number;
                indexInResultArray++;
            }
        }
        resultArray[0] = helpToChangeIndex;
        int result = 0;
        for (
                int number : resultArray) {
            result = result * 10 + number;
        }
        return result;
    }
}