import java.util.*;
import java.util.stream.Collections;

public class MonitoramentoLogAWS{
    public static void main(String[] arsg){
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Realizar a limpesa do buffer do scanner


        Map<String, Long> enventosPorServico = new HashMap<>();
        for(int i = 0; <quantidadeLogs; i++){
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1].trim();
        }
    }
}