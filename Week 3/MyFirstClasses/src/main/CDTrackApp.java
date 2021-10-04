package main;

import lib.CDTrack;

public class CDTrackApp {

    public static void main(String[] args) {

        CDTrack[] cd = new CDTrack[5];

        CDTrack bRhapsody = new CDTrack("Bohemian Rhapsody", "Queen", 355);

        cd[0] = bRhapsody;

        cd[1] = new CDTrack("The Chain", "Fleetwood Mac", 270);
        cd[2] = new CDTrack("The Masterplan", "Oasis", 323);
        cd[3] = new CDTrack("Sgt. Pepper's Lonely Hearts Club Band", "The Beatles", 120);
        cd[4] = new CDTrack("Behind Blue Eyes", "The Who", 279);

        boolean trackExists = false;

        for (CDTrack track : cd){
            System.out.println(track.getTitle());
            if (track.getTitle().equals("Welcome to the Jungle")){
                trackExists = true;
                break;
            }
        }

        if(trackExists){
            System.out.println("We have got the track 'Welcome to the Jungle' in store");
        } else {
            System.out.println("We do not have the track 'Welcome to the Jungle' in store");
        }

        CDTrack track2 = cd[1];
        System.out.println("Our first track is: " + cd[0].getTitle());
        
        System.out.println("Our second track is: " + track2.getTitle().toString());

    }
}
