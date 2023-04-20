package adapterppb;

public class Evento {

    IData data;
    DataAdapter persistencia;

    public Evento() {
        data = new DataPadraoBR();
        persistencia = new DataAdapter(data);
    }

    public void setdataBR(String dataBR) {
        data.setData(dataBR);
        persistencia.salvarDataUS();
    }

    public String getDataUS() {
        return persistencia.recuperarDataUS();
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do adaptador
    public String getDatabr() {
        return persistencia.getDataUS();
    }
}
