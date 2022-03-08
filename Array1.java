package Array;

public class Array1 {
    public static void main(String[] args) {
        int[] arr=new int[3];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("array using for loop");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("another way array using for loop");

        int []arr1={10,20,30,40,50};
        for (int j = 0; j < arr1.length ; j++) {
            System.out.println(arr1[j]+" ");
        }
        System.out.println("3rd way array using for loop");
        int[][] arr2={{2,4,6,8},{3,6,9}};
        System.out.println(arr2.length);
        System.out.println(arr2[0].length);
        System.out.println(arr2[1].length);
        System.out.println("define array value....\n");
        System.out.println(arr2[1][1]);

    }
}
