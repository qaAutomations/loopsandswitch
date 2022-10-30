import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // print hi 13 times ;

//        int x= 0;
//        while (x<13){
//            System.out.println("hi");
//            x++;
//        }
//
//
//        for(int i = 0 ; i < 13 ; i++){
//            System.out.println("hi");
//        }
//
//        for(int i = 0 ; i < 100 ; i++){
//            //0-99
//            if(i%2 == 0)
//                System.out.println(i);
//        }
//
//
//        for (int i = 0 ; i < 4 ; i++){
//            String name = scanner.next();
//            System.out.println(name);
//        }

        // כתבו תוכנית המקבלת מהמשתמש 4 מספרים שלמים
        // ומדפיסה את המספר הגדול מביניהם
        // בלי שימוש בפונקיית מקס ובלי הגדרת  4 משתנים

        int max = Integer.MIN_VALUE; // -2^31
        for (int i = 0 ; i < 4 ; i++){

            int number = scanner.nextInt();
            if (number > max ){
                max=number;
            }
        }
        System.out.println(max);

    }
}
