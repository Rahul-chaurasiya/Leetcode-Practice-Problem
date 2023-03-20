class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int top = 0;
        int left = 0;
        int bottom = arr.length-1;
        int right = arr[0].length-1;
        List<Integer> l = new ArrayList<>();
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                l.add(arr[top][i]);
            top++;

            for (int i = top; i <= bottom; i++)
                l.add(arr[i][right]);
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    l.add(arr[bottom][i]);
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    l.add(arr[i][left]);
            }
            left++;
        }
        return l;
    }
}
