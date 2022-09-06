public class Sort {
    public static void main(String[] args) {
        System.out.println("Sorting Arrays Project : ");

        int[] data = new int[]{4, 2, 3, 6, 9, 3, 5};


        Sort printing = new Sort();

        System.out.println("BubbleSorting:");
        printing.print(Sort.bubblesort(data));
        System.out.println("\nInsertionSorting");
        printing.print(Sort.insertionsort(data));
        System.out.println("\nSelectionSorting");
        printing.print(Sort.selectionsort(data));
    }

    public static int[] bubblesort(int[] data) {
        boolean sorted = false;
        int placeholder;
        while (!sorted) {
            sorted = true;
            for (int x = 0; x < data.length - 1; x++) {
                if (data[x] > data[x + 1]) {
                    placeholder = data[x];
                    data[x] = data[x + 1];
                    data[x + 1] = placeholder;
                    sorted = false;
                }
            }
        }
        return data;
    }

    public static int[] insertionsort(int[] data) {
        for (int i = 1; i < data.length; i++  ) {
            int current = data[i];
            int y = i-1;
            while( y >=0 && current < data[y]){
                data[y+1] = data[y];

                y--;
            }
            data[y+1] = current;
        }

        return data;
    }

    public static int[] selectionsort(int[] data) {
        for(int z = 0; z < data.length; z++){
            int minimum = data[z];
            int minimumID = z;
            for(int j = z+1; j < data.length; j++){
                if(data[j] < minimum){
                    minimum = data[j];
                    minimumID = j;
                }

            }

            int temporary = data[z];
            data[z] = minimum;
            data[minimumID] = temporary;
        }
        return data;
    }




    public void print(int[] data) {
        for (int value : data) {
            System.out.print(value + ",");
        }
    }
}
