package com.involuntary.revpos.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class ManagerController {

    @FXML
    private ImageView manageHomeBtn;

    /**
     * Calls FXML to switch to the manager home screen
     */
    @FXML
    public void openManageHome() throws IOException {
        Parent root = FXMLLoader.load(
            getClass().getResource("/views/manager.fxml"));
        Scene scene = manageHomeBtn.getScene();
        scene.setRoot(root);
    }

    @FXML
    private ImageView manageInventoryBtn;

    /**
     * Calls FXML to switch to the inventory screen
     */
    @FXML
    public void openManageInventory() throws IOException {
        Parent root = FXMLLoader.load(
            getClass().getResource("/views/managerInventory.fxml"));
        Scene scene = manageInventoryBtn.getScene();
        scene.setRoot(root);
    }

    @FXML
    private ImageView manageMenuBtn;

    /**
     * Calls FXML to switch to the managing menu screen
     */
    @FXML
    public void openManageMenu() throws IOException {
        Parent root = FXMLLoader.load(
            getClass().getResource("/views/managerMenu.fxml"));
        Scene scene = manageMenuBtn.getScene();
        scene.setRoot(root);
    }

    @FXML
    private ImageView manageStatsBtn;

    /**
     * Calls FXML to switch to the stats screen
     */
    @FXML
    public void openManageStats() throws IOException {
        Parent root = FXMLLoader.load(
            getClass().getResource("/views/stats.fxml"));
        Scene scene = manageStatsBtn.getScene();
        scene.setRoot(root);
    }

    @FXML
    private ImageView manageExitBtn;

    /**
     * Calls FXML to return the point of sale, exiting the manager interface
     */
    @FXML
    public void exitManage() throws IOException {
        Parent root = FXMLLoader.load(
            getClass().getResource("/views/pos.fxml"));
        Scene scene = manageExitBtn.getScene();
        scene.setRoot(root);
    }
}
