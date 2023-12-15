import java.util.ArrayList;
import java.util.Random;

public class ArtPieces {
    public static String[] generate() {
        String[] artPieces = new String[100];
        String[] firstName = {"Pablo", "Vincent", "Leonardo", "Rembrandt", "Michelangelo", "Salvador", "Claude",
            "Edvard", "Frida", "Henri", "Gustav", "Georgia", "Jackson", "Wassily", "Piet", "Yayoi", "Tamara",
            "Banksy", "Ai", "Jean-Michel", "Keith", "Anselm", "Damien", "David", "Jeff", "Yoko", "Marina",
            "Tracey", "Cindy", "Jenny", "Swoon", "Kara", "JR", "Kehinde", "Shirin", "Gerhard", "Richard",
            "Francis", "Mark", "Cy", "Chuck", "Sol", "Donald", "Bridget", "Ellsworth", "Joan", "Agnes",
            "Louise", "Barbara", "Catherine", "Mary", "Miriam", "Hilma", "Niki", "Lorraine", "Loie", "Anna",
            "Yvonne", "Ruth", "Betye", "Alma", "Kara", "Zarina", "Helen", "Yoko", "Carolee", "Adrian",
            "Hans", "Marcel", "Man", "Max", "Kazimir", "Robert", "Alfred", "Jasper", "Frank", "Willem",
            "Richard", "Lee", "Clyfford", "Dan", "Ellsworth", "Robert", "Donald", "Agnes", "Franz", "Louise",
            "Joan", "Eva", "Dorothea", "Georgia", "Alice", "Berthe", "Mary", "Cassatt", "Kathe", "Camille",
            "Tamara", "Zinaida", "Judith", "Artemisia", "Angelica", "Rosa", "Sofonisba", "Frida", "Yayoi",
            "Louise", "Cindy", "Marlene", "Barbara", "Kiki"};
        String[] lastName = {"Picasso", "Van Gogh", "da Vinci", "van Rijn", "Buonarroti", "Dali", "Monet", "Munch",
            "Kahlo", "Matisse", "Klimt", "O'Keeffe", "Pollock", "Kandinsky", "Mondrian", "Kusama", "de Lempicka",
            "Banksy", "Weiwei", "Basquiat", "Haring", "Kiefer", "Hirst", "Lynch", "Koons", "Ono", "Abramovic",
            "Emin", "Sherman", "Holzer", "Swoon", "Walker", "Graffiti", "Wiley", "Neshat", "Richter", "Serra",
            "Bacon", "Rothko", "Bourgeois", "Turrell", "Close", "Kruger", "Sultan", "Judd", "Andre", "Irwin",
          "Flavin", "Hepworth", "Calder", "Gonzalez-Torres", "Jacobs"};
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            String artName = "\"" + firstName[random.nextInt(firstName.length)] + " " 
                + lastName[random.nextInt(lastName.length)] + "\"";
            artPieces[i] = artName;
        }
        return artPieces;
    }
}
