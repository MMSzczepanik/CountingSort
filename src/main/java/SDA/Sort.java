package SDA;

public class Sort {

    public static int[] countingSort(int[] array){

        // najwieksza wartosc
        int max = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        //pomocnicza tablica i zliczanie
        int[] tmpArray = new int[max+1];
        for(int i=0; i<array.length; i++){
            tmpArray[array[i]]++;
        }

        //sumowanie pomocniczej
        int sum = 0;
        for(int i=0; i<tmpArray.length; i++){
            sum += tmpArray[i];
            tmpArray[i] = sum;
        }

        //finalna
        int[] finalArray = new int[array.length];

        for(int i=0; i<array.length; i++){
            tmpArray[array[i]] -= 1;
            finalArray[tmpArray[array[i]]] = array[i];
        }

        return finalArray;

    }
}
