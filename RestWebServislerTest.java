package tr.edu.medipol.FinalProjesi;

import junit.framework.TestCase;

public class RestWebServislerTest extends TestCase {

    @Test
        public void testUrunListele() {
            RestWebServisler nesne = new RestWebServisler();
            String hata = new String();

            String urunKodu = "Doğru ürün kodu";

            assertEquals("", hata);
        }

    @Test
    public void testUrunSil() {
        RestWebServisler nesne2 = new RestWebServisler();
        String hata2 = new String();

        String urunKodu = "Doğru ürün kodu";

        assertEquals("", hata2);
    }

public class RestWebServislerTest {

    @Test
    public void testUrunEkle() {
        RestWebServisler nesne3 = new RestWebServisler();
        String hata3 = new String();


        String urunKodu = "Doğru ürün kodu";
        nesne3.urunEkle(urunKodu);

        assertEquals("", hata3);
    }

