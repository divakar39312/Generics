package com.Bridgelabz;

public class MaximumGenerics {
		/**
		 * @param x taking first value
		 * @param y taking second value
		 * @param z taking third value
		 * @return returning the result which is maximum
		 */
		public static Float maxfloat(Float x, Float y, Float z) {
			Float max = x;
			if (y.compareTo(max) > 0 && y.compareTo(z) > 0)
				max = y;
			else if (z.compareTo(max) > 0)
				max = z;
			return max;
		}
}
