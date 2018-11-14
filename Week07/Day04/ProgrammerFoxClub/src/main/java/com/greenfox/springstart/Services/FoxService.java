package com.greenfox.springstart.Services;

import com.greenfox.springstart.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoxService {

    List<Fox> foxes;

    public FoxService (){
        foxes = new ArrayList<>();
    }
    public List<String> listOfTricks = new ArrayList<>( Arrays.asList("JavaScript","Java","C+","C++","Solidity" ));
    public List<String> listOfFood = new ArrayList<>(Arrays.asList("Pizza", "Tofu", "Salad", "Falafel", "Beans"));
    public List<String> listOfDrinks = new ArrayList<>(Arrays.asList("Water","Macha","Juice","Coffee" ));


    public void saveFox(Fox fox) {
        foxes.add(fox);
    }

    public void deleteFox (Fox fox) {foxes.remove( fox );}

    public boolean contains(String foxName) {
        for (int i = 0; i < foxes.size(); i++) {
            if (foxes.get( i ).name.equals( foxName )){
                return true;
            }
        }
        return false;
    }

    public Fox getFoxByName (String name) {
        for (int i = 0; i < foxes.size(); i++) {
            if (foxes.get( i ).name.equals( name )) {
                return (foxes.get( i ));
            }
        }
        return null;
    }
}
