package ui;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class PurchaseManager {

    private static final String FILE = "purchases.json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void savePurchase(Purchase purchase) {
        List<Purchase> list = loadAll();
        list.add(purchase);

        try (Writer writer = new FileWriter(FILE)) {
            gson.toJson(list, writer);
        } catch (IOException e) {
            System.out.println("Error saving purchase: " + e.getMessage());
        }
    }

    public static List<Purchase> loadAll() {
        File file = new File(FILE);
        if (!file.exists()) return new ArrayList<>();

        try (Reader reader = new FileReader(FILE)) {
            Type listType = new TypeToken<ArrayList<Purchase>>(){}.getType();
            List<Purchase> list = gson.fromJson(reader, listType);
            return list != null ? list : new ArrayList<>();
        } catch (IOException e) {
            System.out.println("Error reading purchases: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}