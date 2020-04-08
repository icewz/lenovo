package apiNeedToReadCareFully.IO;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        method1();
    }

    /**
     * read File contents
     *
     * @throws IOException
     */
    public static void method1() throws IOException {
        File f = new File("D:" + File.separator + "test.txt");
        InputStream input = null;
        input = new FileInputStream(f);
        byte b[] = new byte[1024];
        input.read(b);
        input.close();
        System.out.println("q:" + new String(b));
    }
}
