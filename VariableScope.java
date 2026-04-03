import java.util.Random;

class DiceRoller{

    int number;
    Random random;
    DiceRoller(){
        this.random = new Random();
        roll();
    }

    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
public class VariableScope {
    public static void main(String[] args) {
      DiceRoller diceRoller = new DiceRoller();  
    }
}
