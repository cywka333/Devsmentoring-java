package pl.devsmentoring.java.Exceptions;

class FileHandler{
    private String filePath;
    private int noConnectors;
    private int maxFileSize;

    public FileHandler(String filePath, int noConnectors, int maxFileSize) throws InvalidDataException {
        if (filePath == null || filePath.trim().isEmpty()) {
            throw new InvalidDataException("filePath cannot be empty.");
        }
        if (noConnectors < 0 || noConnectors > 10) {
            throw new InvalidDataException("Number of connectors must be between 0 and 10.");
        }
        if (maxFileSize < 1000 || maxFileSize > 9999) {
            throw new InvalidDataException("MaxFileSize must be a four-digit number. Please enter value between 1000 and 9999.");
        }

        this.filePath = filePath;
        this.noConnectors = noConnectors;
        this.maxFileSize = maxFileSize;
    }

    public void readContent() {
        System.out.println("Reading content of file: " + filePath);
        System.out.println("Your number of connectors is: " + noConnectors);
        System.out.println("Your max file size is: " + maxFileSize);
    }

    public void saveToFile() {
        System.out.println("Saving content to file: " + filePath);
    }
}
