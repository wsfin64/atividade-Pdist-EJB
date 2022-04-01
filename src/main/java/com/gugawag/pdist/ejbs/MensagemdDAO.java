package com.gugawag.pdist.ejbs;

import com.gugawag.pdist.model.Mensagem;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class MensagemdDAO {

    @PersistenceContext(unitName = "default")
    private EntityManager em;

    public void inserir(Mensagem novaMensagem){
        em.persist(novaMensagem);
    }

    public List<Mensagem> listar(){
        return em.createQuery("FROM Mensagem").getResultList();
    }

    public Mensagem buscarPorId(Long id){
        List<Mensagem> listaMensagem = em.createQuery("FROM Mensagem WHERE id = " + id).getResultList();
        Mensagem mensagem = listaMensagem.get(0);
        return mensagem;

    }
}
