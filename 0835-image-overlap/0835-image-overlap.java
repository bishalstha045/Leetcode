class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        List<int[]> points1 = new ArrayList<>();
        List<int[]> points2 = new ArrayList<>();
        // Store coordinates of all 1s
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (img1[r][c] == 1) {
                    points1.add(new int[]{r, c});
                }
                if (img2[r][c] == 1) {
                    points2.add(new int[]{r, c});
                }
            }
        }
        // Count each possible translation
        Map<String, Integer> map = new HashMap<>();
        int answer = 0;
        for (int[] p1 : points1) {
            for (int[] p2 : points2) {
                int dr = p2[0] - p1[0];
                int dc = p2[1] - p1[1];
                String key = dr + "," + dc;
                int count = map.getOrDefault(key, 0) + 1;
                map.put(key, count);
                answer = Math.max(answer, count);
            }
        }
        return answer;
    }
}
/*
Image Overlap: Treat every 1 as a coordinate. For each 1 in img1 and img2, calculate the required shift using (r2-r1, c2-c1). Store each shift in a HashMap and count its frequency. The shift that occurs most often represents the maximum number of overlapping 1s. Pattern: Coordinate Difference + HashMap Frequency
*/