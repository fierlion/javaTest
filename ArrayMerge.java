/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraymerge;
import java.util.*;
/**
 *
 * @author mymac
 */
public class ArrayMerge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> sentence;
        String[] someWord = {"This", "a", "sentence"};
        String[] moreWord = {"is", "long", ",right?"};
        sentence = merge(someWord, moreWord);
        System.out.println(sentence);
        StringBuffer result = new StringBuffer();
        for (String w: sentence) {
            result.append(w);
            result.append(" ");
        }
        System.out.println(result.toString());
        
    }
    
    public static ArrayList<String> merge(String[] words1, String[] words2){
        ArrayList<String> merged = new ArrayList<String>();
        for (int i = 0; i < words1.length; ++i){
            merged.add(words1[i]);
            merged.add(words2[i]);
        }
        return merged;
    }
}
