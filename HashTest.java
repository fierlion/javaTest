/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hashtest;
import java.util.*;

/**
 *
 * @author mymac
 */
public class HashTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] intArr = {3,4,5,6,7};
        HashMap<Integer, Integer> myStud = buildMap(intArr);
        Set set = myStud.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            System.out.println(me.getKey() + ": " + me.getValue());
        }
        System.out.println(" ");
        System.out.println(myStud.get(3));
    }
    
    public static HashMap<Integer, Integer> buildMap(int[] arrIn){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arrIn.length; ++i) {
            map.put(i, arrIn[i]);
        }
        return map;
    }
}
