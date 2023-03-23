package com.example.mgc_webdev;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;

import java.io.IOException;

import static javafx.geometry.Insets.EMPTY;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Button btn1 = new Button("Add Logo");
        btn1.setId("btn");
        btn1.setPrefWidth(120);
        Button btn2 = new Button("Submit Header");
        btn2.setId("btn");
        btn2.setPrefWidth(120);
        Button btn3 = new Button("Menu Bar");
        btn3.setId("btn");
        btn3.setPrefWidth(120);
        Button btn4 = new Button("CheckBox");
        btn4.setId("btn");
        btn4.setPrefWidth(120);
        Button btn5 = new Button("RadioButton");
        btn5.setId("btn");
        btn5.setPrefWidth(120);
        Button btn6 = new Button("Add Image");
        btn6.setId("btn");
        btn6.setPrefWidth(120);
        Button btn7 = new Button("Add TextArea");
        btn7.setId("btn");
        btn7.setPrefWidth(120);
        Button btn8 = new Button("Add TextField");
        btn8.setId("btn");
        btn8.setPrefWidth(120);
        Button btn9 = new Button("Add Buttons");
        btn9.setId("btn");
        btn9.setPrefWidth(120);

        Label hblabel = new Label("Header Background");
        hblabel.setId("labels");
        Label bdlabel = new Label("Body Background");
        bdlabel.setId("labels");
        Label ftlabel = new Label("Footer Background");
        ftlabel.setId("labels");
        Label ftl = new Label("Rename Header");
        ftl.setId("labels");
        Label bel = new Label("Rename Button");
        bel.setId("labels");

        ColorPicker hd = new ColorPicker();
        hd.setId("colors");
        ColorPicker bd = new ColorPicker();
        bd.setId("colors");
        ColorPicker ft = new ColorPicker();
        ft.setId("colors");

        TextField headerName = new TextField();
        headerName.setMaxWidth(120);

        TextField btnName = new TextField();
        btnName.setMaxWidth(120);

        Label headerLabel = new Label();

        VBox menu=new VBox(3);
        menu.setPrefHeight(40);
        VBox.setMargin(menu,new Insets(5));

        Pane top = new Pane();
        top.setId("menubr");
        top.setMaxWidth(25);
        top.setPrefHeight(5);

        Pane middle = new Pane();
        middle.setId("menubr");
        middle.setMaxWidth(25);
        middle.setPrefHeight(5);

        Pane bottom = new Pane();
        bottom.setId("menubr");
        bottom.setMaxWidth(25);
        bottom.setPrefHeight(5);

        HBox container = new HBox();
        VBox radioconn =new VBox();
        VBox radioconnm = new VBox();
        VBox radiocon = new VBox(10);
        radiocon.setMaxWidth(250);
        radiocon.setMaxHeight(260);
        VBox atricle = new VBox();
        HBox display = new HBox();
        VBox forms = new VBox();
        forms.setAlignment(Pos.CENTER);

        display.getChildren().addAll(radiocon);

        container.getChildren().addAll(display, atricle);
        container.setMaxHeight(300);
        HBox header = new HBox();
        header.setPrefHeight(80);
        VBox body = new VBox();
        body.setMaxHeight(470);
        body.getChildren().addAll(menu,container,forms);
        Pane footer = new Pane();
        footer.setMinHeight(50);

        HBox window = new HBox(10);
        VBox con = new VBox();
        con.setPrefWidth(150);
        VBox backgrounds = new VBox();
        backgrounds.setPrefWidth(150);
        backgrounds.setStyle("-fx-background-color:cyan");
        backgrounds.getChildren().addAll(hblabel,hd,bdlabel,bd,ftlabel,ft);
        con.setStyle("-fx-background-color:magenta");
        con.getChildren().addAll(btn1,ftl,headerName,btn2,btn3,btn4,btn5,btn6,btn7,btn8,bel,btnName,btn9);
        VBox webView =new VBox(10);
        webView.setPrefWidth(450);
        webView.setMaxHeight(600);
        webView.getChildren().addAll(header,body,footer);
        window.getChildren().addAll(con,webView,backgrounds);

        ImageView imageA =new ImageView();

        VBox.setMargin(btn1,new Insets(9));
        VBox.setMargin(btn2,new Insets(9));
        VBox.setMargin(btn3,new Insets(9));
        VBox.setMargin(btn4,new Insets(9));
        VBox.setMargin(btn5,new Insets(9));
        VBox.setMargin(btn6,new Insets(9));
        VBox.setMargin(btn7,new Insets(9));
        VBox.setMargin(btn8,new Insets(9));
        VBox.setMargin(btn9,new Insets(9));
        VBox.setMargin(headerName,new Insets(9));
        VBox.setMargin(hblabel,new Insets(9));
        VBox.setMargin(bdlabel,new Insets(9));
        VBox.setMargin(ftlabel,new Insets(9));
        VBox.setMargin(hd,new Insets(9));
        VBox.setMargin(bd,new Insets(9));
        VBox.setMargin(ftl,new Insets(9));
        VBox.setMargin(bel,new Insets(9));
        VBox.setMargin(ft,new Insets(9));
        VBox.setMargin(btnName,new Insets(9));

        HBox.setMargin(imageA,new Insets(9));

        btn1.setOnAction(event -> {
            FileChooser chose=new FileChooser();
            var imgicon = chose.showOpenDialog(stage);
            Image imglogo=new Image(imgicon.getAbsolutePath());
            imageA.setImage(imglogo);
            imageA.setFitHeight(75);
            imageA.setFitWidth(75);
            header.getChildren().add(imageA);
        });
        btn2.setOnAction(event -> {
            headerLabel.setText(headerName.getText());
            headerLabel.setId("header");
            headerLabel.setPrefWidth(525);
            headerLabel.setPrefHeight(75);
            header.getChildren().add(headerLabel);
        });
        hd.setOnAction(event -> {
            Color myColor = hd.getValue();
            header.setBackground(new Background(new BackgroundFill(myColor,CornerRadii.EMPTY, EMPTY)));
        });
        bd.setOnAction(event -> {
            Color myColr = bd.getValue();
            body.setBackground(new Background(new BackgroundFill(myColr,CornerRadii.EMPTY, EMPTY)));
        });
        ft.setOnAction(event -> {
            Color myColo = ft.getValue();
            footer.setBackground(new Background(new BackgroundFill(myColo,CornerRadii.EMPTY, EMPTY)));
        });
        btn3.setOnAction(event -> {
            menu.getChildren().addAll(top,middle,bottom);
        });
        btn5.setOnAction(event -> {
            RadioButton radio = new RadioButton();
            radioconn.getChildren().add(radio);
            VBox.setMargin(radio,new Insets(9));
            display.getChildren().add(radioconn);
        });
        btn4.setOnAction(event -> {
            CheckBox checkBox = new CheckBox();
            VBox.setMargin(checkBox,new Insets(9));
            radioconnm.getChildren().add(checkBox);
            display.getChildren().add(radioconnm);
        });
        btn6.setOnAction(event -> {
            ImageView photo = new ImageView();
            photo.setFitHeight(120);
            FileChooser chooser=new FileChooser();
            var imgs = chooser.showOpenDialog(stage);
            Image img=new Image(imgs.getAbsolutePath());
            photo.setImage(img);
            photo.setFitWidth(120);
            radiocon.getChildren().add(photo);
            VBox.setMargin(photo,new Insets(9));
        });
        btn7.setOnAction(event -> {
            TextArea area = new TextArea();
            area.setMinHeight(100);
            area.setMinWidth(100);
            atricle.getChildren().add(area);
            VBox.setMargin(area,new Insets(9));
        });
        btn8.setOnAction(event -> {
            TextField textField = new TextField();
            textField.setMaxWidth(170);
            VBox.setMargin(textField,new Insets(9));
            forms.getChildren().add(textField);
        });
        btn9.setOnAction(event -> {
            Button asd = new Button();
            asd.setText(btnName.getText());
            asd.setId("addedbtn");
            asd.setPrefWidth(120);
            VBox.setMargin(asd,new Insets(9));
            forms.getChildren().add(asd);
        });


        Scene scene = new Scene(window, 750, 600);
        String style=getClass().getResource("/Style.css").toExternalForm();
        scene.getStylesheets().addAll(style);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
