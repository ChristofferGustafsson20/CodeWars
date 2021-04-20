package Kuy8;

/**
 * Your function takes two arguments:
 *
 * current father's age (years)
 * current age of his son (years)
 * Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old).
 */

public class TwiceAsOld {

    public static int TwiceAsOld(int dadYears, int sonYears){

         int diffYears = dadYears - sonYears * 2;

         if  (diffYears < 0){
             return diffYears * -1;
         }
         return diffYears;
    }
}
