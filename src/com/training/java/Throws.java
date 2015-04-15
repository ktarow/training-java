package com.training.java;

import java.io.IOException;
import java.io.File;

/**
 * Created by ktaro on 2015/04/12.
 */
public class Throws {
    public static void main(String[] args) {
        try {
            createFile();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static  void createFile() throws IOException {
        File file = new File("test.txt");

        if(file.createNewFile()){
            System.out.printf("Fileを作成しました");
        }else{
            throw new IOException("Fileの作成に失敗しました");
        }
    }
}
