package sorting;

public class SimpleSelectionSort {

    static void sort(double[] numbers) {
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

    public static void main(String[] args) {

        double numbers[] = {255, 14, 73, 92, 20, 6, 10, 100, -11, 50, 0};

        sort(numbers);

    }

}