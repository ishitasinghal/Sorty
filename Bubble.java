// In this type of sorting, swapping happens after comparing elements starting from index 0.
// The first two elements are compared if first one is greater than the second one, then swap the numbers.
// Likewise, the heaviest or the largest element goe to the end of the array.

//CODE

public class Bubble
{
  void bsort(int arr[])
  {
    for(int i=0;i<n;i++)
        {
          for(int j=0;j<arr.length-i=1;j++) //to reduce the number of steps
          {
            if(arr[j]>arr[j+1])
            {
              int t = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = t;
            }
          }
        }
        }
        
        void print(int arr[])
        {
          for(int i = 0; i<arr.length;i++)
          {
            System.out.println(arr[i]+" ");
          }
          System.out.println();
        }
        
        public static void main(String args[])
        {
          Bubble b = new Bubble();
          int arr={23, 90, 64, 87, 52, 42, 31, 67, 19, 8, 0};
          b.print();
          b.bsort();
          b.print();
        }
        }
        }
        
