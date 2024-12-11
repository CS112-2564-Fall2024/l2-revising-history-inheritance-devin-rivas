public class HistoricalEvent {
    protected String description;
    protected Date date;

    public HistoricalEvent() {
        this.description = "None";
        this.date = new Date();
    }

    public HistoricalEvent(String description, Date date) {
        this.description = description;
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return this.date;
    }

    public String getDescription() {
        return this.description;
    }

    public String toString() {
        return this.date.toString() + " --- " + this.description;
    }

    public void teach() {
        System.out.println("====================================================");
        System.out.println("HISTORICAL EVENT:");
        System.out.println("====================================================");
        System.out.println(this.toString());
    }

    public boolean equals(Object other) {
        // since instanceof on null will return false, this is a convenient
        // way to compare both for the same class AND for being a valid instance
        if (other instanceof HistoricalEvent) {
            HistoricalEvent event = (HistoricalEvent) other;
            return this.date.equals(event.date) && this.description.equals(event.description);
        }

        return false;
    }

    public int compareTo(Object other) {
        if (other instanceof HistoricalEvent) {
            HistoricalEvent event = (HistoricalEvent) other;
            if (this.date.precedes(event.date)) {
                return -1;
            }
            if (this.date.equals(event.date)) {
                return 0;
            }

            return 1;
        }
        return -1;
    }
}
