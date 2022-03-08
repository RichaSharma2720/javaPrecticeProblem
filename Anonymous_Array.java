package Array;

public class Anonymous_Array {
    public static void main(String[] args) {
        // new int[]{10,20}; when we used instantly im pro. It can be single and multi dimantional
        Anonymous_Array.sum(new int[]{10,20,30});
    }
    static void sum(int[] no){ //Anonymous object is reffered in method
        int total=0;
        for (int i:no
             ) {total=total+i;

        }
        System.out.println("Sum is "+total);
    }
}
