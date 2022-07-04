class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int total = m + n;
        if( total % 2 != 0){
            return find(nums1,m ,nums2,n ,total/2+1);
        }
        return (find(nums1,m,nums2,n,total/2)+find(nums1,m,nums2,n,total/2+1))/2;
    }
    public double find(int[] nums1,int m,int[] nums2,int n, int r){
        if(m>n){
            return find(nums2,n,nums1,m,r);
        }
        if(m==0){
            return nums2[r-1];
        }
        if(r==1){
            return Math.min(nums1[0],nums2[0]);
        }
        
        int temp = r/2;
        if(Math.min(m,n)<temp){
            temp = Math.min(m,n);
        }
        
        if(nums1[temp-1]>=nums2[temp-1]){
            int[] p_b = new int[nums2.length-temp];
            for(int i = temp , j = 0; i<nums2.length && j<nums2.length - temp; i++,j++ ){
                p_b[j] = nums2[i];
            }
            return find(nums1,m,p_b,n-temp,r-temp);
        }
        
        else{
            int[] p_a = new int[nums1.length-temp];
            for(int i = temp , j = 0; i<nums1.length && j<nums1.length - temp; i++,j++ ){
                p_a[j] = nums1[i];
            }
            return find(p_a,m-temp,nums2,n,r-temp);
        }
    }
}