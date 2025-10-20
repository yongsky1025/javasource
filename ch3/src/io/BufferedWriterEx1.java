package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.nio.Buffer;
import java.util.Scanner;

public class BufferedWriterEx1 {
    public static void main(String[] args) {
        // 키보드에서 입력을 받아서 파일에 출력하는 프로그램 작성
        // q 입력 시 입력받던 걸 중지
        Scanner sc = new Scanner(System.in);
        String input = "";
        System.out.println("파일에 작성할 데이터를 입력해 주세요");
        System.out.println("중지를 원하시면 q를 입력하세요");
        String content = null;

        try {
            FileWriter fw = new FileWriter("c:\\temp\\user.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            do {
                System.out.print(">> ");
                input = sc.nextLine();
                bw.write(input);// content += input;
                bw.newLine();
            } while (!input.equals("q"));

            bw.flush();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
