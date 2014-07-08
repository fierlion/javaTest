/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deviation;
import java.util.*;
/**
 *
 * @author mymac
 */
public class Deviation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] testArr = new int[100];
        Random rand = new Random();
        for (int i = 0; i < testArr.length; ++i){
            testArr[i] = rand.nextInt(100) + 1;
        }
        int result = devFind(testArr, 3);
        System.out.println(result);
    }
    
    public static int devFind(int[] arrIn, int seqLen){
        int result = 0;
        for (int i = 0; i <= (arrIn.length - seqLen); ++i){
            int total = 0;
            for (int j = 0; j < seqLen; ++j){
                total += arrIn[i + j];
            }
            if((total / seqLen) > result){
                result = total/seqLen;
            }
        }
        return result;
    }
}
