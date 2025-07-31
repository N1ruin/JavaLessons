package Lesson46.task3.util.constant;

public class MenuMessages {
    public static final String WELCOME_MESSAGE = "Добро пожаловать в систему поиска автомобилей!";

    public static final String HELP_MESSAGE = """
                        Выберите необходимое действие, введя соответствующую цифру:
                        1 - Поиск машин по номеру;
                        2 - Поиск машин по фрагменту номера;
                        3 - Поиск машин по цвету;
                        4 - Поиск машин по году выпуска;
                        0 - Выход из программы.
            """;

    public static final String REQUEST_NUMBER_INPUT_MESSAGE = "Вы выбрали поиск по номеру. Введите номер машины, которую вы хотите найти:";

    public static final String REQUEST_NUMBER_FRAGMENT_INPUT = "Вы выбрали поиск по фрагменту номера. Введите фрагмент номера машины, которую вы хотите найти:";

    public static final String REQUEST_CAR_COLOR_INPUT = "Вы выбрали поиск по цвету. Введите цвет машины, которую вы хотите найти:";

    public static final String REQUEST_CAR_MIN_YEAR_INPUT = "Вы выбрали поиск по году выпуска. Введите год, начиная от которого проводить поиск:";

    public static final String REQUEST_CAR_MAX_YEAR_INPUT = "Введите год, до которого проводить поиск:";

    public static final String EXIT_MESSAGE = "Выход из программы...";

    public static final String CARS_NOT_FOUND_MESSAGE = "Машин не найдено";

    public static final String INCORRECT_MENU_ITEM_MESSAGE = "Некорректный номер, попробуйте еще раз!";
}

