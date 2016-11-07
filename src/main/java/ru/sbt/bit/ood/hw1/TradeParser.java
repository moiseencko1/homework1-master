package ru.sbt.bit.ood.hw1;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by Acer on 31.10.2016.
 */
public interface TradeParser {
    Iterable<Trade> parse(String filename);
}
