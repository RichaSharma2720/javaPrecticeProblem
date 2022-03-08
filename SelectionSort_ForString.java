package Array;

public class SelectionSort_ForString {
    public static void main(String[] args) {
        String[] a={"Deepak","Atul","Tarun","Richa","Ujjawal"};
        int min;
        String temp;
        for (int i = 0; i < a.length; i++)
        {
            min = i;
            for (int j =i+1; j < a.length ; j++) // a.length-1-i last element ko check krne k bad first round mai 2nd round mai last element ko check nahi karega
            {
                if (a[j].compareTo(a[min])<0) {
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
