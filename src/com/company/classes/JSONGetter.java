package com.company.classes;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

public class JSONGetter extends Thread {
    public String jsonIn;
    public static String url;

    private String readAll(Reader reader) throws IOException {
        StringBuilder stringbuilder = new StringBuilder();
        int index;
        while ((index = reader.read()) != -1) {
            stringbuilder.append((char) index);
        }
        return stringbuilder.toString();
    }

    public String ConnectAndGetData() {
        jsonIn = "";
        InputStream inputstream = null;
        try {
            inputstream = new URL(url).openStream();
            try {
                BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream, Charset.forName("UTF-8")));
                try {
                    jsonIn = readAll(bufferedreader);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } finally {
                try {
                    inputstream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonIn;
    }
    public void run(){
        ConnectAndGetData();
        super.run();
    }

}