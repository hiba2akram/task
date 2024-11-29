package com.example.dataform;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    ArrayList<Candidate> candidates = new ArrayList<>();

    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane, 520, 440);


        TextField textField1 = new TextField();
        Label namelabel = new Label("Full Name: ");
        HBox namehbox = new HBox();
        namehbox.getChildren().addAll(namelabel, textField1);
        gridPane.add(namehbox, 0, 1, 1, 1);
        namehbox.setPadding(new Insets(10));
        namehbox.setSpacing(20);


        TextField textField2 = new TextField();
        Label idlabel = new Label("Id: ");
        HBox idhbox = new HBox();
        idhbox.getChildren().addAll(idlabel, textField2);
        gridPane.add(idhbox, 0, 2, 1, 1);
        idhbox.setPadding(new Insets(10));
        idhbox.setSpacing(60);


        Label genderlabel = new Label("Gender: ");
        RadioButton maleradiobutton = new RadioButton("Male");
        RadioButton femaleradiobutton = new RadioButton("Female");
        HBox genderhbox = new HBox();
        genderhbox.getChildren().addAll(genderlabel, maleradiobutton, femaleradiobutton);
        gridPane.add(genderhbox, 0, 3, 1, 1);
        ToggleGroup gendertoggle = new ToggleGroup();
        maleradiobutton.setToggleGroup(gendertoggle);
        femaleradiobutton.setToggleGroup(gendertoggle);
        genderhbox.setPadding(new Insets(10));
        genderhbox.setSpacing(30);


        ComboBox<String> citycombo = new ComboBox<>();
        citycombo.getItems().addAll("Punjab", "Sindh", "Peshawar", "Khyber Pakhtunkhwa");
        Label citylabel = new Label("Home Province: ");
        HBox cityhbox = new HBox();
        cityhbox.getChildren().addAll(citylabel, citycombo);
        gridPane.add(cityhbox, 0, 4, 1, 1);
        cityhbox.setPadding(new Insets(10));
        cityhbox.setSpacing(15);


        DatePicker dob = new DatePicker();
        Label doblabel = new Label("DOB:");
        HBox dobhbox = new HBox();
        dobhbox.getChildren().addAll(doblabel, dob);
        gridPane.add(dobhbox, 0, 5, 1, 1);
        dobhbox.setPadding(new Insets(10));
        dobhbox.setSpacing(20);

        // Buttons
        Button newbutton = new Button("New");
        gridPane.add(newbutton, 6, 1, 1, 1);
        newbutton.setOnAction(e -> clearForm(textField1, textField2, dob, gendertoggle, citycombo));

        Button findbutton = new Button("Find prev");
        gridPane.add(findbutton, 6, 2, 1, 1);
        findbutton.setOnAction(e -> findPreviousCandidate());

        Button deletebutton = new Button("Delete");
        gridPane.add(deletebutton, 6, 3, 1, 1);
        deletebutton.setOnAction(e -> deleteCandidate());

        Button criteriabutton = new Button("Criteria");
        gridPane.add(criteriabutton, 6, 4, 1, 1);
        criteriabutton.setOnAction(e -> showCandidates());

        Button closebutton = new Button("Close");
        gridPane.add(closebutton, 6, 5, 1, 1);
        closebutton.setOnAction(e -> System.exit(0));


        stage.setTitle("Data Form");
        stage.setScene(scene);
        stage.show();
    }

    private void clearForm(TextField nameField, TextField idField, DatePicker dobField, ToggleGroup genderGroup, ComboBox<String> provinceCombo) {
        nameField.clear();
        idField.clear();
        dobField.setValue(null);
        genderGroup.selectToggle(null);
        provinceCombo.setValue(null);
    }

    private void findPreviousCandidate() {
        if (!candidates.isEmpty()) {
            System.out.println("Found previous candidate: " + candidates.get(0));
        } else {
            System.out.println("No previous candidates found.");
        }
    }

    private void deleteCandidate() {
        if (!candidates.isEmpty()) {
            candidates.remove(0);  // Remove the first candidate
            System.out.println("Deleted first candidate.");
        } else {
            System.out.println("No candidates to delete.");
        }
    }

    private void showCandidates() {
        if (!candidates.isEmpty()) {
            System.out.println("List of Candidates:");
            for (Candidate candidate : candidates) {
                System.out.println(candidate);
            }
        } else {
            System.out.println("No candidates available.");
        }
    }

    public static void main(String[] args) {
        launch();
    }
}






