/*
 * MIT License
 *
 * Copyright (c) 2019 Yoann CAPLAIN
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.blackdread.lib.restfilter.filter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.util.LinkedList;
import java.util.List;

public class ZonedDateTimeFilterTest {

    private ZonedDateTimeFilter filter;

    private ZonedDateTime value = ZonedDateTime.parse("2019-10-05T21:25:59+08:00[Asia/Shanghai]");

    @BeforeEach
    public void setup() {
        filter = new ZonedDateTimeFilter();
    }

    @Test
    public void testConstructor() {
        Assertions.assertNull(filter.getEquals());
        Assertions.assertNull(filter.getGreaterThan());
        Assertions.assertNull(filter.getGreaterThanOrEqual());
        Assertions.assertNull(filter.getLessThan());
        Assertions.assertNull(filter.getLessThanOrEqual());
        Assertions.assertNull(filter.getSpecified());
        Assertions.assertNull(filter.getIn());
        Assertions.assertEquals("ZonedDateTimeFilter []", filter.toString());
    }

    @Test
    public void testCopy() {
        final ZonedDateTimeFilter copy = filter.copy();
        Assertions.assertNotSame(copy, filter);
        Assertions.assertNull(copy.getEquals());
        Assertions.assertNull(copy.getGreaterThan());
        Assertions.assertNull(copy.getGreaterThanOrEqual());
        Assertions.assertNull(copy.getLessThan());
        Assertions.assertNull(copy.getLessThanOrEqual());
        Assertions.assertNull(copy.getSpecified());
        Assertions.assertNull(copy.getIn());
        Assertions.assertEquals("ZonedDateTimeFilter []", copy.toString());
    }

    @Test
    public void testSetEquals() {
        Filter<ZonedDateTime> chain = filter.setEquals(value);
        Assertions.assertEquals(filter, chain);
        Assertions.assertEquals(value, filter.getEquals());
    }

    @Test
    public void testSetLessThan() {
        Filter<ZonedDateTime> chain = filter.setLessThan(value);
        Assertions.assertEquals(filter, chain);
        Assertions.assertEquals(value, filter.getLessThan());
    }

    @Test
    public void testSetlessThanOrEqual() {
        Filter<ZonedDateTime> chain = filter.setLessThanOrEqual(value);
        Assertions.assertEquals(filter, chain);
        Assertions.assertEquals(value, filter.getLessThanOrEqual());
    }

    @Test
    public void testSetGreaterThan() {
        Filter<ZonedDateTime> chain = filter.setGreaterThan(value);
        Assertions.assertEquals(filter, chain);
        Assertions.assertEquals(value, filter.getGreaterThan());
    }

    @Test
    public void testSetGreaterThanOrEqual() {
        Filter<ZonedDateTime> chain = filter.setGreaterThanOrEqual(value);
        Assertions.assertEquals(filter, chain);
        Assertions.assertEquals(value, filter.getGreaterThanOrEqual());
    }

    @Test
    public void testSetSpecified() {
        Filter<ZonedDateTime> chain = filter.setSpecified(true);
        Assertions.assertEquals(filter, chain);
        Assertions.assertTrue(filter.getSpecified());
    }

    @Test
    public void testSetIn() {
        List<ZonedDateTime> list = new LinkedList<>();
        Filter<ZonedDateTime> chain = filter.setIn(list);
        Assertions.assertEquals(filter, chain);
        Assertions.assertEquals(list, filter.getIn());
    }

    @Test
    public void testToString() {
        filter.setEquals(value);
        filter.setLessThan(value);
        filter.setLessThanOrEqual(value);
        filter.setGreaterThan(value);
        filter.setGreaterThanOrEqual(value);
        filter.setSpecified(true);
        filter.setIn(new LinkedList<>());
        String str = value.toString();
        final String expected = "ZonedDateTimeFilter [greaterThan=2019-10-05T21:25:59+08:00[Asia/Shanghai], greaterThanOrEqual=2019-10-05T21:25:59+08:00[Asia/Shanghai], lessThan=2019-10-05T21:25:59+08:00[Asia/Shanghai], lessThanOrEqual=2019-10-05T21:25:59+08:00[Asia/Shanghai], equals=2019-10-05T21:25:59+08:00[Asia/Shanghai], specified=true, in=[]]";
        Assertions.assertEquals(expected, filter.toString());
    }
}
