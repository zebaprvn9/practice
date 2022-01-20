package mypack;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int area = 0;
        int copyArr[] = height;
        for(int i = 0; i < height.length; i++) {
            for(int j = i+1; j < height.length; j++) {
                int ht = height[i] < height[j] ? height[i] : height[j];
                int temp = ht*(j-i);
                if(area < temp) {
                    area = temp;
                }
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int maxarea[] = {}; 

    }
}
