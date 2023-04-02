public class TP02Ex06 {
    public static void main(String[] args) {
        String[][] matriz = new String[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = "Douglas";
                System.out.println(matriz[i][j]);
            }
        }
    }
}
