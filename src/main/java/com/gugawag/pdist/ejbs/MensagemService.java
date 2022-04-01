package com.gugawag.pdist.ejbs;

import com.gugawag.pdist.model.Mensagem;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.List;

@Stateless(name = "mensagemService")
@Remote
public class MensagemService {

    @EJB
    private MensagemdDAO mensagemdDAO;

    public List<Mensagem> listar() {
        return mensagemdDAO.listar();
    }

    public void inserir(Mensagem mensagem){
        mensagemdDAO.inserir(mensagem);
    }

    public Mensagem buscarPorId(Long id){
        return mensagemdDAO.buscarPorId(id);
    }
}
