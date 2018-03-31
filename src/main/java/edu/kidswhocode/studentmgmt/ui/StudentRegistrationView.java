package edu.kidswhocode.studentmgmt.ui;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
// Pay attention to the order of annotations
@UIScope
@SpringView(name = StudentRegistrationView.VIEW_NAME)
public class StudentRegistrationView extends VerticalLayout implements View {
    public static final String VIEW_NAME = "studentregistration";

    @PostConstruct
    void init() {
        addComponent(new TextField("First Name:"));
        addComponent(new TextField("Last Name:"));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        // This view is constructed in the init() method()
    }
}
