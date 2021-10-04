package main;

import lib.iterable_comparable.PlayList;
import lib.iterable_comparable.Song;

/* Program to informally test, create and populate a PlayList object. */
public class PlayListApp {

    public static void main(String[] arg) {

    	//Create a new PlayList object
        PlayList playlist = new PlayList("My Favourites");
        PlayList playlist2 = new PlayList("My other faves");

        Song helloThere1 = new Song("Hello there", 235, "General Kenobi");
        Song helloThere2 = new Song("Hello there", 235, "General Kenobe");

        //add some new Song objects

        playlist.addSong( new Song("Bad", 235, "Rhianna") );
        playlist.addSong( new Song("Only Girl (In The World)", 235, "Rhianna") );
        playlist.addSong( new Song("Thinking of Me", 206, "Olly Murs") );
        playlist.addSong( new Song("Raise Your Glass", 202,"P!nk") );
        playlist.addSong( new Song("Beat it", 150,"M Jackson") );        
        playlist.addSong( new Song("Bad", 210,"M Jackson") );

        playlist2.addSong( new Song("Only Girl (In The World)", 235, "Rhianna") );
        playlist2.addSong( new Song("Thinking of Me", 206, "Olly Murs") );
        playlist2.addSong( new Song("Raise Your Glass", 202,"P!nk") );
        playlist2.addSong( new Song("Beat it", 150,"M Jackson") );
        playlist2.addSong( new Song("Bad", 210,"M Jackson") );
        
        //output some details
        for(Song track: playlist){
            track.play();
        }
//
        System.out.println("\n");
//        playlist.mergePlaylist(playlist2);
//
//        for(Song track: playlist){
//            track.play();
//        }

//        System.out.println(playlist + "\n");
//
//        System.out.println("Number of Songs: " + playlist.numberOfSongs());
//        System.out.println("Total time: " + playlist.getTotalTime() + " seconds\n");
//
//        System.out.println("Playing each song...");
//        for (int i = 0; i < playlist.numberOfSongs(); i++) {
//            playlist.getSong(i).play();
//        }
//
//        //find the song at index 4
//        Song s = playlist.getSong(4);
//        System.out.println("\nSong at index 4 is: " + s + "\n");
//
//        //remove a Song
//        System.out.println("Removing a song...");
//        playlist.removeSong(1);
//        System.out.println(playlist.getTrackListings());
//
//        //move up
//        System.out.println("Moving a song...");
//        playlist.moveUp(3);
//        System.out.println(playlist.getTrackListings());
//
//        //shuffle
//        System.out.println("Shuffling playlist...");
//        playlist.shufflePlaylist();
//        System.out.println(playlist.getTrackListings());

        playlist.sortPlaylist();
        System.out.println(playlist.getTrackListings());

        if (helloThere1.compareTo(helloThere2) < 0 ) { // then s1 is before s2
            System.out.println(helloThere1 + " is before " + helloThere2);
        }
        else if (helloThere1.compareTo(helloThere2) == 0 ) { // then s1 and s2 same
            System.out.println(helloThere1 + " is the same as " + helloThere2);
        }
        else if (helloThere1.compareTo(helloThere2) > 0 ) { // then s1 is after s2
            System.out.println(helloThere1 + " is after " + helloThere2);
        }


    }
}
