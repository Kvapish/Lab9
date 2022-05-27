package com.company.classes;

import java.util.ArrayList;


public class Cryptocurrencys {
    public ArrayList<Cryptocurrency> getCryptocurrencys(){
        return cryptocurrencys;
    }
    public Cryptocurrencys(ArrayList<Cryptocurrency> cryptocurrencys) {
        this.cryptocurrencys = cryptocurrencys;
    }
    private ArrayList<Cryptocurrency> cryptocurrencys;
    public Cryptocurrencys() {
        cryptocurrencys = new ArrayList<>();
    }
    public void add(Cryptocurrency cryptocurrency) {
        this.cryptocurrencys.add(cryptocurrency);
    }

    public ArrayList getList() {
        return cryptocurrencys;
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
