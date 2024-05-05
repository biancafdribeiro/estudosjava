public class Main {
        public static void main(String[] args) {
            // Criando um objeto Hora usando o construtor padrão
            Hora hora1 = new Hora();
            System.out.println("Hora 1 (formato 1): " + hora1.getHora1());
            System.out.println("Hora 1 (formato 2): " + hora1.getHora2());
            System.out.println("Hora 1 (segundos): " + hora1.getSegundos());
            System.out.println();

            // Criando um objeto Hora usando o construtor que recebe os valores diretamente
            Hora hora2 = new Hora(10, 45, 30);
            System.out.println("Hora 2 (formato 1): " + hora2.getHora1());
            System.out.println("Hora 2 (formato 2): " + hora2.getHora2());
            System.out.println("Hora 2 (segundos): " + hora2.getSegundos());
            System.out.println();

            // Alterando os valores de hora, minuto e segundo usando os métodos set
            hora2.setHor();
            hora2.setMin();
            hora2.setSeg();
            System.out.println("Hora 2 atualizada (formato 1): " + hora2.getHora1());
            System.out.println("Hora 2 atualizada (formato 2): " + hora2.getHora2());
            System.out.println("Hora 2 atualizada (segundos): " + hora2.getSegundos());
        }
    }
