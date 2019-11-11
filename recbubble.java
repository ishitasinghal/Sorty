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
  
