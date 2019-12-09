package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	getBucketCount(-3.4, 2.1, 1.5, 2);
	getBucketCount(3.4, 2.1, 1.5, 2);
	getBucketCount(2.75, 3.25, 2.5, 1);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if ((width > 0.0 && height > 0.0 && areaPerBucket > 0.0) && extraBuckets >= 0) {
            double area = width * height;

            return (int) Math.ceil((area - (areaPerBucket * extraBuckets)) / areaPerBucket);
        }

        return -1;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        return getBucketCount(area, 1, areaPerBucket);
    }
}
