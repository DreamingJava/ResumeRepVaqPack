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
public class ResumeEducation {

    private int id;
    private int userId;
    private String collegeName;
    private String degree;
    private String subject;
    private String year;
    private String board;
    private String obtainedMarks;
    private String totalMarks;
    private String percentage;

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
     * @return the collegeName
     */
    public String getCollegeName() {
        return collegeName;
    }

    /**
     * @param collegeName the collegeName to set
     */
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    /**
     * @return the degree
     */
    public String getDegree() {
        return degree;
    }

    /**
     * @param degree the degree to set
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the board
     */
    public String getBoard() {
        return board;
    }

    /**
     * @param board the board to set
     */
    public void setBoard(String board) {
        this.board = board;
    }

    /**
     * @return the obtainedMarks
     */
    public String getObtainedMarks() {
        return obtainedMarks;
    }

    /**
     * @param obtainedMarks the obtainedMarks to set
     */
    public void setObtainedMarks(String obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }

    /**
     * @return the totalMarks
     */
    public String getTotalMarks() {
        return totalMarks;
    }

    /**
     * @param totalMarks the totalMarks to set
     */
    public void setTotalMarks(String totalMarks) {
        this.totalMarks = totalMarks;
    }

    /**
     * @return the percentage
     */
    public String getPercentage() {
        return percentage;
    }

    /**
     * @param percentage the percentage to set
     */
    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String toString() {
        return "Educational {id=" + this.id + ",school=" + this.collegeName 
                + ", degree=" + this.degree + ", subject=" + this.subject 
                + ", year=" + this.year + ", board=" + this.board 
                + ", obtainedMarks=" + this.obtainedMarks + ", totalMarks="
                + this.totalMarks + " }";
    }
}
