import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collection;
import java.io.*;
public class sampleget {
    public static void main(String[] args) {
        LinkedList<String> song = new LinkedList<String>();

        song.add("Dear God");
        song.add("Dear Agony");
        song.add("My Dear");

        System.out.println(song);

        //SECOND LIST
        LinkedList<String> artist = new LinkedList<String>();

        artist.add("Avenged Sevenfold");
        artist.add("Breaking Benjamin");
        artist.add("Memphis May Fire");
        for (int i=0; i < song.size(); i++ ) {
            System.out.println(song.get(i) + " - " + artist.get(i));
        }
        //MERGE 
        song.addAll(artist);
        System.out.println(song);
        System.out.println();

        // GET METHOD
        System.out.println();
        System.out.println("first element: " + song.getFirst());
        System.out.println("last element:" + song.getLast());
        System.out.println(song.removeLast());

        System.out.println();

        // ITERATION LOOP
        for(String temp: song) {
            System.out.println(temp);
        }

       
    }
}
