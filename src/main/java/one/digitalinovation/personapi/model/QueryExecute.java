package one.digitalinovation.personapi.model;

import one.digitalinovation.personapi.dao.AlunoDAO;
import one.digitalinovation.personapi.entity.Aluno;
import one.digitalinovation.personapi.entity.Estado;

import java.util.List;

public class QueryExecute {

    public static void main(String[] args) {

        Estado estado = new Estado();

        AlunoDAO alunoDAO = new AlunoDAO();
        List<Aluno> alunos = alunoDAO.list();

        alunos.stream().forEach(System.out::println);

        Aluno alunoByid = alunoDAO.getById(1);
        System.out.println(alunoByid);


        Aluno alunoParaInsercao = new Aluno(
                "Matheus",
                43,
                estado
        );

        alunoDAO.create(alunoParaInsercao);

        alunoDAO.delete(6);

        Aluno alunoParaAtualizar = alunoDAO.getById(3);
        alunoParaAtualizar.setNome("Joaquim");
        alunoParaAtualizar.setIdade(18);
        alunoParaAtualizar.setEstado(estado);

        alunoDAO.update(alunoParaAtualizar);
    }

}
