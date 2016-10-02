package Chapter1_2

/**
 * Created by Alexander Worton on 02/10/2016.
 */
class ExerciseA {
    /*
    int num = 5             num: 5
    println num             output: 5

    num = num + 2           num: 5 + 2 : 7
    println num             output: 7

    num = num / 3 * 6       num: 7 / 3 * 6 : 2 * 6 : 12
    println num             output: 12

    println 7 + 15 % 4      output: 10

    num = 24 / 3 / 4        num: 8 / 4 : 2
    println num             output: 2

    num = 24 / (num / 4)    num: 24 / (2 / 4) : 24 / 0 : ERR
    println num             Line not reached
    */

    /*
    Incorrect answers listed below:

    num = num / 3 * 6       num: 7 / 3 * 6 : 2 * 6 : 12
    println num             output: 12

        This answer was incorrect, because java converts to floating point as required
        during the calculation, and only discards when writing to the type. Therefore,
        7 / 3 holds 2.3333333333, not 2 as in C#. This results in 2.3333333333 * 6 ->
        13.99999 which the fractional part is discarded when stored as an int.

    num = 24 / (num / 4)    num: 24 / (2 / 4) : 24 / 0 : ERR
    println num             Line not reached

        For the same reason above, java does not divide by 0, but instead divides by 0.5
    */

    public void run(){
        int num = 5
        println num
        num = num + 2
        println num
        num = num / 3 * 6
        println num
        println 7 + 15 % 4
        num = 24 / 3 / 4
        println num
        num = 24 / (num / 4)
        println num

        println ""
        println "(7 / 3): " + (7 / 3)
        println "(2 / 4): " + (2 / 4)
    }

}
