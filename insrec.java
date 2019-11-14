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
