package ru.sbt.bit.ood.hw1;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Acer on 13.10.2016.
 */
public class TradeCSVParser implements TradeParser {
    public Iterable<Trade> parse(String filename) {
        try {
            Reader in = new FileReader(filename);
            Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
            List trades = new ArrayList();
            for (CSVRecord record : records) {
                Trade trade = new Trade(record.toMap());
                trades.add(trade);
            }
            return trades;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("There was an error while parsing CSV file");
        }
    }
}
