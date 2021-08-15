package de.bohnottensen.vaadin.views;

import com.vaadin.flow.dom.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MainViewTest {

  @Test
  void testConstructor() {
    MainView actualMainView = new MainView();
    assertFalse(actualMainView.isAttached());
    assertEquals("100%", actualMainView.getWidth());
    assertNull(actualMainView.getHeight());
    assertNull(actualMainView.getClassName());
    assertEquals(3, actualMainView.getComponentCount());
    assertTrue(actualMainView.getClassNames().isEmpty());
    Element element = actualMainView.getElement();
    assertEquals(
        "<vaadin-vertical-layout theme=\"padding spacing\" style=\"width:100%\">\n" + " <h1>Welcome to MainView</h1>\n"
            + " <vaadin-vertical-layout theme=\"padding spacing\" style=\"width:100%\"></vaadin-vertical-layout>\n"
            + " <vaadin-horizontal-layout theme=\"spacing\">\n" + "  <vaadin-text-field></vaadin-text-field>\n"
            + "  <vaadin-button>\n" + "   Testing\n" + "  </vaadin-button>\n" + " </vaadin-horizontal-layout>\n"
            + "</vaadin-vertical-layout>",
        element.toString());
    assertTrue(element.isVisible());
    assertFalse(element.isTextNode());
    assertTrue(element.isEnabled());
    assertEquals("Welcome to MainViewTesting", element.getTextRecursively());
    assertEquals("", element.getText());
    assertEquals("vaadin-vertical-layout", element.getTag());
    assertTrue(element.getComponent().isPresent());
    assertEquals(3, element.getChildCount());
  }


}