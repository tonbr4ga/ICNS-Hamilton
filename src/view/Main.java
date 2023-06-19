package view;

import DAO.FuncionarioDAO;

public class Main {

    public static void main(String[] args) {
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Login login = new Login(funcionarioDAO);
    }
}
