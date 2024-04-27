package com.melion.memento.examples.textEditing;

import java.io.*;

public class FileEditor {
    private File file;
    private FileWriter fileWriter;
    private final String FILE_DIR = "src/main/resources/";
    private String path;
    private  FileInputStream fileReader;

    public FileEditor(String path){
        this.path = FILE_DIR + path;
        this.file = new File(this.path);
        try {
            this.fileWriter = new FileWriter(this.file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void createFile() throws IOException {
        if(file.createNewFile())
            System.out.println("File is created successfully with the file name: " + file.getName());
        else
            System.out.println("File wasnt created successfully");
    }

    public void writeToFile(String text)  {
        try {
            fileWriter.write(text);
            fileWriter.close();
            System.out.println(file.getName() + " has been edited successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getFileData(){
        String data = "";

        try {
            int ch;
            fileReader = new FileInputStream(this.file);
            while ((ch = fileReader.read()) != -1){
                data += (char)ch;
            }
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
    public File getFile() {
        return file;
    }
}
