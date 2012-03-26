package com.winkball.whiteboard.data.mock;

import com.winkball.whiteboard.data.MilestoneRepository;
import com.winkball.whiteboard.domain.Milestone;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository(value="MockMilestoneRepository")
public class MockMilestoneRepository implements MilestoneRepository {
    
    private static final List<Milestone> milestones = new ArrayList<Milestone>();

    static {
        milestones.add(new Milestone("Milestone 1"));
        milestones.add(new Milestone("Milestone 2"));
        milestones.add(new Milestone("Milestone 3"));
    }

    public List<Milestone> findAll() {
        return milestones;
    }
}
