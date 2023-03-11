package app;

import misc.Misc;

/**
 * Класс цветов
 */
public class Colors {
    /**
     * цвет фона
     */
    public static final int APP_BACKGROUND_COLOR = Misc.getColor(102, 204, 0, 204);

    /**
     * Запрещённый конструктор
     */
    private Colors() {
        throw new AssertionError("Вызов этого конструктора запрещён");
    }
    /**
     * Цвет текста заголовка
     */
    public static final int LABEL_TEXT_COLOR = Misc.getColor(255, 0, 0, 0);
    /**
     * цвет подложки панелейMisc.getColor(2000, 153, 0, 102);
     */
    public static final int PANEL_BACKGROUND_COLOR = Misc.getColor(255, 235, 255, 230);
    /**
     * Цвет текста
     */
    public static final int MULTILINE_TEXT_COLOR = Misc.getColor(255, 0, 0, 1);
    /**
     * Цвет подложки поля ввода
     */
    public static final int FIELD_BACKGROUND_COLOR = Misc.getColor(255, 255, 255, 255);
    /**
     * Цвет текста
     */
    public static final int FIELD_TEXT_COLOR = Misc.getColor(255, 0, 0, 0);
    /**
     * Цвет кнопки
     */
    public static final int BUTTON_COLOR = Misc.getColor(80, 0, 0, 0);
    /**
     * Цвет пересечения
     */
    public static final int CROSSED_COLOR = Misc.getColor(255, 205,	38, 130);
    /**
     * Цвет разности
     */
    public static final int SUBTRACTED_COLOR = Misc.getColor(255, 14, 41, 75);
}
