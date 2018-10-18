import java.util.*;

public class practicum4 {
    public static void main(String[] args)
    {

        boolean runGame = true;

        Scanner scan = new Scanner(System.in);

        String input = "";
        String[] commandos = { "hoger", "lager", "exit" };

        double getalStart = 0;
        double getalEind = 0;


        while (runGame)  // runGame == true
        {
            getalStart = Math.ceil(Math.random() *10);

            System.out.println("Getal is:" +getalStart);


            //input controleren
            boolean geldigeInput = false;

            while (geldigeInput == false)
            {
                input = scan.nextLine();
                input = input.toLowerCase();

                for (int i = 0; i < commandos.length; i++)
                {
                    if (input.equals(commandos[i]))
                    {
                        //input is gelgig
                        geldigeInput = true;
                        break; //breek de loop af omdat wij al input hebben
                    }
                }


            }
            //input evalueren
            getalEind = Math.ceil(Math.random() *10);

            boolean win = false;
            if (input.equals(commandos[0])) //"hoger"
            {
                if (getalEind > getalStart)
                {
                    //gewonnen
                }
            }
                else if (input.equals(commandos[1])) //"lager"
            {
                if (getalEind < getalStart);
            }
            else
            {

                //niet hoger of lager, dan zal het wel exit zijn
                runGame = false;
                continue;
            }
            //eindresultaat tonen
            System.out.println("Getal start is:" + getalStart);
            System.out.println("Getal eind is:" + getalEind);
            if (getalEind != getalStart)
            {
                if (win)
                {
                    //je hebt gewonnen
                }
                else
                {
                    //je hebt verloren
                }
            }
        }

    }
}
