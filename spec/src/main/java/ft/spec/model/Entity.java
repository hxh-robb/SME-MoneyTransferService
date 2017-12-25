package ft.spec.model;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Entity base class
 */
public abstract class Entity implements Serializable {
    /**
     * Construct an entity instance
     */
    protected Entity() {
        this(false);
    }

    /**
     * Initialize common fields
     */
    protected Entity(boolean init) {
        if( init ) {
            this.id = UUID.randomUUID().toString(); // generate random unique id
            this.ts = new Date();
            this.de = false;
        }
    }

    /**
     * <pre>
     * Entity unique identity
     * "id" stands for "IDentity"
     * </pre>
     */
    protected String id;

    /**
     * <pre>
     * Entity updated timestamp
     * "ts" stands for "TimeStamp"
     * </pre>
     */
    protected Date ts;

//    /**
//     * <pre>
//     * Entity belongs to which business object(organization,user,platform,etc.)
//     * "bt" stands for "Belongs To"
//     * </pre>
//     */
//    protected Object bt;

    /**
     * <pre>
     * Deleted state of the entity
     * </pre>
     */
    protected Boolean de;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

//    public Object getBt() {
//        return bt;
//    }
//
//    public void setBt(Object bt) {
//        this.bt = bt;
//    }

    public Boolean getDe() {
        return de;
    }

    public void setDe(Boolean de) {
        this.de = de;
    }

    @Override
    public String toString() {
        return toString(true);
    }

    protected String toString(boolean complete) {
         String fields = "id='" + id + '\'' +
                ", ts=" + ts +
                ", de=" + de ;
        return complete ? MessageFormat.format("Entity'{'{0}'}'}", fields) : fields;
    }
}
