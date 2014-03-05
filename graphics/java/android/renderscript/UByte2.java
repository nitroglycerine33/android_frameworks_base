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

import android.renderscript.UByte;

/** @hide
 * Vector version of the basic uchar type.
 * Provides two uchar fields packed.
 */
public final class UByte2 {
    public UByte x;
    public UByte y;

    public UByte2() {
    }

    public UByte2(UByte2 data) {
        this.x = data.x;
        this.y = data.y;
    }

    public UByte2(UByte x, UByte y) {
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
    public static UByte2 add(UByte2 a, UByte2 b) {
        UByte2 res = new UByte2();
        res.x = UByte.add(a.x, b.x);
        res.y = UByte.add(a.y, b.y);

        return res;
    }

    /**
     * Vector add
     *
     * @param value
     */
    public void add(UByte2 value) {
        x.add(value.x);
        y.add(value.y);
    }

    /**
     * Vector add
     *
     * @param value
     */
    public void add(UByte value) {
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
    public static UByte2 add(UByte2 a, UByte b) {
        UByte2 res = new UByte2();
        res.x = UByte.add(a.x, b);
        res.y = UByte.add(a.y, b);

        return res;
    }

    /**
     * Vector subtraction
     *
     * @param value
     */
    public void sub(UByte2 value) {
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
    public static UByte2 sub(UByte2 a, UByte2 b) {
        UByte2 res = new UByte2();
        res.x = UByte.sub(a.x, b.x);
        res.y = UByte.sub(a.y, b.y);

        return res;
    }

    /**
     * Vector subtraction
     *
     * @param value
     */
    public void sub(UByte value) {
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
    public static UByte2 sub(UByte2 a, UByte b) {
        UByte2 res = new UByte2();
        res.x = UByte.sub(a.x, b);
        res.y = UByte.sub(a.y, b);

        return res;
    }

    /**
     * Vector multiplication
     *
     * @param value
     */
    public void mul(UByte2 value) {
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
    public static UByte2 mul(UByte2 a, UByte2 b) {
        UByte2 res = new UByte2();
        res.x = UByte.mul(a.x, b.x);
        res.y = UByte.mul(a.y, b.y);

        return res;
    }

    /**
     * Vector multiplication
     *
     * @param value
     */
    public void mul(UByte value) {
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
    public static UByte2 mul(UByte2 a, UByte b) {
        UByte2 res = new UByte2();
        res.x = UByte.mul(a.x, b);
        res.y = UByte.mul(a.y, b);

        return res;
    }

    /**
     * Vector division
     *
     * @param value
     */
    public void div(UByte2 value) {
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
    public static UByte2 div(UByte2 a, UByte2 b) {
        UByte2 res = new UByte2();
        res.x = UByte.div(a.x, b.x);
        res.y = UByte.div(a.y, b.y);

        return res;
    }

    /**
     * Vector division
     *
     * @param value
     */
    public void div(UByte value) {
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
    public static UByte2 div(UByte2 a, UByte b) {
        UByte2 res = new UByte2();
        res.x = UByte.div(a.x, b);
        res.y = UByte.div(a.y, b);

        return res;
    }

    /**
     * Vector dot Product
     *
     * @param a
     * @return
     */
    public UByte dotProduct(UByte2 a) {
        return UByte.add(UByte.mul(x, a.x), UByte.mul(y, a.y));
    }

    /**
     * Vector dot Product
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte dotProduct(UByte2 a, UByte2 b) {
        return UByte.add(UByte.mul(b.x, a.x), UByte.mul(b.y, a.y));
    }

    /**
     * Vector add Multiple
     *
     * @param a
     * @param factor
     */
    public void addMultiple(UByte2 a, UByte factor) {
        x.add(UByte.mul(a.x, factor));
        y.add(UByte.mul(a.y, factor));
    }

    /**
     * set vector value by UByte2
     *
     * @param a
     */
    public void set(UByte2 a) {
        this.x = a.x;
        this.y = a.y;
    }

    /**
     * get vector length
     *
     * @return
     */
    public int length() {
        return 2;
    }

    /**
     * return the element sum of vector
     *
     * @return
     */
    public UByte elementSum() {
        return UByte.add(x, y);
    }

    /**
     * get the vector field value by index
     *
     * @param i
     * @return
     */
    public UByte get(int i) {
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
     * set the vector field value by index
     *
     * @param i
     * @param value
     */
    public void setAt(int i, UByte value) {
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
     * add the vector field value by index
     *
     * @param i
     * @param value
     */
    public void addAt(int i, UByte value) {
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
     * set the vector field value
     *
     * @param x
     * @param y
     */
    public void setValues(UByte x, UByte y) {
        this.x = x;
        this.y = y;
    }

    /**
     * copy the vector to UByte array
     *
     * @param data
     * @param offset
     */
    public void copyTo(UByte[] data, int offset) {
        data[offset] = x;
        data[offset + 1] = y;
    }
}
