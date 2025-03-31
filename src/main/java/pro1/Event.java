package pro1;

import com.google.gson.annotations.SerializedName;

public class Event
{
    @SerializedName("rok")
    String rok;
    @SerializedName("mistnost")
    String mistnost;
    @SerializedName("nazev")
    String nazev;
    @SerializedName("obsazeni")
    int obsazeni;


public int getObsazeni()
    {
        return obsazeni;
    }
}
