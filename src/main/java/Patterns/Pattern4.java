package Patterns;

/**
 *     *
 *    * *
 *   * * *
 *  * * * *
 * * * * * *
 */
public class Pattern4 {
    public static void main(String[] args) {
        int input = 5;
        for(int i = input; i > 0; i--){
            StringBuilder sb = new StringBuilder();
            for(int j = i; j > 0; j--){
               sb.append(" ");
            }
            for(int k = 1; k <= input - (i-1); k++ ){
                sb.append("* ");
            }
            System.out.println(sb);
        }
    }

}
