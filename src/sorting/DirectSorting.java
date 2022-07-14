package sorting;

/*  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * *
 *   Author: NJAD NISSI 安杰                                                                       *
 *   COMPUTER SCIENCE ENGINEER                                                                    *
 *   PROGRAMMER IN C, CPP, JAVA, PYTHON.                                                          *
 *   contact me at: njadnissi@gmail.com                                                           *
 ** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
public class DirectSorting {

    static void sort(double[] numbers) {
        int sortedElNo = 1; /**directly push the first element in the sorted space*/

        System.out.println("DIRECT INSERT SORTING\n(SORTED SPACE)  [UNSORTED SPACE]");
        showStep(numbers, -1, 0);

        for (int i = 0; i < numbers.length; i++) {

            /**Move the current value from unsorted space to sorted space.*/
            for (int j = 0; j < sortedElNo - 1; j++) {
                if (numbers[i] < numbers[j]) {
                    moveValue(numbers, i, j);
                    break;
                }
            }
            showStep(numbers, sortedElNo - 1, i);

            sortedElNo++;
        }
    }

    static void moveValue(double[] numbers, int from, int to) {
        double valueToMove = numbers[from];
        /**shift toward right because is from >= to*/
        for (int i = from; i > to; i--)
            numbers[i] = numbers[i - 1];
        numbers[to] = valueToMove;
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

        double[] numbers = {255, 14, 73, 92, 20, 6, 10, 100, -11, 50, 0};

        sort(numbers);

    }

}
