package p05.textbookExercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int pus = 0;
		double avg = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		// 최대값
		int i = 0;
		for (i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			// 최소값
			if (min > array[i]) {
				min = array[i];
			}
			// 합계
			pus += array[i];
			// 평균
			avg = (double) pus / array.length;
		}
		System.out.println("max :" + max);
		System.out.println("min :" + min);
		System.out.println("합계 :" + pus);
		System.out.println("평균 :" + avg);
	}
}
