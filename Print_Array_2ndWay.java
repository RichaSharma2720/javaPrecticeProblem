package Array;

public class Print_Array_2ndWay {
    public static void main(String[] args) {
        int [][] a={{10,20,30},{35,65,85,98}};
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();

        }
    }
}
