import java.util.ArrayList;
import java.util.List;
public class Problem2161 {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        
        List<Integer> s = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        List<Integer> p = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(nums[i]==pivot) p.add(nums[i]);
            else if(nums[i]<pivot) s.add(nums[i]);
            else l.add(nums[i]);
        }
        int []res =new int[s.size()+l.size()+p.size()];
        int r=0;
        for(int i=0;i<s.size();i++){
            res[r++]=s.get(i);
        }
        for(int i=0;i<p.size();i++){
            res[r++]=p.get(i);
        }
        for(int i=0;i<l.size();i++){
            res[r++]=l.get(i);
        }
        return res;
    }
    public int[] pivotArray1(int[] nums, int pivot) {
        int n = nums.length;
        int[] res = new int[n];
        
        // Count how many elements are less than pivot
        int smallerCount = 0;
        int equalCount = 0;

        for (int num : nums) {
            if (num < pivot) smallerCount++;
            else if (num == pivot) equalCount++;
        }

        // Place elements directly into res
        int sIndex = 0;                  // For smaller elements
        int eIndex = smallerCount;        // Start placing equals after smaller
        int lIndex = smallerCount + equalCount;  // Larger elements after equals

        for (int num : nums) {
            if (num < pivot) res[sIndex++] = num;
            else if (num == pivot) res[eIndex++] = num;
            else res[lIndex++] = num;
        }
        return res;
    }

}
