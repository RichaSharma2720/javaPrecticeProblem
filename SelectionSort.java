package Array;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {10, 5, 69, 4, 8, 100};
        int min, temp ;
        for (int i = 0; i < a.length; i++)
        {
            min = i;
            for (int j =i+1; j < a.length ; j++) // a.length-1-i last element ko check krne k bad first round mai 2nd round mai last element ko check nahi karega
            {
                if (a[j] < a[min]) {
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
