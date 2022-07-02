package homework2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DoTest {

    private TestExistenceOfElement isElementExist;

    @BeforeEach //BeforeEach anotasyonu altındaki metot her bir test case den önce çalışacaktır.
    void setUp() {
        this.isElementExist = new TestExistenceOfElement();  //Nesne üretiyoruz.
    }

    @Test // Test anotasyonu altındaki metodun test case olarak çalışacağını belirtir.
    public void test(){

        Assertions.assertEquals(true, isElementExist.isExist());
        //junit kütüphanesine ait Assertions koşulları sayesinde testimizin sonucunu sorgulayabiliriz.
        //assertEquals metodunda beklenen değer olarak, aradığımız elementin sayfada var olduğunu varsayarak 'true' giriyoruz.
        //Bu metot, nesnemizin isExist() metodundan gelen sonuçla beklediğimiz değeri kıyaslayıp testi sonuçlandıracak.

    }

}
