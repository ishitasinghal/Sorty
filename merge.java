// implementing merge sort
// it follows the divide and conquer approach

//CODE

public class Mergesort
{
  void merge(int arr[], int l, int m, int r)
  {
    int n1 = m-l+1;
    int n2 = r-m;
    int L[] = new int [n1]; //new divided left array of size n1
    int R[] = new int[n2];
    for(int i=0; i< n1;i++)
      L[i]=arr[l+i];
    for(int j=0;j<n2;j++)
      R[j]=arr[m+1+j];
    int i=0,j=0;
    int k=l;
    while(i<n1 && j<n2)
    {
      if(L[i]<=R[j])
      {
        arr[k]=L[i];
        i++;
      }
      else
      {
        arr[k]=R[j];
        j++;
      }
      k++;
    }
    while(j<n2)
    {
      arr[k]=R[j];
      j++;
      k++;
    }
  }
  void sort(int arr[], int l, int r)
  {
    if(l<r)
    {
      int m=(l+r)/2;
      sort(arr, l, m);
      sort(arr, m+1,r);
      merge(arr, l, m, r);
    }
  }
  
