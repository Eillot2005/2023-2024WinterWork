package test2;

public class practice2 {
    public static void main(String[] args)
    {
        int arr[][]=new int[2][];
        int arr1[]={1,2,3};
        int arr2[]={4,5,2};
        arr[0]=arr1;
        arr[1]=arr2;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}