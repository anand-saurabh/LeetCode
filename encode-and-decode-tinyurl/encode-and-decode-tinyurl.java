public class Codec {
​
    
    Map<String, String>
        encode = new HashMap();
    Set<Integer>
        set = new HashSet();
    
    String temp = "http://tinyurl.com";
    
    Random rd = new Random();
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int next = rd.nextInt();
        while(set.contains(next))
        {
            next = rd.nextInt();
        }
        set.add(next);
        String tem = temp + "\\/" + next;
        encode.put(tem, longUrl);
        return tem;
    }
​
    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return encode.get(shortUrl);
    }
}
​
// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
