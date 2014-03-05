/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.renderscript;

import android.renderscript.ULong;

/** @hide
 * Vector version of the basic ulong type.
 * Provides two ulong fields packed.
 */
public final class ULong2 {
    public ULong x;
    public ULong y;

    public ULong2() {
    }

    public ULong2(ULong2 data) {
        this.x = data.x;
        this.y = data.y;
    }

    public ULong2(ULong x, ULong y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Vector add
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong2 add(ULong2 a, ULong2 b) {
        ULong2 res = new ULong2();
        res.x = ULong.add(a.x, b.x);
        res.y = ULong.add(a.y, b.y);

        return res;
    }

    /**
     * Vector add
     *
     * @param value
     */
    public void add(ULong2 value) {
        x.add(value.x);
        y.add(value.y);
    }

    /**
     * Vector add
     *
     * @param value
     */
    public void add(ULong value) {
        x.add(value);
        y.add(value);
    }

    /**
     * Vector add
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong2 add(ULong2 a, ULong b) {
        ULong2 res = new ULong2();
        res.x = ULong.add(a.x, b);
        res.y = ULong.add(a.y, b);

        return res;
    }

    /**
     * Vector subtraction
     *
     * @param value
     */
    public void sub(ULong2 value) {
        x.sub(value.x);
        y.sub(value.y);
    }

    /**
     * Vector subtraction
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong2 sub(ULong2 a, ULong2 b) {
        ULong2 res = new ULong2();
        res.x = ULong.sub(a.x, b.x);
        res.y = ULong.sub(a.y, b.y);

        return res;
    }

    /**
     * Vector subtraction
     *
     * @param value
     */
    public void sub(ULong value) {
        x.sub(value);
        y.sub(value);
    }

    /**
     * Vector subtraction
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong2 sub(ULong2 a, ULong b) {
        ULong2 res = new ULong2();
        res.x = ULong.sub(a.x, b);
        res.y = ULong.sub(a.y, b);

        return res;
    }

    /**
     * Vector multiplication
     *
     * @param value
     */
    public void mul(ULong2 value) {
        x.mul(value.x);
        y.mul(value.y);
    }

    /**
     * Vector multiplication
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong2 mul(ULong2 a, ULong2 b) {
        ULong2 res = new ULong2();
        res.x = ULong.mul(a.x, b.x);
        res.y = ULong.mul(a.y, b.y);

        return res;
    }

    /**
     * Vector multiplication
     *
     * @param value
     */
    public void mul(ULong value) {
        x.mul(value);
        y.mul(value);
    }

    /**
     * Vector multiplication
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong2 mul(ULong2 a, ULong b) {
        ULong2 res = new ULong2();
        res.x = ULong.mul(a.x, b);
        res.y = ULong.mul(a.y, b);

        return res;
    }

    /**
     * Vector division
     *
     * @param value
     */
    public void div(ULong2 value) {
        x.div(value.x);
        y.div(value.y);
    }

    /**
     * Vector division
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong2 div(ULong2 a, ULong2 b) {
        ULong2 res = new ULong2();
        res.x = ULong.div(a.x, b.x);
        res.y = ULong.div(a.y, b.y);

        return res;
    }

    /**
     * Vector division
     *
     * @param value
     */
    public void div(ULong value) {
        x.div(value);
        y.div(value);
    }

    /**
     * Vector division
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong2 div(ULong2 a, ULong b) {
        ULong2 res = new ULong2();
        res.x = ULong.div(a.x, b);
        res.y = ULong.div(a.y, b);

        return res;
    }

    /**
     * Vector dot Product
     *
     * @param a
     * @return
     */
    public ULong dotProduct(ULong2 a) {
        return ULong.add(ULong.mul(x, a.x), ULong.mul(y, a.y));
    }

    /**
     * Vector dot Product
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong dotProduct(ULong2 a, ULong2 b) {
        return ULong.add(ULong.mul(b.x, a.x), ULong.mul(b.y, a.y));
    }

    /**
     * Vector add Multiple
     *
     * @param a
     * @param factor
     */
    public void addMultiple(ULong2 a, ULong factor) {
        x.add(ULong.mul(a.x, factor));
        y.add(ULong.mul(a.y, factor));
    }

    /**
     * Set vector value by ULong2
     *
     * @param a
     */
    public void set(ULong2 a) {
        this.x = a.x;
        this.y = a.y;
    }

    /**
     * Get vector length
     *
     * @return
     */
    public int length() {
        return 2;
    }

    /**
     * Return the element sum of vector
     *
     * @return
     */
    public ULong elementSum() {
        return ULong.add(x, y);
    }

    /**
     * Get the vector field value by index
     *
     * @param i
     * @return
     */
    public ULong get(int i) {
        switch (i) {
        case 0:
            return x;
        case 1:
            return y;
        default:
            throw new IndexOutOfBoundsException("Index: i");
        }
    }

    /**
     * Set the vector field value by index
     *
     * @param i
     * @param value
     */
    public void setAt(int i, ULong value) {
        switch (i) {
        case 0:
            x = value;
            return;
        case 1:
            y = value;
            return;
        default:
            throw new IndexOutOfBoundsException("Index: i");
        }
    }

    /**
     * Add the vector field value by index
     *
     * @param i
     * @param value
     */
    public void addAt(int i, ULong value) {
        switch (i) {
        case 0:
            x.add(value);
            return;
        case 1:
            y.add(value);
            return;
        default:
            throw new IndexOutOfBoundsException("Index: i");
        }
    }

    /**
     * Set the vector field value
     *
     * @param x
     * @param y
     */
    public void setValues(ULong x, ULong y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Copy the vector to ULong array
     *
     * @param data
     * @param offset
     */
    public void copyTo(ULong[] data, int offset) {
        data[offset] = x;
        data[offset + 1] = y;
    }
}
