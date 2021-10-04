package main;

import lib.measurable.Die;
import lib.measurable.Measurable;
import lib.measurable.Name;
import lib.measurable.Song;
import lib.measurable.DataAnalysis;

import java.util.ArrayList;

public class MeasurableDemo {

    public static void main(String[] args) {

        DataAnalysis<Song> song = new DataAnalysis<>();
        DataAnalysis<Name> name = new DataAnalysis<>();
        DataAnalysis<Die> die = new DataAnalysis<>();

        song.addMeasurable(new Song("Blame it on this song", 312, "Chunk! No, Captain Chunk"));
        song.addMeasurable(new Song("Blame it on this song", 214, "Chunk! No, Captain Chunk"));
        song.addMeasurable(new Song("Blame it on this song", 538, "Chunk! No, Captain Chunk"));
        song.addMeasurable(new Song("Blame it on this song", 129, "Chunk! No, Captain Chunk"));
        name.addMeasurable(new Name("Shaun", "Brown"));
        name.addMeasurable(new Name("Michael", "Evans"));
        name.addMeasurable(new Name("Tom", "Curtis"));
        name.addMeasurable(new Name("Ashim", "Gale"));
        die.addMeasurable(new Die());
        die.addMeasurable(new Die());
        die.addMeasurable(new Die());
        die.addMeasurable(new Die());

        System.out.println(song + "" + name + "" + die);

        System.out.println("Average song measure? " + song.avg() + "\n");
        System.out.println("Average name measure? " + name.avg() + "\n");
        System.out.println("Average die measure? " + die.avg() + "\n");

        System.out.println("Sum of song measure? " + song.sum() + "\n");
        System.out.println("Sum of name measure? " + name.sum() + "\n");
        System.out.println("Sum of die measure? " + die.sum() + "\n");

        System.out.println("Min of song measure? " + song.min() + "\n");
        System.out.println("Min of name measure? " + name.min() + "\n");
        System.out.println("Min of die measure? " + die.min() + "\n");

        System.out.println("Max of song measure? " + song.max() + "\n");
        System.out.println("Max of name measure? " + name.max() + "\n");
        System.out.println("Max of die measure? " + die.max() + "\n");

    }

}
