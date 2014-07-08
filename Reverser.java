/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reverser;
import java.util.*;
/**
 *
 * @author Ray Allan Foote
 * July 6, 2014
 */
public class Reverser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] tests = {"abcd/", "this is a string/"};
        reversed(tests);
    }
    
    public static void reversed(String[] arrIn){
        for (int i = 0; i < arrIn.length; ++i){
            char[] charIn = arrIn[i].toCharArray();
            char[] swapped = swapper(charIn);
            System.out.println(swapped);
        }       
    }
    
    public static char[] swapper(char[] charIn){
        for (int i = 0; i < (charIn.length / 2); ++i){
            char extra = charIn[i];
            charIn[i] = charIn[(charIn.length -i)-2];
            charIn[(charIn.length-i)-2] = extra;
        }
        return charIn;
    }
      
}
