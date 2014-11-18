/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import lab1.*;
import java.util.*;
import java.time.*;

/**
 *
 * @author viewt_000
 */
public class Lab6 {
    public static void main(String[] args) {
        Song songOne = new Song("Test Song 1", "Test Artist", "Test", LocalDate.of(1999, Month.MARCH, 12));
        Song songTwo = new Song("Test Song 1", "Test Artist 2", "Test", LocalDate.of(1999, Month.MARCH, 11));
        Song songThree = new Song("Test Song 2", "Test Artist", "Test", LocalDate.of(2001, Month.MARCH, 12));
        Song songFour = new Song("Another Test Song", "Test Artist 2", "Test", LocalDate.of(2003, Month.MARCH, 12));
        
        List<Song> songList = new LinkedList<>();
        songList.add(songOne);
        songList.add(songTwo);
        songList.add(songThree);
        songList.add(songFour);
        Collections.sort(songList, new SongTitleComparator());
        for(Song s: songList)
        {
            System.out.println(s);
        }
    }
}
