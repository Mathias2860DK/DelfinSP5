package Domain;

import java.sql.Timestamp;

public class Resultater implements Comparable<Resultater> {
    //medlem_id, stilart_id, result, result_time
    int medlem_id;
    private int stilart_id;
    private long result;
    Timestamp result_time;


    public Resultater() {
        this.medlem_id = medlem_id;
        this.stilart_id = stilart_id;
        this.result = result;
        this.result_time = result_time;
    }


    public Resultater(int medlem_id, int stilart_id, long result, Timestamp result_time) {
        this.medlem_id = medlem_id;
        this.stilart_id = stilart_id;
        this.result = result;
        this.result_time = result_time;
    }

    public int getMedlem_id() {
        return medlem_id;
    }

    public void setMedlem_id(int medlem_id) {
        this.medlem_id = medlem_id;
    }

    public int getStilart_id() {
        return stilart_id;
    }

    public void setStilart_id(int stilart_id) {
        this.stilart_id = stilart_id;
    }

    public long getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Timestamp getResult_time() {
        return result_time;
    }

    public void setResult_time(Timestamp result_time) {
        this.result_time = result_time;
    }
//TODO WHAT
  /*  public static final Comparator <Resultater> resultComparator = new Comparator<Resultater>() {
        @Override
        public int compare(Resultater o1, Resultater o2) {
            return o1.result - o2.result;

    }*/

    @Override
    public String toString() {
        return "medlem_id: " + medlem_id +
                ", stilart_id: " + stilart_id +
                ", result: " + result +
                ", result_time: " + result_time + "\n";
    }




    @Override
    public int compareTo(Resultater o) {

        return (int) (this.result -  (o.getResult()));
    }
}
