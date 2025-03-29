package designexamples.logging;

import java.util.ArrayList;
import java.util.List;

// File class
class FileData {
    private String name;
    private String format;
    private int size;

    public FileData(String name, String format, int size) {
        this.name = name;
        this.format = format;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }

    public int getSize() {
        return size;
    }
}

// Directory class
class Directory {
    private List<FileData> files;

    public Directory() {
        this.files = new ArrayList<>();
    }

    public void addFile(FileData file) {
        files.add(file);
    }

    public List<FileData> listFiles() {
        return files;
    }
}

// Abstract base class for search criteria
abstract class SearchCriteria {
    public abstract boolean matches(FileData file);
}

// Derived class for size-based criteria
class SizeCriteria extends SearchCriteria {
    private int minSize;

    public SizeCriteria(int minSize) {
        this.minSize = minSize;
    }

    @Override
    public boolean matches(FileData file) {
        return file.getSize() > minSize;
    }
}

// Derived class for format-based criteria
class FormatCriteria extends SearchCriteria {
    private String format;

    public FormatCriteria(String format) {
        this.format = format;
    }

    @Override
    public boolean matches(FileData file) {
        return file.getFormat().equals(format);
    }
}

// Class to find files
class FileFinder {
    public List<FileData> find(Directory directory, SearchCriteria criteria) {
        List<FileData> result = new ArrayList<>();
        for (FileData file : directory.listFiles()) {
            if (criteria.matches(file)) {
                result.add(file);
            }
        }
        return result;
    }
}

public class LogFilesDemo {
    public static void main(String[] args) {
        Directory directory = new Directory();

        // Add files to the directory
        directory.addFile(new FileData("file1.txt", "txt", 4000));
        directory.addFile(new FileData("file2.xml", "xml", 6000));
        directory.addFile(new FileData("file3.jpg", "jpg", 2000));
        directory.addFile(new FileData("file4.xml", "xml", 8000));

        FileFinder finder = new FileFinder();

        // Find all files larger than 5000 KB
        SizeCriteria sizeCriteria = new SizeCriteria(5000);
        List<FileData> largeFiles = finder.find(directory, sizeCriteria);
        System.out.println("Files larger than 5000 KB:");
        for (FileData file : largeFiles) {
            System.out.println("- " + file.getName());
        }

        // Find all XML files
        FormatCriteria formatCriteria = new FormatCriteria("xml");
        List<FileData> xmlFiles = finder.find(directory, formatCriteria);
        System.out.println("\nXML files:");
        for (FileData file : xmlFiles) {
            System.out.println("- " + file.getName());
        }
    }
}
