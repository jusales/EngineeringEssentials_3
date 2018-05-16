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

/**
 * This class will define a company and its attributes
 * Look at resources/data/companyInfo.json
 */
public class Company {

    // TODO - Think back to your modelling session
    // Define the attributes of a Company based on the
    // provided data in resources/data
    private String symbol;
    private String name;
    private String headquartersCity;
    private String headquartersStateOrCountry;
    private String numberOfEmployees;
    private String sector;
    private String industry;

    public Company(symbol, name, headquartersCity, headquartersStateOrCountry, numberOfEmployees, sector, industry) {
        this.symbol = symbol;
        this.name = name;
        this.headquartersCity = headquartersCity;
        this.headquartersStateOrCountry = headquartersStateOrCountry;
        this.numberOfEmployees = numberOfEmployees;
        this.sector = sector;
        this.industry = industry;
    }

    // TODO - add getter and setter methods for your attributes
    // hello there

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(name) {
        this.name = name;
    }

    public String getHeadquartersCity() {
        return headquartersCity;
    }

    public void setHeadquartersCity(headquartersCity) {
        this.headquartersCity = headquartersCity;
    }

    public String getHeadquartersStateOrCountry() {
        return headquartersStateOrCountry;
    }

    public void setHeadquartersStateOrCountry(headquartersStateOrCountry) {
        this.headquartersStateOrCountry = headquartersStateOrCountry;
    }

    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    public String getSector() {
        return sector;
    }

    public void setSector(sector) {
        this.sector = sector;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(industry) {
        this.industry = industry;
    }

    

}