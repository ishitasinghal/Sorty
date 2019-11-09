#in selection sort we basically select the smallest element from the array and then compare it with the first index of the list.
#if the element is greater than the smallest element selected, then the element is swapped with that element.

#Code

class Selection
{
  void sort(int arr[])
  {
    for(int i=0; i<arr.length-1;i++)    //to reduce the number of swaps
    {
      int min = i;
      for(int j=i+1; j<arr.length;j++)
      if(arr[i]<arr[min])
      min = j;
      
      int temp=arr[min];
      arr[min]=arr[i];
      arr[i]=temp;
    }
  }
