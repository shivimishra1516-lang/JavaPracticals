final class AlphaBox {

    void encrypt() {
        System.out.println("Encrypting...");
    }

    void decrypt() {
        System.out.println("Decrypting...");
    }

    void validateToken() {
        System.out.println("Token is valid");
    }
}

public class Practical08 {

    public static void main(String[] args) {

        AlphaBox obj = new AlphaBox();

        obj.encrypt();
        obj.decrypt();
        obj.validateToken();
    }
}