/**
 * Created by Alexander Worton on 02/10/2016.
 */
class ExerciseA {

    public static void one(){
        println("")
    }

    public static void two(){
        println("Hickory, Dickory, Dock")
    }

    public static void three(int numWords = 2){
        Stack<String> words = new Stack<>()

        words = collectWords(words, numWords)

        outputWords(words, "\t• ")
    }

    private static void outputWords(Stack<String> words, String preceedingString){
        println()
        println("Your words in reverse order are: ")
        while(words.size() > 0){
            println preceedingString + words.pop()
        }
    }

    private static Stack<String> collectWords(Stack<String> words, numWords){
        Scanner sc = new Scanner(System.in)

        for (int i = 1; i <= numWords; i++){
            println ("Please enter word " + i)
            String word = sc.next()
            words.push(word)
        }

        return words
    }

}
