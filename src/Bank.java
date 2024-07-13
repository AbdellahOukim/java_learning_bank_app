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
                Account userAccount = null  ;
                boolean foundAccount = false ;
                int foundIndex = -1  ;

                while ( !foundAccount ) {
                    System.out.println(" Enter your id : ") ;
                    int rib = scanner.nextInt() ;
                    System.out.println(" Enter your password : ") ;
                    int pass = scanner.nextInt() ;

                    for ( int i = 0 ; i < accounts.toArray().length ; i++ ) {
                        if (accounts.get(i).getRIB() == rib && accounts.get(i).getPassword() == pass) {
                            foundAccount = true ;
                            foundIndex = i ;
                            break;
                        }
                    }
                    if ( !foundAccount )
                        System.out.println("Account not found !") ;
                }

                System.out.println("Success logging !! \n ") ;
                System.out.println("1 => Cash ATM -- 2 => View sold -- 3 => put money ") ;
                System.out.println(" Type : ") ;
                int operation = scanner.nextInt() ;

                switch (operation) {
                    case 1 :

                        break ;
                    case 2 :
                        System.out.println(" Your sold is :  " + accounts.get(foundIndex).getSold()) ;
                        break ;
                    case 3 :
                        System.out.println(" Enter price " ) ;
                        double price = scanner.nextDouble() ;
                        accounts.get(foundIndex).setSold(price) ;
                        break ;
                    default:
                        break ;

                }

                action = 0 ;

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
