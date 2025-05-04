public class TrappingRainwater {
    public static int trappingRainwater(int height[]){
        // Calculate left max boundary - array
        int LeftMax[] = new int[height.length];
        LeftMax[0] = height[0];
        for(int i = 1; i < height.length; i++){
            LeftMax[i] = Math.max(height[i], LeftMax[i-1]);
        }
        // Calculate right max boundary - array 
        int RightMax[] = new int[height.length];
        RightMax[RightMax.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--){
            RightMax[i] = Math.max(height[i], RightMax[i+1]);
        }
        int trappedWater = 0;
        // loop
        for(int i = 0; i < height.length; i++){
            // waterLevel = min(leftmax boundary, rightmax boundary)
            int waterLevel = Math.min(LeftMax[i], RightMax[i]);
            // trapped water = waterlevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args){
        // Example usage of trappingRainwater method
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped rainwater: " + trappingRainwater(height));
    }
}
