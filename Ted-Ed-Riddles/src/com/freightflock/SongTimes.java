package com.freightflock;

import java.io.*;
import java.util.*;
//import javafx.util.Pair;

/*
 We have a catalog of song titles (and their lengths) that we play at a local radio station.  We have been asked to play two of those songs in a row, and they must add up to exactly seven minutes long.

 Given a list of songs and their durations, write a function that returns the names of any two distinct songs that add up to exactly seven minutes.  If there is no such pair, return an empty collection.

 Example:
 song_times_1 = [
 ("Stairway to Heaven", "8:05"), ("Immigrant Song", "2:27"),
 ("Rock and Roll", "3:41"), ("Communication Breakdown", "2:29"),
 ("Good Times Bad Times", "2:48"), ("Hot Dog", "3:19"),
 ("The Crunge", "3:18"), ("Achilles Last Stand", "10:26"),
 ("Black Dog", "4:55")
 ]
 find_pair(song_times_1) => ["Rock and Roll", "Hot Dog"] (3:41 + 3:19 = 7:00)

 Additional Input:
 song_times_2 = [
 ("Stairway to Heaven", "8:05"), ("Immigrant Song", "2:27"),
 ("Rock and Roll", "3:41"), ("Communication Breakdown", "2:29"),
 ("Good Times Bad Times", "2:48"), ("Black Dog", "4:55"),
 ("The Crunge", "3:18"), ("Achilles Last Stand", "10:26"),
 ("The Ocean", "4:31"), ("Hot Dog", "3:19"),
 ]
 song_times_3 = [
 ("Stairway to Heaven", "8:05"), ("Immigrant Song", "2:27"),
 ("Rock and Roll", "3:41"), ("Communication Breakdown", "2:29"),
 ("Hey Hey What Can I Do", "4:00"), ("Poor Tom", "3:00"),
 ("Black Dog", "4:55")
 ]
 song_times_4 = [
 ("Hey Hey What Can I Do", "4:00"), ("Rock and Roll", "3:41"),
 ("Communication Breakdown", "2:29"), ("Going to California", "3:30"),
 ("On The Run", "3:50"), ("The Wrestler", "3:50"),
 ("Black Mountain Side", "2:11"), ("Brown Eagle", "2:20")
 ]
 song_times_5 = [("Celebration Day", "3:30"), ("Going to California", "3:30"), ("Take it easy", "3:30")]
 song_times_6 = [
 ("Rock and Roll", "3:41"), ("If I lived here", "3:59"),
 ("Day and night", "5:03"), ("Tempo song", "1:57")
 ]
 song_times_7 = [("Black Dog", "4:55"), ("Living Loving Maid", "2:05")]
 song_times_8 = [("Communication Breakdown", "2:29"), ("Tea for One", "9:27")]

 All Test Cases - snake_case:
 find_pair(song_times_1) => ["Rock and Roll", "Hot Dog"]
 find_pair(song_times_2) => ["Rock and Roll", "Hot Dog"] or ["Communication Breakdown", "The Ocean"]
 find_pair(song_times_3) => ["Hey Hey What Can I Do", "Poor Tom"]
 find_pair(song_times_4) => []
 find_pair(song_times_5) => ["Celebration Day", "Going to California"] or ["Celebration Day", "Take it easy"] or ["Going to California", "Take it easy"]
 find_pair(song_times_6) => ["Day and night", "Tempo song"]
 find_pair(song_times_7) => ["Black Dog", "Living Loving Maid"]
 find_pair(song_times_8) => []

 All Test Cases - camelCase:
 findPair(songTimes1) => ["Rock and Roll", "Hot Dog"]
 findPair(songTimes2) => ["Rock and Roll", "Hot Dog"] or ["Communication Breakdown", "The Ocean"]
 findPair(songTimes3) => ["Hey Hey What Can I Do", "Poor Tom"]
 findPair(songTimes4) => []
 findPair(songTimes5) => ["Celebration Day", "Going to California"] or ["Celebration Day", "Take it easy"] or ["Going to California", "Take it easy"]
 findPair(songTimes6) => ["Day and night", "Tempo song"]
 findPair(songTimes7) => ["Black Dog", "Living Loving Maid"]
 findPair(songTimes8) => []

 Complexity Variable:
 n = number of song/time pairs
 */
