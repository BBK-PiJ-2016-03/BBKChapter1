package Chapter1_1
/**
 * Created by Alexander Worton on 02/10/2016.
 */
class ExerciseB {
    public void conCat(int numWords = 2){
        Scanner sc = new Scanner(System.in)
        String build = ""
        for (int i = 0; i < numWords; i++){

            print i < 1 ? "Please key in a word: " : "And now key in another: "

            build += sc.next().trim() + " "
        }
        println "You have typed: " + build.trim()
    }
}
