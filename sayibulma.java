public class sayibulma {
    public static void main(String[] args) {
        int [] sayilar=new int[] {1,2,5,7,9,0};
        int aranacak=5;
        boolean varMi=false;
        for(int sayi:sayilar){
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }
        String mesaj="";
        if(varMi){
            mesaj="sayı mevcuttur"+aranacak;
            mesajVer(mesaj);
        
        }else{
             System.out.println("sayımevcut değildir");
        }
    
    }

    public static void mesajVer(String mesaj){
        System.out.println("mesaj");
    }
    //CAMEL CASE JAVDA İLK HARF KÜÇÜK SONRAKİ KELİMELER BÜYÜK HARFLE BAŞLAR
    
}
