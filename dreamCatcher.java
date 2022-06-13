// DreamCatcher can be used as a dream journal for dream recording.
// Once clients have a dream to remember, they could put down the date
// they had that dream and its details.
// In addition, it also contains methods for deleting, or returning informations
// about recorded dreams
// And methods that provide symbol analysis for the dream
// and a keyword search feature. 
public interface DreamCatcher {

    // record a new dream with the given date
    public DreamCatcher(String date, String dreamDetail);

    // check and return the dream detail on the given date
    public String dreamCheck(String date);

    // delete the recorded dream of that given date
    public void dreamDelete(String date);

    // return the total number of the dreams that have been recorded
    public int totalDreamsNum();

    // return all the dream storys with its dates
    public List<String> allDreams();

    // search up a word from all the dreams and return all the dreams
    // that contain that words as well as tbe date
    public List<String> searchDream(String keyWord);

    // update symbol list
    public void symbolUpdate(String symbol, String explanation);

    // pass in a given date and return a symbol explanation of that day's dream
    // specifically, check if that the dream detail contains any symbols from our 
    // symbol list, and return the corresponding explanation of them
    public List<String> symbolCheck(String date);
}
