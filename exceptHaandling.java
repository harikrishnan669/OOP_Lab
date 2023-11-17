import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;
class input{
	void scan() throws IOException {
		try {
	FileOutputStream fr=new FileOutputStream("hello.txt");
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a line of text");
	String line=bf.readLine();
	fr.write(line.getBytes());
	fr.close();
			}
		catch(IOException e) {
			e.printStackTrace();		}
	}
}
class output{
	void print() throws IOException {
	try {
	BufferedReader bff=new BufferedReader(new FileReader("hello.txt"));
	FileReader fr1=new FileReader("hello.txt");
	String contents;
	while((contents=bff.readLine())!=null) {
		System.out.println(contents);
	}
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
}
public class nands {

	public static void main(String[] args) throws IOException{
		input in=new input();
		in.scan();
		output ou=new output();
		ou.print();
  
	}

}
