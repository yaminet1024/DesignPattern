package Experience_1_4;

import java.io.IOException;

public abstract class Prototype {
     public abstract WeeklyLog shallowClone();
     public abstract WeeklyLog deepClone() throws IOException, ClassNotFoundException;
}
