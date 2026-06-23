public class TrappingRainWater {

    public static int trappedWater(int height[]) {

        //Calculate leftmost highest boundary
        //Calculate rightmost highest buondary
        //calculate water level
        //(water lever - current bar level)

        int n = height.length;

        int leftmostBoundary[] = new int[n];
        int rightmostBoundary[] = new int[n];


        leftmostBoundary[0] = height[0];
        for (int i=1; i<n; i++) {
            leftmostBoundary[i] = Math.max(height[i], leftmostBoundary[i-1]);
        }

        rightmostBoundary[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightmostBoundary[i] = Math.max(height[i], rightmostBoundary[i+1]);
        }

        int trappedWater = 0;
        for(int i=0; i<n; i++) {
            int waterLevel = Math.min(leftmostBoundary[i], rightmostBoundary[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;

    }
    public static void main(String args[]) {

        int height[] = {4, 2, 0, 6, 3, 2, 5};

        System.out.println("Trapped rainwater is: " + trappedWater(height));

    }
}