package com.afeibaili.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 读取文件类
 *
 * @author AfeiB
 * {@code @date}2024/11/8 下午2:14
 */

public class GetFile {
    private static final InputStreamReader __firstname;
    private static final InputStreamReader __lastname;
    private static final InputStreamReader __chineseFirstname;
    private static final InputStreamReader __chineseLastname;
    public static BufferedReader firstname;
    public static BufferedReader lastname;
    public static BufferedReader chineseFirstname;
    public static BufferedReader chineseLastname;
    private static InputStream _firstname;
    private static InputStream _lastname;
    private static InputStream _chineseFirstname;
    private static InputStream _chineseLastname;

    static {
        try {
            _firstname = ClassLoader.getSystemResourceAsStream("firstname.txt");
            _lastname = ClassLoader.getSystemResourceAsStream("lastname.txt");
            _chineseFirstname = ClassLoader.getSystemResourceAsStream("姓.txt");
            _chineseLastname = ClassLoader.getSystemResourceAsStream("名.txt");

            __firstname = new InputStreamReader(_firstname);
            __lastname = new InputStreamReader(_lastname);
            __chineseFirstname = new InputStreamReader(_chineseFirstname);
            __chineseLastname = new InputStreamReader(_chineseLastname);

            firstname = new BufferedReader(__firstname);
            lastname = new BufferedReader(__lastname);
            chineseFirstname = new BufferedReader(__chineseFirstname);
            chineseLastname = new BufferedReader(__chineseLastname);

            NameSplice.firstnames = firstname.lines().toArray(String[]::new);
            NameSplice.lastnames = lastname.lines().toArray(String[]::new);
            NameSplice.chineseFirstnames = chineseFirstname.lines().toArray(String[]::new);
            NameSplice.chineseLastnames = chineseLastname.lines().toArray(String[]::new);
        } finally {
            try {
                if (_firstname != null) _firstname.close();
            } catch (IOException e) {
//                throw new RuntimeException(e);
            }
            try {
                if (lastname != null) lastname.close();
            } catch (IOException e) {
//                throw new RuntimeException(e);
            }
            try {
                if (chineseFirstname != null) chineseFirstname.close();
            } catch (IOException e) {
//                throw new RuntimeException(e);
            }
            try {
                if (chineseLastname != null) chineseLastname.close();
            } catch (IOException e) {
//                throw new RuntimeException(e);
            }

            try {
                if (firstname != null) firstname.close();
            } catch (IOException e) {
//                throw new RuntimeException(e);
            }
            try {
                if (_lastname != null) _lastname.close();
            } catch (IOException e) {
//                throw new RuntimeException(e);
            }
            try {
                if (_chineseFirstname != null) _chineseFirstname.close();
            } catch (IOException e) {
//                throw new RuntimeException(e);
            }
            try {
                if (_chineseLastname != null) _chineseLastname.close();
            } catch (IOException e) {
//                throw new RuntimeException(e);
            }
        }
    }
}
