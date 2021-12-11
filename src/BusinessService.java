public interface BusinessService {

    public void insert (DatasetSpec datasetSpec,int value, Months months);

    public void listAll (Datasets datasets);

    public void deleteDataset (Datasets datasets);

    public void forecastDataset (Datasets datasets);

    public void findMaximumSales (Datasets datasets);

    public void findMinimumSales (Datasets datasets);

    public void searchValue (int value);

    public void replaceValue (DatasetSpec datasetSpec,int replaceValue, Months months);

}
