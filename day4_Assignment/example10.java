package day4_Assignment;

//Base class
class After_12Th {
 void careerOptions() {
     System.out.println("Choose a career path after 12th grade.");
 }
}

//First level subclasses
class Engineering extends After_12Th {
 void engineeringBranch() {
     System.out.println("Engineering has multiple branches.");
 }
}

class Medical extends After_12Th {
 void medicalBranch() {
     System.out.println("Medical has various fields.");
 }
}

class Other_courses extends After_12Th {
 void otherCoursesBranch() {
     System.out.println("There are many professional courses other than Engineering and Medical.");
 }
}

//Second level subclasses under Engineering
class IT extends Engineering {
 void show() {
     System.out.println("You chose IT Engineering.");
 }
}

class Mechanical extends Engineering {
 void show() {
     System.out.println("You chose Mechanical Engineering.");
 }
}

class CS extends Engineering {
 void show() {
     System.out.println("You chose Computer Science Engineering.");
 }
}

//Second level subclasses under Medical
class MBBS extends Medical {
 void show() {
     System.out.println("You chose MBBS.");
 }
}

class BDS extends Medical {
 void show() {
     System.out.println("You chose BDS (Dental).");
 }
}

//Second level subclasses under Other_courses
class BCA extends Other_courses {
 void show() {
     System.out.println("You chose BCA (Bachelor of Computer Applications).");
 }
}

class BBA extends Other_courses {
 void show() {
     System.out.println("You chose BBA (Bachelor of Business Administration).");
 }
}

//Main class to test
public class example10 {
 public static void main(String[] args) {
     IT it = new IT();
     it.careerOptions();
     it.engineeringBranch();
     it.show();

     MBBS mbbs = new MBBS();
     mbbs.careerOptions();
     mbbs.medicalBranch();
     mbbs.show();

     BCA bca = new BCA();
     bca.careerOptions();
     bca.otherCoursesBranch();
     bca.show();
 }
}

//Choose a career path after 12th grade.
//Engineering has multiple branches.
//You chose IT Engineering.
//Choose a career path after 12th grade.
//Medical has various fields.
//You chose MBBS.
//Choose a career path after 12th grade.
//There are many professional courses other than Engineering and Medical.
//You chose BCA (Bachelor of Computer Applications).
