package pl.lublin.wsei.java.cwiczenia.console;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBinCopy {

    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("sample_1920x1280.tiff");
            out = new FileOutputStream("img_copy.tiff");
            int c;
            while ((c=in.read()) !=-1) {
                out .write(c);
            }
        }
        
    }
}
