package de.bohnottensen.vaadin.views;

import com.vaadin.flow.dom.Element;
import de.bohnottensen.vaadin.controller.PersonService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class PersonViewTest {
  @Autowired
  private PersonService personService;

  @Test
  void testConstructor() {
    PersonView actualPersonView = new PersonView(personService);
    assertFalse(actualPersonView.isAttached());
    assertEquals("100%", actualPersonView.getWidth());
    assertNull(actualPersonView.getHeight());
    assertNull(actualPersonView.getClassName());
    assertEquals(1, actualPersonView.getComponentCount());
    assertTrue(actualPersonView.getClassNames().isEmpty());
    Element element = actualPersonView.getElement();
    assertEquals("<vaadin-vertical-layout theme=\"padding spacing\" style=\"width:100%\">\n"
        + " <vaadin-grid></vaadin-grid>\n" + "</vaadin-vertical-layout>", element.toString());
    assertTrue(element.isVisible());
    assertFalse(element.isTextNode());
    assertTrue(element.isEnabled());
    assertEquals("", element.getText());
    assertEquals("vaadin-vertical-layout", element.getTag());
    assertTrue(element.getComponent().isPresent());
    assertEquals(1, element.getChildCount());
  }
}

