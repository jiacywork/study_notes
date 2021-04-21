package com.jiacy.app.io.bio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

public class TestRandomAccessFile {

    public static void main(String[] args) throws IOException {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("template/temp_file.txt", "rw")) {
            byte[] data = new byte[1024];
            int count;
            while ((count = randomAccessFile.read(data, 0, data.length)) != -1) {
                System.out.println(new String(data, 0, count, StandardCharsets.UTF_8));
            }
            // 可使用指针，开启多线程下载文件，每个线程下载部门内容，然后进行合并
            // randomAccessFile.seek(0); 将指针移到指定位置
        }
    }

}
