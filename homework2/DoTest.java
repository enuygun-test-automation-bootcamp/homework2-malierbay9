package homework2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoTest {

    @Test
    public void test(){

        TestExistenceOfElement isElementExist = new TestExistenceOfElement();// Sınıfımızdan nesne oluşturuyoruz.

        Assertions.assertEquals(true,isElementExist.isExist());
        //junit kütüphanesine ait Assertions koşulları sayesinde testimizin sonucunu sorgulayabiliriz.
        //assertEquals metodunda beklenen değer olarak, aradığımız elementin sayfada var olduğunu varsayarak 'true' giriyoruz.
        //Bu metot, nesnemizin isExist() metodundan gelen sonuçla beklediğimiz değeri kıyaslayıp testi sonuçlandıracak.

    }

}
