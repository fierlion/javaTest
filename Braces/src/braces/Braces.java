/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package braces;
import java.util.*;
/**
 *
 * @author Ray Allan Foote
 * July 25, 2014
 */
public class Braces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] braceAr = {")(){}", "[]({})", "([])", "{()[]}", "([)]"};
        String[] quickie = {"{()[]}"};
        isBal(braceAr);
        }

    public static void isBal(String[] arIn){
        for (int i = 0; i < arIn.length; ++i){
            int result = 0;
            Stack bracer = new Stack();   
            char[] charIn = arIn[i].toCharArray();
            for (int j = 0; j < charIn.length; ++j){
                if(Arrays.asList('}',']',')').contains(charIn[j])){
                    try {
                        switch(charIn[j]){
                            case ')':
                                System.out.println(bracer.pop());
                            case '}':
                                System.out.println(bracer.pop());
                            case ']':
                                System.out.println(bracer.pop());
                            default:
                                break;
                        }
                    } 
                    catch (EmptyStackException e){
                        if(j == charIn.length -1){
                            result = 1;
                            break;
                        }
                    }
                if(Arrays.asList('{','[','(').contains(charIn[j])){
                    bracer.push(charIn[j]);
                    }
                }
            }
        }
    }
}
    
    

