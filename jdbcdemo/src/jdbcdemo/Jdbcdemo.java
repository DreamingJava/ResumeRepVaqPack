/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.sql.*;

/**
 *
 * @author OWNER
 */
public class Jdbcdemo extends Application {
    
    Connection myConn = null;
    Statement myStmt = null;
    ResultSet myRs = null;
    
    String user = "root";
    String pass = "1234";
    
    
    
    @Override
    public void start(Stage primaryStage) throws SQLException {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction((ActionEvent event) -> {
            System.out.println("Hello World!");
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        System.out.println("hi");
        try {
    
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/edu", user, pass);
            
            myStmt = myConn.createStatement();
            
            myRs = myStmt.executeQuery("select * from employees");
            
            while (myRs.next()){
                System.out.println(myRs.getString("last_name") + ", "
                + myRs.getString("first_name"));
            }
        }
        catch (Exception exc){
            exc.printStackTrace();
        }
        finally {
            if (myRs != null){
                myRs.close();
            }
            if (myStmt != null){
                myStmt.close();
            }
            if (myConn != null){
                myConn.close();
            }
        }
    }

    /**     * @param args the command line arguments

     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
