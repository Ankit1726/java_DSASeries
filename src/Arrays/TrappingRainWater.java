package Arrays;

import com.sun.jdi.request.WatchpointRequest;

public class TrappingRainWater {
    public static int TrapWater(int height[]){  // TC-> O(n)
        int n = height.length;
        // cal to left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        // cal to right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        // loop
        int TrapWater = 0;
        for (int i=0;i<n;i++){
            // waterLevel = min(leftMax boundary  , rightMax boundary)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            // trapped Water = waterLevel - height[i]
            TrapWater+= waterLevel - height[i];
        }
        return TrapWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,6,3,2,5};
        System.out.println("Total Water Trapped -> "+TrapWater(height));
    }
}
