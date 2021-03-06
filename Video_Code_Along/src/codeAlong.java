
public class codeAlong {

	public static void main(String[] args) {
		String[] students = new String[3];
		
		students[0] = "Tom String";
		students[1] = "dieo";
		students[2] = "kevin";
		
		for( int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		for(String student : students) {
			System.out.println(student);
		}

		String[] products = new String[5];
		products[0] = "Carrots";
		products[1] = "Pineapples";
		products[2] = "Tomatoes";
		products[3] = "Potatoes";
		products[4] = "Cereal";
		
		for(String product : products) {
			System.out.println("Products: " + product);
		}
		
		int[] multiplesOf3 = new int[10];
		for (int i = 1; i <= multiplesOf3.length; i++) {
			multiplesOf3[i-1] = i*3;
			System.out.println("number: " + multiplesOf3[i-1]);
		}
		
		String fullName = createFullName("jake", "sus");
		System.out.println(fullName);
		
		int[] myArray = new int[3];
		myArray[1] = 7;
		myArray[0] = 10;
		myArray[2] = 8;
		
		int sum = sumArray(myArray);
		System.out.println(sum);
 		
		double[] grade = new double[5];
		grade[0] = 88.7;
		grade[1] = 90.5;
		grade[2] = 87.1;
		grade[3] = 76.7;
		grade[4] = 95.7;
		
		System.out.println(calculateAvg(grade));
		
		System.out.println(multString("hello", 3));
	}
	
	public static String multString(String str, int num) {
		String result = "";
		for(int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}
	
	public static double calculateAvg(double[] numbers) {
		double sum = 0;
		for(double number : numbers) {
			sum += number;
		}
		return sum/numbers.length;
	}
	
	public static int sumArray(int[] numbers) {
		int sum = 0; 
		for(int number : numbers) {
			sum+= number;
		}
		return sum;
	}
	
	public static String createFullName(String x, String y) {
		return x + " " + y;
	}

}
