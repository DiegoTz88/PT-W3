import java.util.Arrays;

public class java_week_3_codingChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Array for integer ages
		int[] ages = new int[8];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
		//1.a method for subtracting first value from last value
		System.out.println("Problem 1.a:");
		System.out.println(subFirstLast(ages));
		
		//1.b add value to array
		System.out.println("Problem 1.b:");
		int l = ages.length;
		int newAges[] = new int[l+1];
		int newValue = 90;
		for(int i = 0; i < l; i++) {
			newAges[i] = ages[i];
		}
		newAges[l] = newValue;
		System.out.println(subFirstLast(newAges));
		
		//1.c method for calculating average ages
		System.out.println("Problem 1.c:");
		System.out.println(calcAvg(ages));
		
		//2. Array for String names
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		//2.a Calculating average number of letters per name
		System.out.println("Problem 2.a:");
		int avgs = 0;
		int total = 0;
		for(int i = 0; i < names.length; i++) {
			total += names[i].length();
		}
		avgs = total / names.length;
		System.out.println(avgs);
		
		//2.b
		System.out.println("Problem 2.b:");
		String result = "";
		for(int i = 0; i < names.length; i++) {
			result += names[i] + " ";
		}
		System.out.println(result);
		
		
		/*3.	How do you access the last element of any array?
		 * 		numbers[numbers.length-1];
		 * 
		 *4.	How do you access the first element of any array?
		 *		numbers[0];
		 */
		
		//5. Declaring array called nameLengths
		System.out.println("Problem 5:");
		int n = names.length;
		
		int[] nameLengths = new int[n];
		for(int i = 0; i < n; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println(Arrays.toString(nameLengths));
		
		
		//6. calculating nameLengths sum
		System.out.println("Problem 6:");
		int nameLengthSum = 0;
		for(int i = 0; i < nameLengths.length; i++) {
			nameLengthSum += nameLengths[i];
		}
		System.out.println(nameLengthSum);
		
		//7. concatenated word
		System.out.println("Problem 7:");
		System.out.println(multString("hello", 3));
		
		//8. Method that creates full name
		System.out.println("Problem 8:");
		String fullName = createFullName("Diego", "Tzompa");
		System.out.println(fullName);
		
		//9.Method checks if integer array > 100
		System.out.println("Problem 9:");
		int[] test1 = new int[3];
		test1[0] = 30;
		test1[1] = 40;
		test1[2] = 31;
		System.out.println(sumGreater(test1));
		
		int[] test2 = new int[3];
		test2[0] = 30;
		test2[1] = 40;
		test2[2] = 29;
		System.out.println(sumGreater(test2));
		
		//10. double array average
		System.out.println("Problem 10:");
		double[] numDoubles = new double[4];
		numDoubles[0] = 12.34;
		numDoubles[1] = 1.52;
		numDoubles[2] = 23.76;
		numDoubles[3] = 4.94;
		System.out.println(calcAvgDbl(numDoubles));
		
		//11. Comparing double arrays averages
		System.out.println("Problem 11:");
		double[] numDoubles2 = new double[4];
		numDoubles[0] = 11.84;
		numDoubles[1] = 3.42;
		numDoubles[2] = 17.23;
		numDoubles[3] = 3.45;
		System.out.println(compareAvgDbl(numDoubles, numDoubles2));
		System.out.println(compareAvgDbl(numDoubles2, numDoubles));
		
		//12. willBuyDrink boolean
		System.out.println("Problem 12:");
		System.out.println(willBuyDrink(true, 10.51));
		System.out.println(willBuyDrink(false, 10.51));
		
		//13. Method will return true if first string length is longer than second string
		System.out.println("Problem 13:");
		System.out.println(firstStringLength("yogurt", "milk"));
		System.out.println(firstStringLength("milk", "yogurt"));
 		
	}
	
	public static int subFirstLast(int[] numbers) {
		int sub = 0;
		sub = numbers[numbers.length-1] - numbers[0];
		return sub;
		
	}
	
	public static int calcAvg(int[] num) {
		int avg = 0;
		int total = 0;
		for(int i = 0; i < num.length; i++) {
			total += num[i];
		}
		avg = total/num.length;
		return avg;
	}
	
	public static String multString(String str, int num) {
		String result = "";
		for(int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}
	
	public static String createFullName(String x, String y) {
		return x + " " + y;
	}
	
	public static boolean sumGreater(int[] num) {
		int result = 0;
		for(int i = 0; i < num.length; i++) {
			result += num[i];
		}
		
		if(result > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double calcAvgDbl(double[] num) {
		double avg = 0.0;
		double total = 0.0;
		for(int i = 0; i < num.length; i++) {
			total += num[i];
		}
		avg = total/num.length;
		return avg;
	}
	
	public static boolean compareAvgDbl(double[] num1, double[] num2) {
		double avg1 = 0.0;
		double total1 = 0.0;
		double avg2 = 0.0;
		double total2 = 0.0;
		for(int i = 0; i < num1.length; i++) {
			total1 += num1[i];
		}
		avg1 = total1/num1.length;
		
		for(int i = 0; i < num2.length; i++) {
			total1 += num2[i];
		}
		avg2 = total2/num2.length;
		
		if(avg1 > avg2) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean firstStringLength(String one, String two) {
		if(one.length() > two.length()) {
			return true;
		} else {
			return false;
		}
	}
}
