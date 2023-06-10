package oop1.Song04_PackageAndImport;

/*
@User   jianqiang
@Create 2023/4/30 0:55 周日 星期日

@Description
*/

import java.lang.System;
import java.lang.String;

import oop1.Song02_Method_overload.OverLoad;

public class PackageImportTest {
    public static void main(String[] args) {
        OverLoad ol = new OverLoad();
        System.out.println(ol.concat("_", "Package", "Import"));

        // 全类名
        // java.sql.Date date1;            // 声明
        // date1 = new java.sql.Date();    // 赋值

    }
}
