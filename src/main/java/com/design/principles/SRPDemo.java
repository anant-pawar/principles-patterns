package com.design.principles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class Journal {
    private List<String> entries = new ArrayList<String>();
    private Integer count = 0;

    public void addEntry(String entry) {
        entries.add("" + ++count + ": " + entry);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}

class Persistence {
    public void saveToFile(Journal journal, String filename, Boolean overwrite) throws FileNotFoundException {
        if(overwrite || new File(filename).exists()){
            try(PrintStream printStream = new PrintStream(filename)){
                printStream.println(journal.toString());
            }
        }
    }
}

class SRPDemo{
    public static void main(String[] args) throws Exception {
        Journal journal = new Journal();

        journal.addEntry("i eat samosa today");
        journal.addEntry("i had gastric issues after having samosa");

        System.out.println(journal);

        Persistence persistence = new Persistence();
        String fileName = "D://Journal.txt";
        persistence.saveToFile(journal, fileName, true);

        Runtime.getRuntime().exec("notepad.exe "  + fileName);
    }
}
