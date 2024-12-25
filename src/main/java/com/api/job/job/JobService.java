package com.api.job.job;

import java.util.List;

public interface JobService {

    Job getJobById(Long id);

    List<Job> findAll();
    void createJob(Job job);

    boolean deletebById(Long id);

    boolean updateJob(Long id, Job updateJob);
}
