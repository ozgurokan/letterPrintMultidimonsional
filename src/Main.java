public class Main {
    public static void main(String[] args) {
        // daha büyük görünmesi için 7ye 5 matris oluşturdum
        String[][] letter = new String[7][5];

        // B harfindeki kaviser için dikey çizgilere bir boşluk daha ekledim
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 4) {
                    letter[i][j] = "  * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }
        // çıktı vermek için forEach ile matrisi gezdim
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}