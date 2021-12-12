 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.util.List;

/**
 *
 * @author dineshmurugesan
 */
public abstract class Enterprise extends Organization {

    private EntType entType;
    private OrganizationDirectory orgDir;

    public OrganizationDirectory getOrgDir() {
        return orgDir;
    }

    public enum EntType {

        HealthCenter("HealthCenter"),
        InsuranceCompany("InsuranceCompany"),
        Government("Government"),
        NGO("NGO");

        private String value;

        private EntType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EntType getEntType() {
        return entType;
    }

    public void setEntType(EntType entType) {
        this.entType = entType;
    }

    public Enterprise(String name, EntType type) {
        super(name);
        this.entType = type;
        orgDir = new OrganizationDirectory();
    }
    
    public abstract List<Organization.Type> getAllOrganizationTypes();
}
