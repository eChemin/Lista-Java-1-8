        public class Carro {
            private String marca;
            private String modelo;
            private int ano;
            private String placa;
            private double velocidadeAtual;

            public Carro(String marca, String modelo, int ano, String placa) {
                this.marca = marca;
                this.modelo = modelo;
                this.ano = ano;
                this.placa = placa;
                this.velocidadeAtual = 0;
            }

            public void acelerar(double quantidade) {
                velocidadeAtual += quantidade;
                System.out.println("O carro acelerou para " + velocidadeAtual + " km/h");
            }

            public void frear(double quantidade) {
                if (quantidade <= velocidadeAtual) {
                    velocidadeAtual -= quantidade;
                    System.out.println("O carro freou para " + velocidadeAtual + " km/h");
                } else {
                    velocidadeAtual = 0;
                    System.out.println("O carro parou completamente");
                }
            }

            public void exibirInfo() {
                System.out.println("Marca: " + marca);
                System.out.println("Modelo: " + modelo);
                System.out.println("Ano: " + ano);
                System.out.println("Placa: " + placa);
                System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
            }
        }