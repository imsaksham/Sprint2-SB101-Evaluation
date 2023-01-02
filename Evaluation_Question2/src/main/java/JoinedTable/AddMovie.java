package JoinedTable;

import Bean.Movie;
import Util.MangerEvalution;

import javax.persistence.EntityManager;

public class AddMovie {


    public static void main(String[] args) {
        Movie m=new Movie();
        m.setGenre("Drama");
        m.setMovieName("Cirkus");

        Movie m1=new Movie();
        m1.setGenre("Romance");
        m1.setMovieName("Ajay Wardhan");

        Movie m2=new Movie();
        m2.setGenre("Action");
        m2.setMovieName("An Action Hero");

        Movie m3=new Movie();
        m3.setGenre("Thriller");
        m3.setMovieName("Blurr");

        EntityManager em= MangerEvalution.provideConnection();
        em.getTransaction().begin();
        em.persist(m);
        em.persist(m1);
        em.persist(m2);
        em.persist(m3);
        em.getTransaction().commit();
        em.close();
        System.out.println("Successfully Done");
    }
}
