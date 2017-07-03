package me.phuongtm.urlgenerator;

import java.util.Objects;

/**
 * Created by phuongtran on 7/2/17.
 */
public class UrlGenerator {

    /**
     * Generate plain alphabet string from Vietnamese string <br/>
     * Microsoft Internet Explorer has a maximum uniform resource locator (URL) length of 2,083 characters. <br/>
     * Internet Explorer also has a maximum path length of 2,048 characters. <br/>
     * This limit applies to both POST request and GET request URLs. <br/>
     * @see <a href="https://support.microsoft.com/en-us/help/208427/maximum-url-length-is-2,083-characters-in-internet-explorer">MSDN</a>
     * @param fromString String to be converted
     * @return
     */
    public static String generateFromString(final String fromString) {
        Objects.requireNonNull(fromString, "String cannot be null");
        if (fromString.length() > 1900) {
            throw new IllegalArgumentException("The URL length should be less than 2083 for better support from browser");
        }
        String result = fromString
                .trim()
                .replaceAll("á|à|ạ|ã|ả|ă|ắ|ằ|ẵ|ẳ|â|ấ|ầ|ậ|ẫ|ẩ", "a")
                .replaceAll("đ", "d")
                .replaceAll("é|è|ẹ|ẽ|ẻ|ê|ế|ề|ệ|ễ|ể", "e")
                .replaceAll("ó|ò|ọ|õ|ỏ|ô|ố|ồ|ộ|ỗ|ổ|ơ|ớ|ờ|ợ|ỡ|ở", "o")
                .replaceAll("í|ì|ị|ĩ|ỉ", "i")
                .replaceAll("ú|ù|ụ|ũ|ủ|ư|ứ|ừ|ự|ữ|ử", "u")
                .replaceAll("ý|ỳ|ỵ|ỹ|ỷ", "y")
                .replaceAll("\\s{1,}", "-")
                .replaceAll("'|,|~|\\?|`|!|@|#|$|%|^|&|\\*|\\(|\\)|_|\\+|=|\\{|\\}|\\[|\\]|\\||;|:|\"|\\.|<|>", "");
        return result;
    }

}
