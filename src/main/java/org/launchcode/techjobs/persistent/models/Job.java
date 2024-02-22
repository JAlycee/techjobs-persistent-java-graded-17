package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Job  extends AbstractEntity{

    @ManyToOne(cascade = CascadeType.ALL)
    @Valid
    private Employer employer;

    @ManyToMany(cascade = CascadeType.ALL)
    @Valid
    private List<Skill> skills = new ArrayList<>();


    public Job() {
    }

    // Initialize the id and value fields.
    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

}