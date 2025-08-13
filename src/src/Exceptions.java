import javax.naming.AuthenticationException;
import java.io.FileNotFoundException;
import java.net.BindException;
import java.util.Scanner;

public class Exceptions {

    public void question1() throws RuntimeException {
        RuntimeException runtimeException = new RuntimeException("text");
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("text");
        indexOutOfBoundsException.printStackTrace();
        throw runtimeException;
    }

    public static void question2() {
        try {
            int[] arr = {1, 2, 3, 4};
            System.out.println(arr[4]);
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("an error occured");
        }
    }

    public static void question3(Scanner reader) throws IllegalArgumentException, RuntimeException {
            for (int i = 0; i < 100; i++) {
                int num = reader.nextInt();
                if (num == 45) {
                    try {
                        throw new IllegalArgumentException("Illegal Argument Exception");
                    }
                    catch(IllegalArgumentException illegalArgumentException){
                        System.out.println(illegalArgumentException);
                    }

                } else if (num == 100) {
                    throw new RuntimeException("Runtime Exception");
                }
        }
    }

    public static void question4(int num) throws FileNotFoundException, BindException, AuthenticationException {
        if (num == 1) throw new FileNotFoundException("File Not  Found Exception");
        else if (num == 2) throw new BindException("Bind Exception");
        else if (num == 3) throw new AuthenticationException("Authentication Exception");
    }
    public static void question5(int num) throws AuthenticationException, FileNotFoundException, BindException {
        try {
            question4(num);
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("1");
        }catch (BindException bindException){
            System.out.println("2");
        }catch(AuthenticationException authenticationException){
            System.out.println("3");
        }
    }
    public static void question6(int num) throws AuthenticationException, FileNotFoundException, BindException, RuntimeException {
        try {
            question4(num);
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("1");
        }catch (BindException bindException){
            System.out.println("2");
        }catch(AuthenticationException authenticationException){
            System.out.println("3");
        }
        finally{
            System.out.println("here");
            System.out.println(num);
            throw new RuntimeException("Runtime Exception");
        }
    }
        //solution 7
        // answer: make the name longer or delete the coondition name.length>3 from the constractor

        //solution 8
    public static int getIndex(String[]arr){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("yellow")) {
                    return i;
                }
            }
        return -1;
        // answer: delete "=" in for loop
    }
}