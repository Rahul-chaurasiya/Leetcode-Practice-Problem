class Solution {
    public double[] sampleStats(int[] count) {
        int modeKey = 0, maxModeValue = -1;
        long totalSum = 0;
        int numberOfElements = 0;
        double min = -1;
        double max = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                if (min == -1) {
                    min = i;
                }
                if (count[i] > maxModeValue) {
                    maxModeValue = count[i];
                    modeKey = i;
                }
                max = i;
                totalSum += (long)i * count[i];
                numberOfElements += count[i];
            }
        }
        return new double[]{min, max, totalSum/(double)numberOfElements, getMedian(numberOfElements, count), modeKey};
    }

    private double getMedian(int totalCount, int[] count) {
        if (totalCount % 2 == 1) {
            return getMedianOfOddElement(count, totalCount / 2 + 1);
        } else {
            return getMedianOfEvenElement(count, totalCount /2);
        }
    }

    private double getMedianOfOddElement(int[] count, int targetCount) {
        int countSoFar = 0;
        int median = -1;
        for (int i = 0; i < count.length; i++) {
            countSoFar += count[i];
            if (countSoFar >= targetCount) {
                median = i;
                break;
            }
        }
        return median;
    }

    private double getMedianOfEvenElement(int[] count, int targetCount) {
        double left = 0, right = 0;
        int countSoFar = 0;
        for (int i = 0; i < count.length; i++) {
            countSoFar += count[i];
            // if current count holds half and half + 1, then return i
            if (countSoFar >= targetCount + 1) {
                left = i;
                right = i;
                break;
            } else if (countSoFar == targetCount) { // if current count only holds half, 
            // then half + 1 will be the right next index that has a count> 0. 
                left = i;
                for (int k = i + 1; k < count.length; k++) {
                    if (count[k] != 0) {
                        right = k;
                        break;
                    }
                }
                break;
            }
        }
        return (left + right) / 2;
    }
}
