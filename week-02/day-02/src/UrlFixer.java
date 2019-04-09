public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";
        String url2 = url;

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        //method 1
        url = url.replace("bots", "odds");
        url = url.replace("https//", "https://");
        System.out.println(url);

        //method2
        int indexOFBots = url2.indexOf("bots");
        System.out.println(indexOFBots);
        url2 = url2.substring(5, 38);
        String fixedUrl = "https:";
        String changeEnd = "odds";
        System.out.println(fixedUrl + url2 + changeEnd);

    }
}