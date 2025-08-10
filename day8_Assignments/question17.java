package day8_Assignments;

//2.	Create a LinkedHashSet of custom objects (e.g., Student with id and name):
//o	Override hashCode() and equals() properly.
//o	Add at least 3 Student objects.
//o	Try adding a duplicate student and check if it gets added.


import java.util.LinkedHashSet;
import java.util.Objects;

class Children {
    private int id;
    private String name;

    public Children(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals to compare Children by id and name
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Children other = (Children) obj;
        return id == other.id && Objects.equals(name, other.name);
    }

    // Override hashCode consistent with equals
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Children{id=" + id + ", name='" + name + "'}";
    }
}

public class question17 {
    public static void main(String[] args) {
        LinkedHashSet<Children> childrenSet = new LinkedHashSet<>();

        // Add 3 Children objects
        childrenSet.add(new Children(1, "sai"));
        childrenSet.add(new Children(2, "ram"));
        childrenSet.add(new Children(3, "keerthi"));

        // Try adding a duplicate Children object
        boolean added = childrenSet.add(new Children(2, "ram"));

        System.out.println("Children objects in LinkedHashSet:");
        for (Children child : childrenSet) {
            System.out.println(child);
        }

        if (!added) {
            System.out.println("\nDuplicate Children object was NOT added.");
        } else {
            System.out.println("\nDuplicate Children object was added (unexpected).");
        }
    }
}

//Children objects in LinkedHashSet:
//Children{id=1, name='sai'}
//Children{id=2, name='ram'}
//Children{id=3, name='keerthi'}
//
//Duplicate Children object was NOT added.
