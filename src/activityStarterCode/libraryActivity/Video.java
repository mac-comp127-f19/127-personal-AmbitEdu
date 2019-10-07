package activityStarterCode.libraryActivity;

public class Video implements Media {

    private String title;
    private String director;
    private int copiesAvailable;
    private int copiesOwned;

    public Video(String title, String director, int copiesOwned) {
        this.title = title;
        this.director = director;
        this.copiesOwned = copiesOwned;
        this.copiesAvailable = copiesOwned;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDirector() {
        return this.director;
    }

    @Override
    public String toString() {
        return this.title + " by " + this.director + "\nCopies Available: " + copiesAvailable;
    }

    //-----------

    public boolean checkOut() {
        if(copiesAvailable >= 1) {
            copiesAvailable -= 1;
            return true;
        } else {
            return false;
        }
    }

    public boolean checkIn() {
        if(copiesAvailable < copiesOwned) {
            copiesAvailable += 1;
            return true;
        } else {
            return false;
        }
    }
}
