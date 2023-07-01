package com.example.java;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.stream.Stream;

/**
 * This is code to get <b>xml</b> data from <i>URL</i>
 */
public class Main {

    private static final String FLOWERS_FEED =
            "http://services.hanselandpetal.com/feeds/flowers.xml";

    /**
     *
     * @param args - String to pass
     * @throws IOException - exception e
     */
    public static void main(String[] args) throws IOException {
            InputStream stream = null;
            BufferedInputStream buf = null ;

        try {
            URL url = new URL(FLOWERS_FEED);
            stream = url.openStream();
            buf = new BufferedInputStream(stream);

            StringBuilder sb = new StringBuilder();
            while (true){
                int data = buf.read();
                if(data==-1){
                    break;
                }else {
                    sb.append((char) data);
                }
            }
            System.out.println(sb);
        } finally {
            stream.close();
            buf.close();
        }

    }

}
