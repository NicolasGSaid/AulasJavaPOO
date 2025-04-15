
import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menuPrincipal = 0;
        int menuSecundario = 0;

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();

        while (menuPrincipal != 7) {
            menuSecundario = 0;
            System.out.println("Menu de Funcionários...[1]");
            System.out.println("Menu de Clientes.......[2]");
            System.out.println("Menu de Fornecedores...[3]");
            System.out.println("Contas a Receber.......[4]");
            System.out.println("Contas a Pagar.........[5]");
            System.out.println("Fluxo de Caixa.........[6]");
            System.out.println("Sair...................[7]");
            System.out.print("Opção: ");

            menuPrincipal = input.nextInt();

            if (menuPrincipal == 1) {

                while (menuSecundario != 5) {
                    System.out.println("\n");
                    System.out.println("Incluir Funcionário....[1]");
                    System.out.println("Alterar Funcionário....[2]");
                    System.out.println("Consultar Funcionários.[3]");
                    System.out.println("Excluir Funcionário....[4]");
                    System.out.println("Voltar.................[5]");
                    System.out.print("Opção: ");
                    menuSecundario = input.nextInt();
                    input.nextLine(); // Limpar o buffer

                    // Menu de Funcionários
                    if (menuSecundario == 1) { // Incluir Funcionário
                        Funcionario funcionario = new Funcionario();
                        funcionario.entrar(input);
                        funcionarios.add(funcionario);
                        System.out.println("Funcionário cadastrado com sucesso!");

                    } else if (menuSecundario == 2) { // Alterar Funcionario
                        if (funcionarios.isEmpty()) {
                            System.out.println("Nenhum funcionário cadastrado!");
                        } else {
                            System.out.println("Digite o ID do Funcionário que deseja alterar: ");
                            int idAlterar = input.nextInt();
                            input.nextLine(); // Limpar o buffer

                            // Procurar o Funcionário pelo ID
                            Funcionario funcionarioEncontrado = null;
                            for (Funcionario funcionario : funcionarios) {
                                if (funcionario.getId() == idAlterar) {
                                    funcionarioEncontrado = funcionario;
                                    break;
                                }
                            }
                            if (funcionarioEncontrado != null) {
                                System.out.println("Funcionário encontrado! Insira os novos dados:");
                                funcionarioEncontrado.entrar(input); // Alterar os dados
                                System.out.println("Funcionário alterado com sucesso!");
                            } else {
                                System.out.println("Funcionário não encontrado!");
                            }
                        }

                    } else if (menuSecundario == 3) {
                        if (funcionarios.isEmpty()) {
                            System.out.println("Nenhum funcionário cadastrado!");
                        } else {
                            System.out.println("Funcionarios cadastradss: ");
                            for (Funcionario funcionario : funcionarios) {
                                funcionario.imprimir();
                            }
                        }
                    } else if (menuSecundario == 4) {
                        if (funcionarios.isEmpty()) {
                            System.out.println("Nenhum funcionário cadastrado!");
                        } else {
                            System.out.println("Digite o ID da funcionário que deseja excluir: ");
                            int idExcluir = input.nextInt();
                            input.nextLine(); // Limpar o buffer

                            // Procurar o Funcionário pelo ID
                            Funcionario funcionarioEncontrado = null;
                            for (Funcionario funcionario : funcionarios) {
                                if (funcionario.getId() == idExcluir) {
                                    funcionarioEncontrado = funcionario;
                                    break;
                                }
                            }
                            if (funcionarioEncontrado != null) {
                                funcionarios.remove(funcionarioEncontrado);
                                System.out.println("Pessoa excluída com sucesso!");
                            } else {
                                System.out.println("Pessoa não encontrada!");
                            }
                        }
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }

            } else if (menuPrincipal == 2) {

                while (menuSecundario != 5) {
                    System.out.println("Inlcuir Cliente........[1]");
                    System.out.println("Alterar Cliente........[2]");
                    System.out.println("Consultar Clientes.....[3]");
                    System.out.println("Excluir Cliente........[4]");
                    System.out.println("Voltar.................[5]");
                    System.out.print("Opção: ");
                    menuSecundario = input.nextInt();

                    if (menuSecundario == 1) { // Incluir Cliente
                        Cliente cliente = new Cliente();
                        cliente.entrar(input);
                        clientes.add(cliente);
                        System.out.println("Cliente cadastrado com sucesso!");

                    } else if (menuSecundario == 2) { // Alterar funcionário
                        System.out.println("Alterar Cliente");
                        if (clientes.isEmpty()) {
                            System.out.println("Nenhum cliente cadastrado!");
                        } else {
                            System.out.println("Digite o ID do Cliente que deseja alterar: ");
                            int idAlterar = input.nextInt();
                            input.nextLine(); // Limpar o buffer

                            // Procurar o Cliente pelo ID
                            Cliente clienteEncontrado = null;
                            for (Cliente cliente : clientes) {
                                if (cliente.getId() == idAlterar) {
                                    clienteEncontrado = cliente;
                                    break;
                                }
                            }
                            if (clienteEncontrado != null) {
                                System.out.println("Cliente encontrado! Insira os novos dados:");
                                clienteEncontrado.entrar(input); // Alterar os dados
                                System.out.println("Cliente alterado com sucesso!");
                            } else {
                                System.out.println("Cliente não encontrado!");
                            }
                        }

                    } else if (menuSecundario == 3) { // Exibir Funcionarios
                        if (clientes.isEmpty()) {
                            System.out.println("Nenhum cliente cadastrado!");
                        } else {
                            System.out.println("Clientes cadastrados: ");
                            for (Cliente cliente : clientes) {
                                cliente.imprimir();
                            }
                        }

                    } else if (menuSecundario == 4) { // Excluir Cliente
                        if (clientes.isEmpty()) {
                            System.out.println("Nenhum cliente cadastrado!");
                        } else {
                            System.out.println("Digite o ID do cliente que deseja excluir: ");
                            int idExcluir = input.nextInt();
                            input.nextLine(); // Limpar o buffer

                            // Procurar o Cliente pelo ID
                            Cliente clienteEncontrado = null;
                            for (Cliente cliente : clientes) {
                                if (cliente.getId() == idExcluir) {
                                    clienteEncontrado = cliente;
                                    break;
                                }
                            }
                            if (clienteEncontrado != null) {
                                clientes.remove(clienteEncontrado);
                                System.out.println("Cliente excluído com sucesso!");
                            } else {
                                System.out.println("Cliente não encontrado!");
                            }
                        }
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }

            } else if (menuPrincipal == 3) {
            } else if (menuPrincipal == 4) {
            } else if (menuPrincipal == 5) {
            } else if (menuPrincipal == 6) {
            } else {
                System.out.println("Opção inválida!");
            }

            System.out.println("Sistema Encerrrado!");

        }
    }
}