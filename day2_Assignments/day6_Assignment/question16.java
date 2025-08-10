//: Multi Exception in One Try Block
//Write a class MultiExceptionDemo:
//•	In a single try block, perform:
//o	Opening a file
//o	Parsing its first line as integer
//o	Dividing 100 by that integer
//•	Use multiple catch blocks in this order:
//1.	FileNotFoundException
//2.	IOException
//3.	NumberFormatException
//4.	ArithmeticException
//•	In each catch, print a tailored message:
//o	File not found
//o	Problem reading file
//o	Invalid number format
//o	Division by zero
//•	Finally, print "Execution completed".

package day6_Assignment;
import java.io.*; 

public class question16 {
    public static void main(String[] args) {
        String filename = "C:\\Users\\HEMANTH OLETI\\OneDrive\\Desktop\\New folder (2)\\destination.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            // Read first line
            String line = br.readLine();

            // Parse integer
            int num = Integer.parseInt(line);

            // Divide 100 by parsed number
            int result = 100 / num;
            System.out.println("Result: " + result);

            br.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("Problem reading file");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        finally {
            System.out.println("Execution completed");
        }
    }
}

//Invalid number format
//Execution completed

