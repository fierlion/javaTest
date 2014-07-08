/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package replacer;
import java.util.*;
/**
 *
 * @author Ray Allan Foote
 * July 6, 2014
 */
public class Replacer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] tests = {"this is a string  with   some words", "none"};
        replaceIt(tests);
    }
    
    public static void replaceIt(String[] arrIn){
        for (int i = 0; i < arrIn.length; ++i){
            char[] first = arrIn[i].toCharArray();
            int spaces = 0;
            for (int j = 0; j < first.length; ++j){
                if (first[j] == ' ') spaces++;
            }
            if(spaces > 0){
                char[] second = new char[first.length + spaces];
                for (int k = 0; k < first.length; ++k){
                    //add first[k] to second[k] and '%/' for each ' ' 
                }
            }
        }
    }
}
