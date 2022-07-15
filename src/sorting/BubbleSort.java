package sorting;

/*  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * *
 *   Author: NJAD NISSI 安杰                                                                       *
 *   COMPUTER SCIENCE ENGINEER                                                                    *
 *   PROGRAMMER IN C, CPP, JAVA, PYTHON.                                                          *
 *   contact me at: njadnissi@gmail.com                                                           *
 ** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
/**
 * Bubble Sort:
 *  (1) We start with the second element, and traverse the whole list,
 *  looking for the right position for that (according to ascending or descending order).
 *  (2) We repeat the process until the last iteration which is item  the last item.
 *  (#) the sorting is successful after n-1 times, n being the number of items.
 * */

public class BubbleSort {

    static void sortAscendingOrder(double[] numbers) {
        System.out.println("BUBBLE SORT");
        showStep(numbers, 0);
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++)
                if (numbers[i] < numbers[j])
                    swap(numbers, i, j);
            showStep(numbers, i);
        }
    }

    static void sortDescendingOrder(double[] numbers) {
        System.out.println("BUBBLE SORT");
        showStep(numbers, 0);
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++)
                if (numbers[i] < numbers[j])
                    swap(numbers, i, j);
            showStep(numbers, i);
        }
    }

    static void swap(double[] numbers, int i, int j) {
        if (i != j) {
            numbers[i] += numbers[j];
            numbers[j] = numbers[i] - numbers[j];
            numbers[i] -= numbers[j];
        }
    }

    static void showStep(double[] numbers, int round) {
        System.out.print("round" + round + "=> ");
        for (int j = 0; j < numbers.length - 1; j++)
            System.out.print(numbers[j] + "     ");
        System.out.println(numbers[numbers.length - 1]);
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        double numbers[] = {255, 14, 73, 92, 20, 6, 10, 100, -11, 50, 0};

        sortAscendingOrder(numbers);
        sortDescendingOrder(numbers);

    }
}
