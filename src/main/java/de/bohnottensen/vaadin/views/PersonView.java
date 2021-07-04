package de.bohnottensen.vaadin.views;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.router.Route;
import de.bohnottensen.vaadin.controller.PersonService;
import de.bohnottensen.vaadin.model.Person;

import java.util.List;

@Route("person")
public class PersonView extends VerticalLayout {


  private static final long serialVersionUID = -3540074179219665342L;
  private final PersonService personService;

  public PersonView(PersonService service) {
    personService = service;

    ListDataProvider<Person> dataProvider = getPersonListDataProvider();
    showTable(dataProvider);
  }

  private void showTable(ListDataProvider<Person> dataProvider) {
    Grid<Person> grid = new Grid<>();
    grid.setItems(dataProvider);
    add(grid);
  }

  private ListDataProvider<Person> getPersonListDataProvider() {
    List<Person> personList = personService.findAllPersons();
    return DataProvider.ofCollection(personList);
  }
}
