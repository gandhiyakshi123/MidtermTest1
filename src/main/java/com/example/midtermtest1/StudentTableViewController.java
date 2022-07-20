package com.example.midtermtest1;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class StudentTableViewController implements Initializable {

    @FXML
    private TableView<Student> StudentTableView;

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

    @FXML
    private Button makeButtonToLoadAllStudents;

    @FXML
    private ComboBox<String> makeComboBox;

    @FXML
    private Label makeLabelForNoOfStudents;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

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
        StudentTableView.getItems().addAll(DBUtility.getStudentFromDB());
        makeLabelForNoOfStudents.setText("Number Of Students: " + (StudentTableView.getItems().size()));

        //       "AB","BC","MB","NB","NL","NS","NT","NU","ON","PE","QC","SK","YT"
        List<String> provinceName = Arrays.asList("AB", "BC", "MB", "NB", "NL", "NS", "NT", "NU", "ON", "PE", "QC", "SK", "YT");
        makeComboBox.getItems().addAll(provinceName);

        // The ComboBox for selecting the province be populated with a sorted list of distinct provinces from the database.
      makeComboBox.valueProperty().addListener(((observableValue, old, newValue) ->
        {
            if (newValue == "AB") {
                StudentTableView.getItems().clear();
                StudentTableView.getItems().addAll(DBUtility.showStudentsByProvince("AB"));
                makeLabelForNoOfStudents.setText("Number Of Students: " + (StudentTableView.getItems().size()));
            } else if (newValue == "BC") {
                StudentTableView.getItems().clear();
                StudentTableView.getItems().addAll(DBUtility.showStudentsByProvince("BC"));
                makeLabelForNoOfStudents.setText("Number Of Students: " +  (StudentTableView.getItems().size()));
            } else if (newValue == "MB") {
                StudentTableView.getItems().clear();
                StudentTableView.getItems().addAll(DBUtility.showStudentsByProvince("MB"));
                makeLabelForNoOfStudents.setText("Number Of Students: " +  (StudentTableView.getItems().size()));
            } else if (newValue == "NB") {
                StudentTableView.getItems().clear();
                StudentTableView.getItems().addAll(DBUtility.showStudentsByProvince("NB"));
                makeLabelForNoOfStudents.setText("Number Of Students: " +  (StudentTableView.getItems().size()));
            } else if (newValue == "NL") {
                StudentTableView.getItems().clear();
                StudentTableView.getItems().addAll(DBUtility.showStudentsByProvince("NL"));
                makeLabelForNoOfStudents.setText("Number Of Students: " +  (StudentTableView.getItems().size()));
            } else if (newValue == "NS") {
                StudentTableView.getItems().clear();
                StudentTableView.getItems().addAll(DBUtility.showStudentsByProvince("NS"));
                makeLabelForNoOfStudents.setText("Number Of Students: " +  (StudentTableView.getItems().size()));
            } else if (newValue == "NT") {
                StudentTableView.getItems().clear();
                StudentTableView.getItems().addAll(DBUtility.showStudentsByProvince("NT"));
                makeLabelForNoOfStudents.setText("Number Of Students: " +  (StudentTableView.getItems().size()));
            } else if (newValue == "NU") {
                StudentTableView.getItems().clear();
                StudentTableView.getItems().addAll(DBUtility.showStudentsByProvince("NU"));
                makeLabelForNoOfStudents.setText("Number Of Students: " +  (StudentTableView.getItems().size()));
            } else if (newValue == "ON") {
                StudentTableView.getItems().clear();
                StudentTableView.getItems().addAll(DBUtility.showStudentsByProvince("ON"));
                makeLabelForNoOfStudents.setText("Number Of Students: " +  (StudentTableView.getItems().size()));
            } else if (newValue == "PE") {
                StudentTableView.getItems().clear();
                StudentTableView.getItems().addAll(DBUtility.showStudentsByProvince("PE"));
                makeLabelForNoOfStudents.setText("Number Of Students: " +  (StudentTableView.getItems().size()));
            } else if (newValue == "QC") {
                StudentTableView.getItems().clear();
                StudentTableView.getItems().addAll(DBUtility.showStudentsByProvince("QC"));
                makeLabelForNoOfStudents.setText("Number Of Students: " +  (StudentTableView.getItems().size()));
            } else if (newValue == "SK") {
                StudentTableView.getItems().clear();
                StudentTableView.getItems().addAll(DBUtility.showStudentsByProvince("SK"));
                makeLabelForNoOfStudents.setText("Number Of Students: " +  (StudentTableView.getItems().size()));
            } else if (newValue == "YT") {
                StudentTableView.getItems().clear();
                StudentTableView.getItems().addAll(DBUtility.showStudentsByProvince("YT"));
                makeLabelForNoOfStudents.setText("Number Of Students: " + (StudentTableView.getItems().size()));
            }
            else {
                StudentTableView.getItems().clear();
                // load the students into the tableView
                StudentTableView.getItems().addAll(DBUtility.getStudentFromDB());
                makeLabelForNoOfStudents.setText("Number Of Students: " + (StudentTableView.getItems().size()));
            }
        }));

        makeButtonToLoadAllStudents.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent eventOnClick) {
                StudentTableView.getItems().clear();
                // load the students into the tableView
                StudentTableView.getItems().addAll(DBUtility.getStudentFromDB());
                makeLabelForNoOfStudents.setText("Number Of Students: " + (StudentTableView.getItems().size()));
            }
        });
    }
}
