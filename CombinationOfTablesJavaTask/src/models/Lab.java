package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab {
    public static void main(String[] args) {
        List<List<String>> dataTable1 = LabTable();
        printDataTable(dataTable1);
    }
    private static List<List<String>> LabTable() {
        List<List<String>> dataTable = new ArrayList<>();

        List<String> headerRow = Arrays.asList("Id", "LabName", "Subject");
        dataTable.add(headerRow);
        dataTable.add(Arrays.asList("Lab1", "Computer Lab", "CSE"));
        dataTable.add(Arrays.asList("Lab2", "BEE Lab", "EEE"));
        dataTable.add(Arrays.asList("Lab3", "Mechanical Lab", "MECH")); // Use course name from CourseTable
        dataTable.add(Arrays.asList("Lab4", "ECD Lab", "ECE"));
        return dataTable;
    }
    private static void printDataTable(List<List<String>> dataTable) {
        for (List<String> row : dataTable) {
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}
