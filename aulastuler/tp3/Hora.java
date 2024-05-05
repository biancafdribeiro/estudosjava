import java.util.InputMismatchException;
import java.util.Scanner;

public class Hora {
    //atributos
    private int hora;
    private int min;
    private int seg;

    // Construtor que permite ao usuário digitar os valores de hora, minuto e segundo durante a criação do objeto
    public Hora() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Digite as horas (0-23):");
                hora = scanner.nextInt();

                if (hora < 0 || hora > 23) {
                    System.out.println("Hora inválida. Por favor, digite novamente.");
                    continue;
                }
            break; //quando digita um valor válido

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.nextLine();
            }
        }

        while (true) {
            try {
                System.out.println("Digite os minutos (0-59):");
                min = scanner.nextInt();

                if (min < 0 || min > 59) {
                    System.out.println("Minutos inválidos. Por favor, digite novamente.");
                    continue;
                }
                break; //quando digita um valor válido

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.nextLine();
            }
        }

        while (true) {
            try {
                System.out.println("Digite os segundos (0-59):");
                seg = scanner.nextInt();

                if (seg < 0 || seg > 59) {
                    System.out.println("Segundos inválidos. Por favor, digite novamente.");
                    continue;
                }
                break; //quando digita um valor válido

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.nextLine();
            }
        }
    }

    public int getHor() {
        return hora;
    }

    public void setHor() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Digite as horas atualizadas (0-23):");
                hora = scanner.nextInt();

                if (hora < 0 || hora > 23) {
                    System.out.println("Hora inválida. Por favor, digite novamente.");
                    continue;
                }
                break; //quando digita um valor válido

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.nextLine();
            }
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Digite os minutos atualizados (0-59):");
                min = scanner.nextInt();

                if (min < 0 || min > 59) {
                    System.out.println("Minutos inválidos. Por favor, digite novamente.");
                    continue;
                }
                break; //quando digita um valor válido

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.nextLine();
            }
        }
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Digite os segundos atualizados (0-59):");
                seg = scanner.nextInt();

                if (seg < 0 || seg > 59) {
                    System.out.println("Segundos inválidos. Por favor, digite novamente.");
                    continue;
                }
                break; //quando digita um valor válido

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.nextLine();
            }
        }
    }

    public Hora(int h, int m, int s) {
        this.hora = h;
        this.min = m;
        this.seg = s;
    }

    public void setHor(int h) {
        this.hora = h;
    }

    public void setMin(int m) {
        this.min = m;
    }

    public void setSeg(int s) {
        this.seg = s;
    }

    public String getHora1() {
        String horaFormatada1 = String.format("%02d:%02d:%02d", hora, min, seg);
        return horaFormatada1;
    }

    public String getHora2() {
        String periodo = hora < 12 ? "AM" : "PM";
        int hora12h = hora % 12 == 0 ? 12 : hora % 12;
        String horaFormatada12h = String.format("%02d:%02d:%02d %s", hora12h, min, seg, periodo);
        return horaFormatada12h;
    }

    public int getSegundos() {
        int horaSegundos = (hora * 3600) + (min * 60) + seg;
        return horaSegundos;
    }

}
    
