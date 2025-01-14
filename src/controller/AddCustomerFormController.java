package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AddCustomerFormController {

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtSalary;

    List<Customer> customerList = new ArrayList<>();
    @FXML
    void btnAddOnAction(ActionEvent event) {
        customerList.add(
                new Customer(txtID.getText(),
                        txtName.getText(),
                        txtAddress.getText(),
                        Double.parseDouble(txtSalary.getText())
                )
        );

        System.out.println("-------------------------------");
        customerList.forEach(cus->{
            System.out.println(cus);
        });
        System.out.println("-------------------------------");
    }

    @FXML
    void btnDelereOnAction(ActionEvent event) {

    }

    @FXML
    void btnSearchOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

}
