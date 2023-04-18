package adapterppb;

public class DataPadraoBR implements IData{
    private String DataBR;

    @Override
    public String getData() {
        return this.DataBR;
    }

    @Override
    public void setData(String data) {
        this.DataBR=data;
    }
}
