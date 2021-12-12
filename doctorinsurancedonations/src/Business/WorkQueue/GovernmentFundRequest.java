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
    private int pop;
    private double reqAmt;

    public GovernmentFundRequest(String location, int population, double requestAmount) {
        this.location = location;
        this.pop = population;
        this.reqAmt = requestAmount;

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

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public double getReqAmt() {
        return reqAmt;
    }

    public void setReqAmt(double reqAmt) {
        this.reqAmt = reqAmt;
    }

}
