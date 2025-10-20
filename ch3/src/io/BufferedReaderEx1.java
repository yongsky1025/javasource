package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderEx1 {
    public static void main(String[] args) {
        try {
            // InputStream in = new FileInputStream("c:\\temp\\file1.txt");
            // InputStreamReader reader = new InputStreamReader(in, "utf8");
            // BufferedReader br = new BufferedReader(reader);
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream("c:\\temp\\file1.txt"), "utf8"));

            // Writer out = new FileWriter("c:\\temp\\output5.txt");
            // BufferedWriter bw = new BufferedWriter(out);
            BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\output5.txt"));

            String input = null;

            while ((input = br.readLine()) != null) {
                bw.write(input);
                bw.newLine(); // 엔터

            }
            // in.close();
            bw.flush(); // 버퍼 비우기
            bw.close();
            // out.close();
        } catch (IOException e) { // FileNotFoundException, IOException 처리 가능
            e.printStackTrace();
        }

    }

}
