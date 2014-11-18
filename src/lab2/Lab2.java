/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import lab1.*;
import java.util.*;
import java.time.*;

/**
 *
 * @author viewt_000
 */
public class Lab2 {
    public static void main(String[] args) {
        Song songOne = new Song("Test Song 1", "Test Artist", "Test", LocalDate.of(1999, Month.MARCH, 12));
        Song songTwo = new Song("Test Song 1", "Test Artist 2", "Test", LocalDate.of(1999, Month.MARCH, 12));
        Song songThree = new Song("Test Song 2", "Test Artist", "Test", LocalDate.of(2001, Month.MARCH, 12));
        Song songFour = new Song("Another Test Song", "Test Artist 2", "Test", LocalDate.of(2003, Month.MARCH, 12));
        
        Map<Integer, Song> songMap = new LinkedHashMap<>();
        songMap.put(songOne.hashCode(), songOne);
        songMap.put(songTwo.hashCode(), songTwo);
        songMap.put(songThree.hashCode(), songThree);
        songMap.put(songFour.hashCode(), songFour);
        Set<Integer> keySet = songMap.keySet();
        for(Integer i : keySet)
        {
            System.out.println(songMap.get(i));
        }
    }
}
