/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author rajesh
 */
public class GovernmentFundRequest extends WorkRequest {

    private String location;
    private int population;
    private double requestAmount;

    public GovernmentFundRequest(String location, int population, double requestAmount) {
        this.location = location;
        this.population = population;
        this.requestAmount = requestAmount;

    }

    @Override
    public String toString() {
        return location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getRequestAmount() {
        return requestAmount;
    }

    public void setRequestAmount(double requestAmount) {
        this.requestAmount = requestAmount;
    }

}
