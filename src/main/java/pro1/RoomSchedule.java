package pro1;

import com.google.gson.annotations.SerializedName;

public class RoomSchedule
{
    @SerializedName("rozvrhovaAkce")
    private Event[] actions;

    public Event[] getActions()
    {
        return actions;
    }
}
