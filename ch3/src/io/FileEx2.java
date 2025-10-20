package io;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class FileEx2 {
    public static void main(String[] args) {
        File currDir = new File("c:\\temp");

        // listFiles
        File[] files = currDir.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }

        if (!currDir.exists()) {
            currDir.mkdir(); // make directory
        }

        File dir = new File("c:\\temp\\dir");
        File file1 = new File("c:\\temp\\dir\\file1.txt");
        File file2 = new File("c:\\temp\\file1.txt");
        File file3 = new File("c:\\temp\\file2.txt");

        if (!dir.exists())
            dir.mkdir();
        try {
            if (!file1.exists())
                file1.createNewFile();

            if (!file2.exists())
                file2.createNewFile();

            if (!file3.exists())
                file3.createNewFile();
        } catch (IOException e) {

            e.printStackTrace();
        }

        // currDir의 파일 리스트 불러오기
        files = currDir.listFiles();

        // a : am/pm
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");

        // sdf. format(new Date(file.lastModifide()))
        // file.lastModified() : long
        // 12346692113336333 =>

        // 날짜 형식
        // 1. java.util.Date
        // new Date() =>
        // 2. java.time.LocalDate
        // LocalDate.ofEpochDay(0)

        System.out.println("\t날짜\t시간\t형태\t\t크기\t이름");
        System.out.println("========================================================");
        for (File file : files) {
            // file.lastModified() 파일의 최종 수정일
            System.out.print(sdf.format(new Date(file.lastModified())));
            if (file.isDirectory()) {
                System.out.println("\t<DIR>\t\t" + file.getName());
            } else {
                System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }

    }
}
