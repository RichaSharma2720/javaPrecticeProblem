package Array;

public class Kth_Smallest_Element {

        public static void main(String[] args) {
            int k=3;
            int [] a={12,5,6,89,77,8,4,55,67};
            for (int i = 0; i <a.length ; i++) {
                for (int j = i+1; j <a.length ; j++) {
                    if(a[i]>a[j]){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
                if(i==k-1){
                    System.out.println(k+"th largest element is "+a[i]);

                }

            }
            System.out.println("================================");
            for (int i = 0; i <a.length ; i++)
            {
                System.out.print(a[i]+" ");

            }
        }
    }

