import java.util.Arrays;

public class WaterPool {
    public static long calculateWaterAmount(int[] landscape) {
        validateLandscape(landscape);

        int[] leftPeaks = calculateLeftPeaks(landscape);

        long waterAmount = 0;
        int rightPeak = 0;
        for (int i = landscape.length - 1; i > 0; i--) {
            if (rightPeak < landscape[i]) rightPeak = landscape[i];
            waterAmount += Math.min(rightPeak, leftPeaks[i]) - landscape[i];
        }

        return waterAmount;
    }

    private static int[] calculateLeftPeaks(int[] landscape) {
        int[] leftPeaks = Arrays.copyOf(landscape, landscape.length);

        for (int i = 1; i < landscape.length; i++) {
            if (leftPeaks[i] < leftPeaks[i - 1]) {
                leftPeaks[i] = leftPeaks[i - 1];
            }
        }

        return leftPeaks;
    }

    private static void validateLandscape(int[] landscape){
        if (landscape.length > 32000 || landscape.length < 1) {
            throw new IllegalArgumentException("Unacceptable landscape length " + landscape.length + " possible values are 1..32000");
        }

        if (Arrays.stream(landscape).anyMatch(it -> it > 32000 || it < 0)) {
            throw new IllegalArgumentException("Unacceptable peaks in landscape possible values are 0..32000");
        }
    }
}
