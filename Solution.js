
/**
 * @param {number[][]} arrays
 * @return {number}
 */
var maxDistance = function (arrays) {

    let size = arrays.length;
    let minPrevious = arrays[0][0];
    let maxPrevious = arrays[0][arrays[0].length - 1];
    let maxDistance = 0;

    for (let i = 1; i < size; i++) {

        let currentMin = arrays[i][0];
        let currentMax = arrays[i][arrays[i].length - 1];

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
};
