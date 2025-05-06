abstract class VisitorPass {
    abstract int calculateTicketPrice(int numberOfVisitors);
}

class VIPPass extends VisitorPass {
    int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 1000;
    }
}

class FamilyPass extends VisitorPass {
    int calculateTicketPrice(int numberOfVisitors) {
        int pricePerVisitor = (numberOfVisitors >= 4) ? 350 : 400;
        return numberOfVisitors * pricePerVisitor;
    }
}

class GeneralPass extends VisitorPass {
    int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 500;
    }
}

public class Main {
    public static void main(String[] args) {
        VisitorPass vip = new VIPPass();
        VisitorPass family = new FamilyPass();
        VisitorPass general = new GeneralPass();

        System.out.println("VIP Pass Total Price: Rs. " + vip.calculateTicketPrice(2));
        System.out.println("Family Pass Total Price: Rs. " + family.calculateTicketPrice(5));
        System.out.println("General Pass Total Price: Rs. " + general.calculateTicketPrice(3));
    }
}
