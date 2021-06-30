package apiNeedToReadCareFully.IO;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {
        //method1();
        GuessStatisticsMessage gsm = new GuessStatisticsMessage();
        String me = gsm.make('b', 4);
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

    // 可变参数
    public String format(String format, Object... args) {
        return format;
    }

    public String monad(Integer... args) {
        return "";
    }

    public String triad(String name, int count, Integer... args) {
        return "";
    }

//    public static void deletePageAndAllReferences(Page page) {
//            deletePage(page);
//            registry.deleteReferences(page.name);
//            configKeys.deleteKey(page.name.makeKey());
//    }
//
//    public void delete(Page page) {
//        try {
//            deletePageAndAllReferences(page);
//        } catch (Exception e) {
//            logError(e);
//        }
//    }
//    private void logError(Exception e) {
//        logger.log(e.getMessage());
//    }


}