import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String userName,password;
		int right=3,select,balance=2300,price;
		Scanner inp = new Scanner(System.in);
					
		 while (right>0) {
			 System.out.print("Kullanici adinizi giriniz: ");
			 userName=inp.nextLine();
			 System.out.print("Sifrenizi giriniz: ");
			 password=inp.nextLine();
			 if (userName.equals("patika") && password.equals("dev123")) {
				System.out.println("Basarili bir sekilde giris yaptiniz");
				do {
					System.out.println("1-Para Yatirma\n"+"2-Para Cekme\n"+"3-Bakiye Sorgulama\n"+"4-Cikis Yap");
					System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");
					select = inp.nextInt();
					switch (select) {
					case 1:
						System.out.println("Eklemek Istediginiz Para Miktari: ");
						price = inp.nextInt();
						balance+=price;
						System.out.println("Yeni Bakiyeniz: "+balance);
						break;
					case 2:
						System.out.println("Cekmek Istediginiz Para Miktari: ");
						price = inp.nextInt();
						if (balance<price) {
							System.out.println("Yetersiz Bakiye");
						}
						else {
							balance-=price;
							System.out.println("Yeni Bakiyeniz: "+balance);

						}
					case 3:
						System.out.println("Bakiyeniz: "+balance);

					default:
						System.out.println("Gecersiz Islem Yaptıiniz");
						break;
					}
				} while (select==4);
				System.out.println("Tekrar gorusmek uzere");
				break;
			}
			 else {
				right--;
				System.out.println("Kullanici girisiniz hatali.Tekrar deneyiniz.");
				if (right==0) {
					System.out.println("Banka hesabiniz bloke oldu.");
				}
				else {
					System.out.println("Kalan giris hakkiniz: "+right);
				}
			}
		 }

	}

}
