package Array;

public class BubleSort {
    public static void main(String[] args) {
        int temp;

        int[]a={10,5,69,4,8,100};
        for(int i=0;i<a.length;i++){
            int flag=0;
            for (int j = 0; j <a.length-1-i ; j++) // a.length-1-i last element ko check krne k bad first round mai 2nd round mai last element ko check nahi karega
                 {
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }

            }if(flag==1){
                break;

            }
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+ " ");

        }
    }
}
