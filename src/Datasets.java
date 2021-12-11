public class  Datasets   {

    DatasetSpec datasetSpec;
    int value;
    Months months;

    public Datasets(DatasetSpec datasetSpec, int value, Months months) {
        this.datasetSpec = datasetSpec;
        this.value = value;
        this.months = months;
    }

    public DatasetSpec getDatasetSpec() {
        return datasetSpec;
    }

    public void setDatasetSpec(DatasetSpec datasetSpec) {
        this.datasetSpec = datasetSpec;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Months getMonths() {
        return months;
    }

    public void setMonths(Months months) {
        this.months = months;
    }


}
