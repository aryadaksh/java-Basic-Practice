package com.week.ten;

import java.util.ArrayList;
import java.util.List;

public class OOMTest {
    public static void main(String[] args) {
        List<byte[]> memoryHog = new ArrayList<>();
        while (true) {
            memoryHog.add(new byte[1024 * 1024]); // allocate 1 MB chunks
            System.out.println("Allocated: " + memoryHog.size() + " MB");
        }
    }
}

