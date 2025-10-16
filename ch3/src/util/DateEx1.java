package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {
    public static void main(String[] args) {
        // 시스템 날짜와 시간 가져오기
        Date date = new Date();
        System.out.println(date); // Thu Oct 16 15:49:19 KST 2025

        // yyyy : year => 년도
        // MM : Month => 월
        // dd : day => 일
        // hh : hour => 시
        // mm : minute => 분
        // ss : second => 초
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        System.out.println(sdf.format(date));
    }
}
