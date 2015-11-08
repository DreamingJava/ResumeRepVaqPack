/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaqpack;

/**
 *
 * @author OWNER
 */
public class ResumeExperience {

    private int id;
    private int userId;
    private String employer;
    private String designation;
    private String joiningDate;
    private String leavingDate;
    private String working;
    private String experience;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the employer
     */
    public String getEmployer() {
        return employer;
    }

    /**
     * @param employer the employer to set
     */
    public void setEmployer(String employer) {
        this.employer = employer;
    }

    /**
     * @return the designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * @param designation the designation to set
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * @return the joiningDate
     */
    public String getJoiningDate() {
        return joiningDate;
    }

    /**
     * @param joiningDate the joiningDate to set
     */
    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    /**
     * @return the leavingDate
     */
    public String getLeavingDate() {
        return leavingDate;
    }

    /**
     * @param leavingDate the leavingDate to set
     */
    public void setLeavingDate(String leavingDate) {
        this.leavingDate = leavingDate;
    }

    /**
     * @return the working
     */
    public String getWorking() {
        return working;
    }

    /**
     * @param working the working to set
     */
    public void setWorking(String working) {
        this.working = working;
    }

    /**
     * @return the experience
     */
    public String getExperience() {
        return experience;
    }

    /**
     * @param experience the experience to set
     */
    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String toString() {
        return "Experience {id=" + this.id + ", employer=" + this.employer
                + ", designation=" + this.designation + ", joiningDate=" 
                + this.joiningDate + ", leavingDate=" + this.leavingDate 
                + ", working=" + this.working + ", experience="
                + this.experience;
    }

}
