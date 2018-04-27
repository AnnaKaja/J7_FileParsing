package pl.sda;

import java.io.IOException;
import java.util.List;

//POJO - Plain Old Java Object
public class App {
    public static void main(String[] args) {
//        CSVFileReader reader = new CSVFileReader();
//        try {
//            List<Person> personList = reader.readPersonData("C:\\projects\\converter\\Dane_Osobowe.csv");
//            System.out.println(personList.toArray());
//        } catch (IOException e) {
//            System.out.println("WYSTĄPIŁ BŁĄD");
//        }


        CSVFileWriter writer = new CSVFileWriter();
        writer.write("C:\\projects\\converter\\Dane_Osobowe.csv");
    }
}