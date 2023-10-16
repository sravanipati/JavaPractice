
package pkgTwo;
 
import pkgOne.LevelTwoClass;
 
class LevelThreeClass extends LevelTwoClass {
 
    LevelThreeClass() {
        this("good");
        System.out.println("package LevelThreeClass " +
                "no args constructor");
    }
 
    private LevelThreeClass(String text) {
        super();
        System.out.println("private LevelThreeClass " +
                "single params constructor");
    }
}
 
public class ConstructorAccess {
    public static void main(String[] args) {
        LevelThreeClass c = new LevelThreeClass();
 
    }
}