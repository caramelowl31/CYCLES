import ru.netology.java.CYCLES.services.RecreationService;

public class Main {

    public static void main(String[] args) {
        RecreationService service = new RecreationService();

        int recreation = service.calculate(10_000,3_000,20_000);
        System.out.println(recreation);

        recreation = service.calculate(100_000,60_000,150_000);
        System.out.println(recreation);
    }

}