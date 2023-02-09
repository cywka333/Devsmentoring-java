package pl.devsmentoring.java.Exceptions;

public class Main {

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        FileHandler fileHandler;
        try {
            String filePath = userInput.getFilePath();
            int noConnectors = userInput.getNoConnectors();
            int maxFileSize = userInput.getMaxFileSize();

            fileHandler = new FileHandler(filePath, noConnectors, maxFileSize);
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
            return;
        }

        fileHandler.readContent();
        fileHandler.saveToFile();
    }
}