package Array;

public class Array_3D {
    public static void main(String[] args) {
        int[][][] a={{{10,20},{30,40,50,60},{70,80,90},{100,101,102,56,87}}};
        System.out.println(a);
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                for (int k = 0; k <a[i][j].length ; k++) {
                    System.out.print(a[i][j][k]+" ");

                }
                System.out.println();

            }
        }
    }
}
/*
i=0
a[i].lenght=3
condition true
k=0;k<a[i][j].lemgth = a[0][0].length= 2 |10|20|
*/
