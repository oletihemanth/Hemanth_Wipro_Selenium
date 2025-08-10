//Traffic Light State Machine
//Implement enum TrafficLight implementing interface State, with constants RED, GREEN, YELLOW.
//Each must override State next() to transition in the cycle.
//Simulate and print six transitions starting from RED

package day6_Assignment;


interface State {
 State next();
}

enum TrafficLight implements State {
 RED {
     public State next() {
    	 return GREEN; 
    	 }
 },
 GREEN {
     public State next() { 
    	 return YELLOW; 
    	 }
 },
 YELLOW {
     public State next() {
    	 return RED;
    	 }
 };
}

public class question10 {
 public static void main(String[] args) {
     State current = TrafficLight.RED; // Start from RED

     for (int i = 0; i < 6; i++) {
         System.out.println(current);
         current = current.next(); // Move to the next state
     }
 }
}

//RED
//GREEN
//YELLOW
//RED
//GREEN
//YELLOW
