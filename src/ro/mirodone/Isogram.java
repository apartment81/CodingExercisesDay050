package ro.mirodone;

import java.util.Arrays;

public class Isogram {

     boolean isIsogram (String string) {

         string = string.toLowerCase();
         int  length = string.length();

         char array[] = string.toCharArray();

         Arrays.sort(array);

         for ( int i = 0; i < length -1 ; i++){
             if( array[i] == array[i+1]){
                 return false;
             }
         }return  true;

     }

}
