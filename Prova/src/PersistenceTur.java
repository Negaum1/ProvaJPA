

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class PersistenceTur {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadtur");
        EntityManager em = factory.createEntityManager();
        
        Turista tur = new Turista();
        tur.setNome("JOACI DA SILVA LEITE");
        tur.setTelefone("65981479943");
        tur.setIdade(42);
        
        GuiaTur guia = new GuiaTur();
        guia.setNome("JOAO DA SILVA");
        guia.setMatricula(454545);
        guia.setTelefone("65999991234");
        
        PasseioTur passtur = new PasseioTur();
        passtur.setPasseio("Cachoeira Serra Azul");
        passtur.setDescrição("Cahoeira Serra Azul  5k de trilha");
        passtur.setGdificuldade(6);
        passtur.setCidade("Nobres");
        
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        em.persist (tur);
        em.persist(guia);
        em.persist(passtur);
        tr.commit();
        em.close();
        factory.close();
        
      
       
        
    }
}

