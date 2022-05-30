package com.company.classes;

import java.util.ArrayList;
import java.util.Locale;


public class Cryptocurrencys {
    private final ArrayList<Cryptocurrency> cryptocurrencys;

    public Cryptocurrencys(ArrayList<Cryptocurrency> cryptocurrencys) {
        this.cryptocurrencys = cryptocurrencys;
    }

    public Cryptocurrencys() {
        cryptocurrencys = new ArrayList<>();

    }

    public ArrayList<Cryptocurrency> getCryptocurrencys() {
        return cryptocurrencys;
    }

    public void add(Cryptocurrency cryptocurrency) {
        this.cryptocurrencys.add(cryptocurrency);
    }

    public ArrayList getList() {
        return cryptocurrencys;
    }

    public ArrayList getList(String currencyname) {
        ArrayList<Cryptocurrency> crypto = new ArrayList<>();
        for (Cryptocurrency currency : cryptocurrencys) {
            if (currency.getName().toUpperCase().contains(currencyname.toUpperCase())) {
                crypto.add(currency);
            }
        }
        return crypto;
    }

    @Override
    public String toString() {
        String result = "";
        for (Cryptocurrency c : cryptocurrencys) {
            result += c + System.lineSeparator();
        }
        return result;
    }
}
