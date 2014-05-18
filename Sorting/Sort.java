/*
                 * In bubble sort, we basically traverse the array from first
                 * to array_length - 1 position and compare the element with the next one.
                 * Element is swapped with the next element if the next element is greater.
                 *
                 * Bubble sort steps are as follows.
                 *
                 * 1. Compare array[0] & array[1]
                 * 2. If array[0] > array [1] swap it.
                 * 3. Compare array[1] & array[2]
                 * 4. If array[1] > array[2] swap it.
                 * ...
                 * 5. Compare array[n-1] & array[n]
                 * 6. if [n-1] > array[n] then swap it.
                 *
                 * After this step we will have largest element at the last index.
                 *
                 * Repeat the same steps for array[1] to array[n-1]
                 *  
                 */
public class Sort
{
     public static void main(String[ ] args)
     {
             String[ ] names = {"joe", "slim", "ed", "george"};
             sortStringExchange (names);
             for ( int k = 0;  k < 4;  k++ )
                System.out.println( names [ k ] );
      }

      public static void sortStringExchange( String  x [ ] )
      {
            int i, j;
            String temp;

            for ( i = 0;  i < x.length;  i++ )
            {
                for ( j = 1;  j < x.length-i;  j++ )
                {  
                         if ( x [ j-1 ].compareToIgnoreCase( x [ j ] ) > 0 )
                          {                                             // ascending sort
                                      temp = x [ j-1 ];
                                      x [ j-1 ] = x [ j ];    // swapping
                                      x [ j ] = temp; 
                                      
                           } 
                   } 
             } 
      } 
}