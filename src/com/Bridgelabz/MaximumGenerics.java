package com.Bridgelabz;

public class MaximumGenerics<T extends Comparable<T>> {

	/**
	 * @param <T>
	 * @param w   - Taking the first value
	 * @param x   - Taking the second value
	 * @param y   - Taking the third value
	 * @param z   - Taking the fourth value
	 * @return maximum of 4 values
	 */
	public static <T extends Comparable<T>> T toPrintMax(T w, T x, T y, T z) {
		T max = w;
		
		if (x.compareTo(max) > 0 && x.compareTo(y) > 0 && x.compareTo(z) > 0) {
			max = x;
		}
		
		if (y.compareTo(max) > 0 && y.compareTo(x) > 0 && x.compareTo(z) > 0) {
			max = y;
		}
		
		if (z.compareTo(max) > 0 && z.compareTo(x) > 0 && z.compareTo(y) > 0) {
			max = z;
		}
		return max;
	}
	 public static <T> void printMax(T w,T x,T y,T z, T max){
	        System.out.println(max);
	    }}
