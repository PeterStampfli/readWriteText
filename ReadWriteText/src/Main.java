import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

//https://github.com/PeterStampfli/readWriteText.git


public class Main {

	public static void main(String[] args){

		String thePath="/home/peter/Documents/text.txt";
		Path path=Paths.get(thePath);
        String line=null;
		try {
			BufferedReader reader=Files.newBufferedReader(path);
            while ((line = reader.readLine()) != null) {
                // do something with the line
        		System.out.println(line);

            }
			reader.close();
			
		} catch (IOException ex){
			ex.printStackTrace(System.out);				
		}

		thePath="/home/peter/Documents/textOut.txt";
		path=Paths.get(thePath);
		
		try {
			BufferedWriter writer=Files.newBufferedWriter(path,StandardOpenOption.CREATE);
			writer.write("ein anfang");
			writer.newLine();
			writer.write("nexte zeile");
			writer.close();
			
		} catch (IOException ex){
			ex.printStackTrace(System.out);				
		}

	}

}
