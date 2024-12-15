public class metin {
    public static void main(String[] args) {
        String mesaj = "    bugün hava çok güzel.    ";
        System.out.println(mesaj);
        System.out.println("karakter sayısı: " + mesaj.length());
        System.out.println("5. elemanı bul:" + mesaj.charAt(4));
        // concant=birleştirme
        System.out.println(mesaj.concat("yaşasın!"));
        // startsWith ile endsWith boolen yani true or false
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        // karakterin mesajin içinde kaçıncı olduğunu gösterir
        System.out.println(mesaj.indexOf("a"));
        // lastIndexOf aramaya sağdan başlar ama normal idex değerini girer
        System.out.println(mesaj.lastIndexOf("e"));
        // REPLACE değiştirmek eski karakeri yeniyle ğeğiştirmek
        System.out.println(mesaj.replace(' ', '-'));
        // stringle değişkene atayarak tekrar tekar kullanabiliriz
        String yenimesaj = mesaj.replace(' ', '-');
        System.out.println(yenimesaj);
        //substring bir yerden itibaren sonuna kadar parça almak nereye kadar alacagına karar verebilirsin
        //değer aralığında 2değil 5 açık aralık oldu
        System.out.println(mesaj.substring(2,5));
        for(String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }
        //vtoLowerCase bütün harfleri küçüğe çevirir
        System.out.println(mesaj.toLowerCase());
        //toApperCase bütün harfleri büyüğe çeviirir
        System.out.println(mesaj.toUpperCase());
        //farklı kaynaklardan algımız bilgiler kaynak uyuşmazlığından dolayı bilginin başında ve sonnda boşluk olabiliyor 
        //trim bunu engellemek için
        System.out.println(mesaj.trim());
    }
}
