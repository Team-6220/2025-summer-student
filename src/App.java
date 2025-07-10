import Stuff.Player;
public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Player jeff = new Player("Jef", 35, true);
        Player jeff1 = new Player("Jef", 35, true);
        Player jeff2= new Player("Jef", 35, true);
        Player jeff3 = new Player("Jef", 35, true);
        Player jeff4 = new Player("Jef", 35, true);
        Player jeff5 = new Player("Jef", 35, true);
        Player jeff6 = new Player("Jef", 35, true);
        // System.out.println(jeff.getName() + " is" + (jeff.getIsHappy()? " happy " : " not happy "));
        System.out.println(Player.getTotalPlayers());
        jeff.thisIsAMethod();
        System.out.println(Player.getTotalPlayers());
    }
}