// 3. Write a Java program to find the maximum and minimum value of an array.   
public class P3MaxMin {
    static void min1(int arr[])
    {
        int min1=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(min1>arr[i])
            min1=arr[i];  
        }
        System.out.println("Minimum value of array is "+min1);
    }
    static void max1(int arr[])
    {
        int max1=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max1<arr[i])
            max1=arr[i];  
        }
        System.out.println("Maximum value of array is "+max1);
    }

    public static void main(String[] args) {
        int arr[]={33,3,4,5};
        min1(arr);
        max1(arr);
    }
}

