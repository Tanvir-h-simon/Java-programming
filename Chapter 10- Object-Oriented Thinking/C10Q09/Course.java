public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;
    private static final int INITIAL_CAPACITY = 16;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[INITIAL_CAPACITY];
        numberOfStudents = 0;
    }

    public void addStudent(String student) {
        // Check if an array needs to be resized
        if (numberOfStudents >= students.length) {
            resizeArray();
        }

        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    private void resizeArray() {
        // Create a new array with double the size
        String[] newArray = new String[students.length * 2];

        // Copy all elements from the old array to the new array
        System.arraycopy(students, 0, newArray, 0, students.length);

        // Replace the old array with the new array
        students = newArray;
    }

    public void dropStudent(String student) {
        // Find the student's position in the array
        int index = -1;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                index = i;
                break;
            }
        }

        // If a student found, remove them
        if (index != -1) {
            // Shift all elements to the left
            for (int i = index; i < numberOfStudents - 1; i++) {
                students[i] = students[i + 1];
            }

            // Set the last position to null and decrement number of students
            students[numberOfStudents - 1] = null;
            numberOfStudents--;
        }
    }

    public void clear() {
        // Remove all students from the course
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = null;
        }
        numberOfStudents = 0;
    }

    public String[] getStudents() {
        // Create an array of exact size to return
        String[] result = new String[numberOfStudents];
        System.arraycopy(students, 0, result, 0, numberOfStudents);
        return result;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }
}