class Student {
    String name;
    int roll;
    String password;
    int[] marks;

    //  Copy Constructor
    Student(Student other) {
        marks = new int[3];
        this.name = other.name;
        this.roll = other.roll;
        this.password = other.password;

        // Deep copy of marks array
        for (int i = 0; i < 3; i++) {
            this.marks[i] = other.marks[i];
        }
        System.out.println("Copy constructor called for " + this.name);
    }

    //  Parameterized constructor (name)
    Student(String name) {
        marks = new int[3];
        this.name = name;
        System.out.println("Parameterized constructor called (name)");
    }

    //  Non-parameterized constructor
    Student() {
        marks = new int[3];
        System.out.println("Non-parameterized constructor called");
    }

    //  Parameterized constructor (roll)
    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
        System.out.println("Parameterized constructor called (roll)");
    }
}
