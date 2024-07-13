import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    public void run() {
        Scanner scanner = new Scanner(System.in) ;
        ArrayList<Account> accounts = new ArrayList<Account>() ;

        System.out.println(" ------ Welcome to AO BANK ------") ;

        int action = 0 ;

        while ( action != 1 && action != 2  ) {
            System.out.println("1 => logging --- 2 => registering ") ;
            System.out.println("Type : ") ;
            action = scanner.nextInt() ;
            scanner.nextLine() ;

            if( action == 1 ) {
                System.out.println(" Welcome back to your AO BANK !! ") ;
                boolean foundAccount = false ;

                while ( !foundAccount ) {
                    System.out.println(" Enter your id : ") ;
                    int rib = scanner.nextInt() ;
                    System.out.println(" Enter your password : ") ;
                    int pass = scanner.nextInt() ;

                    for (Account ac : accounts ) {
                        if (ac.getRIB() == rib && ac.getPassword() == pass) {
                            foundAccount = true;
                            break;
                        }
                    }
                    if ( foundAccount ) {
                        System.out.println("Success logging !! ") ;
                    }else {
                        System.out.println("Account not found !") ;
                    }
                }
                System.out.println(" Continue ");
            }else{
                System.out.println(" ** welcome to AO BANK Happy to hear that you want to register ! **") ;
                System.out.println(" Enter your full name : ") ;
                String user = scanner.nextLine() ;
                System.out.println(" Enter your chosen id : ") ;
                int rib = scanner.nextInt() ;
                System.out.println(" Enter your password : ") ;
                int pass = scanner.nextInt() ;
                Account account = new Account(rib, user, pass , 0) ;
                accounts.add(account) ;
                action = 0 ;
            }

        }

        System.out.println(" end !! ");




    }

}
