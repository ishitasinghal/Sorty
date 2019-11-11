// this basically gives a recursive approach to the bubble sort technique.
//Same function is called recursively.

//Code
public class Bubble
{
  static void sortb(int arr[], int n) //n basically depicts the length of array.
  {
    if(n==1)
      return;
    
    for(int i=0; i<n-1;i++)
    {
      if(arr[i]>arr[i+1])
      {
        int t = arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=t;
      }
    }
    sortb(arr, n-1);
  }
  void print(int arr[], int n)
  {
    for(int j=0; j<n; j++)
    {
      System.out.print(arr[j]+" ");
    }
    System.out.println();
  }
  public static void main(String args[])
  {
    int arr[] = { 23, 65, 1, 29, 50, 87, 10, 93, 47};
    Bubble b = new Bubble();
    b.print(arr, arr.length);
    b.sortb(arr, arr.length);
    b.print(arr, arr.length);
  }
}
    
  
