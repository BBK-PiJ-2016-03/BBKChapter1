/**
 * Created by Alexander Worton on 02/10/2016.
 */
class ExerciseB {
    public void conCat(int numWords = 2){
        Scanner sc = new Scanner(System.in)
        String build = ""
        for (int i = 1; i <= numWords; i++){
            println "Please enter word " + i
            build += sc.next().trim() + " "
        }
        println build.trim()
    }
}
