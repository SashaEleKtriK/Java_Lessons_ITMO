package Lab10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(readToList("files/text1.txt"));
        writeLineToFile("files/text2.txt", "Буря мглою небо кроет");
        writeLineToFile("files/text2.txt", "Вихри снежные крутя");
        fileMerger("files/text2.txt", "files/text1.txt", "files/textMerged.txt");
        charChanger("files/text1.txt", "files/textChanged1.txt");

    }

    public static List<String> readToList(String path) {
        File file = new File(path);
        List<String> fileStrList = new ArrayList<>();
        try (BufferedReader bfr = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = bfr.readLine()) != null) {
                fileStrList.add(input);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return fileStrList;
    }

    public static void writeLineToFile(String path, String newStr) {
        File file = new File(path);
        try (BufferedWriter bfw = new BufferedWriter(new FileWriter(file, true))) {
            bfw.write(newStr + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void fileMerger(String path1, String path2, String path3) {
        File file1 = new File(path1);
        File file2 = new File(path2);
        File mergedFile = new File(path3);
        try (BufferedWriter bfw = new BufferedWriter(new FileWriter(mergedFile))) {
            String line;
            try (BufferedReader bfr1 = new BufferedReader((new FileReader(file1)));) {
                while ((line = bfr1.readLine()) != null) {
                    bfw.write(line + "\n");
                }
            }


            try (BufferedReader bfr2 = new BufferedReader(new FileReader(file2));) {
                while ((line = bfr2.readLine()) != null) {
                    bfw.write(line + "\n");
                }
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

    }

    public static void charChanger(String path, String newPath) {
        File file = new File(path);
        File newFile = new File(newPath);
        try (BufferedReader bfr = new BufferedReader(new FileReader(file))) {
            try (BufferedWriter bfw = new BufferedWriter(new FileWriter(newFile))) {
                String line;
                String newLine = "";
                while ((line = bfr.readLine()) != null) {
                    for (Character c : line.toCharArray()
                    ) {
                        if (Character.isLetter(c) || Character.isDigit(c)) {

                        } else {
                            c = '$';
                        }
                        newLine += c;

                    }

                    bfw.write(newLine + "\n");
                    newLine = "";
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
