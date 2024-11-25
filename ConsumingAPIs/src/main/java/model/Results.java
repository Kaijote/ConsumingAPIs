package model;

import java.util.ArrayList;

public record Results (String status, int code, String locale, Integer seed, int total, ArrayList<Books> data){
}
