/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaqpack;

import java.util.ArrayList;

/**
 *
 * @author OWNER
 */
public class ResumeService {
    
    private final ResumeDatabase databaseConnection = new ResumeDatabase();

        public boolean insertEducationalDetails(ArrayList<ResumeEducation> education) {
        return databaseConnection.insertEducationalDetails(education);
    }
    public ArrayList<ResumeEducation> getEducationDetails() {
        return databaseConnection.getEducationalDetails();
    }
    
}
