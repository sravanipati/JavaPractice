
package pkgOne;

class LevelOneClass {
    protected LevelOneClass() {
        System.out.println("protected LevelOneClass " +
                "no args constructor");
    }

    LevelOneClass(String text) {
        System.out.println("package level LevelOneClass " +
                "single params constructor");
    }
}

public class LevelTwoClass extends LevelOneClass {

    protected LevelTwoClass() {
        System.out.println("protected LevelTwoClass " +
                "no args constructor");
    }

    LevelTwoClass(String text) {
        System.out.println("package level LevelTwoClass " +
                "single params constructor");
    }
}