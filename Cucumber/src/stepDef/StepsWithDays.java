package stepDef;

import io.cucumber.java.ParameterType;
import io.cucumber.java.bg.И;

public class StepsWithDays {
    @ParameterType(".*")
    public Days days(String day) {
        return Days.valueOf(day);
    }

    @И("{days} мой любимый день")
    public void printDay(Days day) {
        System.out.println("Мой любимый день " + day.value + "\n");
    }
}
