/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anagram;
import java.util.*;
/**
 * @author Ray Allan Foote
 * July 5, 2014
 */
public class Anagram {

    public static void main(String[] args) {
        String[] list1 = {"cinema", "host", "aba", "train"};
        String[] list2 = {"iceman", "shot", "bab", "rain"};
        isAna(list1, list2);
    }
    
    public static void isAna(String[] ar1, String[] ar2){
        //sort strings into alphabetical lists, then compare.
        char[] chars1;
        char[] chars2;
        for (int i = 0; i < ar1.length; ++i){
            chars1 = ar1[i].toCharArray();
            chars2 = ar2[i].toCharArray();
            Arrays.sort(chars1); 
            Arrays.sort(chars2);
            int isIt = 1;
            if (chars1.length != chars2.length){
                isIt = 0;
            } else {
                for (int j = 0; j < chars1.length; ++j){
                    if(chars1[j] != chars2[j]){
                        isIt = 0;
                    }
                }    
            }
            System.out.println(isIt);
        }
    }
    
}
