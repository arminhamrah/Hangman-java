import acm.program.*;

public class HangmanConsoleProgram extends ConsoleProgram
{
    public void run()
    {
        HangmanGame game = new HangmanGame();
        println("Please use all caps to play this game.");
        println(game.getLettersGuessed());
        while (game.getGuessesLeft() >= 0)
        {
            String guess = readLine("Enter a guess letter:");
            guess = guess.substring(0,1).toUpperCase();
            if (game.makeGuess(guess) == true)
            {
                println("Good guess");
            }
            else
            {
                println("Bad guess");
            }
            println(game.getGuessesLeft());
            println(game.getPuzzle());
            println(game.getLettersGuessed());
        }
        
        if (game.getGuessesLeft()<0)
        {
            println("Wow, you are bad. This must be Aarav playing");
        }
    }
}