package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx1 {
    public static void main(String[] args) {
        try {
            // InputStream in = new FileInputStream("c:\\temp\\img1.jpg");
            // BufferedInputStream bis = new BufferedInputStream(in);
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:\\temp\\img1.jpg"));

            // OutputStream out = new FileOutputStream("c:\\temp\\copy3.jpg");
            // BufferedOutputStream bos = new BufferedOutputStream(out);
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:\\temp\\copy3.jpg"));
            int input = 0;
            byte[] bytes = new byte[1024];
            while ((input = bis.read(bytes)) != -1) {
                // System.out.println((char) input);
                bos.write(bytes);

            }

            // in.close();
            bos.flush(); // 버퍼 비우기
            bos.close();
            // out.close();
        } catch (IOException e) { // FileNotFoundException, IOException 처리 가능
            e.printStackTrace();
        }

    }

}
