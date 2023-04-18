package adapterppb;

public class DataPadraoUS implements IData{
        private String DataUS;

        @Override
        public String getData() {
            return this.DataUS;
        }

        @Override
        public void setData(String data) {
            this.DataUS=data;
        }
}
