import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Logger {

    String fileName;
    String PATH;
    ArrayList<String> linesToWrite = new ArrayList<>();

    public Logger() {
        //
        // TO USE THIS: change "user_goes_here" to the correct username, and create an empty folder in Documents called "logs"
        //
        PATH = "C:\\Users\\user_goes_here\\Documents\\logs\\";
    }

    // Some code below was referenced from https://www.w3schools.com/java/java_files_create.asp
    public void createFile() {
        try {
            File myObj = new File( PATH + fileName + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void writeToFile() {
        try {
            FileWriter myWriter = new FileWriter(PATH + fileName + ".txt", true);

            for (String line: linesToWrite) {
                myWriter.write(line+"\n");
            }

            myWriter.close();
            System.out.println("Successfully wrote to " + fileName + ".txt");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
