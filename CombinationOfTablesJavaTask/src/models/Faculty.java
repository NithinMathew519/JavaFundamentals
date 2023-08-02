package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Faculty {
    public static void main(String[] args) {
        List<List<String>> dataTable1 = FacultyTable();
        printDataTable(FacultyTable());
    }
    private static List<List<String>> FacultyTable() {
        List<List<String>> dataTable = new ArrayList<>();

        List<String> headerRow = Arrays.asList("id", "FacultyName", "Subject");
        dataTable.add(headerRow);

        dataTable.add(Arrays.asList("Faculty1", "Mohan", "EEE"));
        dataTable.add(Arrays.asList("Faculty2", "Robert", "CSE"));
        dataTable.add(Arrays.asList("Faculty3", "James", "ECE"));
        dataTable.add(Arrays.asList("Faculty4", "Albert", "Mech"));

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
