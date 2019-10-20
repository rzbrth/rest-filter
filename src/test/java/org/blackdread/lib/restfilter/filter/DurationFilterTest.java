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

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

public class DurationFilterTest {

    private DurationFilter filter;

    private Duration value = Duration.ofMinutes(5);

    @BeforeEach
    public void setup() {
        filter = new DurationFilter();
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
        Assertions.assertEquals("DurationFilter []", filter.toString());
    }

    @Test
    public void testCopy() {
        final DurationFilter copy = filter.copy();
        Assertions.assertNotSame(copy, filter);
        Assertions.assertNull(copy.getEquals());
        Assertions.assertNull(copy.getGreaterThan());
        Assertions.assertNull(copy.getGreaterThanOrEqual());
        Assertions.assertNull(copy.getLessThan());
        Assertions.assertNull(copy.getLessThanOrEqual());
        Assertions.assertNull(copy.getSpecified());
        Assertions.assertNull(copy.getIn());
        Assertions.assertEquals("DurationFilter []", copy.toString());
    }

    @Test
    public void testSetEquals() {
        Filter<Duration> chain = filter.setEquals(value);
        Assertions.assertEquals(filter, chain);
        Assertions.assertEquals(value, filter.getEquals());
    }

    @Test
    public void testSetLessThan() {
        Filter<Duration> chain = filter.setLessThan(value);
        Assertions.assertEquals(filter, chain);
        Assertions.assertEquals(value, filter.getLessThan());
    }

    @Test
    public void testSetlessThanOrEqual() {
        Filter<Duration> chain = filter.setLessThanOrEqual(value);
        Assertions.assertEquals(filter, chain);
        Assertions.assertEquals(value, filter.getLessThanOrEqual());
    }

    @Test
    public void testSetGreaterThan() {
        Filter<Duration> chain = filter.setGreaterThan(value);
        Assertions.assertEquals(filter, chain);
        Assertions.assertEquals(value, filter.getGreaterThan());
    }

    @Test
    public void testSetGreaterThanOrEqual() {
        Filter<Duration> chain = filter.setGreaterThanOrEqual(value);
        Assertions.assertEquals(filter, chain);
        Assertions.assertEquals(value, filter.getGreaterThanOrEqual());
    }

    @Test
    public void testSetSpecified() {
        Filter<Duration> chain = filter.setSpecified(true);
        Assertions.assertEquals(filter, chain);
        Assertions.assertTrue(filter.getSpecified());
    }

    @Test
    public void testSetIn() {
        List<Duration> list = new LinkedList<>();
        Filter<Duration> chain = filter.setIn(list);
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
        Assertions.assertEquals("DurationFilter [greaterThan=PT5M, greaterThanOrEqual=PT5M, lessThan=PT5M, lessThanOrEqual=PT5M, equals=PT5M, specified=true, in=[]]", filter.toString());
    }
}
