package Dormitory;

/**
 *
 * An interface of constants, implement it when requierd to use pre-defined user
 * and resource types
 */
public interface Constants {
    /**
     * Defining the user types
     */
    static final int ADMIN = 1;
    static final int STUDENT = 3;

    /**
     * Defining the resource types
     */
    static final String BED = "BED";
    static final String TABLE = "TABLE";
    static final String Locker = "LOCKER";
    static final String BUILDING_F = "BUILDING_F";
    static final String BUILDING_M = "BUILDING_M";
}