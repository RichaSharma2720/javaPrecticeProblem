package Array;

public class Find_Min_Max {
    public static void main(String[] args) {
        int [] a={4,3,5,2,1,6};
        int min=a[0];
        int max=a[0];
        for (int i = 1; i <=a.length-1 ; i++)
        {
                if (max<a[i])
                {
                    max=a[i];
                }else if(min>a[i]) {
                    min=a[i];
                }else {
                    System.out.println("not found element");
                }

        }System.out.println("Maximum Element is: "+max+" \nMinimum Element is: "+min);
    }
}
