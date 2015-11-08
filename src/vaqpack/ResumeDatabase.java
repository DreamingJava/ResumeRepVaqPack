/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaqpack;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.*;

/**
 *
 * @author OWNER
 */
public class ResumeDatabase {

    private static Connection myCon = null;
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String DATABASE_NAME = "resumedatabase";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/"
            + ResumeDatabase.DATABASE_NAME;
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "1234";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER_NAME);
            myCon = (Connection) DriverManager.getConnection(
                    DB_URL, USER_NAME, PASSWORD);
            return myCon;
        } catch (ClassNotFoundException cne) {
            System.out.println(cne);
        } catch (SQLException sqle) {
            System.out.println(sqle.toString());
        }
        return myCon;
    }

    public void closeConnection() {
        try {

            if (myCon != null) {
                myCon.close();
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.toString());
        }
    }

    public boolean insertEducationalDetails(ArrayList<ResumeEducation> education) {
        for (ResumeEducation edu : education) {
            if (!insertEducationalDetails(edu)) {
                return false;
            }
        }
        return true;
    }

    public boolean insertEducationalDetails(ResumeEducation education) {
        String SQL = "INSERT INTO eductional_details (name, degree, "
                + "subject, year, board_or_university, "
                + "obtained_marks, total_marks,percentage) "
                + "VALUES('"
                + education.getCollegeName()
                + "','"
                + education.getDegree()
                + "','"
                + education.getSubject()
                + "', '"
                + education.getYear()
                + "','"
                + education.getBoard()
                + "', '"
                + education.getObtainedMarks()
                + "', '"
                + education.getTotalMarks()
                + "', '"
                + education.getPercentage()
                + "')";
        System.out.println("SQL >> " + SQL);
        myCon = getConnection();
        boolean result = Boolean.FALSE;
        try {
            if (myCon != null) {
                Statement stmt = myCon.createStatement();
                int update = stmt.executeUpdate(SQL);
                if (update > 0) {
                    result = Boolean.TRUE;
                }
                closeConnection();
            } else {
                System.out.println("Connection is null in insertEducationalDetails");
            }
        } catch (SQLException sqle) {
            System.out.println("sqle in insertEducationalDetails - " + sqle);
        }
        return result;
    }
    
    public boolean insertAchievements(ArrayList<ResumeAchievements> achievements) {
		for(ResumeAchievements achieve : achievements)
		{
			if(!insertAchievement(achieve))
				return false;
		}
		return true;
	}

	public boolean insertAchievement(ResumeAchievements achievement) {
		String SQL = "insert into achievement(name, title, place, ach_date)"
				+ " values ('"
				+ achievement.getName()
				+ "','"
				+ achievement.getTitle()
				+ "','"
				+ achievement.getPlace()
				+ "','" +
				achievement.getDate()
				+ "')";
		System.out.println("SQL >> " + SQL);
		boolean result = false;
		myCon = getConnection();
		try {
			if (myCon != null) {
				Statement stmt = myCon.createStatement();
				int update = stmt.executeUpdate(SQL);
				if (update > 0) {
					result = Boolean.TRUE;
				}
				closeConnection();
			} else {
				System.out.println("Connection is null in insertAchievement");
			}
		} catch (SQLException sqle) {
			System.out.println("sqle in insertAchievement - " + sqle);
		}
		return result;
	}
        
    public boolean insertExperiences(ArrayList<ResumeExperience> experience) {
		for(ResumeExperience exp : experience)
		{
			if(!insertExperienceDetails(exp))
				return false;
		}
		return true;
	}

	public boolean insertExperienceDetails(ResumeExperience experience) {
		String SQL = "INSERT INTO experience (employer, designation, "
				+ "joining_date, leaving_date, work, experience) "
				+ "VALUES('"
				+ experience.getEmployer()
				+ "', '"
				+ experience.getDesignation()
				+ "', '"
				+ experience.getJoiningDate()
				+ "', '"
				+ experience.getLeavingDate()
				+ "', '"
				+ experience.getWorking()
				+ "', '"
				+ experience.getExperience()
				+ "')";
		System.out.println("SQL >> " + SQL);
		myCon = getConnection();
		boolean result = Boolean.FALSE;
		try {
			if (myCon != null) {
				Statement st = myCon.createStatement();
				int update = st.executeUpdate(SQL);
				if (update > 0)
					result = Boolean.TRUE;
				closeConnection();
			} else {
				System.out
						.println("Connection is null in insertExperienceDetails");
			}
		} catch (SQLException sqle) {
			System.out.println("sqle in insertExperienceDetails - " + sqle);
		}
		return result;
	}
        
        public ArrayList<ResumeEducation> getEducationalDetails() {
		String SQL = "SELECT * FROM eductional_details";
		System.out.println("SQL >> " + SQL);
		myCon = getConnection();
		ArrayList<ResumeEducation> results = new ArrayList<>();
		try {
			if (myCon != null) {
				Statement stmt = myCon.createStatement();
				ResultSet rs = stmt.executeQuery(SQL);
				while (rs.next()) {
					ResumeEducation result = new ResumeEducation();
					result.setCollegeName(rs.getString("name"));
					result.setDegree(rs.getString("degree"));
					result.setSubject(rs.getString("subject"));
					result.setYear(rs.getString("year"));
					result.setBoard(rs.getString("board_or_university"));
					result.setObtainedMarks(rs.getString("obtained_marks"));
					result.setTotalMarks(rs.getString("total_marks"));
					result.setPercentage(rs.getString("percentage"));
					results.add(result);
				}
				closeConnection();
			} else {
				System.out.println("Connection is null in getEducationalDetails");
			}
		} catch (SQLException sqle) {
			System.out.println("sqle in getEducationalDetails - " + sqle);
		}
		return results;
	}
        
        public ArrayList<ResumeExperience> getExperienceDetails() {
		String SQL = "SELECT * FROM experience";
		System.out.println("SQL >> " + SQL);
		myCon = getConnection();
		ArrayList<ResumeExperience> results = new ArrayList<>();
		try {
			if (myCon != null) {
				Statement st = myCon.createStatement();
				ResultSet rs = st.executeQuery(SQL);
				while (rs.next()) {
					ResumeExperience result = new ResumeExperience();
					result.setEmployer(rs.getString("employer"));
					result.setDesignation(rs.getString("designation"));
					result.setJoiningDate(rs.getString("joining_date"));
					result.setLeavingDate(rs.getString("leaving_date"));
					result.setWorking(rs.getString("work"));
					result.setExperience(rs.getString("experience"));
					results.add(result);
				}
				closeConnection();
			} else {
				System.out
						.println("Connection is null in getExperienceDetails");
			}
		} catch (SQLException sqle) {
			System.out.println("sqle in getExperienceDetails - " + sqle);
		}
		return results;
	}
        
        public ArrayList<ResumeAchievements> getAchievementDetails() {
		ArrayList<ResumeAchievements> achievementDetails = new ArrayList<>(0);
		String SQL = "select * from achievement";
		myCon = getConnection();
		try {
			if (myCon != null) {
				Statement st = myCon.createStatement();
				ResultSet rs = st.executeQuery(SQL);
				while (rs.next()) {
					ResumeAchievements achieve = new ResumeAchievements();
					achieve.setName(rs.getString("name"));
					achieve.setTitle(rs.getString("title"));
					achieve.setPlace(rs.getString("place"));
					achieve.setDate(rs.getString("ach_date"));
					achievementDetails.add(achieve);
				}
				closeConnection();
			} else {
				System.out.println("Conection null in getAchievementDetails");
			}
		} catch (Exception e) {
			System.out.print("Error in getAchievementDetails- " + e);
		}

		return achievementDetails;
	}
}
