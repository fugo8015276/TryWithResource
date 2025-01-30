public class SampleUsing {
    public static void main(String[] args) {
        try (SampleResource resource = new SampleResource()) {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
