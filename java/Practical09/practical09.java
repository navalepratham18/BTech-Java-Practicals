import java.io.*; // Importing required classes for file handling

public class practical09 {
    public static void main(String[] args) {
        String fileName = "example.txt"; // Define file name

        // Creating a new file
        try {
            File file = new File(fileName); // Create File object
            if (file.createNewFile()) { // Check if file is created
                System.out.println("File created successfully: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        // Writing to a file
        try (FileWriter writer = new FileWriter(fileName)) { // Open file in write mode
            writer.write("Hello, this is a file handling example in Java!\n");
            writer.write("File handling includes reading and writing operations.\n");
            System.out.println("Data successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Appending to a file
        try (FileWriter writer = new FileWriter(fileName, true)) { // Open file in append mode
            writer.write("Appending new data to the file.\n");
            System.out.println("Data successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }

        // Reading from a file
        try (
            FileReader reader = new FileReader(fileName); // Open file in read mode
            BufferedReader bufferedReader = new BufferedReader(reader) // Wrap with BufferedReader for efficient reading
        ) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = bufferedReader.readLine()) != null) { // Read file line by line
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        // Deleting a file
        File fileToDelete = new File(fileName); // Create File object for deletion
        if (fileToDelete.delete()) { // Attempt to delete the file
            System.out.println("File deleted successfully: " + fileToDelete.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
