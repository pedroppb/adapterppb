package adapterppb;

public class DataAdapter extends DataPadraoUS{
    private IData dataBR;

    public DataAdapter(IData dataBR) {
        this.dataBR = dataBR;
    }

    public String recuperarDataUS() {
        String mes=dataBR.getData().substring(0,2);
        String dia=dataBR.getData().substring(3,5);
        String data =dia+dataBR.getData().substring(2,3)+mes+dataBR.getData().substring(5);
        dataBR.setData(data);
        return dataBR.getData();
    }

    public void salvarDataUS() {
        String dia=dataBR.getData().substring(0,2);
        String mes=dataBR.getData().substring(3,5);
        String data=dia+dataBR.getData().substring(2,3)+mes+dataBR.getData().substring(5);
        this.setData(data);
    }
}
