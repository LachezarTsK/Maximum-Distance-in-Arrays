
import java.util.List;

public class Solution {

    public int maxDistance(List<List<Integer>> arrays) {

        int size = arrays.size();
        int minPrevious = arrays.get(0).get(0);
        int maxPrevious = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDistance = 0;

        for (int i = 1; i < size; i++) {

            int currentMin = arrays.get(i).get(0);
            int currentMax = arrays.get(i).get(arrays.get(i).size() - 1);

            if (Math.abs(minPrevious - currentMax) > maxDistance) {
                maxDistance = Math.abs(minPrevious - currentMax);
            }
            if (Math.abs(maxPrevious - currentMin) > maxDistance) {
                maxDistance = Math.abs(maxPrevious - currentMin);
            }

            minPrevious = Math.min(minPrevious, currentMin);
            maxPrevious = Math.max(maxPrevious, currentMax);
        }

        return maxDistance;
    }
}
