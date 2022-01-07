import java.util.Arrays;

public class ArrayAlgorithms{

    public static void main(String[] args){
        //create an array of 50+ random ints from - 50 to 50 inclusive (myInts)
        int[] myInts = new int[1000];
        for (int i = 0; i < myInts.length; i++){
            myInts[i] = (int)(Math.random()*101) - 50;
        }
        //create an array of at least 20 strings (myWords)
        String story = "I've eaten many strange and scrumptious dishes in my time\n" +
                "Like jellied bugs and curried slugs and earwigs cooked in slime\n" +
                "And mice with rice is very nice\n" +
                "When they're roasted in their prime\n" +
                "But don't forget to sprinkle them with just a pinch of grime\n" +
                "I'm crazy 'bout mosquitos on a piece of buttered toast\n" +
                "And pickled spines of porcupines\n" +
                "And then a great big roast\n" +
                "And dragon's flesh, quite old, not fresh\n" +
                "It costs a buck at most\n" +
                "It comes to you in barrels if you order it by post\n" +
                "(It comes to you in barrels if you order it by post)\n" +
                "For dinner on my birthday shall I tell you what I chose?\n" +
                "Hot noodles made of poodles on a slice of garden hose\n" +
                "And a rather smelly jelly\n" +
                "Made of armadillo's toes\n" +
                "The jelly is delicious, but you have to hold your nose\n" +
                "Peach, peach, peach, peach, peach, peach\n" +
                "Peach, peach, peach, peach, peach, peach\n" +
                "I crave the tasty tentacles of octopi for tea\n" +
                "I like hot dogs, but I love hot frogs\n" +
                "And surely you'll agree\n" +
                "A plate of soil with engine oil's a super recipe\n" +
                "(Recipe)\n" +
                "I hardly need to mention that it's practically free\n" +
                "Peach, peach, peach, peach, peach, peach\n" +
                "Peach, peach, peach, peach, peach, peach\n" +
                "We hardly need to mention that it's practically free\n" +
                "Now comes, my fellow travelers, the burden of my speech\n" +
                "These foods are rare beyond compare\n" +
                "And some right out of reach\n" +
                "But there's no doubt I'd go without\n" +
                "A million plates of each\n" +
                "For one small mite\n" +
                "(One small mite)\n" +
                "One tiny bite\n" +
                "(Tiny bite)\n" +
                "Of this fantastic peach!\n" +
                "Peach, peach, peach, peach, peach, peach\n" +
                "Peach, peach, peach, peach, peach, peach\n" +
                "This fantastic peach!";
            //split the lyrics by space or hard return and store in an array of Strings
            String[] myWords = story.split("[ \n]");

            //strip each word of punctuation, white space and make lower case
            for(int i = 0; i<myWords.length; i++){
                myWords[i] = myWords[i].trim().toLowerCase();
                String temp = "";
                for(int letter = 0; letter < myWords[i].length(); letter++){
                    int character = (int) myWords[i].charAt(letter);
                    if(character >= 97 && character <= 123){
                        temp += (char)character;
                    }
                }
                myWords[i] = temp;
            }


        /* write a block of code that will traverse the new array of ints and prints out the sum and the average of myInts. */
        int sum = 0;
        for(int i: myInts){
            sum += i;
        }
        System.out.println("myInt total: " + sum);
        System.out.println("MyInt average: " + ((double)sum/myInts.length));


        /* write a block of code that will find the int that occurs most often (mode) inside myInts */
        int most = 0;
        int quantity = 0;
        for(int i = 0; i<myInts.length; i++){
            int count = 0;
            for(int j = i; j<myInts.length; j++){
                if(myInts[i] == myInts[j]){
                    count++;
                }
            }
            if (count > quantity){
                quantity = count;
                most = myInts[i];
            }
        }
        System.out.println("The value " + most + " has the most occurrences: " + quantity);


        /* write a block of code that will determine if the myWords array contains at least one word that starts with the letter ‘t’*/

        /* write a block of code that will determine if ALL of the numbers in myInts are positive/*/

        /* write a block of code that will determine if any consecutive words in myWords are the same:  “I will will do this” → true*/

        /* write a block of code that will determine if there are any duplicates in myInts */

        /* write a block of code that determine how many numbers in MyInts are between 1 and 10 exclusive */

    }
}
