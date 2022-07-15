package sorting;

/*  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * *
 *   Author: NJAD NISSI 安杰                                                                       *
 *   COMPUTER SCIENCE ENGINEER                                                                    *
 *   PROGRAMMER IN C, CPP, JAVA, PYTHON.                                                          *
 *   contact me at: njadnissi@gmail.com                                                           *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
/**
 * Selection Sort:
 *  (1) We divide the list into two parts: Sorted space () and unsorted space [].
 *  (2) we select the minimum(for ascending order) or maximum(for descending order)
 *      item from the unsorted space and move it to next position int the sorted space.
 *  (3) Repeat the process until the unsorted space has no item left.
 *  (#) the sorting is successful after n-1 times, n being the number of items.
 * */
public class SelectionSort {

    static void sortAscendingOrder(double[] numbers) {
        int sortedElementsNo = 0;

        System.out.println("SIMPLE SELECT SORTING\n(SORTED SPACE)  [UNSORTED SPACE]");
        showStep(numbers, -1, 0);

        for (int round = 1; round <= numbers.length; round++) {
            /**If this number is the minimum of the unsorted list.*/
            int minIndex = getMinIndex(numbers, sortedElementsNo);

            swap(numbers, sortedElementsNo, minIndex);

            /**DISPLAY ALL STEPS OF THE METHOD*/
            showStep(numbers, sortedElementsNo, round);

            sortedElementsNo++;
        }
    }

    static void sortDescendingOrder(double[] numbers) {
        int sortedElementsNo = 0;

        System.out.println("SIMPLE SELECT SORTING\n(SORTED SPACE)  [UNSORTED SPACE]");
        showStep(numbers, -1, 0);

        for (int round = 1; round <= numbers.length; round++) {
            /**If this number is the minimum of the unsorted list.*/
            int maxIndex = getMaxIndex(numbers, sortedElementsNo);

            swap(numbers, sortedElementsNo, maxIndex);

            /**DISPLAY ALL STEPS OF THE METHOD*/
            showStep(numbers, sortedElementsNo, round);

            sortedElementsNo++;
        }
    }

    static void swap(double[] numbers, int i, int j) {
        if (i != j) {
            numbers[i] += numbers[j];
            numbers[j] = numbers[i] - numbers[j];
            numbers[i] -= numbers[j];
        }
    }

    static int getMinIndex(double[] numbers, int startPos) {
        int min = startPos;

        for (int i = startPos + 1; i < numbers.length; i++)
            if (numbers[i] < numbers[min]) min = i;
        return min;
    }

    static int getMaxIndex(double[] numbers, int startPos) {
        int max = startPos;

        for (int i = startPos + 1; i < numbers.length; i++)
            if (numbers[i] > numbers[max]) max = i;
        return max;
    }

    static void showStep(double[] numbers, int sortedElNo, int round) {

        System.out.print("round" + round + "=>( ");/**OPEN SORTED SPACE*/
        if (sortedElNo < 0) {
            System.out.print(" ) [ ");
            for (int j = 0; j < numbers.length - 1; j++)
                System.out.print(numbers[j] + "    ");
        } else {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (j == sortedElNo)
                    System.out.print(numbers[j] + " ) [ ");/**CLOSE SORTED SPACE*/
                else
                    System.out.print(numbers[j] + "    ");
            }
        }
        System.out.print(numbers[numbers.length - 1]);/**Appending the last element without adding spaces after*/
        System.out.println(" ]\n------------------------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        double numbers[] = {255, 14, 73, 92, 20, 6, 10, 100, -11, 50, 0};

        sortAscendingOrder(numbers);
        sortDescendingOrder(numbers);

    }

}