
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
	int maxDistance(vector<vector<int>>& arrays) {

		int size = arrays.size();
		int minPrevious = arrays[0][0];
		int maxPrevious = arrays[0][arrays[0].size() - 1];
		int maxDistance = 0;

		for (int i = 1; i < size; i++) {

			int currentMin = arrays[i][0];
			int currentMax = arrays[i][arrays[i].size() - 1];

			if (abs(minPrevious - currentMax) > maxDistance) {
				maxDistance = abs(minPrevious - currentMax);
			}
			if (abs(maxPrevious - currentMin) > maxDistance) {
				maxDistance = abs(maxPrevious - currentMin);
			}

			minPrevious = min(minPrevious, currentMin);
			maxPrevious = max(maxPrevious, currentMax);
		}

		return maxDistance;
	}
};
