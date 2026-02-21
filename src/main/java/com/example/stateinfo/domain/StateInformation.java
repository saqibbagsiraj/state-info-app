package com.example.stateinfo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "state_information")
public class StateInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "state_name")
    private String stateName;

    private String capital;
    private Long population;
    private Double area;

    @Column(name = "literacy_rate")
    private Double literacyRate;

    private String language;

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStateName() { return stateName; }
    public void setStateName(String stateName) { this.stateName = stateName; }

    public String getCapital() { return capital; }
    public void setCapital(String capital) { this.capital = capital; }

    public Long getPopulation() { return population; }
    public void setPopulation(Long population) { this.population = population; }

    public Double getArea() { return area; }
    public void setArea(Double area) { this.area = area; }

    public Double getLiteracyRate() { return literacyRate; }
    public void setLiteracyRate(Double literacyRate) { this.literacyRate = literacyRate; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }
}