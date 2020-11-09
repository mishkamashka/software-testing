package main;

import au.com.bytecode.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import java.util.TreeMap;

public class ResultPrinter {

    interface FunctionInterface {
        double calculate(double x);
    }

    private static TreeMap<Double, Double> getValues(FunctionInterface method, double step, double startAt, double endAt){
        TreeMap<Double, Double> values = new TreeMap<>();
        for (double i = startAt; i <= endAt; i += step)
            values.put(i, method.calculate(i));

        return values;
    }

    public static void print(FunctionInterface method, double step, double startAt, double endAt, String fileName){

        TreeMap<Double, Double> values = getValues(method, step, startAt, endAt);

        File file = new File(fileName);
        try {
            FileWriter fileWriter = new FileWriter(file);
            CSVWriter csvWriter = new CSVWriter(fileWriter);
            String[] header = { "x", "y" };
            csvWriter.writeNext(header);

            for(Map.Entry<Double, Double> entry : values.entrySet()) {
                String[] str = { Double.toString(entry.getKey()), Double.toString(entry.getValue()) };
                csvWriter.writeNext(str);
            }

            csvWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
