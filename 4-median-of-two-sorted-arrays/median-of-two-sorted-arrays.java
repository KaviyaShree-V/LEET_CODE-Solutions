class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size=nums1.length + nums2.length;
        double sizes=0.0;
        List<Integer> total = new ArrayList<>();
        for (int num : nums1) {
            total.add(num);
            }
        for (int num : nums2) {
            total.add(num);
        }
        Collections.sort(total);
        int t=total.size();
        if(t%2 == 0){
            int x = t/2 -1,y=t/2;
            sizes = (total.get(x)+total.get(y))/2.0;
        }
        if(t%2 !=0){
            int y= t/2;
            sizes = total.get(y);
        }
        return sizes;
    }
}