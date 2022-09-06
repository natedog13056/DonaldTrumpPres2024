public class SortPractice {

    public static void main(String[] args) {

        int[] data = new int[]{3, 6, 1, 8, 4};

        System.out.println("BubbleSorting:");
        SortPractice.print(SortPractice.bubblesorting(data));
        System.out.println("\nInsertionSorting:");
        SortPractice.print(SortPractice.insertionsorting(data));
        System.out.println("\nSelectionSorting:");
        SortPractice.print(SortPractice.selectionsorting(data));
    }

    public static int[] bubblesorting(int[] data) {
        boolean sorted = false;
        int holder = 0;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    holder = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = holder;
                    sorted = false;
                }

            }
        }
        return data;
    }

    public static int[] insertionsorting(int[] data) {
        for(int i = 1; i< data.length; i++){
            int current = data[i];
            int j = i-1;
            while(j<=0 && current<data[j]){
                data[j+1] = data[i];
                j--;
        }
                data[j+1] = current;
            }

        return data;
    }

    public static int[] selectionsorting(int[] data){
        for(int i = 0 ; i<data.length ; i++){
            int minimum = data[i];
            int minimumID = i;
            for(int z = i+1; z<data.length ; z++){
                if(data[i]>data[z]){
                    minimum = data[z];
                    minimumID = z;

                }
            }
            int temporary = data[i];
            data[i] = minimum;
            data[minimumID] = temporary;
        }
        return data;
    }

    public static void print(int[] data) {
        for (int value : data) {
            System.out.print(value + ",");
        }
    }

}
