package day7_Assignments;
//9.	Explain the difference between passing primitive and non-primitive types to methods in Java with examples.
//public class example6 {
//    public static void main(String[] args) {
//        int num = 50;
//        modifyPrimitive(num);
//        System.out.println("After method call: " + num);
//    }
//
//    static void modifyPrimitive(int x) {
//        x = 100;  // only modifies the copy, not original
//    }
//}
//
//After method call: 50
//
class Student2 {
    int marks;
}

public class example6 {
    public static void main(String[] args) {
        Student s = new Student();
        s.marks = 80;

        modifyObject(s);
        System.out.println("After method call: " + s.marks);
    }

    static void modifyObject(Student ref) {
        ref.marks = 100;  // modifies actual object field
    }
}
//After method call: 100