package com.afeibaili;

import com.afeibaili.util.NameSplice;

import java.util.Arrays;
import java.util.List;

/**
 * 通过此类的静态方法获取到名字
 *
 * @author AfeiB
 * {@code @date}2024/11/8 下午2:13
 */

public class NameGenerator {
    private static final NameSplice name = new NameSplice();

    /**
     * 调用方法获取一个英文的名字
     *
     * @return 返回一个英文的名字
     */
    public static String getName() {
        return name.getFirstName() + " " + name.getLastName();
    }

    /**
     * 返回一个国人的汉字名字
     *
     * @return 返回一个中文的名字，汉字名字
     */
    public static String getChineseName() {
        return name.getChineseFirstName() + name.getChineseLastName();
    }

    /**
     * 批量获取英文名字，对IO次数交互变少，速度快
     *
     * @param number 要生成的个数
     * @return 返回一个英文名字的集合
     */
    public static List<String> batchGetName(Integer number) {
        if (number == null) return null;
        return Arrays.asList(name.batchGetName(number));
    }

    /**
     * 批量获取中文名字，对IO次数交互变少，速度快
     *
     * @param number 获取名字的个数
     * @return 返回一个中文汉字名字的集合
     */
    public static List<String> batchGetChineseName(Integer number) {
        if (number == null) return null;
        return Arrays.asList(name.batchGetChineseName(number));
    }
}
