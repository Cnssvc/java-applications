public class orn2 {
    public static void main(String[] args) {
        int number = 28;
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println("sayı mükemmel sayıdır");
        } else {
            System.out.println("sayı mükemmel değildir");
        }

    }
    /*
     * üst alma math.pow
     * karekökünüALMA math.sqrt
     * sayının mutlak değerini almak math.abs
     */
}
    
