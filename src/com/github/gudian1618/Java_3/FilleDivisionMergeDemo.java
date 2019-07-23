package com.github.gudian1618.Java_3;

import java.io.File;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-07-23 22:49
 * @description
 */

public class FilleDivisionMergeDemo {

    // 文件的分割
    private static void division(File targetFile, long cutsize) {

        if (targetFile==null) return;
        // 计算总分割的文件数
        int num = targetFile.length()%cutsize==0?
            (int)(targetFile.length()/cutsize):
            (int)(targetFile.length()/cutsize+1);
        // 构造一个文件输入流
    }

    // 文件的合并
    private static void merge() {

    }

    public static void main(String[] args) {

        File file = new File("/Users/zyd/IdeaProjects/Test/src/com/github" +
            "/gudian1618/Java_3/a.mp4");

    }

}
