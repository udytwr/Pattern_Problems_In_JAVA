
public class P9 {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            
            for (int j = i; j > 0; --j) {
                System.out.print(" ");
            }

            for (int j = 0; j < 5-i; j++) {
                System.out.print("*");
            }

            if (i != 4) {
                for (int j = 0; j < 4-i; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
