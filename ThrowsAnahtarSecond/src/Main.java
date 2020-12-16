
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

        /*
        RunTimeException altındaki exceptionlarımız bizim uncheck exceptionlarımız
        örnek olarak == 
        Arithmatic,NullPointer,NumberFormat,IndexOutofBounds.....
        bunları bizim yapıya bildirmemize gerek yok try-catch blok içerisine aldığımızda sorun kalmıyor.
        Bunun sebebi ise uncheck exceptionlar java tarafından öngörülemiyor
        Check exceptionlar Java tarafından öngörülebiliyorlar.
        burada iki farklı yöntem var hatayı ya biz yakalarız yada kullanıcının yakalamasını istediriz..
        
    
        public static void main(String[] args) throws IOException {bu yapı ile kullanıcıdan hatayı yakalaması istenir tarafımızca ....
        JAVA bize bu mekan metodunun bu hatayı dırlattığını bildir demesi şeklinde açıklanabilir.
        Eğer biz hatayı kendimiz yakalayarak kullanıcıya hiçbir işlem yaptırmak istemiyorsak TRY-CATCH kullanmamız yeterli olacaktir.
        
    
        Throws anahtar kelimesi sadece Checkexception da gerekli diğer yapılar için kullanılsada kullanımasada olur...
         KAYNAK = mustafa Murat Coşkun udemy Java eğitimi Referans alınmıştır.
        */
        public static void mekan_kontrol(int yas) throws IOException {
        
        if (yas < 18) {
            throw new IOException();
            
        }
        else {
            System.out.println("Mekana hoşgeldiniz...");
        }
        
    }
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();

            try {
                mekan_kontrol(yas);
            } catch (IOException ex) {
                System.out.println("IOeXCEPTİON OLUŞTU...");
                //burada JAVA senin mutlaka bu hatayı yakalaman gerekiyor dediği için biz burada bu işlemi gerçekleştiriyoruz...
                //buradaki yapımız Checkexception olduğu için try-catch ile biz kullanıcı üzerindeki yükü ortadan kaldırmış oluyoruz.
                
            }

        
    }
   
    
}
