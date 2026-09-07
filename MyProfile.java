public class MyProfile {
    public static void main(String[] args) {

        // int: stores my age
        int age = 24;

        // double: stores my height in metres
        double height = 3.05;

        // boolean: shows whether I am a continuing student
        boolean continuingStudent = true;

        // char: stores the first letter of my surname
        char gender = 'M';

        // long: stores my phone number
        // The L at the end tells Java that this is a long value
        long phoneNumber = 753080079L;

        // short: stores the number of courses registered
        short numberOfCourses = 6;

        // byte: stores the number of siblings
        byte siblings = 3;

        // float: stores my weight in kilograms
        float weight = 56.5f;

        // Display my profile information
        System.out.println("Name: NSANJA TIMOTHY");
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " metres");
        System.out.println("Continuing Student: " + continuingStudent);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Number of Courses: " + numberOfCourses);
        System.out.println("Number of Siblings: " + siblings);
        System.out.println("Weight: " + weight + " kg");
    }
}