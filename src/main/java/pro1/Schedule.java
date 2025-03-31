package pro1;

import com.google.gson.annotations.SerializedName;

public class Schedule
{
    @SerializedName("rozvrhovaAkce")
    ScheduleEvent[] events;
}
