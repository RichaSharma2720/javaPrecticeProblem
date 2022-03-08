package Array;

public class Array_usingWhileloop {
    public static void main(String[] args) {
        int []a={ 10,20,30};
        int i=0;
        do{
            System.out.print(a[i]+" ");
            i++;
        }
        while(i<a.length);
    }
}
