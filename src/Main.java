public class Main {
    public static void main(String[] args) {

        //Задача №1.
        byte testByte = 69;
        short testShort = -32000;
        int testInt = 1827323423;
        long testLong = -987453847598374L;
        float testFloat = 6.3f;
        double testDouble = -789.6783453463468;
        char testChar = 34;
        boolean testBoolean = false;

        //Задача №2.
        float boxer_0 = 78.2f;
        float boxer_1 = 82.7f;
        float commonWeight = boxer_0 + boxer_1;
        System.out.println("Общий вес боксеров: " + commonWeight + " кг.");
        float difference = boxer_0 - boxer_1;
        System.out.println("Разница в весе: " + Math.abs(difference) + " кг.\n");

        //Задача №3.
        byte bananaWeight = 80;
        byte hundredMlMilkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        short breakfastWeight_G = (short) (bananaWeight * 5 + hundredMlMilkWeight * 2 + iceCreamWeight * 2 + eggWeight * 4);
        float breakfastWeight_KG = breakfastWeight_G/1000F;
        System.out.println("Масса завтрака: " + breakfastWeight_KG + " кг.\n");

        //Задача №4
        byte purposeLoss = 7;
        short minWeightLossPerDay = 250;
        short maxWeightLossPerDay = 500;
        byte fastestLoss_Days = (byte) (purposeLoss*1000/maxWeightLossPerDay);
        byte slowestLoss_Days = (byte) (purposeLoss*1000/minWeightLossPerDay);
        System.out.println("При максимальной потере веса уйдет " + fastestLoss_Days + " дней.");
        System.out.println("При минимальной потере веса уйдет " + slowestLoss_Days + " дней.");
        byte averageLossPerDay = (byte) ((fastestLoss_Days + slowestLoss_Days)/2);
        System.out.println("При среднем показателе потери веса дней уйдет: " + averageLossPerDay + ".\n");

        //Задача №5.
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int christinaSalary = 76230;
        int mashaCurrentYearSalary = mashaSalary * 12;
        int denisCurrentYearSalary = denisSalary * 12;
        int christinaCurrentYearSalary = christinaSalary * 12;

        float mashaPromotionSalary =  (float) (mashaSalary * 1.1);
        float denisPromotionSalary =  (float) (denisSalary * 1.1);
        float christinaPromotionSalary =  (float) (christinaSalary * 1.1);
        int mashaPromotionYearSalary = (int) (mashaPromotionSalary * 12);
        int denisPromotionYearSalary = (int) (denisPromotionSalary * 12);
        int christinaPromotionYearSalary = (int) (christinaPromotionSalary * 12);
        System.out.println("Маша теперь получает " + (int) (mashaPromotionSalary) + " рублей в месяц.\nГодовой доход вырос на " + (mashaPromotionYearSalary-mashaCurrentYearSalary) + " рублей.");
        System.out.println("Денис теперь получает " + (int) (denisPromotionSalary) + " рублей в месяц.\nГодовой доход вырос на " + (denisPromotionYearSalary-denisCurrentYearSalary) + " рублей.");
        System.out.println("Кристина теперь получает " + (int) (christinaPromotionSalary) + " рублей в месяц.\nГодовой доход вырос на " + (christinaPromotionYearSalary-christinaCurrentYearSalary) + " рублей.\n");

        //Задача №6.
        byte a = 12;
        byte b = 27;
        byte c = 44;
        byte d = 15;
        byte e = 9;
        int result = a * (b + (c - d * e));
        result = 0 - result;
        System.out.println("Ответ шестой задачи: " + result + ".\n");

        //Задача №7.
        int a_1 = 5;
        int b_1 = 7;
        a_1 = a_1 + b_1 % a_1;
        b_1 = (b_1 + b_1 + b_1 + b_1 + b_1)/b_1;
        System.out.println("Ответ седьмой задачи:\n" + a_1 + "\n" +  b_1 + "\n");

        //Задача №8.
        int a_2 = 417;
        int b_2 = (a_2 % 100)/10;
        System.out.println("Ответ восьмой задачи: " + b_2);
    }
}