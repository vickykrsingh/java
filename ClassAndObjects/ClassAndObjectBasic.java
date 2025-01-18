package ClassAndObjects;

public class ClassAndObjectBasic {
    public static class Student {
        public Student(String Name, int Roll, int Age, double MarksInPercentage, String[] InrolledCourses) {
            this.Name = Name;
            this.Age = Age;
            this.Roll = Roll;
            this.MarksInPercentage = MarksInPercentage;
            this.InrolledCourses = InrolledCourses;
            NoOfInrolledStudent++;
        }

        private String Name;
        private int Roll;
        private int Age;
        private double MarksInPercentage;
        private String[] InrolledCourses;
        private static int NoOfInrolledStudent;
        final String CollegeName = "Galgotias University";

        public void printData() {
            System.out.print("Name is " + this.Name + "\n" + "Age is " + this.Age + "\n" + "Roll is " + this.Roll + "\n"
                    + "Total Percentage is " + this.MarksInPercentage + "\nCollege Name is " + this.CollegeName + "\n"
                    + "Inrolled Courses ");
            for (String course : InrolledCourses) {
                System.out.print(course + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("vicky", 29, 23, 43.23, new String[] { "Course1", "Course2" });
        Student s2 = new Student("vipul", 30, 29, 54.3, new String[] { "Html", "Css", "Java" });
        Student s3 = new Student("Aryaman Mishra", 31, 27, 62, new String[] { "React.js", "Node.js" });
        System.out.println();
        s1.printData();
        s2.printData();
        s3.printData();

        System.out.println("No of Inrolled Student : " + Student.NoOfInrolledStudent);

    }
}