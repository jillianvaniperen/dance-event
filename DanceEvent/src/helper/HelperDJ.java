package helper;

import entity.DJ;

import java.util.ArrayList;
import java.util.List;

public class HelperDJ {

    List<DJ> djs = new ArrayList<>();

    public List<DJ> findAll() { return djs; }

    public DJ save(DJ dj) {
        djs.add(dj);
        return dj;
    }

    public DJ findByID (long ID) {
        for (DJ dj: djs) {
            if (dj.getID() == ID) {
                return dj;
            }
        }
        return null;
    }

    public void deleteByID (long ID) {
        List<DJ> newDJs = new ArrayList<>();
        for (DJ dj: djs) {
            if (dj.getID() != ID) {
                newDJs.add(dj);
            }
        }
        djs = newDJs;
    }
}
