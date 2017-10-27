package com.example;

import java.util.Random;

public class GetJokes {

    private String [] joke ={
            "Eight bytes walk into a bar.  The bartender asks, “Can I get you anything?”\n" +
                    "“Yeah,” reply the bytes.  “Make us a double.",
            "How did the programmer die in the shower?\n" +
                    "A. He read the shampoo bottle instructions: Lather. Rinse. Repeat.",
            "How many programmers does it take to change a light bulb?\n" +
                    "None – It’s a hardware problem",
            "Why do programmers always mix up Halloween and Christmas?\n" +
                    "Because Oct 31 equals Dec 25.",
            "There are only 10 kinds of people in this world: those who know binary and those who don’t.",
            "A programmer walks to the butcher shop and buys a kilo of meat.  An hour later he comes back upset that the butcher shortchanged him by 24 grams.",
            "“Knock, knock.”\n" +
                    "“Who’s there?”\n" +
                    "very long pause….\n" +
                    "“Java.",
            "Programming is 10% science, 20% ingenuity, and 70% getting the ingenuity to work with the science.",
            "Programming is like sex:\n" +
                    "One mistake and you have to support it for the rest of your life.\n" +
                    "\n",
            "A man is smoking a cigarette and blowing smoke rings into the air.  His girlfriend becomes irritated with the smoke and says, “Can’t you see the warning on the cigarette pack?  Smoking is hazardous to your health!”\n" +
                    "\n" +
                    "To which the man replies, “I am a programmer.  We don’t worry about warnings; we only worry about errors.”",
            "There are three kinds of lies: Lies, damned lies, and benchmarks.\n" +
                    "\n",
            "All programmers are playwrights, and all computers are lousy actors.",
            "Have you heard about the new Cray super computer?  It’s so fast, it executes an infinite loop in 6 seconds.",
            "The generation of random numbers is too important to be left to chance.",
            "I just saw my life flash before my eyes and all I could see was a close tag"

    };



    public String getjoke()
    {
        return joke[new Random().nextInt(joke.length -1)];
    }

}
