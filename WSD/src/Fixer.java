import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

class Fixer{
	public static void main(String [] args) {
		try {
			Scanner scan = new Scanner(new File("Semeval_Gold_Keys/semeval-2015-task-13-en-n.key"));
			PrintWriter printer = new PrintWriter(new File("Semeval_Gold_Keys/semeval-2015-task-13-en-n-wn.key"));
			while(scan.hasNextLine()) {
				String line = scan.nextLine();
				String [] s = line.split("\t");
				for(int x=2;x<s.length;x++) {
					if(s[x].startsWith("wn")) {
						printer.println(line);
						break;
					}
				}
			}
			scan.close();
			printer.close();
		}
		catch(Exception e) {
			
		}
		/*try {
			Scanner scan = new Scanner(new File("System_Keys/pywsd_simple_lesk_semeval.key"));
			scan.useDelimiter("\n");
			PrintWriter print = new PrintWriter(new File("System_Keys/pywsd_simple_lesk_semeval_new.key"));
			while(scan.hasNext()) {
				String s = scan.next();
				if(s.length()>16)
				print.println(s.substring(0, 15)+s.substring(0, 15)+s.substring(15,s.length()));
			}
			scan.close();
			print.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
	}
}