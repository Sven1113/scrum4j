
package de.hsbochum.fbg.kswe.scrum.events;

import de.hsbochum.fbg.kswe.scrum.artifacts.ProductBacklog;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class SprintReview implements Event {

    private final int POSITION = 3;

    public int getPOSITION() {
        return POSITION;
    }
    
    @Override
    public Class<? extends Event> followingEventType() {
        return SprintRetrospective.class;
    }

    @Override
    public void init(Event previos, ProductBacklog productBacklog) throws InitializationException {
    }

}
