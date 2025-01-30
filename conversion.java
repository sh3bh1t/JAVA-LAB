interface Compute {
    void convert();
}

class GBtoBytes implements Compute {
    double gb;
    GBtoBytes(double gb) {
        this.gb = gb;
    }

    public void convert() {
        System.out.println(gb + " GB = " + gb * 1073741824 + " bytes");
    }
}

class EuroToRupees implements Compute {
    double euro;
    EuroToRupees(double euro) {
        this.euro = euro;
    }

    public void convert() {
        System.out.println(euro + " Euro = " + euro * 90 + " Rupees");
    }
}

public class conversion {
    public static void main(String[] args) {
        Compute gbToBytes = new GBtoBytes(2);  // 2 GB
        Compute euroToRupees = new EuroToRupees(50);  // 50 Euro

        gbToBytes.convert();  // Convert GB to bytes
        euroToRupees.convert();  // Convert Euro to Rupees
    }
}
