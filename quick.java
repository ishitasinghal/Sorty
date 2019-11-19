// this code is to implement quick sort.
// This works on the divide and conquer approach.
// One element is taken as a pivot.
// then the array is traversed, finding the smallest element and comparing the element.

//CODE

public class Quick
{
  int partition(int arr[], int l, int h) //l for low, h for high
  {
    int pivot=arr[h];
    int i=(l-1);
    for(int j=l;j<h;j++)
    {
      if(arr[j]<pivot)
      {
        i++;
        int temp=arr[i];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
      }
      void sort(int att[], int l, int h)
      {
        if(l<h)
        {
          int p=partition(arr,l,h);
          sort(arr,l,p-1);  
          sort(arr,p+1,h);
        }
      }
static void print(int arr[])
{
  for(int i=-;i<arr.length;i++)
  {
    System.out.print(arr[i]+" ");
  }
  System.out.println();
}
      
