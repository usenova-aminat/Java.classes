public class Student{
    
    public String name;
    public int id;
    public String major;
    public int gpa;
    
    public Student(String name, int id, String major, int gpa) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = gpa;
    }
    
    public Student(){
        this.name = " ";
        this.id = 0;
        this.major = " ";
        this.gpa = 0;
    }
    
    public void displayInfo() {
        System.out.print("Student name: " + name + ", ");
        System.out.print("Student id: " + id + ", ");
        System.out.print("Student major: " + major + ", ");
        System.out.println("Student gpa: " + gpa);
    }
    
    public void excellentStudent () {
        if (this.gpa >= 85) {
            System.out.println("Name: " + this.name + ". " + " GPA: " + gpa + "-admitted to the Erasmus program");
        }
        else {
            System.out.println("Name: " + this.name + ". The student's GPA is less than 85");
        }
    }

    public static void main(String[] args) {
        Student Student1 = new Student("Adil Ryspaev", 230102012, "Business Administration", 77);
        Student Student2 = new Student("Artur Pirozhkov", 230106016, "Computer Science", 91);
        Student Student3 = new Student("Akylai Akylova", 220804015, "Psychology", 98);
    
        Student Student4 = new Student();
        Student4.name = "Ainura Amanova";
        Student4.id = 240108013;
        Student4.major = "Management";
        Student4.gpa = 83;
        
        
        Student1.displayInfo();
        Student2.displayInfo();
        Student3.displayInfo();
        Student4.displayInfo();
        
        System.out.println(" ");
        
        Student1.excellentStudent();
        Student2.excellentStudent();
        Student3.excellentStudent();
        Student4.excellentStudent();
}
}

