/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ajayasooriya
 */
public class Demo1 {
    public static void main(String[] args) {
        // HashMap, Hashtable, TreeMap, LinkedHashMap
        Map myMap = new HashMap();
//        //
//        myMap.put("January",1);
//        myMap.put("February",2);
//        myMap.put("March",3);
//        
//        Integer m = (Integer)myMap.get("January");
//        System.out.println(m);
        

        //get key
        Set keys = myMap.keySet();
        
        for(Object key: keys){
            Employee e = (Employee)myMap.get(key);
            System.out.println(e);                
        }
        //get values       
        Collection empCol = myMap.values();
        for(Object empObj: empCol){
            Employee e = (Employee)empObj;
            System.out.println(e);                
        }
    }
}
