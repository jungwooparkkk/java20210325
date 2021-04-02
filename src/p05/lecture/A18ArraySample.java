package p05.lecture;

public class A18ArraySample {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 3, 4, 5, 6, 7 };
		int[] arr2 = new int[] { 99, 88, 70 };
		// arr1 과 arr2의 평규
		double avg1 = avg(arr1);
		double avg2 = avg(arr2);

		System.out.println(avg1); // 5
		System.out.println(avg2); // 85.66666666666667

	}

	public static double avg(int[] arr) {
//		double avg = 0;
//		double v = 0;
//		
//		for (int i = 0; i <arr.length; i++) {
//			v += arr[i];
//			avg = v/(i+1);
//	}
//		return avg;
		
		
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum / arr.length;

	}
}
