package com.company.classes;

import java.util.Comparator;

public class Cryptocurrency {

    private String id;
    private int rank;
    private String symbol;
    private String name;
    private double supply;
    private String maxSupply;
    private double marketCapUsd;
    private double volumeUsd24Hr;
    private double priceUsd;
    private double changePercent24Hr;
    private String vwap24Hr;
    private String explorer;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSupply() {
        return supply;
    }

    public void setSupply(double supply) {
        this.supply = supply;
    }

    public String getMaxSupply() {
        return maxSupply;
    }

    public void setMaxSupply(String maxSupply) {
        this.maxSupply = maxSupply;
    }

    public double getMarketCapUsd() {
        return marketCapUsd;
    }

    public void setMarketCapUsd(double marketCapUsd) {
        this.marketCapUsd = marketCapUsd;
    }

    public double getVolumeUsd24Hr() {
        return volumeUsd24Hr;
    }

    public void setVolumeUsd24Hr(double volumeUsd24Hr) {
        this.volumeUsd24Hr = volumeUsd24Hr;
    }

    public double getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(double priceUsd) {
        this.priceUsd = priceUsd;
    }

    public double getChangePercent24Hr() {
        return changePercent24Hr;
    }

    public void setChangePercent24Hr(double changePercent24Hr) {
        this.changePercent24Hr = changePercent24Hr;
    }

    public String getVwap24Hr() {
        return vwap24Hr;
    }

    public void setVwap24Hr(String vwap24Hr) {
        this.vwap24Hr = vwap24Hr;
    }

    public String getExplorer() {
        return explorer;
    }

    public void setExplorer(String explorer) {
        this.explorer = explorer;
    }
    public Cryptocurrency(String id,int rank,String symbol,String name,double supply,String maxSupply,double marketCapUsd,double volumeUsd24Hr,double priceUsd,double changePercent24Hr,String vwap24Hr,String explorer) {
        super();
        this.id = id;
        this.rank = rank;
        this.symbol = symbol;
        this.name = name;
        this.supply = supply;
        this.maxSupply = maxSupply ;
        this.marketCapUsd = marketCapUsd;
        this.volumeUsd24Hr = volumeUsd24Hr;
        this.priceUsd = priceUsd;
        this.changePercent24Hr =changePercent24Hr;
        this.vwap24Hr = vwap24Hr ;
        this.explorer = explorer;
    }


    @Override
    public String toString() {
        return "Cryptocurrency{" +'\n'+
                "id=" + id + '\n' +
                "rank=" + rank +'\n' +
                "symbol=" + symbol + '\n' +
                "name=" + name + '\n' +
                "supply=" + supply +'\n'+
                "maxSupply=" + maxSupply +'\n'+
                "marketCapUsd=" + marketCapUsd +'\n'+
                "volumeUsd24Hr=" + volumeUsd24Hr +'\n'+
                "priceUsd=" + priceUsd +'\n'+
                "changePercent24Hr=" + changePercent24Hr +'\n'+
                "vwap24Hr=" + vwap24Hr +'\n'+
                "explorer=" + explorer + '\n' +
                '}';
    }

    public static Comparator<Cryptocurrency> byPriceUSD = (o1, o2) -> o1.priceUsd < o2.priceUsd ? 1 : o1.priceUsd > o2.priceUsd ? -1 : 0;
    public static Comparator<Cryptocurrency> byMarketCapUsd = (o1, o2) -> o1.marketCapUsd < o2.marketCapUsd ? 1 : o1.marketCapUsd > o2.marketCapUsd ? -1 : 0;
    public static Comparator<Cryptocurrency> byVolumeUsd24H = (o1, o2) -> o1.volumeUsd24Hr > o2.volumeUsd24Hr ? 1 : o1.volumeUsd24Hr < o2.volumeUsd24Hr ? -1 : 0;

}
