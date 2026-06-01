import java.util.Scanner;
class SolutionMedian {

    public static void main(String [] args){
        int nums1[] = new int[2];
        int nums2[] = new int[2];
    Scanner sc = new Scanner(System.in);
	
    for(int i = 0; i<nums1.length; i++){
        nums1[i] = sc.nextInt();
    }

    for(int i = 0; i<nums2.length; i++){
         nums2[i] = sc.nextInt();
    }

	findMedianSortedArrays(nums1, nums2);
    SolutionMedian s = new SolutionMedian();
    double med = s.findMedianSortedArrays(nums1, nums2);
	System.out.println("Median Sort ");
    System.out.println(med);

    }

    

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
 
        int index = 0;
		
        int nums3[] = new int[nums1.length + nums2.length];

        for(int i= 0; i<nums1.length; i++){
            nums3[index++] = nums1[i];                         
        }

        for(int i= 0; i<nums2.length; i++){
            nums3[index++] = nums2[i];            
        }
		
		System.out.println("Array Before Sorting " );
		for(int i= 0; i<nums3.length; i++){
            System.out.print(" " +nums3[i] + " ");            
        }

	
        for(int i = 0; i<nums3.length; i++){
            for(int j = 0 ; j<nums3.length-i-1; j++){
				if(nums3[j] > nums3[j+1]){ // 4 3 2 6
					int temp = nums3[j];
					nums3[j] = nums3[j+1];
					nums3[j+1] = temp;
				}
            }
        }

        int positon = 0;
		System.out.println();
		System.out.println("\nArray after useing buble sort " );
         for(int i= 0; i<nums3.length; i++){
            positon = i + 1;
			System.out.print(nums3[i]+" ");
         }

		System.out.print("\npostion is " + positon + "  \n ");
		
         if(positon% 2 != 0){
         int p  =  nums3.length/2;
           int median =  nums3[p];
           return median;
         }
		 
         else {
            int p = nums3.length/2;
			
            double median = (nums3[p] + nums3[p-1])/2.0;
            return median;

         }

    }
}