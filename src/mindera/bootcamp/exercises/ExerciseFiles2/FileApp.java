package mindera.bootcamp.exercises.ExerciseFiles2;

import java.io.*;

public class FileApp {

    public static void main(String[] args) {

        String[] filesInDirectory = new String[0];

        try {
            filesInDirectory = getFilesFromDirectoryFirstLetters(readFromConsole("Input Directory List"), readFromConsole("Input First Letters"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        /*try {
            writeFileNamesOnFile(filesInDirectory, readFromConsole("Type the name of the file to write the list."));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/

        /*try {
            checkIfFileExists(filesInDirectory, readFromConsole("Insert name of the file"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/

        /*try {
            createNewFile(readFromConsole("Input directory"), readFromConsole("Input file name"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/


    }


    public static String readFromConsole(String message) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(message);
        return reader.readLine();
    }

    private static String[] getFilesFromDirectory(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        String[] filesNames = new String[files.length];
        int fileNamesIndex = 0;
        for (int i = 0; i < filesNames.length; i++) {
            if (files[i].isFile()) {
                filesNames[fileNamesIndex++] = files[i].getName();
            }
        }
        return filesNames;
    }

    private static void writeFileNamesOnFile(String[] fileNames, String newFileName) throws IOException {
        FileWriter writer = new FileWriter(newFileName);
        for (String fileName : fileNames) {
            if (fileName == null) {
                break;
            }
            writer.write(fileName + "\n");
        }
        writer.close();
    }

    private static boolean checkIfFileExists(String[] filenames, String filename) {
        for (String fileName : filenames) {
            if (fileName.equals(filename)) {
                System.out.println("file exists");
                return true;
            }
        }
        System.out.println("file does not exist.");
        return false;
    }

    private static void createNewFile(String path, String filename) throws IOException {
        File newFile = new File(path.concat("/").concat(filename));
        if (newFile.exists()) {
            System.out.println("already exists.");
            return;
        }
        newFile.createNewFile();
    }

    public static FilenameFilter getFileNameFilter(String filterLetters) {
        return new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith(filterLetters);
            }
        };
    }

    private static String[] getFilesFromDirectoryFirstLetters(String path, String letters) {
        File file = new File(path);
        File[] files = file.listFiles(getFileNameFilter(letters));
        String[] filesNames = new String[files.length];
        //int fileNamesIndex = 0;
        for (int i = 0; i < filesNames.length; i++) {
            // if (files[i].isFile()) {
            filesNames[i] = files[i].getName();
            System.out.println(files[i].getName());
            // }
        }
        return filesNames;
    }
}
