import java.util.Date;

public interface SchedulePlanManagement {
	void createSchedule(String employeeId, String scheduleId, String scheduleName, Date startTime, Date endTime);
	void updateSchedule(String employeeId, String scheduleId, String scheduleName, Date startTime, Date endTime);
	void deleteSchedule(String employeeId, String scheduleId);
	String getAllSchedules(String scheduleId, String scheduleName, Date startTime, Date endTime);
}
