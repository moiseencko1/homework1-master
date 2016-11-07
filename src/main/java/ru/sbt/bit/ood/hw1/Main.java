package ru.sbt.bit.ood.hw1;

/**
 * Created by Acer on 13.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        TradesJob tr = new TradesJob(new TradesDAO(), new TradeDownloaderFromFTP(), new TradeCSVParser());
        tr.run();
    }
}
