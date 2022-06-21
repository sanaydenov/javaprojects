package Lesson5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class HomeApp {
    public static void main(String[] args) {
        String[] header = new String[]{"Рост", "Вес", "Возраст"};
        int[][] mydata = new int[][]{{172, 77, 18}, {165, 67, 34}, {180, 99, 36}};
        AppData appData = new AppData(header, mydata);

        try (PrintWriter printWriter = new PrintWriter("data.csv")) {
            printWriter.println(Arrays.toString(appData.getHeader()).split(";"));
            for (int i = 0; i < mydata.length; i++){
                printWriter.println(Arrays.toString(appData.getData()).split(";"));
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data.csv"))) {
            String tempString;
            while ((tempString = bufferedReader.readLine()) != null){
            System.out.println(bufferedReader.readLine());
            }
        }
        catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}