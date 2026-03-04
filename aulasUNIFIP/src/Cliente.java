public class Cliente {

    private String cpf;
    private String nome;
    private String endereco;

    public class validadorCPF {

        public static boolean validar(String cpf) {

            // Remove pontos e traços
            cpf = cpf.replaceAll("[^0-9]", "");

            // Precisa ter 11 dígitos
            if (cpf.length() != 11) return false;

            // Impede CPFs com todos números iguais (11111111111 etc)
            if (cpf.matches("(\\d)\\1{10}")) return false;

            try {
                // === Primeiro dígito verificador ===
                int soma = 0;
                for (int i = 0; i < 9; i++) {
                    soma += (cpf.charAt(i) - '0') * (10 - i);
                }

                int primeiroDigito = 11 - (soma % 11);
                if (primeiroDigito >= 10) primeiroDigito = 0;

                // === Segundo dígito verificador ===
                soma = 0;
                for (int i = 0; i < 10; i++) {
                    soma += (cpf.charAt(i) - '0') * (11 - i);
                }

                int segundoDigito = 11 - (soma % 11);
                if (segundoDigito >= 10) segundoDigito = 0;

                // Verifica se os dígitos batem
                return primeiroDigito == (cpf.charAt(9) - '0') &&
                        segundoDigito == (cpf.charAt(10) - '0');

            } catch (Exception e) {
                return false;
            }
        }
    }




    public Cliente (){}

    public Cliente (String cpf, String nome, String endereco){

        if ((cpf == null) || validadorCPF.validar(cpf)) {
            throw new IllegalArgumentException("CPF inválido!");
        }

        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }



}
