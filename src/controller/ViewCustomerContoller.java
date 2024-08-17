package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

public class ViewCustomerContoller {

    @FXML
    private TableColumn<?, ?> colAddess;

    @FXML
    private TableColumn<?, ?> colID;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colSalary;

    @FXML
    private TableView<Object> tblCustomer;

    @FXML
    void btnReloadOnAction(ActionEvent event) {
        colID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddess.setCellValueFactory(new PropertyValueFactory<>("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));

        ObservableList<Object> customerObservableList = FXCollections.observableArrayList();
        customerObservableList.add(new Customer("01", "Hiru", "ASasd", 30000.0));
        customerObservableList.add(new Customer("01", "Hiru", "ASasd", 30000.0));
        customerObservableList.add(new Customer("01", "Hiru", "ASasd", 30000.0));
        tblCustomer.setItems(customerObservableList);
    }

}
