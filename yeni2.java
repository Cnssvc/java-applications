public class yeni2 {
    public static void main(String[] args) {
        String ogrenci1 = "engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "ahmet";
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("----------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "ahmet";
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("----------");

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }

        double[] myList = { 1.2, 1.3, 1.4, 1.5 };
        double total = 0;
        double max=myList[0];
        for (double number : myList) { 
            if(max<number){
                max=number;
            }
            total = total + number;
            System.out.println("" + number);
            
        }
        System.out.println("toplam=" + total);
        System.out.println("en buyuk="+max);
    }
}