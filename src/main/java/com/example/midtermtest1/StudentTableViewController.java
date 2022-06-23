package com.example.midtermtest1;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class StudentTableViewController {

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
    private TableColumn<Student, Integer> studentIDColumn;

    @FXML
    private TableColumn<Student, String> telephoneColumn;

}
