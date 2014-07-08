/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package allunique;
import java.util.*;
/**
 *
 * @author Ray Allan Foote
 * July 6, 2014
 */
public class AllUnique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] tests = {"Anthills are fun", "all unique", "nope", 
            "qwertyuiopasdfghjklzxcvbnm"};
        allUnique(tests);
    }
    
    public static void allUnique(String[] arrIn){
        for(int i = 0; i < arrIn.length; ++i){
            int result = 1;
            char[] charIn = arrIn[i].toCharArray();
            Arrays.sort(charIn);
            System.out.println(charIn);
            for (int j = 0; j < charIn.length; ++j){
                for (int k = j+1; k < charIn.length; ++k){
                    if (charIn[j]==charIn[k]) result = 0;
                }
            }
            System.out.println(result);
        }
    }
    
}
