import javax.swing.*;

public class Frame{

	public Frame() {
		String[] qa;
		String answer;
		String response;
		while (true){
			qa = Questions.generate();
			answer = JOptionPane.showInputDialog(null, qa[0]);
			System.out.println(answer);
			System.out.println(qa[1]);
			if (answer == null) System.exit(0);
			response = Integer.valueOf(qa[1]) == Integer.valueOf(answer) ? "Correct!" : "Incorrect, correct was "+qa[1] ;
			JOptionPane.showMessageDialog(null, response);
		}
	}

}
