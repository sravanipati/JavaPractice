
interface Expandable {
    void expand();
}

interface Collapsible {
    void collapse();
}

class IceCooler implements Collapsible {
    public void collapse() {
        System.out.println("Camping trip over, fold it up.");
    }
}

class SuitCase implements Expandable {
    public void expand() {
        System.out.println("New clothes bought on vacation.  Expand.");
    }
}

class Portfolio implements Expandable, Collapsible {

    public void expand() {
        System.out.println("Bull market, Portfolio gets bigger.");
    }

    public void collapse() {
        System.out.println("Bear market, Portfolio shrinks to nothing.");
    }
}

public class TestGrowth {
    public static void main(String[] args) {
        IceCooler ic = new IceCooler();
        SuitCase sc = new SuitCase();
        Portfolio p = new Portfolio();

        Expandable[] eList = {p, sc};
        Collapsible[] cList = {p, ic};

        System.out.println(".... Test the Expandable Objects....");
        for (Expandable e : eList) {
            TestExpand(e);
        }

        System.out.println("\n.... Test the Collapsible Objects....");
        for (Collapsible c : cList) {
            TestCollapse(c);
        }

    }

    public static void TestExpand(Expandable e) {
        System.out.println(e.getClass().getName());
        e.expand();
    }

    public static void TestCollapse(Collapsible c) {
        System.out.println(c.getClass().getName());
        c.getClass().getName();
        c.collapse();
    }
}