/* COPYRIGHT (C) HARRY CLARK 2024 */
/* CS2_DSA MAP AND SETS LEARNING EXCERISE */

/* THIS FILE PERTAINS TOWARDS THE SHOWCASE OF BEING ABLE TO READ USER INPUT */
/* TO ADD, STORE AND PRINT OUT RESPECTIVE ELEMENTS ADDED TO A MAP */

/* THE LOOKUP WILL ALLOW USERS TO SEE WHICH SONGS THEY ADD TO THE QUEUE */

import java.util.Map;
import java.util.HashMap;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Scanner;

public class Music
{
    private static String SONG;
    private static final Map<String, Object> SONG_LIST = new HashMap<>();
    private static NavigableSet<String> SONG_ITER;
    private static Scanner SCANNER; 

    /* STATIC DECORATOR FOR CON-CURRENT VARIABLES */

    static
    {
        SCANNER = new Scanner(System.in);
        SONG_ITER = new TreeSet<>();
    }

    /* ADD THE SONG TO THE CURRENT SET BASED ON USER INPUT */

    public final static void ADD_SONGS()
    {
        System.out.println("Add a Song\n");
        SONG = SCANNER.nextLine();

        SONG_LIST.put(SONG, "Song Details:\n");
        SONG_ITER.add(SONG);

        System.out.printf("Song: %s added to the Queue\n", SONG);
    }

    /* NOW, PRINT OUT WHICH SONGS HAVE BEEN ORDERED IN THE ORDER */
    /* THEY APPEAR IN THE SET  */

    public static final void SONG_ORDER()
    {
        System.out.println("Songs in Order:\n");
        for(String S : SONG_ITER)
        {
            System.out.println(S);
        }
    }

    public final static void DISPLAY_MENU()
    {
        System.out.printf("=======================================\n");
        System.out.println("HARRY CLARK - MUSIC MAP QUEUE THINGY-MA-JIG");
        System.out.printf("=======================================\n");


        System.out.println("Enter a choice:\n");
        System.out.println("1. Add Song");
        System.out.println("2. List Songs (in order)");
        System.out.println("3. Exit");

        USER_CHOICE();
    }

    public final static void ARGS(String[] args)
    {
        DISPLAY_MENU();
    }

    private static void USER_CHOICE()
    {
        int INDEX = 0;

        try
        {
            INDEX = SCANNER.nextInt();
            SCANNER.nextLine();

            switch (INDEX) 
            {
                case 1:
                    ADD_SONGS();
                    break;

                case 2:
                    SONG_ORDER();
                    break;

                case 3:
                    System.exit(0);
                    return;
        
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }

        catch (Exception EX)
        {
            EX.getMessage();
            SCANNER.nextLine();
        }

        finally
        {
            DISPLAY_MENU();
        }
    }
}
