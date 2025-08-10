package day7_Assignments;
//10.	Can you simulate call by reference in Java using a wrapper class or array? Justify with a program.
//Wrapper class to simulate call-by-reference
class IntWrapper {
 int value;

 IntWrapper(int value) {
     this.value = value;
 }
}

public class example7 {
 public static void main(String[] args) {
     IntWrapper number = new IntWrapper(10);

     System.out.println("Before method call: " + number.value);

     modify(number);  // Pass object

     System.out.println("After method call: " + number.value);  // Value updated
 }

 static void modify(IntWrapper ref) {
     ref.value = 99;  // Modify internal field
 }
}

//public class ArrayCallByReference {
//    public static void main(String[] args) {
//        int[] num = {10};  // Array with one element
//
//        System.out.println("Before method call: " + num[0]);
//
//        modify(num);  // Pass array
//
//        System.out.println("After method call: " + num[0]);  // Value updated
//    }
//
//    static void modify(int[] arr) {
//        arr[0] = 99;  // Modify the first element
//    }
//}



//Before method call: 10
//After method call: 99

