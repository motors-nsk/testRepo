import org.junit.Test;

import static java.util.concurrent.TimeUnit.SECONDS;

public class SendMailTest {

    @Test
    public void sendMail() {

        YandexMailPage yandexMailPage = new YandexMailPage();
        YandexLoginPage yandexLoginPage = yandexMailPage.login();
        yandexLoginPage.login("alexanderk@adjuggler.ru", System.getProperty("yandexPass"));



        System.out.println(6);


    }
}