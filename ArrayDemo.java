package Array;

public class ArrayDemo {
    public static void main(String[] args) {
        int[][]a={{10,20,30,40},{50,60,70,80,90},{50,60}};
        for(int i=0;i<a.length;i++){
            for (int j = 0; j <a[i].length ; j++) {
                System.out.print(a[i][j]+" ");

            }System.out.println();
        }

        System.out.println(a[0].length);
        System.out.println(a[0]);
        System.out.println(a[0][0] );
        //System.out.println(a[0][0].length );// we can not define length a[0]a[0]

    }
}
