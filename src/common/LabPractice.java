/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Aruni
 */
public class LabPractice {
    public static void main(String[] args) {
        Movie movie1 = new Movie("1", "The GodFather", "Francis Ford Coppala");
        Movie movie2 = new Movie("1", "The GodFather", "Francis Ford Coppala");
        Movie movie3 = new Movie("3", "Inception", "Christopher Nolan");
        Movie movie4 = new Movie("4", "The Hobbit", "Peter Jackson");
        
        // Store movies on a map
        Map<String,Movie> map1 = new HashMap<>();
        map1.put("1", movie1);
        map1.put("1", movie2);
        map1.put("3", movie3);
        map1.put("4", movie4);
        
        // Retrieve one movie by its key
        Movie retrievedMovie = map1.get("3");
        System.out.println("Retrieved movie with a key of 3: " + retrievedMovie);
        
        Set<String> movieKeys = map1.keySet();
        
        for(String key: movieKeys){
            Movie found = map1.get(key);
            System.out.println(found);
        }
        
        Collection<Movie> values = map1.values();
        for(Movie movie: values){
            System.out.println(movie);
        }
        
        
        
        
    }
}
