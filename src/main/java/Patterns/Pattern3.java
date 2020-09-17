package Patterns;

public class Pattern3 {
    /**
     *     1
     *    21
     *   321
     *  4321
     * 54321
     */
    public static void main(String[] args) {
        int input = 5;
        for(int i = input; i > 0 ; i--){
            for(int j = 1 ; j < i; j++){
                System.out.print(" ");
            }
            for(int j = input - (i-1); j >= 1; j--){
                System.out.print(j);
            }

            System.out.println(" ");
        }
    }
}
