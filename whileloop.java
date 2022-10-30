import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        // כתבו תוכנית המדפיסה את כל המספרים
        // מ 1 עד ל 100 כולל  בלולאת וייל
//
//        int number = 1 ;
//        while(number <= 100 ) {
//            System.out.println(number);
//            number++;// number = number +1 ; ber +=1;
//        }


        // כתבו תוכנית המקבלת מספר שלם ומדפיסה את
        // הריבוע שלו עד קבלת המספר 0 ותוכנית תצא
        Scanner scanner = new Scanner(System.in);
//        int numb1 = scanner.nextInt();
//        while (numb1 != 0){
//            System.out.println(numb1 * numb1);
//            numb1 = scanner.nextInt();
//        }


        // כתבו קוד המקבל מהשממש
        // את הפעולה החישובית -> +-%*/
        // והגדרו שני מספרים קבועים
        // אם המשתמש מכניס את + אז
        // יש להדפיס את סכום שני המספרים
        // ואז לשאול אותו במה הוא בוחר
        //  במידה ובחר ב - מציגים
        //  את התשובה של החיסור
        // ואם המשתמש מכניס את
        // האות q יש להדפיס להתראות

        int x = scanner.nextInt(), y = scanner.nextInt();
        char op;
        do {
            System.out.println("choose one of the operators: -+*/% ");
            op = scanner.next().charAt(0);
            switch (op) {
                case '+' -> System.out.println(x + y);
                case '-' -> System.out.println(x - y);
                case '*' -> System.out.println(x * y);
                case '/' -> {
                    if (y != 0) {
                        System.out.println(x / y);
                    } else {
                        System.out.println("error");
                    }

                }
                case '%' -> System.out.println(x % y);
            }

        } while (op != 'q' && op != 'Q');
        System.out.println("it was fun waiting for you ");

    }

}
