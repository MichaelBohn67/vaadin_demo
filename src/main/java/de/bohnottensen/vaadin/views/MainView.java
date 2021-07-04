package de.bohnottensen.vaadin.views;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {
  private static final long serialVersionUID = -8360267176091662525L;

  /**
   * Main view for the web application
   */
  public MainView() {
    VerticalLayout todoList = new VerticalLayout();
    TextField taskField = new TextField();
    Button addButton = new Button("Add");

    addButton.addClickShortcut(Key.ENTER);
    addButton.setText("Testing");
    addButton.addClickListener(click -> {
      Checkbox checkbox = new Checkbox(taskField.getValue());
      todoList.add(checkbox);
    });

      add(new H1("Welcome to MainView"),
        todoList,
        new HorizontalLayout(
            taskField,
            addButton
        )
    );
  }

}
