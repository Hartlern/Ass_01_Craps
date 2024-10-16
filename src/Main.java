import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        String declareEnd = "Y";

        do
        {
            Random rnd = new Random();
            int die1 = rnd.nextInt( 6 ) + 1;
            int die2 = rnd.nextInt( 6 ) + 1;
            int diesum = die2 + die1;

            System.out.println( "You rolled: " + die1 + " + " + die2 + " = " + diesum );

            if( diesum == 2 || diesum == 3 || diesum == 12 )
            {
                System.out.println( "die 1 rolled: " + die1 );
                System.out.println( "die 2 rolled: " + die2 );
                System.out.println( "Craps! You lose" );
                System.out.println( "Want to play again [Y/N]?" );
                declareEnd = scan.next();
            }
            else if( diesum == 7 || diesum == 11 )
            {
                System.out.println( "die 1 rolled: " + die1 );
                System.out.println( "die 2 rolled: " + die2 );
                System.out.println( "Natural! You win" );
                System.out.println( "Want to play again [Y/N]?" );
                declareEnd = scan.next();
            }
            else
            {
                int point = diesum;
                System.out.println( "The point is now: " + point );
                int die3 = rnd.nextInt( 6 ) + 1;
                int die4 = rnd.nextInt( 6 ) + 1;
                int diesum2 = die3 + die4;
                if( diesum2 == 7 )
                {
                    System.out.println( "die 1 rolled: " + die3 );
                    System.out.println( "die 2 rolled: " + die4 );
                    System.out.println( "Got a seven! You lose." );
                    System.out.println( "Want to play again [Y/N]?" );
                    declareEnd = scan.next();
                }
                else if( point == diesum2 )
                {
                    System.out.println( "die 1 rolled: " + die3 );
                    System.out.println( "die 2 rolled: " + die4 );
                    System.out.println( "Made the point! You win!" );
                    System.out.println( "Want to play again [Y/N]?" );
                    declareEnd = scan.next();
                }
                else
                {
                    do
                    {
                        System.out.println( "Rolling again..." );
                        die3 = rnd.nextInt( 6 ) + 1;
                        die4 = rnd.nextInt( 6 ) + 1;
                        System.out.println( "die 1 rolled: " + die3 );
                        System.out.println( "die 2 rolled: " + die4 );
                        diesum2 = die3 + die4;
                        System.out.println( "you rolled: " + diesum2 );
                        System.out.println( "Point is " + point );
                    }
                    while( point != diesum2 && diesum2 != 7 );
                    if( diesum2 == 7 )
                    {
                        System.out.println( " You rolled " + diesum2 + ". You Lose" );
                        System.out.println( "Want to play again [Y/N]?" );
                        declareEnd = scan.next();
                    }
                    else
                    {
                        System.out.println( " You rolled The Point. You win" );
                        System.out.println( "Want to play again [Y/N]?" );
                        declareEnd = scan.next();
                    }
                }
            }

        } while( declareEnd.equalsIgnoreCase( "Y" ) );

    }
}