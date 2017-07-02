package me.phuongtm.urlgenerator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by phuongtran on 7/2/17.
 */
public class UrlGeneratorTest {

    @Test
    public void shouldReturnPlainString() throws Exception {
        String expected = UrlGenerator.generateFromString("Xin chào các bạn, đây là chuỗi có dấu");
        Assert.assertEquals(expected, "Xin chao cac ban, day la chuoi co dau");
    }
}
