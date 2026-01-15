public class Main {
    public static void main(String[] args) {
        // Create a new course
        Course course = new Course("Data Structures and Algorithms");

        // Add three students
        course.addStudent("John Smith");
        course.addStudent("Jane Doe");
        course.addStudent("Bob Johnson");

        // Display all students
        System.out.println("Students in " + course.getCourseName() + " after adding three students:");
        displayStudents(course);

        // Drop a student
        System.out.println("\nDropping student: Jane Doe");
        course.dropStudent("Jane Doe");

        // Display students after dropping one
        System.out.println("\nStudents in " + course.getCourseName() + " after dropping a student:");
        displayStudents(course);

        // Test array resizing by adding more students
        System.out.println("\nAdding 20 more students to test array resizing...");
        for (int i = 1; i <= 20; i++) {
            course.addStudent("Student " + i);
        }

        // Display number of students (should be 22: original 3-1 dropped + 20 new)
        System.out.println("\nNumber of students after adding 20 more: " + course.getNumberOfStudents());

        // Clear the course
        System.out.println("\nClearing all students from the course...");
        course.clear();

        // Display students after clearing (should be empty)
        System.out.println("\nStudents in " + course.getCourseName() + " after clearing:");
        displayStudents(course);
    }

    // Helper method to display all students in a course
    private static void displayStudents(Course course) {
        if (course.getNumberOfStudents() == 0) {
            System.out.println("No students in this course.");
            return;
        }

        String[] students = course.getStudents();
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
        System.out.println("Total number of students: " + course.getNumberOfStudents());
    }
}