public class SongTimes {
    public static void findPair(String[][] songTimes) {
        for (int ii = 0; ii < songTimes.length - 1; ii++) {
            String first_sing_name = songTimes[ii][0];
            String first_song_length = songTimes[ii][1];
            String output[] = first_song_length.split(":");
            //System.out.println(output[0]+":"+output[1]);
            int min_1 = Integer.parseInt(output[0]);
            int sec_1 = Integer.parseInt(output[1]);
            double minute_1 = (double) (min_1 + sec_1 / 60.0);
            //System.out.println("minute_1 = " + minute_1);

            //System.out.println(first_sing_name + ":" + first_song_length);
            for (int jj = ii + 1; jj < songTimes.length; jj++) {
                String second_song_name = songTimes[jj][0];
                String second_song_length = songTimes[jj][1];
                String output2[] = second_song_length.split(":");
                //System.out.println(output2[0]+":"+output2[1]);
                int min_2 = Integer.parseInt(output2[0]);
                int sec_2 = Integer.parseInt(output2[1]);
                double minute_2 = (double) (min_2 + sec_2 / 60.0);
                //System.out.println("minute_2 = " + minute_2);
                //System.out.println(second_song_name + ":" + second_song_length);
                double sum = minute_1 + minute_2;
                //System.out.println("sum= " + sum);

                if (sum >= 6.99 && sum <= 7.01) {
                    System.out.println(first_sing_name + ":" + first_song_length);
                    System.out.println(second_song_name + ":" + second_song_length);
                    break;
                }
            }
        }
    }

    public static void main(String[] argv) {
        String[][] songTimes1 = {
                {"Stairway to Heaven", "8:05"}, {"Immigrant Song", "2:27"},
                {"Rock and Roll", "3:41"}, {"Communication Breakdown", "2:29"},
                {"Good Times Bad Times", "2:48"}, {"Hot Dog", "3:19"},
                {"The Crunge", "3:18"}, {"Achilles Last Stand", "10:26"},
                {"Black Dog", "4:55"}
        };

        findPair(songTimes1);

        String[][] songTimes2 = {
                {"Stairway to Heaven", "8:05"}, {"Immigrant Song", "2:27"},
                {"Rock and Roll", "3:41"}, {"Communication Breakdown", "2:29"},
                {"Good Times Bad Times", "2:48"}, {"Black Dog", "4:55"},
                {"The Crunge", "3:18"}, {"Achilles Last Stand", "10:26"},
                {"The Ocean", "4:31"}, {"Hot Dog", "3:19"}
        };

        findPair(songTimes2);

        String[][] songTimes3 = {
                {"Stairway to Heaven", "8:05"}, {"Immigrant Song", "2:27"},
                {"Rock and Roll", "3:41"}, {"Communication Breakdown", "2:29"},
                {"Hey Hey What Can I Do", "4:00"}, {"Poor Tom", "3:00"},
                {"Black Dog", "4:55"}
        };

        findPair(songTimes3);

        String[][] songTimes4 = {
                {"Hey Hey What Can I Do", "4:00"}, {"Rock and Roll", "3:41"},
                {"Communication Breakdown", "2:29"}, {"Going to California", "3:30"},
                {"On The Run", "3:50"}, {"The Wrestler", "3:50"},
                {"Black Mountain Side", "2:11"}, {"Brown Eagle", "2:20"}
        };

        findPair(songTimes4);

        String[][] songTimes5 = {
                {"Celebration Day", "3:30"}, {"Going to California", "3:30"},
                {"Take it easy", "3:30"}
        };

        findPair(songTimes5);

        String[][] songTimes6 = {
                {"Rock and Roll", "3:41"}, {"If I lived here", "3:59"},
                {"Day and night", "5:03"}, {"Tempo song", "1:57"}
        };

        findPair(songTimes6);

        String[][] songTimes7 = {
                {"Black Dog", "4:55"}, {"Living Loving Maid", "2:05"}
        };

        findPair(songTimes7);

        String[][] songTimes8 = {
                {"Communication Breakdown", "2:29"}, {"Tea for One", "9:27"}
        };

        findPair(songTimes8);
    }
}