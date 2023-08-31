package menu;

import javax.swing.JLabel;

import entities.Produto;

import javax.swing.JOptionPane;


public class Menu {
	private static Produto produto = new Produto();
	public static void exibirMenu() {
		
        String[] opcoes = {"Opção 1: Cadastra produto", 
        				   "Opção 2: Mostra produto cadastrado", 
        				   "Opção 3: Adiciona quantidade", 
        				   "Opção 4: Remove quantidade", "Sair"};
        
        JLabel label = new JLabel("Escolha uma opção:");
        label.setHorizontalAlignment(JLabel.CENTER);
        
        int opcaoSelecionada = JOptionPane.showOptionDialog(
            null, label,
            "Menu Interativo",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null,
            opcoes,
            opcoes[0]);
        
        switch (opcaoSelecionada) {
            case 0:
                produto.name = JOptionPane.showInputDialog("Entre com os dados do produto: \nNome do produto:");
                produto.price = Double.parseDouble(JOptionPane.showInputDialog("Entre com os dados do produto: \nPreço do produto"));
                produto.quantity = Integer.parseInt(JOptionPane.showInputDialog("Entre com os dados do produto: \nQuantidade em estoque"));
                break;
            case 1:
            	JOptionPane.showMessageDialog(null, "Dados do produto: " +produto);
                break;
            case 2:
            	int quantity = Integer.parseInt(JOptionPane.showInputDialog("Adicione a quantidade de produtos para atualizar o estoque"));
                produto.addProducts(quantity);
                JOptionPane.showMessageDialog(null, "Dados atualizados: \n" +produto);
                break;
            case 3:
            	quantity = Integer.parseInt(JOptionPane.showInputDialog("Adicione a quantidade de produtos que quer remover para atualizar o estoque"));
                produto.removeProducts(quantity);
                JOptionPane.showMessageDialog(null, "Dados atualizados: \n" +produto);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Você escolheu sair. Até logo!");
                System.exit(0);
                break;
            default:
                if (opcaoSelecionada == -1) {
                	System.exit(0);
                }
        }
    }					
        }

