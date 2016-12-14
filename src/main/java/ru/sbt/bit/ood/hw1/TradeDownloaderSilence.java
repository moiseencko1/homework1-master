package ru.sbt.bit.ood.hw1;

/**
 * Created by Acer on 02.12.2016.
 */
public class TradeDownloaderSilence implements TradeDownloader {
    public String downloadTrades() {
        System.out.println("file downloaded successfully");
        return null;
    }
}
