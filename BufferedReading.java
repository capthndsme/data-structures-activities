import java.io.*;  
public class BufferedReading {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader("E:\\help.txt");    
        BufferedReader bufferedReader = new BufferedReader(fileReader); 
        String currentLine;
        try {
            while ((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLine);
            }   
        }
        catch (IOException e) {
            System.out.println("ERROR Reading file");
            e.printStackTrace();
            
        }
        try {
            if (bufferedReader != null)
                bufferedReader.close();
                if (fileReader != null ) {
                    fileReader.close();
                }
            } catch (IOException ex) {
                System.out.println("ERROR Closing Bufferedreader and FileReader");
                ex.printStackTrace();
        }
 
    }
}