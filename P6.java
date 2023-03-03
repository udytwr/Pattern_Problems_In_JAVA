
public class P6 {
    
    public static void main(String[] args) {
        
        for (int i = 5; i > 0; --i) {
            
            int j;
            for (j = 0; j < i-1; j++) {
                System.out.print(" ");
            }

            while (j != 5) {
                System.out.print("*");
                j++;
            }

            System.out.println();
        }
    }
}
