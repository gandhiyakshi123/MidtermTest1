package com.example.midtermtest1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentTableViewController implements Initializable {

    @FXML
    private TableColumn<Student, Integer> avgGradeColumn;

    @FXML
    private TableColumn<Student, String> firstNameColumn;

    @FXML
    private TableColumn<Student, String> genderColumn;

    @FXML
    private TableColumn<Student, String> lastNameColumn;

    @FXML
    private TableColumn<Student, String> majorColumn;

    @FXML
    private TableColumn<Student, String> provinceColumn;

    @FXML
    private TableColumn<Student, Integer> studentNumColumn;

    @FXML
    private TableColumn<Student, String> telephoneColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        // configure the columns to know where to get the information from the Student object
        studentNumColumn.setCellValueFactory(new PropertyValueFactory<>("studentNum"));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        genderColumn.setCellValueFactory(new PropertyValueFactory<>("gender"));
        telephoneColumn.setCellValueFactory(new PropertyValueFactory<>("telephone"));
        provinceColumn.setCellValueFactory(new PropertyValueFactory<>("province"));
        majorColumn.setCellValueFactory(new PropertyValueFactory<>("majorCode"));
        avgGradeColumn.setCellValueFactory(new PropertyValueFactory<>("avgGrade"));

        // load the students into the tableView
       // StudentTableViewController.get().addAll(DBUtility.getStudentFromDB());

    }
}
