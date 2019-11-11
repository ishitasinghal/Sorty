#in selection sort we basically select the smallest element from the array and then compare it with the first index of the list.
#if the element is greater than the smallest element selected, then the element is swapped with that element.

#Code

public class Selection
{
  void sort(int arr[])
  {
    for(int i=0; i<arr.length-1;i++)    //to reduce the number of swaps
    {
      int min = i;
      for(int j=i+1; j<arr.length;j++)
      if(arr[j]<arr[min])
      min = j;
      
      int temp=arr[min];
      arr[min]=arr[i];
      arr[i]=temp;
    }
  }

  void print(int arr[])
  {
    for(int i=0;i<arr.length;i++)
      System.out.print(arr[i]+" ");
    System.out.println();
  }
  
  public static void main(String args[])
  {
    Selection s = new Selection();
    int arr[]={26, 76, 1, 34, 24, 98, 10, 86};
    s.print(arr);
    s.sort(arr);
    s.print(arr);
  }
}
    

//Complexity of the above code is O(n^2) as there are two nested loops !
