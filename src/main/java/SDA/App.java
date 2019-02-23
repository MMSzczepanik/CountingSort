package SDA;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         int[] array = {1,0,2,5,2};
         int[] finalArray = Sort.countingSortPlus(array);

         for(int i=0; i<array.length;i++){
             System.out.print(finalArray[i]);
         }
    }
}
