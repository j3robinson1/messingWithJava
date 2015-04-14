import java.io.Console;
public class MadLib {

  public static void main(String[] args) {
    Console console = System.console();
    String ageAsString = console.readLine("Enter your age:  ");
    int age = Integer.parseInt(ageAsString);
    if (age < 13) {
      console.printf("Sorry you must be atleast 13 to use this program.\n");
      System.exit(0);
    }
    String name = console.readLine("Enter your name:  ");
    String adjective = console.readLine("Enter an adjective:  ");
    String noun = console.readLine("Enter a noun:  ");
    String adverb = console.readLine("Enter a adverb:  ");
    String verb = console.readLine("Enter a verb ending in -ing:  ");
    console.printf("%s is a %s %s. They are always %s %s\n", name, adjective, noun, adverb, verb);
  }
}