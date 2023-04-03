package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 500, message = "Description must be less than or equal to 500 characters")
    private String description;

    @ManyToMany(mappedBy="skills")
    private List<Job> jobs= new ArrayList<>();

    public Skill(){

    }
    public void setJobs(List<Job>jobs){
        this.jobs=jobs;
    }
    public List<Job> getJobs(){
        return this.jobs;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
