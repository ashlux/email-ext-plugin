package hudson.plugins.emailext.plugins.trigger;

// TODO: Move out of this package and into the descriptor
public enum MatrixTrigger {
    ONLY_PARENT("Trigger only the parent job"),
    ONLY_CONFIGURATIONS("Trigger for each configuration"),
    BOTH("Trigger for parent and each configuration");

    private final String description;

    private MatrixTrigger(String description) {
        this.description = description;
    }
    // TODO: Unused???
    public String getDescription() {
        return description;
    }
}
