package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import service.RegisterService;
import service.WindowService;

import java.io.IOException;

public class RegisterController {

        @FXML
        private TextField tf_login;
        @FXML
        private PasswordField pf_password;
        @FXML
        private Button btn_register;
        @FXML
        private Button btn_back;
        @FXML
        private Label lbl_error;
        @FXML
        private PasswordField pf_password_confirm;
        @FXML
        private TextField tf_password;
        @FXML
        private TextField tf_password_confirm;
        @FXML
        private CheckBox cb_showPassword;
        // obiekty globalne
        private WindowService windowService;
        private RegisterService registerService;
        public void initialize(){
                windowService = new WindowService();
                registerService = new RegisterService();
        }
        @FXML
        void showPasswordAction(ActionEvent event) {
                registerService.showPassword(cb_showPassword,tf_password,pf_password,tf_password_confirm,pf_password_confirm);
        }
        @FXML
        void backAction(ActionEvent event) throws IOException {
                windowService.openNewWindow("/view/loginView.fxml","Panel logowania");
                windowService.closeCurrentWindow(lbl_error);
        }
        @FXML
        void enterMouseAction(MouseEvent event) { }
        @FXML
        void enterRegisterMouseAction(MouseEvent event) { }
        @FXML
        void exitMouseAction(MouseEvent event) { }
        @FXML
        void exitRegisterMouseAction(MouseEvent event) { }
        @FXML
        void keyRegisterAction(KeyEvent event) { }
        @FXML
        void registerAction(ActionEvent event) {
                if(registerService.loginCheck(tf_login, lbl_error)){
                        if(registerService.passwordsEquality(
                                cb_showPassword,tf_password,pf_password,tf_password_confirm,pf_password_confirm, lbl_error)){
                                System.out.println("rejestrujemy");
                        }
                }
        }

}