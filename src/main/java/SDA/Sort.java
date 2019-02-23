package SDA;

import java.util.HashMap;
import java.util.Map;

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

    public static int[] countingSortPlus(int[] array) {

        // najwieksza wartosc
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }


        Map<Integer,Integer> mapa = new HashMap<>();
        for(int i=0; i<array.length; i++){
             if(mapa.get(array[i])==null){
                 mapa.put(array[i],1);
             }else{
                 mapa.replace(array[i],mapa.get(array[i])+1);
             }
         }

        int sum = 0;
        for(Integer id : mapa.keySet()) {
            sum += mapa.get(id);
            mapa.replace(id,sum);
        }

        //finalna
        int[] finalArray = new int[array.length];

        for(int i=0; i<array.length; i++){
            finalArray[mapa.get(array[i])-1] = array[i];
            mapa.replace(array[i],mapa.get(array[i]) - 1);
        }

        return finalArray;

    }


}
