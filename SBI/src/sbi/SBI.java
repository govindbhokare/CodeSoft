package sbi;


import java.util.Scanner;
import java.util.Date;

public class SBI
{
    static String fname;
    static String femail;
    static String fpass1;
    static String fbranch;
    static String fstate;
    static String fdst;
    static long fpno;
    static long fbal;
    static long credit;
    static long debit;
    static long prebal;

    static int i;
    static Date fdate;
   
    static long[] ACNO= new long[]{35805595903l};
    static String[] IFSC= new String[]{"SBIN0003005"};
    static int[] fPin = new int[10];

   
    static Scanner sc = new Scanner(System.in);
    static void Mainmenu()
    {
        System.out.println("=================================================");
        System.out.println("|#|          STATE BANK OF INDIA              |#|");
        System.out.println("=================================================");
        System.out.println("-------------------------------------------------");
        System.out.println("=================================================");
        System.out.println("CREATE ONLINE NEW SBI ACCOUNT         : PRESS 1  ");
        System.out.println("------------------------------------------------ ");
        System.out.println("CREATE ONLINE INTENET BANKING ACCOUNT : PRESS 2  ");
        System.out.println("-------------------------------------------------");
        System.out.println("LOGIN SBI INTERNET BANKING ACOUNT     : PRESS 3  ");
        System.out.println("=================================================");
       
        switch(sc.nextInt())
        {
        case 1:
        {
            Account();
            break;
        }
        case 2:
        {
             Netbanking();
             break;
        }
        case 3:
        {
            Login();
            break;
        }
        default :
        {

            System.out.println("=================================================");
            System.out.println("||         PLZ CHOOSE VALID OPTION             ||");
            System.out.println("=================================================");
             Mainmenu();
        }
        }
    }
    static void Account()
    {
        System.out.println("=================================================");
        System.out.println("|#|           WELLCOME SBI ACCOUNT            |#|");
        System.out.println("=================================================");
       
        System.out.println("ENTER YOUR  NAME            :");
        sc.nextLine();        
        String name = sc.nextLine();
       
        System.out.println("ENTER STATE                 :");
        String state =sc.nextLine();

        System.out.println("ENTER DISTRICT              :");
        String dst =sc.nextLine();

        System.out.println("ENTER BRANCH                :");
        String branch =sc.nextLine();

        System.out.println("ENTER YOUR PHONE NO         :");
        long pno = sc.nextLong();
       
        System.out.println("ENTER AMOUNT OF BANK BALANCE :");
        long bal= sc.nextLong();
       
        System.out.println("ENTER YOUR EMAIL ID          :");
        sc.nextLine();
        String email = sc.nextLine();
       
        System.out.println("ENTER YOUR PASSWORD          :");
        String pass = sc.nextLine();
       
        System.out.println("ENTER CONFORM PASSWORD      :");
        //String    cpass = sc.nextLine();
       
   
        fname=name;
        fpno=pno;
        femail=email;
        fdst=dst;
        fstate=state;
        fbranch=branch;
        fbal=bal;
       
        if(sc.nextLine().equals(pass))
        {
            System.out.println("===============================================");
            System.out.println("||  CONGRATULATION YOUR ACCOUNT HAS CREATED  ||");
            System.out.println("===============================================");
            fpass1=sc.nextLine();
            Continue();

        }
        else
        {
        System.out.println("=================================================");
        System.out.println("||             PASSWORD NOT MATCH              ||");
        System.out.println("-------------------------------------------------");
        System.out.println("|              ONE TIME ATTEMP ONLY            ||");
        System.out.println("=================================================");
        System.out.println("|              ENTER CONFORM PASSWORD:          |");
        System.out.println("=================================================");

        if(sc.nextLine().equals(pass))
        {
            System.out.println("===============================================");
            System.out.println("||  CONGRATULATION YOUR ACCOUNT HAS CREATED  ||");
            System.out.println("===============================================");
            fpass1=sc.nextLine();
            //String    cpass = sc.nextLine();
            Continue();
        }
        else
        {
            System.out.println("=================================================");
            System.out.println("||             PASSWORD NOT MATCH              ||");
            System.out.println("=================================================");
            System.out.println("||       YOU ATTEMP TWO TIME WRONG PASSWOD     ||");
            System.out.println("=================================================");
            System.out.println("||             TRY AGAIN                       ||");
            System.out.println("=================================================");
            System.out.println("||             THANK YOU                       ||");
            System.out.println("=================================================");
        }
        }
   
    }
    static void Continue()
    {
        System.out.println("=================================================");
        System.out.println("||   IF YOUR ACCOUNT IS CREATED PRESS:    01   ||");
        System.out.println("-------------------------------------------------");
        System.out.println("||  IF YOUR ACCOUNT IS NOT CREATED PRESS: 02   ||");
        System.out.println("=================================================");
       
        switch(sc.nextInt())
        {
        case 01:
        {
            System.out.println("=============================================");
            System.out.println("||  PRESS 03 FOR VIEW PROFILE DETALIS      ||");
            System.out.println("---------------------------------------------");
            System.out.println("||  PRESS 04 FOR CREATE NEW ACCOUNT        ||");
            System.out.println("=============================================");
           
            switch(sc.nextInt())
            {
            case 03:
            {
                 Costomerdetails();    
                 break;
            }
            case 04:
            {
                 Account();
            }
            default:
            {
                System.out.println("=================================================");
                System.out.println("||         PLZ CHOOSE VALID OPTION             ||");
                System.out.println("=================================================");
                Continue();
            }
            }

           
             break;
        }
        case 02:
        {
            Mainmenu();
            break;
        }
        default:
        {
            System.out.println("=================================================");
            System.out.println("||         PLZ CHOOSE VALID OPTION             ||");
            System.out.println("=================================================");
            Continue();
        }
         }
        }
    static void Costomerdetails()
    {
        System.out.println("=====================================================");
        System.out.println("||           COSTPOMER DETAILS                     ||");
        System.out.println("=====================================================");
        System.out.println("| NAME         :"+fname);
        System.out.println("| A/C NO       :"+ACNO[0]);
        System.out.println("| IFSC CODE    :"+IFSC[0]);
        System.out.println("| BANK BALANCE :"+fbal);
        System.out.println("| STATE        :"+fstate);
        System.out.println("| DISTRICT     :"+fdst);
        System.out.println("| BRANCH       :"+fbranch);
        System.out.println("| PHONE NO     :"+fpno);
        System.out.println("| EMAIL ID     :"+femail);
        System.out.println("=====================================================");
       
        System.out.println("| PRESS 06 FOR MAINMENUE:");
        if(sc.nextInt()==06)
        {
            Mainmenu();
        }
    }
    static void Netbanking()
    {
        if(fname==null)
        {
            System.out.println("=================================================");
            System.out.println("|#| YOU 1ST CREATE A/C                        |#|");
            System.out.println("=================================================");
            Mainmenu();
        }
        else
        {
        System.out.println("=================================================");
        System.out.println("|#|    CREATE SBI INTERNET ACCOUNT            |#|");
        System.out.println("=================================================");
        System.out.println("| ENTER EMAIL ID          :");
        sc.nextLine();        
        String email1= sc.nextLine();
       
        System.out.println("| ENTER A/C NUMBER         :");
        long Accno = sc.nextLong();
        if(Accno==ACNO[0])
        {
            System.out.println("| ENTER PASSWORD          :");
            sc.nextLine();        
            String pass1= sc.nextLine();
            fpass1=pass1;
           
            System.out.println("| ENTER CONFORM PASSWORD  :");
           
            if(sc.nextLine().equals(pass1))
            {
                System.out.println("===============================================");
                System.out.println("||  CONGRATULATION YOUR ACCOUNT HAS CREATED  ||");
                System.out.println("===============================================");
                String    fpass1 = sc.nextLine();
                 Netbankinguser();
            }
            else
            {
                System.out.println("=================================================");
                System.out.println("||             PASSWORD NOT MATCH              ||");
                System.out.println("-------------------------------------------------");
                System.out.println("|              ONE TIME ATTEMP ONLY            ||");
                System.out.println("=================================================");
                System.out.println("|              ENTER CONFORM PASSWORD:          |");
                System.out.println("=================================================");

                if(sc.nextLine().equals(pass1))
                {
                    System.out.println("===============================================");
                    System.out.println("||  CONGRATULATION YOUR ACCOUNT HAS CREATED  ||");
                    System.out.println("===============================================");
                    String    cpass1 = sc.nextLine();
                     Netbankinguser();
                   
                }
                else
                {
                    System.out.println("=================================================");
                    System.out.println("||             PASSWORD NOT MATCH              ||");
                    System.out.println("=================================================");
                    System.out.println("||       YOU ATTEMP TWO TIME WRONG PASSWOD     ||");
                    System.out.println("=================================================");
                    System.out.println("||             TRY AGAIN                       ||");
                    System.out.println("=================================================");
                    System.out.println("||             THANK YOU                       ||");
                    System.out.println("=================================================");
                }
            }
           
        }
        else
        {
            System.out.println("=================================================");
            System.out.println("||         ACCOUNT NUMBER IS WRONG             ||");
            System.out.println("-------------------------------------------------");
            System.out.println("||         PLZ ENTER THE VALID A/C NO          ||");
            System.out.println("=================================================");
            Netbanking();
           
        }
        }
       
    }
    static void Login()
    {
        if(fpass1==null)
        {
            System.out.println("=================================================");
            System.out.println("|#| YOU 1ST CREATE INTERNET A/C               |#|");
            System.out.println("=================================================");
            Mainmenu();
        }
        else
        {
        System.out.println("=================================================");
        System.out.println("|#|        INTERNET BANKING LOGIN             |#|");
        System.out.println("=================================================");
        System.out.println("ENTER USER ID           :");
        if(sc.nextLine().equals(femail))
        {
        System.out.println("ENTER USER PASSWORD     :");
         
        if(sc.nextLine().equals(fpass1))
        {
            System.out.println("=================================================");
            System.out.println("|#|        YOU LOGIN SUCCESSFULLY             |#|");
            System.out.println("-------------------------------------------------");
            System.out.println("| OPEN INTERNET BANKING PROFILE PRESS 05        |");
            System.out.println("=================================================");
            if(sc.nextInt()==05)
            {
                Internetuserprofile();
            }
        }
        else
        {
            System.out.println("=================================================");
            System.out.println("||             WRONG USER PASSWORD             ||");
            System.out.println("=================================================");
            Login();
        }
       
        }
        else
        {
            System.out.println("=================================================");
            System.out.println("||             WRONG USER ID XXXXX             ||");
            System.out.println("=================================================");
            Login();
        }
        }
       
    }
    static void Netbankinguser()
    {
        System.out.println("=================================================");
        System.out.println("||   SBI INTERNET BANKING USER DETAILS         ||");
        System.out.println("-------------------------------------------------");
        System.out.println("|    NOTE THE USER ID & PASSWORD                |");
        System.out.println("=================================================");
        System.out.println("| USER ID   :"+femail);
        System.out.println("| USER PASSWORD:"+fpass1);
        System.out.println("=================================================");
       
        System.out.println("| PRESS 06 FOR MAINMENUE:");
        if(sc.nextInt()==06)
        {
            Mainmenu();
        }
    }
    static void Internetuserprofile()
    {
        System.out.println("=================================================");
        System.out.println("||   SBI INTERNET BANKING USER DETAILS         ||");
        System.out.println("-------------------------------------------------");
        System.out.println("| NAME         :"+fname);
        System.out.println("| USER ID   :"+femail);
        System.out.println("| A/C NO       :"+ACNO[0]);
        System.out.println("-------------------------------------------------");
        System.out.println("| PRESS 1 FOR : VIEW THE BANK BALANCE      :    |");
        System.out.println("");
        System.out.println("| PRESS 2 FOR : VIEW THE USER ID & PASSWORD:    |");
        System.out.println("");
        System.out.println("| PRESS 3 FOR : VIEW THE ACCOUNT DETAILS   :    |");
        System.out.println("");
        System.out.println("| PRESS 4 FOR : ADD AMOUNT                 :    |");
        System.out.println("");
        System.out.println("| PRESS 5 FOR : WITHDRAWAL                 :    |");
        System.out.println("");
        System.out.println("| PRESS 6 FOR : VIEW THE DEBIT CARD        :    |");
        System.out.println(" ");
        System.out.println("| PRESS 7 FOR : VIEW MINI STATEMENT        :    |");
        System.out.println("");
        System.out.println("| PRESS 8 FOR : GENERATE NEW DEBIT CARD    :    |");
        System.out.println("");
        System.out.println("| PRESS 9 FOR : VIEW THE ATM PIN           :    |");
        System.out.println("");
        System.out.println("| PRESS 10 FOR :  LOG OUT                   :    |");
        System.out.println("-------------------------------------------------");
       
        switch(sc.nextInt())
        {
        case 1:
        {
            System.out.println("-------------------------------------------------");
            System.out.println("| BANK BALANCE :"+fbal);
            System.out.println("");
            System.out.println("-------------------------------------------------");
            System.out.println("");
            System.out.println("|             PRESS 1 FOR : BACK                |");
            System.out.println("");
            System.out.println("|             PRESS 2 FOR : MAINMENUE           |");
            System.out.println("-------------------------------------------------");
            switch(sc.nextInt())
            {
            case 1:
            {
                Internetuserprofile();
                break;
            }
            case 2:
            {
                Mainmenu();
                break;
            }
            default :
            {
                System.out.println("=================================================");
                System.out.println("||         PLZ CHOOSE VALID OPTION             ||");
                System.out.println("=================================================");
                System.out.println("");
                System.out.println("|             PRESS 1 FOR : BACK                |");
                System.out.println("");
                System.out.println("|             PRESS 2 FOR : MAINMENUE           |");
                System.out.println("-------------------------------------------------");
                switch(sc.nextInt())
                {
                case 1:
                {
                    Internetuserprofile();
                    break;
                }
                case 2:
                {
                    Mainmenu();
                    break;
                }
                }
                }
            }
            break;
        }
        case 2:
        {

            System.out.println("-------------------------------------------------");
            System.out.println("| USER ID   :"+femail);
            System.out.println("| USER PASSWORD:"+fpass1);
            System.out.println("");
            System.out.println("-------------------------------------------------");
            System.out.println("");
            System.out.println("|             PRESS 1 FOR : BACK                |");
            System.out.println("");
            System.out.println("|             PRESS 2 FOR : MAINMENUE           |");
            System.out.println("-------------------------------------------------");
            switch(sc.nextInt())
            {
            case 1:
            {
                Internetuserprofile();
                break;
            }
            case 2:
            {
                Mainmenu();
                break;
            }
            default :
            {
                System.out.println("=================================================");
                System.out.println("||         PLZ CHOOSE VALID OPTION             ||");
                System.out.println("=================================================");
                System.out.println("");
                System.out.println("|             PRESS 1 FOR : BACK                |");
                System.out.println("");
                System.out.println("|             PRESS 2 FOR : MAINMENUE           |");
                System.out.println("-------------------------------------------------");
                switch(sc.nextInt())
                {
                case 1:
                {
                    Internetuserprofile();
                    break;
                }
                case 2:
                {
                    Mainmenu();
                    break;
                }
                }
                }
            }
            break;
        }
        case 3:
        {
            System.out.println("=====================================================");
            System.out.println("||           COSTPOMER DETAILS                     ||");
            System.out.println("=====================================================");
            System.out.println("| NAME         :"+fname);
            System.out.println("| A/C NO       :"+ACNO[0]);
            System.out.println("| IFSC CODE    :"+IFSC[0]);
            System.out.println("| BANK BALANCE :"+fbal);
            System.out.println("| STATE        :"+fstate);
            System.out.println("| DISTRICT     :"+fdst);
            System.out.println("| BRANCH       :"+fbranch);
            System.out.println("| PHONE NO     :"+fpno);
            System.out.println("| EMAIL ID     :"+femail);
            System.out.println("=====================================================");
            System.out.println("");
            System.out.println("|             PRESS 1 FOR : BACK                |");
            System.out.println("");
            System.out.println("|             PRESS 2 FOR : MAINMENUE           |");
            System.out.println("-------------------------------------------------");
            switch(sc.nextInt())
            {
            case 1:
            {
                Internetuserprofile();
                break;
            }
            case 2:
            {
                Mainmenu();
                break;
            }
            default :
            {
                System.out.println("=================================================");
                System.out.println("||         PLZ CHOOSE VALID OPTION             ||");
                System.out.println("=================================================");
                System.out.println("");
                System.out.println("|             PRESS 1 FOR : BACK                |");
                System.out.println("");
                System.out.println("|             PRESS 2 FOR : MAINMENUE           |");
                System.out.println("-------------------------------------------------");
                switch(sc.nextInt())
                {
                case 1:
                {
                    Internetuserprofile();
                    break;
                }
                case 2:
                {
                    Mainmenu();
                    break;
                }
                }
            }
            }
            break;
        }
        case 4:
        {
            Addamount();
            break;
        }
        case 5:
        {
            Withdraval();
            break;
        }
        case 6:
        {
            Debitcard();
            break;
        }
        case 7:
        {
            Statement();
            break;
        }
        case 8:
        {
            GenerateDbt();
            break;
        }
        case 9:
        {
            Atmpin();
            break;
        }
        case 10:
        {
            Mainmenu();
            break;
        }
        default :
        {
            System.out.println("=================================================");
            System.out.println("||         PLZ CHOOSE VALID OPTION             ||");
            System.out.println("=================================================");
            Internetuserprofile();
        }
       
        }
    }
    static void Addamount()
    {
        System.out.println("=================================================");
        System.out.println("| ENTER AMOUNT FOR ADDD MAONEY: ");
        long crd = sc.nextLong();
        fbal +=crd;
        credit=crd;
        Date date = new Date();
        fdate=date;
        System.out.println("-------------------------------------------------");
        System.out.println("||      YOU CREDIT SCCESSFUUL                  ||");
        System.out.println("-------------------------------------------------");
        System.out.println(date.toString()+"| CREDIT  BALANCE: RS " +credit);
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("|             PRESS 1 FOR : BACK                |");
        System.out.println("");
        System.out.println("|             PRESS 2 FOR : MAINMENUE           |");
        System.out.println("-------------------------------------------------");
        switch(sc.nextInt())
        {
        case 1:
        {
            Internetuserprofile();
            break;
        }
        case 2:
        {
            Mainmenu();
            break;
        }
        default :
        {
            System.out.println("=================================================");
            System.out.println("||         PLZ CHOOSE VALID OPTION             ||");
            System.out.println("=================================================");
            System.out.println("");
            System.out.println("|             PRESS 1 FOR : BACK                |");
            System.out.println("");
            System.out.println("|             PRESS 2 FOR : MAINMENUE           |");
            System.out.println("-------------------------------------------------");
            switch(sc.nextInt())
            {
            case 1:
            {
                Internetuserprofile();
                break;
            }
            case 2:
            {
                Mainmenu();
                break;
            }
             }
            }
        }
    }
    static void Withdraval()
    {
        System.out.println("=================================================");
        System.out.println("|              STATE BANK OF INDIA              |");
        System.out.println("-------------------------------------------------");
        System.out.println("|   ENTER THE 4 DIGITS PIN : FOR WITHDRAWAL     |");
        System.out.println("");
        System.out.println("| IF YOU ARE NOT CREATED THE VIRTUAL ATM CARD THEN BACK PRESS 1 ");
        int pin = sc.nextInt();
        if(pin==fPin[i])
        {
            System.out.println("| ENTER THE AMOUNT : FOR WITHRAWAL          |");
            long dbt = sc.nextLong();
            if(fbal>=dbt)
            {
            fbal -=dbt;
            debit=dbt;
            System.out.println("-------------------------------------------------");
            System.out.println("|            WITHDRAVAL SUCCESSFULL             |");
            System.out.println("");
            System.out.println("|          COLLECT YOUR MONEY : RS "+debit+"    |");
            System.out.println("-------------------------------------------------");
            System.out.println("=================================================");
            System.out.println("");
            System.out.println("|             PRESS 1 FOR : AGAIN WITHDRAVAL    |");
            System.out.println("");
            System.out.println("|   PRESS 2 FOR : GO TO NETBANKING PROFILE      |");
            System.out.println("-------------------------------------------------");
            switch(sc.nextInt())
            {
            case 1:
            {
                Withdraval();
                break;
            }
            case 2:
            {
                Internetuserprofile();
                break;
            }
            default :
            {
                System.out.println("=================================================");
                System.out.println("||         PLZ CHOOSE VALID OPTION             ||");
                System.out.println("=================================================");
                System.out.println("=================================================");
                System.out.println("");
                System.out.println("|             PRESS 1 FOR : AGAIN WITHDRAVAL    |");
                System.out.println("");
                System.out.println("|   PRESS 2 FOR : GO TO NETBANKING PROFILE      |");
                System.out.println("-------------------------------------------------");
                switch(sc.nextInt())
                {
                case 1:
                {
                    Withdraval();
                    break;
                }
                case 2:
                {
                    Internetuserprofile();
                    break;
                }
                default :
                {
                    System.out.println("=================================================");
                    System.out.println("||         PLZ CHOOSE VALID OPTION             ||");
                    System.out.println("=================================================");
                }
                }
            }
            }
            }
            else
            {
                System.out.println("=================================================");
                System.out.println("||         INSUFFICIENT BALANCE                ||");
                System.out.println("=================================================");
                Withdraval();
            }
        }
        else if(pin==1)
        {
            Internetuserprofile();
        }
        else
        {

            System.out.println("=================================================");
            System.out.println("||         PLZ CHOOSE VALID OPTION             ||");
            System.out.println("=================================================");
            Withdraval();
        }
        System.out.println("");
        System.out.println("-------------------------------------------------");
    }
    static void Debitcard()
    {
        if(fPin[i]==0)
        {
            System.out.println("=================================================");
            System.out.println("| YOU ARE NOT GENERATE ATM CARD 1ST GENARATE THE ATM CARD   |");
            System.out.println("-------------------------------------------------");
            Internetuserprofile();
        }
        else
        {
        System.out.println("=================================================");
        System.out.println("|              STATE BANK OF INDIA              |");
        System.out.println("-------------------------------------------------");
        System.out.println(" ENTER THE 4 DIGITS ATM PIN FOR : VERIFICATION ");
        System.out.println("");
        if(sc.nextInt()==fPin[i])
        {
            System.out.println("=================================================");
            System.out.println("| DEBIT CARD                          SBI ATM   |");
            System.out.println("|                                               |");
            System.out.println("|  |[X][X]|                                     |");
            System.out.println("|  |[X][X]|                                     |");
            System.out.println("|                                               |");
            System.out.println("|             6543 8765 9875 6543               |");
            System.out.println("|                                               |");
            System.out.println("| CVV: 756                       EXP:01-01-2030 |");
            System.out.println("|                                               |");
            System.out.println("| "+fname+ "                         |");
            System.out.println("=================================================");
            System.out.println("");
            System.out.println("|             PRESS 1 FOR : BACK                |");
            System.out.println("");
            System.out.println("|             PRESS 2 FOR : MAINMENUE           |");
            System.out.println("-------------------------------------------------");
            switch(sc.nextInt())
            {
            case 1:
            {
                Internetuserprofile();
                break;
            }
            case 2:
            {
                Mainmenu();
                break;
            }
            default :
            {
                System.out.println("=================================================");
                System.out.println("||         PLZ CHOOSE VALID OPTION             ||");
                System.out.println("=================================================");
                Statement();
            }
            }
        }
        else
        {
            System.out.println("=================================================");
            System.out.println("|         YOU ENTERED WRONG PIN                 |");
            System.out.println("=================================================");
            System.out.println("|         PLZ ENTER CORRECT PIN                 |");
            Debitcard();
        }
        }
    }
    static void Statement()
    {
        System.out.println("=================================================");
        System.out.println("|              STATE BANK OF INDIA              |");
        System.out.println("-------------------------------------------------");
        System.out.println("|              MINI STATEMENT                   |");
        System.out.println("-------------------------------------------------");
        prebal = (fbal-credit+debit);
        System.out.println("| PREVIOUS BALANCE: RS " +(prebal));
        System.out.println("");
        System.out.println("| CREDIT   BALANCE: RS " +(credit));
        System.out.println("");
        System.out.println("| DEBITED  BALANCE: RS " +(debit));
        System.out.println("-------------------------------------------------");
        System.out.println("| TOTAL    BALANCE: RS " +fbal);
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("|             PRESS 1 FOR : BACK                |");
        System.out.println("");
        System.out.println("|             PRESS 2 FOR : MAINMENUE           |");
        System.out.println("-------------------------------------------------");
        switch(sc.nextInt())
        {
        case 1:
        {
            Internetuserprofile();
            break;
        }
        case 2:
        {
            Mainmenu();
            break;
        }
        default :
        {
            System.out.println("=================================================");
            System.out.println("||         PLZ CHOOSE VALID OPTION             ||");
            System.out.println("=================================================");
            Statement();
        }
        }
   
    }
    static void GenerateDbt()
    {
            System.out.println("=================================================");
            System.out.println("||          GENERATE SBI DEBIT CARD            ||");
            System.out.println("-------------------------------------------------");
            System.out.println("ENTER USER ID           :");
            if(sc.nextLine().equals(femail))
            {
            System.out.println("ENTER USER PASSWORD     :");
            if(sc.nextLine().equals(fpass1))
            {
                System.out.println("| SET ATM 4 DIGITS PIN    :");
                System.out.println("| DON'T USE 1ST DIGIT 0 |");
                 int pin= sc.nextInt();
                 
                if(pin>=1000 && pin<=9999)
                {
                     fPin[i]=pin;
                    System.out.println("=================================================");
                    System.out.println("||   CONGRATULATION YOUR ATM GENERATED         ||");
                    System.out.println("=================================================");
                    System.out.println("| PRESS 1 FOR : VIEW ATM CARD DEATILS            |");
                    System.out.println("-------------------------------------------------");
                    System.out.println("| PRESS 2 FOR : BACK                            |");
                    System.out.println("-------------------------------------------------");
                    switch(sc.nextInt())
                    {
                    case 1:
                    {
                        Debitcard();
                        break;
                    }
                    case 2:
                    {
                        Internetuserprofile();
                        break;
                    }
                    default :
                    {
                        System.out.println("=================================================");
                        System.out.println("||         PLZ CHOOSE VALID OPTION             ||");
                        System.out.println("=================================================");
                        System.out.println("=================================================");
                        System.out.println("| PRESS 1 FOR : VIEW ATM CARD DEATILS            |");
                        System.out.println("-------------------------------------------------");
                        System.out.println("| PRESS 2 FOR : BACK                            |");
                        System.out.println("-------------------------------------------------");
                        switch(sc.nextInt())
                        {
                        case 1:
                        {
                            Debitcard();
                            break;
                        }
                        case 2:
                        {
                            Internetuserprofile();
                            break;
                        }
                        default :
                        {
                            System.out.println("=================================================");
                            System.out.println("||         SORRY ENTER WRONG OPTION             ||");
                            System.out.println("=================================================");
                        }
                        }
                    }
                    }
                }
                else if(pin<1000)
                {
                    System.out.println("=================================================");
                    System.out.println("||    SORRY! YOU CAN'T USE 1ST DIGIT 0         ||");
                    System.out.println("=================================================");
                    GenerateDbt();
                }
                else
                {
                    System.out.println("=================================================");
                    System.out.println("||    SORRY! ENTER  4 DIGITS PIN ONLY          ||");
                    System.out.println("=================================================");
                    GenerateDbt();
                }
           }
            else
            {
                System.out.println("=================================================");
                System.out.println("||         PLZ ENTER VALID PASSWORD            ||");
                System.out.println("=================================================");
                GenerateDbt();
            }
            }    
            else
            {
                System.out.println("=================================================");
                System.out.println("||         PLZ ENTER VALID USER ID             ||");
                System.out.println("=================================================");
                GenerateDbt();
            }
           
    }
    static void Atmpin()
    {
    if(fPin[i]==0)
    {
        System.out.println("=================================================");
        System.out.println("| YOU ARE NOT GENERATE ATM CARD 1ST GENARATE THE ATM CARD   |");
        System.out.println("-------------------------------------------------");
        Internetuserprofile();
    }
    else
    {
       
        System.out.println("=================================================");
        System.out.println("|#|        SBI ATM PIN KNOW                   |#|");
        System.out.println("=================================================");
        System.out.println("ENTER USER ID           :");
        if(sc.nextLine().equals(femail))
        {
        System.out.println("ENTER USER PASSWORD     :");
         
        if(sc.nextLine().equals(fpass1))
        {
            if(fPin[i]==0)
                    {
                System.out.println("=================================================");
                System.out.println("| YOUR ARE NOT GENERATE ATM                     |");
                System.out.println("|-----------------------------------------------|");
                System.out.println("| YOUR FIRST GENERATE THE ATM                   |");
                System.out.println("=================================================");
                Internetuserprofile();
                    }
            else {
            System.out.println("=================================================");
            System.out.println("| YOUR ATM PIN IS:"+fPin[i]);
            System.out.println("=================================================");
            System.out.println("");
            System.out.println("|             PRESS 1 FOR : BACK                |");
            System.out.println("");
            System.out.println("|             PRESS 2 FOR : MAINMENUE           |");
            System.out.println("-------------------------------------------------");
            switch(sc.nextInt())
            {
            case 1:
            {
                Internetuserprofile();
                break;
            }
            case 2:
            {
                Mainmenu();
                break;
            }
            default :
            {
                System.out.println("=================================================");
                System.out.println("||         PLZ CHOOSE VALID OPTION             ||");
                System.out.println("=================================================");
                System.out.println("=================================================");
                System.out.println("");
                System.out.println("|             PRESS 1 FOR : BACK                |");
                System.out.println("");
                System.out.println("|             PRESS 2 FOR : MAINMENUE           |");
                System.out.println("-------------------------------------------------");
                switch(sc.nextInt())
                {
                case 1:
                {
                    Internetuserprofile();
                    break;
                }
                case 2:
                {
                    Mainmenu();
                    break;
                }
                default :
                {
                    System.out.println("=================================================");
                    System.out.println("||         SORRY YOU ARE AUTO EXIST:          ||");
                    System.out.println("=================================================");
                    Mainmenu();
                }
                }
            }
            }
                   }
        }
        else
        {
            System.out.println("=================================================");
            System.out.println("||             WRONG USER PASSWORD             ||");
            System.out.println("=================================================");
            Atmpin();
        }
        }
        else
        {
            System.out.println("=================================================");
            System.out.println("||             WRONG USER ID XXXXX             ||");
            System.out.println("=================================================");
            Atmpin();
        }
    }
    }
   
    public static void main(String[] args)
    {
        Mainmenu();
    }

}
