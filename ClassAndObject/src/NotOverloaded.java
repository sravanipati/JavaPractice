

class NoLoad {
    public void bestMethod(int i) {
        System.out.println("bestMethod for int");
    }
}

public class NotOverloaded {
    public static void main(String[] args) {
        NoLoad n = new NoLoad();
        n.bestMethod(1);
    }

}