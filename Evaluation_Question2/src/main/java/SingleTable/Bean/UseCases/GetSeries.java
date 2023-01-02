package SingleTable.Bean.UseCases;

import Bean.Movie;
import Bean.Series;
import Util.MangerEvalution;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class GetSeries {
    public static void main(String[] args) {
        EntityManager em= MangerEvalution.provideConnection();
        Query query=em.createQuery("From Series");

        List<Series> seriesList=query.getResultList();
        seriesList.forEach(s-> System.out.println(s));




    }

}
