package Array;

public class InertionSort {
    public static void main(String[] args) {
        int[]a={5,1,6,2,4,3};
        int temp,j;
        for (int i = 1; i <a.length ; i++)
        {
            temp=a[i]; // a[i] jise check karwani hai wo hai value temp mai
            j=i;
            while(j>0 && a[j-1]>temp){
                a[j]=a[j-1];
                j=j-1;
            }
            a[j]=temp;
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");

        }
    }
}
/*
1st check
i=1
temp=1
j=1
j>0 && 5>1
a[1]=a[0] // 1=5
j=1-1 //j=0
}
a[0]=1
//5=1
{1,5,6,2,4,3}
i=2
temp=6
j=2
2>0 && a[2-1]>6// 2>0&&5>6 //condition false
a[2]=temp//6=6
{1,5,6,2,4,3}
temp=2;
j=3
3>0 && a[3-1]>2 // True6>2
3>0 &&  6>2
a[3]=2

again for loop
2>0 &&

 */