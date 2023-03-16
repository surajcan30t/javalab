public class l9j3 {
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }
}
