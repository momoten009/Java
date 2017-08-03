import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
class FileMain{
	public static void main (String[] args){
		try{
			File file = new File("c:\\2017\\txt\\A.text");
			FileReader fr = new FileReader(file);
			int ch;
			while((ch = fr.read()) != -1)
				System.out.print((char)ch);
			fr.close();
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}
	}
}