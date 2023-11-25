import java.util.Random;

public class Questions {
	static Random random = new Random();
	static char[] operations = {'+', '-', 'x', '/'};
	static String[] output = new String[2];
	
	
	static String[] generate() {
		byte index = (byte) random.nextInt(4);
		int second = random.nextInt(10000);
		int first = random.nextInt(70)*second;
		switch(operations[index]) {
		case '+': output[1] = String.valueOf(first + second);
		break;
		case '-': output[1] = String.valueOf(first - second);
		break;
		case 'x': output[1] = String.valueOf(first * second);
		break;
		case '/': output[1] = String.valueOf(first / second);
		break;
		}
		output[0] = String.valueOf(first) + String.valueOf(operations[index]) + String.valueOf(second);
		return output;
	}
	
}
