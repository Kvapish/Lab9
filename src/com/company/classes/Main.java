package com.company.classes;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        JSONGetter jsonGetter = new JSONGetter();
        JSONGetter.url = "https://api.coincap.io/v2/assets";
        jsonGetter.run();

        System.out.println("Waiting for data...");
        String jsonString = jsonGetter.jsonIn;
        //System.out.println(jsonString);

        JSONObject obj = null;
        try {
            obj = (JSONObject) new JSONParser().parse(jsonString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println();

        JSONArray array = new JSONArray();
        array.add(obj);
        //System.out.println(obj.toJSONString());


        Cryptocurrencys cryptocurrencys = new Cryptocurrencys();

        for (Object jsonObject : array) {
            JSONObject current = (JSONObject) jsonObject;
            ArrayList arrayList = (ArrayList) current.get("data");
            for (Object object : arrayList) {
                JSONObject index = (JSONObject) object;
                String id = (String) index.get("id");
                int rank = Integer.parseInt((String) index.get("rank"));
                String symbol = (String) index.get("symbol");
                String name = (String) index.get("name");
                double supply = Double.parseDouble((String) index.get("supply"));
                String maxSupply = (String) index.get("maxSupply");
                double marketCapUsd = Double.parseDouble((String) index.get("marketCapUsd"));
                double volumeUsd24Hr = Double.parseDouble((String) index.get("volumeUsd24Hr"));
                double priceUsd = Double.parseDouble((String) index.get("priceUsd"));
                double changePercent24Hr = Double.parseDouble((String) index.get("changePercent24Hr"));
                String vwap24Hr = (String) index.get("vwap24Hr");
                String explorer = (String) index.get("explorer");
                Cryptocurrency cryptocurrency = new Cryptocurrency(id, rank, symbol, name, supply, maxSupply, marketCapUsd, volumeUsd24Hr, priceUsd, changePercent24Hr, vwap24Hr, explorer);
                cryptocurrencys.add(cryptocurrency);
            }
        }
        System.out.println(cryptocurrencys);
        cryptocurrencys.getList().sort(Cryptocurrency.byPriceUSD);
        System.out.println("---------------------------------------");
        System.out.println("After sorting by ascending USD:\n" + cryptocurrencys);
        cryptocurrencys.getList().sort(Cryptocurrency.byMarketCapUsd);
        System.out.println("---------------------------------------");
        System.out.println("After sorting by Market Cap USD:\n" + cryptocurrencys);
        cryptocurrencys.getList().sort(Cryptocurrency.byVolumeUsd24H);
        System.out.println("---------------------------------------");
        System.out.println("After sorted by sales volume USD 24 hours:\n" + cryptocurrencys);
    }
}



