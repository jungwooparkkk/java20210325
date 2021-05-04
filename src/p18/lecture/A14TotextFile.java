package p18.lecture;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class A14TotextFile {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/output4.txt";
		Scanner scanner = new Scanner(System.in);
		
		Writer wr = new FileWriter(file);
		
		String line = "";
		
		while (!line.equals("종료")) {
			System.out.println("입력");
			line = scanner.nextLine();
			wr.write(line+"\n");
			
		}
		wr.close();
		scanner.close();
	}
}
