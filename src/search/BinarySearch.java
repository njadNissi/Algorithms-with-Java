package search;
/*  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * *
*   Author: NJAD NISSI 安杰                                                                       *
*   COMPUTER SCIENCE ENGINEER                                                                    *
*   PROGRAMMER IN C, CPP, JAVA, PYTHON.                                                          *
*   contact me at: njadnissi@gmail.com                                                           *
** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
/**Binary search works only for sorted list of items.*/
public class BinarySearch {

    static int search(double[] numbers, double value){
        boolean found = false;
        int round = 0;
        int start = 0;
        int end = numbers.length - 1;
        int middle = 0;

        while(!found){
            middle = (end + start) / 2;
            showStep(numbers, start, end, middle, round);

            if(numbers[middle] == value)
                found = true;
            else if(numbers[middle] < value)
                start = middle + 1;
            else if(numbers[middle] > value)
                end = middle - 1;

            round++;
        }

        return middle;
    }
    static void showStep(double[] numbers, int start, int end, int mid, int round) {
        if(round == 0)
            System.out.println("BINARY SEARCH ALGORITHM");
        else
            System.out.println("round" + round + "=> search interval=[" + start + ", " + end+"] midInd= "+ mid +" value = " + numbers[mid]);
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        double numbers[] = {-11, 0, 6, 10, 14, 20, 50, 73, 92, 100, 255};

        /**print the sorted array*/
        System.out.print("Sorted List:{ ");
        for (int i = 0; i < numbers.length - 1; i++)
            System.out.print(numbers[i] + "     ");
        System.out.println(numbers[numbers.length - 1]+" }");
        /**print subscripts*/
        System.out.print("indexes:         ");
        for (int i = 0; i < numbers.length - 1; i++)
            System.out.print(i + "        ");
        System.out.println(numbers.length - 1);

        /**Execute the search algorithm*/
        search(numbers, 0);

    }

}
