public class PaintJob {
    public static void main(String[] args) {
        /*System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));*/

        /*System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));*/

        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        int numNeeded = 0;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double areaOfWall = width * height;
        //double numBucketsToCoverWall = areaOfWall / areaPerBucket;
        double areaExtraBucketsCover = extraBuckets * areaPerBucket;
        double areaNotCovered = areaOfWall - areaExtraBucketsCover;

        if (areaNotCovered <= 0.0) {
            numNeeded = 0;
        } else {
            numNeeded = (int) Math.ceil(areaNotCovered / areaPerBucket);
        }

        return numNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0.0 || areaPerBucket <= 0.0) {
            return -1;
        }

        return getBucketCount(1, area, areaPerBucket);
    }



}
