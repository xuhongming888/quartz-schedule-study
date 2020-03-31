package job;

import org.quartz.*;

/**
 * @description:
 * @author: xuzh1
 * @create: 2020-03-31 14:18
 **/
public class DumbJob implements Job {

    public DumbJob() {
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobKey key = context.getJobDetail().getKey();

        JobDataMap dataMap = context.getJobDetail().getJobDataMap();

        String jobSays = dataMap.getString("jobSays");
        float myFloatValue = dataMap.getFloat("myFloatValue");

        System.out.println("Instance " + key + " of DumJob says: " + jobSays + ", and val is: " + myFloatValue);


    }
}
