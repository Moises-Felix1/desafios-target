package teste5;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Há 3 interruptores e 3 lâmpadas. Cada interruptor controla uma lâmpada.");
        System.out.println("Você vai descobrir qual interruptor controla qual lâmpada com base no estado das lâmpadas.");

        // Estado inicial: todos os interruptores estão desligados e as lâmpadas estão frias
        boolean lampada1Acendida = false;
        boolean lampada2Acendida = false;
        boolean lampada3Acendida = false;

        boolean lampada1Quente = false;
        boolean lampada2Quente = false;
        boolean lampada3Quente = false;

        // Etapa 1: Ligar o interruptor A (Controla a Lâmpada 1)
        System.out.println("Ligando o Interruptor 'A' por alguns minutos...");
        lampada1Acendida = true;
        lampada1Quente = true; // A lâmpada 1 vai aquecer

        // Etapa 2: Desligar o interruptor A e ligar o interruptor B (Controla a Lâmpada 2)
        System.out.println("Desligando o Interruptor A e ligando o Interruptor B...");
        lampada1Acendida = false; // Agora a lâmpada 1 está apagada, mas ainda quente
        lampada2Acendida = true; // Lâmpada 2 acesa

        // Simular ida à sala das lâmpadas
        System.out.println("Vá até a sala das lâmpadas para verificar o estado delas.");
        
        // Solicitar ao usuário que informe o estado das lâmpadas
        System.out.print("A lâmpada 1 está quente? (sim/nao): ");
        String lampada1Estado = sc.nextLine();

        System.out.print("A lâmpada 2 está acesa? (sim/nao): ");
        String lampada2Estado = sc.nextLine();

        System.out.print("A lâmpada 3 está apagada e fria? (sim/nao): ");
        String lampada3Estado = sc.nextLine();

        // Verificar qual interruptor controla qual lâmpada com base nas respostas
        if (lampada2Estado.equalsIgnoreCase("sim")) {
            System.out.println("A lâmpada 2 é controlada pelo Interruptor B.");
        }

        if (lampada1Estado.equalsIgnoreCase("sim")) {
            System.out.println("A lâmpada 1 é controlada pelo Interruptor A.");
        }

        if (lampada3Estado.equalsIgnoreCase("sim")) {
            System.out.println("A lâmpada 3 é controlada pelo Interruptor C.");
        }

        sc.close();
	}

}
