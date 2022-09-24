/**
 * This program is a command-line tool for converting values from one metric unit to another
 * 
 * @author Jaskaran Singh
*/

// Import scanner to allow for user input.
import java.util.Scanner;

// Public class definition for the metric unit conversion tool.
public class MetricUnitConverter {
    // Messages that may be printed for the user.
    private static final String welcomeMessage = "\nWelcome to the Metric Unit Converter!";
    private static final String inputInstructionMessage = "\nPlease enter \"q\" to quit or enter a metric conversion query. The metric conversion query should be in the format:\nNumber UnitToConvertFrom = UnitToConvertTo\n\nFor example, a valid metric conversion query for converting 1 kilogram to grams is:\n1 kg = g\n\nNote that UnitToConvertFrom and UnitToConvertTo must use prefixes and symbols from the International System of Units (SI).";
    private static final String errorMessage = "\nYour input is not currently handled by this app.";

    // Main method for the metric unit converter tool.
    public static void main(String[] args) throws Exception {
        // Create a scanner object to allow for user input.
        Scanner scanner = new Scanner(System.in);

        // Print out a welcome message for the user. and instructions.
        System.out.println(welcomeMessage);

        do {
            // Print out an input instructions message for the user.
            System.out.println(inputInstructionMessage);
        } while (condition);
    }
}
