package codewars.level7;

import java.util.*;

public class MinimumInArray {
    // Учитывая список цифр , верните наименьшее число , которое можно составить из этих цифр, используя цифры только один раз (игнорируя дубликаты).
        ///not passed the tests in CodeWars

  //      Arrays.sort(values);
  //      int minusInSizeForResultArray = 0;
  //      for (int i = 1; i < values.length; i++) {
  //          if (values[i] == values[i - 1] || values[i] > 9) {
  //              minusInSizeForResultArray++;
  //          }
  //      }
  //      int[] resultArray = new int[values.length - minusInSizeForResultArray];
  //      int indexInResultArray = 0;
  //      if (resultArray.length > 1) {
  //          resultArray[indexInResultArray] = values[0];
  //          indexInResultArray++;
  //      }
  //      Arrays.sort(resultArray);
  //      int helpToChangeIndex = resultArray[resultArray.length - 1];
  //      for (int number : values) {
  //          if ((Arrays.binarySearch(resultArray, number) < 0) && (number <= 9)) {
  //              resultArray[indexInResultArray] = number;
  //              indexInResultArray++;
  //              if (indexInResultArray >= resultArray.length) {
  //                  break;
  //              }
  //          }
  //      }
  //      resultArray[0] = helpToChangeIndex;
  //      int result = 0;
  //      for (int number : resultArray) {
  //          result = result * 10 + number;
  //      }
  //      return result;
  //  }
        /// This method is working in CodeWars
    public static int min(int[] values) {
        TreeSet<Integer> mySet = new TreeSet<>();
        for (int number : values) {
            if (number <= 9) {
                mySet.add(number);
            }
        }
        int result = 0;
        for (Integer num : mySet) {
            result = result * 10 + num;
        }
        return result;
    }
}