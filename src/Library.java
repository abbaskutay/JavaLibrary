import java.util.ArrayList;
import java.util.Scanner;

public class Library
{

    Library lbr;

    public static void main(String[] args)
    {
        Library lbr = new Library();
        ArrayList<Books> liste = new ArrayList<>();// Kütüphanedeki kitapları tutacak listemiz
        // Liste için ArrayList Kullanılmış
        Personal psl = new Personal();//
        Student std = new Student();// Personelve ögrenci nesneleri

        lbr.books(liste);// Listemize kitapları atan metod çagrılıyor

        Scanner scan = new Scanner(System.in);
        int secim;
        System.out.println("Ögrenci Girişi İçin 1");
        System.out.println("Personel Girişi İçin 2 Tuşlayınız");
        secim = scan.nextInt();
        switch (secim) {
            case 1: {// Ögrenci Girişi
                lbr.studentEnter(std, scan, lbr, liste);
                break;
            }
            case 2: {// Personal Girişi
                lbr.personalEnter(psl, scan, lbr, liste);
                break;
            }
        }

    }

    void books(ArrayList<Books> liste)
    {// Kütüphanedeki kitapları oluşturan metod
        liste.add(new Books("Safahat", 0, true));
        liste.add(new Books("Moskof", 1, true));
        liste.add(new Books("Sergüzeşt", 2, true));
        liste.add(new Books("Kırmızı Başlıklı Kız", 3, true));
        liste.add(new Books("Herkes İçin Java", 4, false));
        liste.add(new Books("Linux'a Giriş", 5, true));
        liste.add(new Books("Etik Hacker", 6, true));
        liste.add(new Books("Beyaz Diş", 7, true));
        liste.add(new Books("Leyla İle Mecnun", 8, true));
        liste.add(new Books("Aşkın Gözyaşları", 9, false));
        liste.add(new Books("Reader At Work", 10, false));

    }

    void displayBooks(ArrayList<Books> liste)
    {// Kitab Listesini Ekrana Yazar
        System.out.println("**** Kütüphane Kitab Listesi ********");
        for (int i = 0; i < liste.size(); i++) {
            System.out.print(liste.get(i).getId() + "-" + liste.get(i).getName());
            if (liste.get(i).isFlag() == false)
                System.out.print("   ---> Kitap Ödünçte");
            else
                System.out.print("   ---> Kitap Al");
            System.out.println();
        }
        System.out.println("######################################");
    }

    void displayMenu()
    {// Menuyü ekrana yazan yordam
        System.out.println("Lütfen İşleminiz İçin Tuşlayınız");
        System.out.println("1-Ödünç Kitab Al");
        System.out.println("2-Ödünç Kitab İade");
        System.out.println("3-Kitab Listesini Görmek");
        System.out.println("4-Çıkış ");
        System.out.println("Secim = ");
    }

    void exit()
    {// Çıkış
        System.out.println("....................");
        System.out.println("İyi bir Kitab İyi Bir Arkadaştır");
        System.out.println("Güle Güle");
    }

    void studentEnter(Student std, Scanner scan, Library lbr, ArrayList<Books> liste)
    {
        int secim;
        int id;
        std.connect();
        lbr.displayMenu();
        secim = scan.nextInt();
        while (true) {
            switch (secim) {
                case 1: {// Kitap Alma seceneği

                    System.out.println("Almak İstediginiz Kitabın id Gir");
                    id = scan.nextInt();
                    if (liste.get(id).isFlag() == false)
                        System.out.println("Üzgünüz Kitab Ödünçte");
                    else {
                        liste.get(id).setFlag(false);
                        System.out.println("Kitab Alındı");
                    }
                    lbr.displayMenu();
                    secim = scan.nextInt();
                    break;
                }
                case 2: {// Kitap İade Secenegi
                    System.out.println("İade Edeceğiniz Kitabın id Gir");
                    id = scan.nextInt();
                    if (liste.get(id).isFlag() == true)
                        System.out.println("Kitap Zaten iade Edilmiş");
                    else {
                        liste.get(id).setFlag(true);
                        System.out.println("Kitab İade Edildi");
                    }
                    lbr.displayMenu();
                    secim = scan.nextInt();
                    break;
                }
                case 3: {// Kitapları Ekrana Yazdırma Secenegi
                    lbr.displayBooks(liste);
                    lbr.displayMenu();
                    secim = scan.nextInt();
                    break;
                }
                case 4: {// Çıkış secenegi
                    lbr.exit();
                    System.exit(-1);
                }
            }
        }
    }

    void personalEnter(Personal std, Scanner scan, Library lbr, ArrayList<Books> liste)
    {// Personel işlemlerini yapan yordam
        int secim;
        int id;
        std.connect();
        lbr.displayMenu();// menu yazdırılıyor
        secim = scan.nextInt();
        while (true) {
            switch (secim) {
                case 1: {// Kitap Alma seceneği

                    System.out.println("Almak İstediginiz Kitabın id Gir");
                    id = scan.nextInt();
                    if (liste.get(id).isFlag() == false)
                        System.out.println("Üzgünüz Kitab Ödünçte");
                    else {
                        liste.get(id).setFlag(false);
                        System.out.println("Kitab Alındı");
                    }
                    lbr.displayMenu();
                    secim = scan.nextInt();
                    break;
                }
                case 2: {// Kitap İade Secenegi
                    System.out.println("İade Edeceğiniz Kitabın id Gir");
                    id = scan.nextInt();
                    if (liste.get(id).isFlag() == true)
                        System.out.println("Kitap Zaten iade Edilmiş");
                    else {
                        liste.get(id).setFlag(true);
                        System.out.println("Kitab İade Edildi");
                    }
                    lbr.displayMenu();
                    secim = scan.nextInt();
                    break;
                }
                case 3: {// Kitapları Ekrana Yazdırma Secenegi
                    lbr.displayBooks(liste);
                    lbr.displayMenu();
                    secim = scan.nextInt();
                    break;
                }
                case 4: {// Çıkış secenegi
                    lbr.exit();
                    System.exit(-1);
                }
            }
        }
    }

}
