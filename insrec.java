// recursive approach to perform insertion sort.

//CODE

public class Recsort
{
static void insrec(int arr[], int n)
{
if(n<=1)
return;
insrec(arr, n-1);
int l=arr[n-1];
int j=n-2;
while(j>=0&&arr[j]>l)
{
arr[j+1]=arr[j];
j--;
}
arr[j+1]=last;
}
  void print(int arr[], int n)
  {
    for(int i =0; i<n, i++)
    {
      System.out.print(arr[i]+" ")
    }
    System.out.println();
  }
  public static void main(String args[])
  {
    int arr[]={12, 34, 9, 10, 8, 4, 76, 98, 0};
    Recsort r = new Recsort();
    r.print(arr, arr.length);
    r.insrec(arr, arr.length);
    r.print(arr, arr.length);
  }
}
    
