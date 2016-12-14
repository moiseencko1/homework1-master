package ru.sbt.bit.ood.hw1;

import org.apache.commons.csv.CSVRecord;

import java.util.List;
import java.util.Map;

public class TradesJob {

    private final TradesDAO tradesDAO;
    private final TradeDownloader tradeDownloader;
    private final TradeParser tradeParser;

    public TradesJob(TradesDAO tradesDAO, TradeDownloader tradeDownloader, TradeParser tradeParser) {
        this.tradesDAO = tradesDAO;
        this.tradeDownloader = tradeDownloader;
        this.tradeParser = tradeParser;
    }

    public void run() {
        String filename = tradeDownloader.downloadTrades();
        Iterable trades = tradeParser.parse(filename);
        updateTrades(trades);
        System.out.println("All perform successfully");
    }

    private void updateTrades(Iterable trades) {
        tradesDAO.deleteAll();
        for (Object trade : trades) {
            tradesDAO.save((Trade) trade);
        }
    }
}
