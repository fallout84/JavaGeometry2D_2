import app.Application;
import io.github.humbleui.jwm.App;

/**
 * Главный класс приложения
 */
public class Main {
    /**
     * Главный метод приложения
     *
     * @param args аргументы командной строки или нет
     */
    public static void main(String[] args) {
        App.start(Application::new);
    }
}
