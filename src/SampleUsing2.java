public class SampleUsing2 {
    public static void main(String[] args) {
        try (SampleResource resource = new SampleResource()) {
            throw new Exception();
        } catch (Exception e) {
            for (Throwable t : e.getSuppressed()) {
                System.out.println(t);
            }
        } finally {
            System.out.println("finally");
        }
    }
}
