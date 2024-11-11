package com.afeibaili.util;

import java.util.Random;

/**
 * 拼接姓和名
 *
 * @author AfeiB
 * {@code @date}2024/11/8 下午2:24
 */

public class NameSplice {
    public static final Random randomNumber = new Random();
    static String[] firstnames;
    static String[] lastnames;
    static String[] chineseFirstnames;
    static String[] chineseLastnames;

    static {
        try {
            Class.forName("com.afeibaili.util.GetFile");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String getFirstName() {
        return firstnames[randomNumber.nextInt(firstnames.length)];
    }

    public String getLastName() {

        return lastnames[randomNumber.nextInt(lastnames.length)];
    }

    public String getChineseFirstName() {
        return chineseFirstnames[randomNumber.nextInt(chineseFirstnames.length)];
    }

    public String getChineseLastName() {
        return chineseLastnames[randomNumber.nextInt(chineseLastnames.length)];
    }

    public String[] batchGetName(Integer number) {
        String[] array = new String[number];
        for (int i = 0; i < number; i++) {
            array[i] = firstnames[randomNumber.nextInt(firstnames.length)] + " "
                    + lastnames[randomNumber.nextInt(lastnames.length)];
        }
        return array;
    }

    public String[] batchGetChineseName(Integer number) {
        String[] array = new String[number];
        for (int i = 0; i < number; i++) {
            array[i] = chineseFirstnames[randomNumber.nextInt(chineseFirstnames.length)] +
                    chineseLastnames[randomNumber.nextInt(chineseLastnames.length)];
        }
        return array;
    }
}
