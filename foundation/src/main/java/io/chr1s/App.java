package io.chr1s;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gongqi <qgong92@gmail.com>
 * Created on 2022-04-12
 */
public class App {

    public static void main(String[] args) throws Exception {
//        List<String> allLines = Files.readAllLines(Paths.get("/Users/gongqi/Desktop/no_right_music.txt"));
//        File newFile = new File("/Users/gongqi/Desktop/no_right_music_company.txt");
//        FileWriter musicianWriter = new FileWriter("/Users/gongqi/Desktop/no_right_music_musician.txt");
//        FileWriter musicIdCompanyWriter = new FileWriter("/Users/gongqi/Desktop/no_right_music_id_company.txt");
//        FileWriter writer = new FileWriter(newFile);
//        for (String line : allLines) {
//            System.out.println(line);
//            String[] ss = line.split(",");
//            if (ss[1].endsWith("4")) {
//                writer.write("'" + ss[1] + "'");
//                writer.write(",");
//                musicIdCompanyWriter.write(ss[1].split("\\$")[0] + ",\n");
//            } else {
//                musicianWriter.write("'" + ss[1] + "'");
//                musicianWriter.write(",");
//            }
//
//        }
//        writer.flush();
//        writer.close();
//        musicianWriter.flush();
//        musicianWriter.close();
//        musicIdCompanyWriter.flush();
//        musicIdCompanyWriter.close();

        List<Integer> list = new ArrayList<>();
        list.add(null);
        try {
            list.stream().filter(i -> i > 0).forEach(System.out::println);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
