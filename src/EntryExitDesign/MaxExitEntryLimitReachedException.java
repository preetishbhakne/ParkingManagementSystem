package EntryExitDesign;

public class MaxExitEntryLimitReachedException extends Exception{
    public MaxExitEntryLimitReachedException(String className, int limit) {
        super("Cannot create more than " + limit + " instances of " + className);
    }

}
