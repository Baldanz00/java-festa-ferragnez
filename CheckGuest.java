
/*CICLO FOR */
/*import java.util.Scanner;
public class CheckGuest {
    public static void main(String[] args) {
        // Lista degli invitati
        String[] guestList = {
            "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
            "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"
        };

        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente come si chiama
        System.out.print("Ciao! Come ti chiami? ");
        String guestName = scanner.nextLine();

        // Verifica se il nome è presente nella lista (case insensitive)
        boolean isInvited = false;
        for (int i = 0; i < guestList.length; i++) {
            if (guestList[i].equalsIgnoreCase(guestName)) {
                isInvited = true;
                break;
            }
        }

        // Risposta in base alla verifica
        if (isInvited) {
            System.out.println("Benvenuto/a alla festa! 🎉");
        } else {
            System.out.println("Mi dispiace, non sei nella lista. Torna a casa ");
        }

        scanner.close();
    }
} */



/*CICLO WHILE */
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] guestList = {
            "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
            "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ciao! Come ti chiami? ");
        String guestName = scanner.nextLine();

        boolean isInvited = false;
        int i = 0;

        while (i < guestList.length) {
            if (guestList[i].equalsIgnoreCase(guestName)) {
                isInvited = true;
                break;
            }
            i++;
        }

        if (isInvited) {
            System.out.println("Benvenuto/a alla festa! 🎉");
        } else {
            System.out.println("Mi dispiace, non sei nella lista. Torna a casa 😎");
        }

        scanner.close();
    }
}