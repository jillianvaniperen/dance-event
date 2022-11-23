package helper;

import entity.Set;

import java.util.ArrayList;
import java.util.List;

public class HelperSet {
    List<Set> sets = new ArrayList<>();

    public List<Set> findAll() { return sets; }

    public Set save(Set set) {
        sets.add(set);
        return set;
    }

    public Set findBySetID(long setID) {
        for (Set set: sets) {
            if (set.getSetID() == setID) {
                return set;
            }
        }
        return null;
    }


}

