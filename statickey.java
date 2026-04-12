class Friend{
    String name;
    static int numberOfFriends;

    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends(){
        System.out.println("You have "+numberOfFriends+" Friends");
    }
}
public class statickey {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Pawan");
        Friend friend2 = new Friend("Ritu");
        Friend friend3 = new Friend("Allo");
        Friend friend4 = new Friend("Motu");



        // System.out.println(Friend.numberOfFriends);
        Friend.displayFriends(); 
    }
}
