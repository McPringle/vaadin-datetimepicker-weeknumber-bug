package swiss.fihlon.vaadin;

import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "/")
@PageTitle("Test View")
public class TestView extends Div {

    public TestView() {
        final var dateTimePicker = new DateTimePicker("Date");
        dateTimePicker.setWeekNumbersVisible(true);

        // make sure the week number is not "hidden" on either side
        dateTimePicker.getStyle().set("padding", "50px");

        add(dateTimePicker);
    }
}
