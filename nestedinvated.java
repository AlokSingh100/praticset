package nested;

public class nestedinvated {
    public static void main(String[] args) {
        int n=6;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
