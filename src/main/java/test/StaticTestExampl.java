package test;

import org.junit.jupiter.api.Test;

//служит примером использования статической переменной в тесте
public class StaticTestExampl {

    static String siteUrl = "Google.com"; //одни общие данные для всех тестов
    static String password = "pass123";

    @Test
    void openSite() {
//        Selenide.open(siteUrl);
//        ...setValue(password);
    }

    @Test
    void setPassword() {
//        Selenide.open(siteUrl);
//        ...setValue(password);
    }
}
