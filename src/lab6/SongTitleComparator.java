/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Comparator;
import lab1.*;
/**
 *
 * @author viewt_000
 */
public class SongTitleComparator implements Comparator<Song>{

    @Override
    public int compare(Song t, Song t1) {
        return t.getTitle().compareTo(t1.getTitle());
    }
    
}
