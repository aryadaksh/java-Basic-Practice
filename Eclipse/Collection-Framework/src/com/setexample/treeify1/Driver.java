package com.setexample.treeify1;



import java.util.HashSet;

class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        // Force all objects into the same bucket
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Company)) return false;
        Company other = (Company) obj;
        return this.name.equals(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Driver {
    public static void main(String[] args) {
        HashSet<Company> company = new HashSet<>();

        // Add > 8 elements with same hash → triggers treeify (if capacity ≥ 64)
        company.add(new Company("TCS1"));
        company.add(new Company("TCS2"));
        company.add(new Company("TCS3"));
        company.add(new Company("TCS4"));
        company.add(new Company("TCS5"));
        company.add(new Company("TCS6"));
        company.add(new Company("TCS7"));
        company.add(new Company("TCS8"));
        company.add(new Company("TCS9"));
        company.add(new Company("TCS10"));
        company.add(new Company("TCS11"));

        System.out.println("After adding: " + company);

        // Remove enough elements so bucket size < 6 → triggers untreeify
        company.remove(new Company("TCS10"));
        company.remove(new Company("TCS9"));
        company.remove(new Company("TCS8"));
        company.remove(new Company("TCS7"));
        company.remove(new Company("TCS6"));

        System.out.println("After removing: " + company);

        // Debugging tip:
        // In Eclipse, set a breakpoint here and inspect:
        // company.map.table[1]
        // If you see HashMap$TreeNode → treeified
        // If you see HashMap$Node → untreeified
    }
}
