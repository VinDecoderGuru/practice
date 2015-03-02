package com.problems;

import java.io.*;
import java.util.*;

/**
 *
 * Write a program to read words from a file. Count the repeated or duplicated words.
 * Sort it by maximum repeated or duplicated word count.
 *
 *
 * Created by vinay.pawar on 2/10/15.
 */
public class FindMaxWordCountFromFile {

    public static String fileLocation = "/Users/vinay.pawar/Vinay/Personal/Mission Impossible/Code/practice/resources/";
    public static String fileName = "FindMAxWordCountFile";

    public Map<String,Integer> FindMaxWordCountFromFile(File file) throws IOException {
        Map<String,Integer> dubplicateWords = new HashMap<String, Integer>();
        if(file != null) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = null;
                while ((line = br.readLine()) != null) {
                    String [] lineWords = line.split(" ");
                    for(int i = 0 ; i< lineWords.length;i++) {
                        if(dubplicateWords.containsKey(lineWords[i])) {
                            int count = dubplicateWords.get(lineWords[i]);
                            dubplicateWords.put(lineWords[i],count+1);
                        } else {
                            dubplicateWords.put(lineWords[i],1);
                        }
                    }
                }
                br.close();

            } catch (FileNotFoundException e) {
                System.out.println("Error happened while processing file, "+e.getMessage());
            }
        }
        return dubplicateWords;
    }

    public static void main(String[] args) {
        try {
            File file = new File(FindMaxWordCountFromFile.fileLocation+FindMaxWordCountFromFile.fileName);
            Map<String,Integer>  dubplicateWords = new FindMaxWordCountFromFile().FindMaxWordCountFromFile(file);
            Set<String> keys = dubplicateWords.keySet();
            Iterator<String> keyIter = keys.iterator();
            while (keyIter.hasNext()) {
                String word = keyIter.next();
                Integer wordCount = dubplicateWords.get(word);
                if(wordCount > 1) {
                    System.out.println("'"+word+"' \t\t appeard "+wordCount+" times");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
