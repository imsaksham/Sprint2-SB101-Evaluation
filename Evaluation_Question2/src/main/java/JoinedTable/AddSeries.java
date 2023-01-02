package JoinedTable;

import Bean.Series;
import Util.MangerEvalution;

import javax.persistence.EntityManager;

public class AddSeries {
    public static void main(String[] args) {
        Series series1=new Series();
        series.setSeriesName("Krishi Darshan");
        series.setNoOfEpisodes(57);

        Series series2=new Series();
        series1.setSeriesName("Days of Our Lives");
        series1.setNoOfEpisodes(56);

        Series series3=new Series();
        series2.setSeriesName("Eat Bulaga!");
        series2.setNoOfEpisodes(1);

        Series series4=new Series();
        series3.setSeriesName("Coronation Street");
        series3.setNoOfEpisodes(60);

        EntityManager em= MangerEvalution.provideConnection();
        em.getTransaction().begin();
        em.persist(series1);
        em.persist(series2);
        em.persist(series3);
        em.persist(series4);

        em.getTransaction().commit();
        em.close();
        System.out.println("Successfully Done");
    }
}
