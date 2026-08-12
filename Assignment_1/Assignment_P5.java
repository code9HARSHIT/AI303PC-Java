// Issuable Interface
interface Issuable {
    void issueItem();
    void returnItem();
}

// Abstract Parent Class
abstract class LibraryItem {
    protected String title;
    protected String itemId;
    protected boolean isIssued;

    public LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isIssued = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean isIssued) {
        this.isIssued = isIssued;
    }

    public void displayInfo() {
        System.out.println("ID: " + itemId + " | Title: " + title + " | Issued: " + isIssued);
    }

    public abstract double calculateFine(int daysLate);
}

class Book extends LibraryItem implements Issuable {
    private static final double FINE_PER_DAY = 5.0;

    public Book(String title, String itemId) {
        super(title, itemId);
    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * FINE_PER_DAY;
    }

    @Override
    public void issueItem() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book '" + title + "' has been issued.");
        } else {
            System.out.println("Book '" + title + "' is already issued.");
        }
    }

    @Override
    public void returnItem() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book '" + title + "' has been returned.");
        } else {
            System.out.println("Book '" + title + "' was not issued.");
        }
    }

    @Override
    public String toString() {
        return "Item: " + title + " (Book)";
    }
}

class Magazine extends LibraryItem implements Issuable {
    private static final double FINE_PER_DAY = 2.0;

    public Magazine(String title, String itemId) {
        super(title, itemId);
    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * FINE_PER_DAY;
    }

    @Override
    public void issueItem() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Magazine '" + title + "' has been issued.");
        } else {
            System.out.println("Magazine '" + title + "' is already issued.");
        }
    }

    @Override
    public void returnItem() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Magazine '" + title + "' has been returned.");
        } else {
            System.out.println("Magazine '" + title + "' was not issued.");
        }
    }

    @Override
    public String toString() {
        return "Item: " + title + " (Magazine)";
    }
}

public class Assignment_P5 {
    public static void main(String[] args) {
        // Instantiate 2 Books and 2 Magazines
        LibraryItem book1 = new Book("Java Programming", "B101");
        LibraryItem mag1 = new Magazine("National Geographic", "M201");
        LibraryItem book2 = new Book("Clean Code", "B102");
        LibraryItem mag2 = new Magazine("Time Magazine", "M202");

        LibraryItem[] items = { book1, mag1, book2, mag2 };

        System.out.println("=== Issuing Items ===");
        for (LibraryItem item : items) {
            if(item instanceof Issuable) {
                ((Issuable) item).issueItem();
            }
        }

        System.out.println("\n=== Late Returns & Fine Calculation ===");
        int[] daysLate = { 4, 4, 2, 2 };

        for (int i = 0; i < items.length; i++) {
            double fine = items[i].calculateFine(daysLate[i]);
            System.out.printf("%s | Fine for %d days late: Rs.%.0f\n", items[i], daysLate[i], fine);
        }
    }
}
