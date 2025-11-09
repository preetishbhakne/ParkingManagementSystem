package EntryExitDesign;

public class MaxExitEntryLimitReachedException extends Exception{
    public MaxExitEntryLimitReachedException(String className, int limit) {
        super("There are only " + limit + " gates " + className);
    }

}
