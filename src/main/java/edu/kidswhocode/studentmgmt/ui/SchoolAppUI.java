package edu.kidswhocode.studentmgmt.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;

@Theme("chameleon")
@SpringUI
@SpringViewDisplay
public class SchoolAppUI extends UI implements ViewDisplay {
    @Autowired
    private Greeter greeter;

    private Panel springViewDisplay;

    public void init(VaadinRequest request) {
        VerticalLayout root = new VerticalLayout();
        root.setSizeFull();
        setContent(root);
        CssLayout nav = new CssLayout();
        nav.addStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
        nav.addComponent(createNavigationButton("Register Student",
                StudentRegistrationView.VIEW_NAME));
        root.addComponent(nav);
        springViewDisplay = new Panel();
        springViewDisplay.setSizeFull();
        root.addComponent(springViewDisplay);
        root.setExpandRatio(springViewDisplay, 1.0f);
    }

    private Button createNavigationButton(String caption, final String viewName) {
        Button button = new Button(caption);
        button.addStyleName(ValoTheme.BUTTON_SMALL);
        // If you didn't choose Java 8 when creating the project, convert this
        // to an anonymous listener class
        button.addClickListener(event -> getUI().getNavigator().navigateTo(viewName));
        return button;
    }

    @Override
    public void showView(View view) {
        springViewDisplay.setContent((Component) view);
    }
}
