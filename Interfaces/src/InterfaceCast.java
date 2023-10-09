
interface Laughable {
    void laugh();
}

class Joke implements Laughable {
    public void laugh() {
        System.out.println("That joke is laughable");
    }
}

class Story {
    public void read() {
        System.out.println("This story is a good read");
    }
}

class FunnyStory extends Story implements Laughable {

    public void laugh() {
        System.out.println("That story is funny");
    }

    public void read() {
        System.out.println("This story is a good giggle");
    }
}

class Farce extends Story implements Laughable {
    public void laugh() {
        System.out.println("This story is funny in a farcical way");
    }
}

public class InterfaceCast {
    public static void main(String[] args) {
        Story story = new Farce();
        FunnyStory funnyStory = new FunnyStory();
        Joke joke = new Joke();

        testLaughable(joke);
        testLaughable(funnyStory);

        testStory(story);
        testStory(funnyStory);

        testLaughable((Laughable) story);
    }


    public static void testLaughable(Laughable l) {
        l.laugh();
    }

    public static void testStory(Story s) {
        s.read();
    }
}