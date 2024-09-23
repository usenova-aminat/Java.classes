### Java.classes

# Student Class in Java

This Java class, `Student`, represents a student entity with key attributes such as `name`, `id`, `major`, and `gpa`. The class provides methods to display student information and to determine if the student qualifies for the Erasmus program based on their GPA.
 
### Attributes

- `name` (String):
- `id` (int):  
- `major` (String):  
- `gpa` (int):  

### Constructors

1. **Parameterized Constructor**: Initializes all attributes using provided values,the **this** keyword is a reference to the current objects in the class.
   public Student(String name, int id, String major, int gpa) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = gpa;
    }

2. **Default constractor**: initializes attributes with default values
   public Student(){
        this.name = " ";
        this.id = 0;
        this.major = " ";
        this.gpa = 0;
    }
### Methods

1. **DesplayInfo method**: this method just prints out attribute content
   public void displayInfo() {
        System.out.print("Student name: " + name + ", ");
        System.out.print("Student id: " + id + ", ");
        System.out.print("Student major: " + major + ", ");
        System.out.println("Student gpa: " + gpa);
    } 
2. **Additional method**: I used for loop to determine student's gpa, on the basis of which a student is admitted or not admitted to the Erasmus program
    public void excellentStudent () {
        if (this.gpa >= 85) {
            System.out.println("Name: " + this.name + ". " + " GPA: " + gpa + "-admitted to the Erasmus program");
        }
        else {
            System.out.println("Name: " + this.name + ". The student's GPA is less than 85");
        }
    }

### Testing the Class: 
This part of code creates objects (1.)using parameterized constructor, (2.)using default constractor, **new** is a keyword, that creates new object from a class. 
    1.  Student Student1 = new Student("Adil Ryspaev", 230102012, "Business Administration", 77);
        Student Student2 = new Student("Artur Pirozhkov", 230106016, "Computer Science", 91);
        Student Student3 = new Student("Akylai Akylova", 220804015, "Psychology", 98);

   2. Student Student4 = new Student();
        Student4.name = "Ainura Amanova";
        Student4.id = 240108013;
        Student4.major = "Management";
        Student4.gpa = 83;

This part of code calls the displayInfo() method on each object created
        Student1.displayInfo();
        Student2.displayInfo();
        Student3.displayInfo();
        Student4.displayInfo();
This part of code calls the Additional method(ExccelentStudent) on each object created
        Student1.excellentStudent();
        Student2.excellentStudent();
        Student3.excellentStudent();
        Student4.excellentStudent();
