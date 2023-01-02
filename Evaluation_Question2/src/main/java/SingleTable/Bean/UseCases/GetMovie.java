package SingleTable.Bean.UseCases;

import Bean.Movie;
import Util.MangerEvalution;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Scanner;

public class GetMovie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        EntityManager em= MangerEvalution.provideConnection();

        System.out.println("Enter movie id: ");
        int id=sc.nextInt();
        Query query=em.createQuery("From Movie where movieId:id", Movie.class);
        query.setParameter("id", id);
        Movie movie= (Movie) query.getSingleResult();
        System.out.println(movie);

    }
}
