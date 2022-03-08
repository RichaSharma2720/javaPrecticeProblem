package Array;

public class BubbleSort_ForString {
    public static void main(String[] args) {
        String temp;

        String[] a={"Deepak","Atul","Tarun","Richa","Ujjawal"};
        for(int i=0;i<a.length;i++){

            for (int j = 0; j <a.length-1-i ; j++) // a.length-1-i last element ko check krne k bad first round mai 2nd round mai last element ko check nahi karega
            {
                if(a[j].compareTo(a[j+1])>0){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }

            }
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+ " ");

        }
    }
}
