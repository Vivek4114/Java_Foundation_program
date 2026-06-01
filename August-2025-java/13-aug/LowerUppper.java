 import java.io.*;

class LowerUpper {
    public static void main(String[] args) {
        int Ll, Ul;

        System.out.println("Enter your Lower Number and Upper Number (e.g., 12 56):");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] input = reader.readLine().split("\\s+"); // splits on spaces

            if (input.length < 2) {
                System.out.println("Please enter two numbers separated by space.");
                return;
            }

            Ll = Integer.parseInt(input[0]);
            Ul = Integer.parseInt(input[1]);

            if (Ul > Ll) {
                System.out.println("The Greater Number is " + Ul);
            } else if (Ll > Ul) {
                System.out.println("The Greater Number is " + Ll);
            } else {
                System.out.println("Both numbers are equal.");
            }

        } catch (IOException e) {
            System.out.println("An input error occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integer numbers.");
        }
    }
}
