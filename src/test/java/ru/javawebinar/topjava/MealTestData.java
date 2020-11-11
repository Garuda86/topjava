package ru.javawebinar.topjava;

import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

import static ru.javawebinar.topjava.model.AbstractBaseEntity.START_SEQ;
import static org.assertj.core.api.Assertions.assertThat;

public class MealTestData {

    public static final int USER_ID = START_SEQ;
    public static final int ADMIN_ID = START_SEQ + 1;
    public static final int NOT_FOUND = 10;
    //

    public static final Meal MEAL1 = new Meal(START_SEQ+2, LocalDateTime.of(2020, Month.JANUARY, 30, 13, 0, 0), "Обед", 1000);
    public static final Meal MEAL2 = new Meal(START_SEQ+3, LocalDateTime.of(2020, Month.JANUARY, 31, 0, 0, 0), "Еда на граничное значение", 100);
    public static final Meal MEAL3 = new Meal(START_SEQ+4, LocalDateTime.of(2020, Month.JANUARY, 31, 10, 0, 0), "Завтрак", 1000);
    public static final Meal MEAL4 = new Meal(START_SEQ+5, LocalDateTime.of(2020, Month.JANUARY, 31, 13, 0, 0), "Обед", 500);
    public static final Meal MEAL5 = new Meal(START_SEQ+6, LocalDateTime.of(2020, Month.JANUARY, 31, 20, 0, 0), "Ужин", 410);

    //public static final Meal MEAL6 = new Meal(START_SEQ+5, LocalDateTime.of(2020, Month.JANUARY, 8, 11, 0, 0), "Uzhin", 500);





    public static Meal getNew() {
        return new Meal(null, LocalDateTime.of(2020, Month.NOVEMBER, 8, 11, 0, 0), "NewEda", 500);
    }

    public static Meal getUpdated() {
        Meal updated = new Meal(MEAL1);
        updated.setDescription("UpdatedMeal1");
        updated.setCalories(330);
        return updated;
    }

    public static void assertMatch(Meal actual, Meal expected) {
        assertThat(actual).isEqualTo(expected);
    }

    public static void assertMatch(Iterable<Meal> actual, Meal... expected) {
        assertMatch(actual, Arrays.asList(expected));
    }

    public static void assertMatch(Iterable<Meal> actual, Iterable<Meal> expected) {
        assertThat(actual).isEqualTo(expected);
    }

}
