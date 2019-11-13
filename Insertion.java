// here we have an array logically divided into two, thata is sorted and unsorted array.
// the element in the sorted array is compared with the first element of the unsorted array.
// if the element is greater, then swapping is done until the correct order and condition is not achieved.

//Code:

class Insert
{
  void insort(int arr[])
  {
    for(int i=0;i<arr.length;i++)
    {
      int key=arr[i];
      int j=i-1;
      while(j>=0 && arr[j]>key)
      {
        arr[j+1]=arr[j];
        j=j-1;
      }
      arr[j+1]=key;
    }
  }
  
  void print(int arr[])
  {
    for(int i=0; i<arr.length;i++)
    {
      System.out.print(arr[i]+" ");
    }
    System.out.println();  //to drop to a new line
  }
  
  public static void main(String args[])
  {
    int arr[]={12, 45, 23,1, 0, 87, 75, 30, 74, 100};
    Insert i = new Insert();
    i.print(arr);
    i.insort(arr);
    i.print(arr);
  }
}
    
