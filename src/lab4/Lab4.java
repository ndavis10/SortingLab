/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import lab1.*;
import java.util.*;
import java.time.*;

/**
 *
 * @author viewt_000
 */
public class Lab4 {
    public static void main(String[] args) {
        Song songOne = new Song("Test Song 1", "Test Artist", "Test", LocalDate.of(1999, Month.MARCH, 12));
        Song songTwo = new Song("Test Song 1", "Test Artist 2", "Test", LocalDate.of(1999, Month.MARCH, 11));
        Song songThree = new Song("Test Song 2", "Test Artist", "Test", LocalDate.of(2001, Month.MARCH, 12));
        Song songFour = new Song("Another Test Song", "Test Artist 2", "Test", LocalDate.of(2003, Month.MARCH, 12));
        
        Set<Song> songSet = new TreeSet<>();
        songSet.add(songOne);
        songSet.add(songTwo);
        songSet.add(songThree);
        songSet.add(songFour);
        for(Song s: songSet)
        {
            System.out.println(s);
        }
    }
}
