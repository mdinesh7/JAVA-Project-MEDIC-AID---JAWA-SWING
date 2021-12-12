/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Insurance;

/**
 *
 * @author bunty
 */
public class Insurance {

    private String plcyNm;
    private String InsCmpny;
    private double cvrg;
    private String plcyTC;
    private double monthlyPrm;

    public Insurance(String policyName, String InsuranceCompany, double coverage) {
        this.plcyNm = policyName;
        this.InsCmpny = InsuranceCompany;
        this.cvrg = coverage;
    }

    public String getPlcyNm() {
        return plcyNm;
    }

    public void setPlcyNm(String policyType) {
        this.plcyNm = policyType;
    }

    public double getMonthlyPrm() {
        return monthlyPrm;
    }

    public void setMonthlyPrm(double monthlyPrm) {
        this.monthlyPrm = monthlyPrm;
    }

    public String getInsCmpny() {
        return InsCmpny;
    }

    public void setInsCmpny(String InsCmpny) {
        this.InsCmpny = InsCmpny;
    }

    public double getCvrg() {
        return cvrg;
    }

    public void setCvrg(double cvrg) {
        this.cvrg = cvrg;
    }

    public String getPlcyTC() {
        return plcyTC;
    }

    public void setPlcyTC(String plcyTC) {
        this.plcyTC = plcyTC;
    }

    @Override
    public String toString() {
        return plcyNm;
    }

}
