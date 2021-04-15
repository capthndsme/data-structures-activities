import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collection;
import java.io.*;
import java.util.Scanner;

    public class Links {
        public static void main (String[]args) {
            Scanner sc = new Scanner(System.in);
            LinkedList <String> FavSongs = new LinkedList();

            FavSongs.add("Don't Look Back in Anger");
            FavSongs.add("Listen up");
            FavSongs.add("Live Forever");
            FavSongs.add("The Hindu Times");
            FavSongs.add("Shakermaker");

            System.out.println("These are my favorite songs that I think are the best!");
            System.out.println("------------------------------------------------------");

            for(String temp: FavSongs) {
                System.out.println(temp);
            }
            System.out.println("How about you? Would you like to insert/delete/display/search a song?");
            String DoThis = sc.nextLine();

            if (DoThis.toLowerCase().contains("insert")) {
                System.out.print("Enter the song you want to insert:");
                String InsertSong = sc.nextLine();
                FavSongs.add(InserSong);
                System.out.println(FavSongs);
}
                else if (DoThis.toLowerCase().contains("delete")) {
                System.out.println("What element do you want to delete? Enter the number: ");
                int RemoveSong = sc.nextInt();
                FavSongs.remove(RemoveSong);
                System.out.println(FavSongs); 
            }
                else if (DoThis.toLowerCase().contains("display")) {
                System.out.println("What song do you want to display?: ");
                String DisplaySong = sc.nextLine();
                System.out.println(DisplaySong);
            }
                else if (DoThis.toLowerCase().contains("search")) {
                System.out.println("What song do you want to search?: ");
                String SearchSong = sc.nextInt();
                    if (FavSong.contains(SearchSong)) {
                        System.out.println(SearchSong + " " + "is one of the Favorite songs listed");
                    } else {
                        System.out.println(Searchsong + " " + "is not one of the Favorite songs listed");
                }
            }
        }
    }