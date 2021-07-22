
import java.io.*;
class combinedjava {

	public static void main(String[] args) throws IOException
	{	
		File dir = new File("D:\\20 Programming Books Collection Pack-2 ( C, C++ and More )\\combined code");

		PrintWriter pr = new PrintWriter("finalcombinedtext.txt");

	
		String[] fileNames = dir.list();

	
		for (String fileName : fileNames) {
			System.out.println("get data from " + fileName);

			
			File f = new File(dir, fileName);

			
			BufferedReader bu = new BufferedReader(new FileReader(f));
		

			
			String line = bu.readLine();
			while (line != null) {

				pr.println(line);
				line = bu.readLine();
			}
			pr.flush();
		}
		System.out.println("Reading from all files" +
		" in directory " + dir.getName() + " Completed");
	}
}
