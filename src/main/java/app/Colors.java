package app;

import misc.Misc;

/**
 * Класс цветов
 */
public class Colors {
    /**
     * цвет фона
     */
    public static final int APP_BACKGROUND_COLOR = Misc.getColor(200, 102, 0, 102);

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
    public static final int MULTILINE_TEXT_COLOR = Misc.getColor(255, 0, 0, 0);
}
