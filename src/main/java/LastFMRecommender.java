//
//package main.java;


import java.io.*;
import java.util.*;

public class LastFMRecommender implements FMRecommenderInterface {
    @Override
    public int[] listFriends(int user) {
        return null;
    }

    /**
     *  prints the user1’s friends in
     * common with user2
     *
     * @param list of int
     */

    @Override
    public int[]  commonFriends(int user1, int user2){
        return null;
    }

    /**
     *  prints the list of artists listened
     * by both users
     *
     * @param list of int
     */

    @Override
    public int[] listArtists(int user1, int user2){
        return null;
    }

    /**
     *  prints the list of top 10 most popular artists listened by all
     * users
     *
     * @param list of int
     */

    @Override
    public int[] listTop10(){
        return null;
    }
    // user-artists.dat
    /**
     *   recommends 10 most popular artists listened by
     * the given user and his/her friends.
     *
     * @param list of int
     */

    @Override
    public String[] recommend10(int user){
        return null;
    }
// user-artists.dat

    // artist.dat

}
