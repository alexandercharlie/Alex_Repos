/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSort;

/**
 *
 * @author Manjeet Kumar
 */
public class _Quick_Sort
{
    public static void main(String[] alex)
    {
        _Quick_Sort _qs=new _Quick_Sort();

        int array[]={1,4,5,6,7,8,12,75,85};
        int start=1;
        int end=7;
        _qs._quick_Sort(array, start, end);
        
    System.out.println("Quick Sorting is going here...Array="+array+"");
    }

public void _quick_Sort_(int array[]) 
// pre: array is full, all elements are non-null integers
// post: the array is sorted in ascending order
{
	_quick_Sort(array, 0, array.length - 1);              // quicksort all the elements in the array
}


public void _quick_Sort(int array[], int start, int end)
{
        int i = start;                          // index of left-to-right scan
        int k = end;                            // index of right-to-left scan

        if (end - start >= 1)                   // check that there are at least two elements to sort
        {
                int pivot = array[start];       // set the pivot as the first element in the partition

                while (k > i)                   // while the scan indices from left and right have not met,
                {
                        while (array[i] <= pivot && i <= end && k > i)  // from the left, look for the first
                                i++;                                    // element greater than the pivot
                        while (array[k] > pivot && k >= start && k >= i) // from the right, look for the first
                            k--;                                        // element not greater than the pivot
                        if (k > i)                                       // if the left seekindex is still smaller than
                                _swap(array, i, k);                      // the right index, swap the corresponding elements
                }
                _swap(array, start, k);          // after the indices have crossed, swap the last element in
                                                // the left partition with the pivot 
                _quick_Sort(array, start, k - 1); // quicksort the left partition
                _quick_Sort(array, k + 1, end);   // quicksort the right partition
                
                System.out.println("Quick Sorting is going here... i= "+i+" K="+k+" Pivot="+pivot+" Array="+array[i]);
      
        }
        else    // if there is only one element in the partition, do not do any sorting
        {
                return;                     // the array is sorted, so exit
        }

}

public void _swap(int array[], int index1, int index2) 
// pre: array is full and index1, index2 < array.length
// post: the values at indices 1 and 2 have been swapped
{
	int temp = array[index1];           // store the first value in a temp
	array[index1] = array[index2];      // copy the value of the second into the first
	array[index2] = temp;               // copy the value of the temp into the second
}    
}
