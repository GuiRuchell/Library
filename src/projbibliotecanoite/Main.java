
package projbibliotecanoite;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Locacao objLocacao = new Locacao();
        Locacao objLocacao2 = new Locacao();
        Locacao objLocacao3 = new Locacao();
        byte op;
        
        do{
            System.out.print("Escolha uma opção abaixo\n" +
                "[1] - Cadastrar funcionário\n" +
                "[2] - Cadastrar usuário\n" +
                "[3] - Cadastrar livro\n" +
                "[4] - Mostrar todos os dados do cadastro\n" +
                "[5] - Ir para locação \n"
               +"[0] - Sair\n"
               + "Digite aqui a opção: "); 
              op = leia.nextByte();
              leia.nextLine();
            switch(op){
                case 1:
                    System.out.print("Cadastro do funcionário: \n"
                            + "Nome: ");
                    objLocacao.getObjUsuario().setNome(leia.nextLine());
                    System.out.print("CPF: ");
                    objLocacao.getObjFuncionario().setCpf(leia.nextLong());
                    System.out.print("Chapa: ");
                    objLocacao.getObjFuncionario().setChapa(leia.next());
                    System.out.print("Salário: ");
                    objLocacao.getObjFuncionario().setSalario(leia.nextDouble());
                    leia.nextLine();
                    System.out.print("Endereço------\n"
                            + "Rua: ");
                    objLocacao.getObjFuncionario().getObjEndereco().setRua(leia.nextLine());
                    System.out.print("Numero: ");
                    objLocacao.getObjFuncionario().getObjEndereco().setNumero(leia.nextInt());
                    leia.nextLine();
                    System.out.print("Bairro: ");
                    objLocacao.getObjFuncionario().getObjEndereco().setBairro(leia.nextLine());
                break;
                case 2:
                    System.out.print("Cadastro do usuário: \n"
                            + "Nome: ");
                    objLocacao.getObjUsuario().setNome(leia.nextLine());
                    System.out.print("CPF: ");
                    objLocacao.getObjUsuario().setCpf(leia.nextLong());
                    System.out.print("Código: ");
                    objLocacao.getObjUsuario().setCodigo(leia.nextInt());
                    leia.nextLine();
                    System.out.print("\nEndereço\n"
                            + "Rua: ");
                    objLocacao.getObjUsuario().getObjEndereco().setRua(leia.nextLine());
                    System.out.print("Numero: ");
                    objLocacao.getObjUsuario().getObjEndereco().setNumero(leia.nextInt());
                    leia.nextLine();
                    System.out.print("Bairro: ");
                    objLocacao.getObjUsuario().getObjEndereco().setBairro(leia.nextLine());
                break;
                case 3:
                    System.out.print("Cadastro do livro: \n"
                            + "Titulo: ");
                    objLocacao.getObjLivro().setTitulo(leia.nextLine());
                    System.out.print("Genero: ");
                    objLocacao.getObjLivro().setGenero(leia.nextLine());
                    System.out.print("Autor: ");
                    objLocacao.getObjLivro().setAutor(leia.nextLine());
                break;
                case 4:
                    do{
                        System.out.print("Selecione o cadastro na qual o mesmo queira acessar: \n"
                                + "1 - Cadastro do Funcionário: \n"
                                + "2 - Cadastro do Usuário \n"
                                + "3 - Cadastro do livro\n"
                                + "9 - Voltar ao menu principal\n"
                                + "Digite a opção desejada: ");
                                op = leia.nextByte();
                                switch(op){
                                    case 1:
                                        System.out.print(objLocacao.getObjFuncionario().toString());
                                        break;
                                    case 2: 
                                        System.out.print(objLocacao.getObjUsuario().toString());
                                        break;
                                    case 3:
                                        break;
                                    case 9:
                                        break;
                                    default: 
                                        System.out.print("\nOpção Inválida Digite novamente!!");
                                }
                    }while(op != 9); 
                break;
                case 5:
                    do{
                        System.out.print("\n::::::::::::::::: Sistema de Locação ::::::::::::::::::\n" +
                              "  Escolha uma opção abaixo\n" +
                              "  [1] - Locar livro\n" +
                              "  [2] - Devolver livro\n" +
                              "  [3] - Mostrar os dados do livro locado\n" +
                              "  [4] - Mostra os dados do livro devolvido\n" +
                              "  [5] - Sair da locação\n" +
                              "  Digite aqui a opção: \n");
                        op = leia.nextByte();
                       switch(op){
                           case 1:
                               leia.nextLine();
                               System.out.print("Insira os dados do livro: \n"
                                       + "Titulo: ");
                               objLocacao2.getObjLivro().setTitulo(leia.nextLine());
                               System.out.print("Genero: ");
                               objLocacao2.getObjLivro().setGenero(leia.nextLine());
                               System.out.print("Autor: ");
                               objLocacao2.getObjLivro().setAutor(leia.nextLine());
                               System.out.print("Dia da locação: ");
                               objLocacao.getDataLocacao().setDia(leia.nextInt());
                               System.out.print("Mês da locação: ");
                               objLocacao.getDataLocacao().setMes(leia.nextInt());
                               System.out.print("Ano de locação: ");
                               objLocacao.getDataLocacao().setAno(leia.nextInt());
                               System.out.print("Valor da locação: ");
                               objLocacao.setValorLocacao(leia.nextDouble());
                               objLocacao.devolverLivro();
                               
                           break;
                           case 2:
                               leia.nextLine();
                               System.out.print("Insira os dados do livro devolvido: \n"
                                       + "Titulo: ");
                               objLocacao3.getObjLivro().setTitulo(leia.nextLine());
                               System.out.print("Genero: ");
                               objLocacao3.getObjLivro().setGenero(leia.nextLine());
                               System.out.print("Autor: ");
                               objLocacao3.getObjLivro().setAutor(leia.nextLine());
                               System.out.print("Dia da locação: ");
                               objLocacao3.getDataLocacao().setDia(leia.nextInt());
                               System.out.print("Mês da locação: ");
                               objLocacao3.getDataLocacao().setMes(leia.nextInt());
                               System.out.print("Ano de locação: ");
                               objLocacao3.getDataLocacao().setAno(leia.nextInt());
                               System.out.print("Dia da devolução: ");
                               objLocacao3.getDataDevolucao().setDia(leia.nextInt());
                               System.out.print("Mês da devolução: ");
                               objLocacao3.getDataDevolucao().setMes(leia.nextInt());
                               System.out.print("Ano de devolução: ");
                               objLocacao3.getDataDevolucao().setAno(leia.nextInt());
                               objLocacao.locarLivro();
                            break;
                            case 3:
                               System.out.print("Dados do livro locado: \n"
                                       + objLocacao2.getObjLivro().toString()+objLocacao.getDataLocacao());
                               break;
                            case 4:
                               System.out.print("Dados do livro devolvido: \n"
                                       + objLocacao3.getObjLivro().toString() +" Data de Locação: "+objLocacao3.getDataLocacao()+"\nData devolução: "+objLocacao3.getDataDevolucao()+"\nMulta: "+objLocacao.getValorMulta());
                            break;
                            case 5:
                            break;
                            default: 
                                System.out.print("Opção inválida digite novamente!!!!");
                       } 
                    }while(op != 5);
                break;
                case 0:
                break;
                default:
                    System.out.print("\n Opção inválida digite novamente!!"); 
            }
                      
        }while(op != 0);
        
    }
}
