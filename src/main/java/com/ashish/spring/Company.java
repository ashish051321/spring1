package com.ashish.spring;

import java.util.List;
import java.util.Map;

public class Company {
    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    private Employee emp;

    public List getDepartments() {
        return departments;
    }

    public void setDepartments(List departments) {
        this.departments = departments;
    }

    public Map getCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(Map countryCapital) {
        this.countryCapital = countryCapital;
    }

    private List departments;
    private Map countryCapital;

    @Override
    public String toString() {
        return "Company{" +
                "emp=" + emp +
                ", departments=" + departments +
                ", countryCapital=" + countryCapital +
                '}';
    }

}
