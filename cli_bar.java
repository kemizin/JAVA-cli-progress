package github;

public class barra_de_progresso {
    public static void main(String[] args) throws InterruptedException {
        
        int porcentagem = 0;

        // Spinner animation characters
        char[] spinner = {'\\', '|', '/', '-'};
        int i = 0;

        while (porcentagem <= 100) {
            int blocos = porcentagem / 10;

            String barra = "▋".repeat(blocos) + " ".repeat(10 - blocos); // you can change the char, in java you can use ▋ idk why/

            System.out.printf(
                "\r|%s| %d%% %c",
                barra,
                porcentagem,
                spinner[i % 4]
            );

            i++;
            porcentagem++;

            //you can delete this 
            long tempo = 100; // 0.1s
            if (porcentagem == 100) {
                tempo = 10_000; // 10s
            } else if (porcentagem > 50) {
                tempo = 40; // 0.04s
            }

            Thread.sleep(tempo);
        }

        System.out.println();
        System.out.println("download completo com sucesso");
    }
}
