public class Main {
    public static void main(String[] args) {
        Tariff tariff = new Tariff();
        System.out.println(tariff.name);
        System.out.println(tariff.minutes);
        System.out.println(tariff.unlimToTele2);
        System.out.println(tariff.gigabites);
        System.out.println(tariff.unlimVK);
        System.out.println(tariff.unlimFacebook);
        System.out.println(tariff.unlimOK);
        System.out.println(tariff.unlimWhatsapp);
        System.out.println(tariff.unlimTamTam);
        System.out.println(tariff.unlimInstagram);
        System.out.println(tariff.cost);
        System.out.println(tariff.salesHit);
        System.out.println(tariff.buySIM);
        System.out.println(tariff.edit);

        tariff.name = "myOnline";
        tariff.minutes = 500;
        tariff.unlimToTele2 = true;
        tariff.gigabites = 40;
        tariff.unlimVK = true;
        tariff.unlimFacebook = true;
        tariff.unlimOK = true;
        tariff.unlimWhatsapp = true;
        tariff.unlimViber = true;
        tariff.unlimTamTam = true;
        tariff.unlimInstagram = true;
        tariff.salesHit = true;
        tariff.cost = 500_00;

        System.out.println(tariff.name);
        System.out.println(tariff.minutes);
        System.out.println(tariff.gigabites);
        System.out.println(tariff.cost);

    }
}
