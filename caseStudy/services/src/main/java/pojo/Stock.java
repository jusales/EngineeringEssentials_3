/**
 * Copyright 2018 Goldman Sachs.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package pojo;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.Date;

/**
 * This class will define a company's end-of-day stock price
 * Look at resources/data/historicalStockData.json
 */
public class Stock {

    private static Map<String, Map<String, Double>> stockData;

    // TODO - Think back to your modelling session
    // Define the attributes of a stock price based on the
    // provided data in resources/data

    // TODO - add getter and setter methods for your attributes

    public Stock() {
        JSONParser parser = new JSONParser();
        JSONArray array = (JSONArray) parser.parse(new FileReader("resources/data/historicalStockData.json"));
        this.stockData = new HashMap<String, Map<String, Double>>();

        //loop that reads name and associated information to place in a map
        for (Object o : array) {
            JSONObject stock = (JSONObject) o;
            String name = (String) stock.get("name");
            JSONArray prices = (JSONArray) stock.get("dailyClosePrice");
            Map<String, Double> stockPrices = new ObjectMapper().readValue(((JSONObject) prices.get(0), HashMap.class);

            stockData.put(name, stockPrices);
        }
    }

    public Map<String, Double> getDates(String name) {
        if (!stockData.containsKey(name)) {
            throw new IllegalArgumentException();
        }
        retun stockData.getKey(name);
    }

    public List<Double> getPricesInRange(String name, String startDate, String endDate) {

        Map<String, Double> stockDates = stockData.get(name);
        List<Double> prices = new ArrayList<Double>();
        String[] startInfo = startDate.split("/");
        String[] endInfo = endDate.split("/");
        Date start = new Date(startInfo[2], startInfo[1], startInfo[0]);
        Date end = new Date(endInfo[2], endInfo[1], endInfo[0]);

        for (String date : stockDates.keySet()) {
            String[] dateInfo = date.split("/");
            Date currentDate = new Date(dateInfo[2], dateInfo[1], dateInfo[0]);
            if ((currentDate.after(start) || currentDate.equals(start)) && (currentDate.before(end) || currentDate.equals(end)) {
                prices.add(stockDates.get(date));
            }

        }
        return prices;     
    }
    
}