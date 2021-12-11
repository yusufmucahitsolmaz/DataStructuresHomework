import java.util.LinkedList;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {


        DatasetSpec dataset1 = new DatasetSpec("Ahmet",2012);
        int [] value = {1,42};

        Datasets datasets = new Datasets(dataset1,value[0], Months.January);
        Datasets datasetss = new Datasets(dataset1,value[1], Months.May);

    }
}
