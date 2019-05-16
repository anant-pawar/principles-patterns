package com.design.principles;

class Document {
    private String name;

    public Document(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

interface Printer {
    void print(Document document);
}

interface Scanner {
    void scan(Document document);
}

class JustPrinter implements Printer {
    @Override
    public void print(Document document) {
        System.out.println("Print : " + document.getName());
    }
}

class JustScanner implements Scanner {
    @Override
    public void scan(Document document) {
        System.out.println("Scan : " + document.getName());
    }
}

public class ISPDemo {
    public static void main(String[] args){
        Document document = new Document("Resume");
        Printer printer = new JustPrinter();
        Scanner scanner = new JustScanner();

        printer.print(document);
        scanner.scan(document);
    }
}
