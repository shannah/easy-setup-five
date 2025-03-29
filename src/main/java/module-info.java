open module ca.weblite.easySetupFive {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.desktop;
    requires net.harawata.appdirs;
    requires com.google.gson;
    requires com.sun.jna;
    requires org.apache.commons.lang3;
    requires org.apache.commons.io;
    requires org.tinylog.api;
    requires atlantafx.base;
    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.fontawesome5;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.materialdesign2;
    requires org.fxmisc.richtext;

    exports ca.weblite.easySetupFive;
    exports ca.weblite.easySetupFive.controller;
    exports ca.weblite.easySetupFive.services;

}
