package apiNeedToReadCareFully.IO;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {
        //method1();
        GuessStatisticsMessage gsm = new GuessStatisticsMessage();
        String me = gsm.make('b',4);
        System.out.println(me);
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

//    public List<Cell> getFlaggedCellls() {
//        List<Cell> flaggedCells = new ArrayList<Cell>();
//        for (Cell cell : gameBoard)
//            if (cell.isFlagged())
//                flaggedCells.add(cell);
//        return flaggedCells;
//    }

    public static void copyChars(char source[], char destination[]) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }
}
