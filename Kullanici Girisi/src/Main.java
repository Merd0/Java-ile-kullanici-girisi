import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String userName, password, select, newPassword;

        System.out.print("Kullanıcı Adınız :");
        userName = inp.nextLine();

        System.out.print("Şifrenizi Giriniz :");
        password = inp.nextLine();

        if (userName.equals("Merdo") && (password.equals("java123"))) {
            System.out.println("Giriş Başarılı!");
        }

        // Tüm bilgiler yanlış ise;

        else if (!(userName.equals("Merdo")) && !(password.equals("java123"))) {

            System.out.println("Hatalı Giriş! Lütfen Tekrar Deneyiniz!");

        }

        // Sadece Kullanıcı adı yanlış ise;

        else if (!(userName.equals("Merdo")) && (password.equals("java123"))) {

            System.out.print("Kullanıcı adı hatalı lütfen Kullanıcı adını kontrol edip tekrar deneyiniz.");

        }

        // sadece parolanın yanlış oldugu kombinasyon ve kullanıcıdan şifreyi değiştirmek isteyim istemedigini ögreniyoruz ve seçim yaptırıyoruz.

        else if ((userName.equals("Merdo")) && !(password.equals("java123"))) {
            System.out.println("Hatalı Şifre!");
            System.out.println("Şifrenizi Unuttuysanız yeni şifre oluşturmak için: 'R'. \n Yeni Şifre oluşturmaktan vazgeçmek ve giriş ekranından ayrılmak için:'E'.");
            System.out.print(" Seçiminiz: ");
            select = inp.nextLine();


            // yaptıgı seçime göre devam ediyoruz.


            if (select.equals("R") || select.equals("r")) {
                System.out.print("Yeni şifre giriniz (Lütfen daha önceki şifrelerinizden farklı bir şifre oluşturunuz:");
                newPassword = inp.nextLine();
                // şifre başarılı şekilde değiştirilirdi ise;

                if (!newPassword.equals("java123")) {
                    System.out.print("Yeni şifreniz başarlı bir şekilde oluşturuldu.");
                    // şifre hatalı şekilde değiştirilmeye çalışılırsa
                } else {
                    System.out.print("Hatalı deneme! Yeni şifre önceki şifrelerinizle aynı olamaz. Tekrar Deneyiniz!");
                }
                // kullanınıcı şifre degiştirmek istemzse
            } else if (select.equals("E") || select.equals("e")) {
                System.out.print("kullanıcı giriş sayfanda ayrılıyorsunuz ... iyi günler :) ");
                // kullanıcı R ve E dışında hatalı tercih yaparsa
            } else {
                System.out.print("Hatalı giriş yaptınız!! Lütfen sadece 'R ve E' seçeneklerinden birini giriniz.");
            }


        }


    }
}