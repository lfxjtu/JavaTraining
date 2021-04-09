package JavaTraining.Assignment4.ArmstrongNumbers;

public class PrintArmstrongNumbers {
    public static void main(String[] args) {
        int unitDigit = 0, tenDigit = 0, hundredDigit = 0, armstrongNum = 0;
        System.out.println("Armstrong numbers between 1 and 500: ");
        for(int i =1; i <= 500; i ++){
            hundredDigit = i/100;
            tenDigit = (i%100)/10;
            unitDigit = i%10;
            armstrongNum = hundredDigit*hundredDigit*hundredDigit+tenDigit*tenDigit*tenDigit+unitDigit*unitDigit*unitDigit;
            if(i==armstrongNum){
                System.out.println(i);
            }
        }

//        Another method:
//        int totalNum = 0, armstrongNum = 0;
//        for(hundredDigit=0;hundredDigit<6;hundredDigit++){
//            for(tenDigit=0;tenDigit<10;tenDigit++){
//                for (unitDigit=0;unitDigit<10;unitDigit++){
//                    totalNum = hundredDigit*100+tenDigit*10+unitDigit;
//                    armstrongNum = hundredDigit*hundredDigit*hundredDigit+tenDigit*tenDigit*tenDigit+unitDigit*unitDigit*unitDigit;
//                    if(totalNum==armstrongNum)
//                        System.out.println(totalNum);
//                }
//            }
//        }

    }
}
