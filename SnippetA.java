public class SnippetA {
    public static void main(String[] args) {

        // final means this value cannot be changed
        final int MAX_RETAKES = 3;

        // Display the maximum number of retakes
        System.out.println("Retakes allowed: " + MAX_RETAKES);

        // Corrected: MAX_RETAKES cannot be changed because it is final
        // MAX_RETAKES = 4;  // ERROR

    }
}