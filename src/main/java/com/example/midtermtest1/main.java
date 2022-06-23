package com.example.midtermtest1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("tableView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Students");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        //DBUtility.getStudentFromDB();
        launch();
    }
}