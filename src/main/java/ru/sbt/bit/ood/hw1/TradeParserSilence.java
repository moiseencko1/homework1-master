package ru.sbt.bit.ood.hw1;

import java.util.ArrayList;

/**
 * Created by Acer on 02.12.2016.
 */
public class TradeParserSilence implements TradeParser {
    public Iterable<Trade> parse(String filename) {
        System.out.println("file parsed successfully");
        return new ArrayList<Trade>();
    }
}
