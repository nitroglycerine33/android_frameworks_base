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
 * Provides three uchar fields packed.
 */
public final class UByte3 {
    public UByte x;
    public UByte y;
    public UByte z;

    public UByte3() {
    }

    public UByte3(UByte3 data) {
        this.x = data.x;
        this.y = data.y;
        this.z = data.z;
    }

    public UByte3(UByte x, UByte y, UByte z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Vector add
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte3 add(UByte3 a, UByte3 b) {
        UByte3 res = new UByte3();
        res.x = UByte.add(a.x, b.x);
        res.y = UByte.add(a.y, b.y);
        res.z = UByte.add(a.z, b.z);

        return res;
    }

    /**
     * Vector add
     *
     * @param value
     */
    public void add(UByte3 value) {
        x.add(value.x);
        y.add(value.y);
        z.add(value.z);
    }

    /**
     * Vector add
     *
     * @param value
     */
    public void add(UByte value) {
        x.add(value);
        y.add(value);
        z.add(value);
    }

    /**
     * Vector add
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte3 add(UByte3 a, UByte b) {
        UByte3 res = new UByte3();
        res.x = UByte.add(a.x, b);
        res.y = UByte.add(a.y, b);
        res.z = UByte.add(a.z, b);

        return res;
    }

    /**
     * Vector subtraction
     *
     * @param value
     */
    public void sub(UByte3 value) {
        x.sub(value.x);
        y.sub(value.y);
        z.sub(value.z);
    }

    /**
     * Vector subtraction
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte3 sub(UByte3 a, UByte3 b) {
        UByte3 res = new UByte3();
        res.x = UByte.sub(a.x, b.x);
        res.y = UByte.sub(a.y, b.y);
        res.z = UByte.sub(a.z, b.z);

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
        z.sub(value);
    }

    /**
     * Vector subtraction
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte3 sub(UByte3 a, UByte b) {
        UByte3 res = new UByte3();
        res.x = UByte.sub(a.x, b);
        res.y = UByte.sub(a.y, b);
        res.z = UByte.sub(a.z, b);

        return res;
    }

    /**
     * Vector multiplication
     *
     * @param value
     */
    public void mul(UByte3 value) {
        x.mul(value.x);
        y.mul(value.y);
        z.mul(value.z);
    }

    /**
     * Vector multiplication
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte3 mul(UByte3 a, UByte3 b) {
        UByte3 res = new UByte3();
        res.x = UByte.mul(a.x, b.x);
        res.y = UByte.mul(a.y, b.y);
        res.z = UByte.mul(a.z, b.z);

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
        z.mul(value);
    }

    /**
     * Vector multiplication
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte3 mul(UByte3 a, UByte b) {
        UByte3 res = new UByte3();
        res.x = UByte.mul(a.x, b);
        res.y = UByte.mul(a.y, b);
        res.z = UByte.mul(a.z, b);

        return res;
    }

    /**
     * Vector division
     *
     * @param value
     */
    public void div(UByte3 value) {
        x.div(value.x);
        y.div(value.y);
        z.div(value.z);
    }

    /**
     * Vector division
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte3 div(UByte3 a, UByte3 b) {
        UByte3 res = new UByte3();
        res.x = UByte.div(a.x, b.x);
        res.y = UByte.div(a.y, b.y);
        res.z = UByte.div(a.z, b.z);

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
        z.div(value);
    }

    /**
     * Vector division
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte3 div(UByte3 a, UByte b) {
        UByte3 res = new UByte3();
        res.x = UByte.div(a.x, b);
        res.y = UByte.div(a.y, b);
        res.z = UByte.div(a.z, b);

        return res;
    }

    /**
     * Vector dot Product
     *
     * @param a
     * @return
     */
    public UByte dotProduct(UByte3 a) {
        UByte mChar = UByte.add(UByte.mul(x, a.x), UByte.mul(y, a.y));
        UByte nChar = UByte.add(UByte.mul(z, a.z), mChar);

        return nChar;
    }

    /**
     * Vector dot Product
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte dotProduct(UByte3 a, UByte3 b) {
        UByte mChar = UByte.add(UByte.mul(b.x, a.x), UByte.mul(b.y, a.y));
        UByte nChar = UByte.add(UByte.mul(b.z, a.z), mChar);

        return nChar;
    }

    /**
     * Vector add Multiple
     *
     * @param a
     * @param factor
     */
    public void addMultiple(UByte3 a, UByte factor) {
        x.add(UByte.mul(a.x, factor));
        y.add(UByte.mul(a.y, factor));
        z.add(UByte.mul(a.z, factor));
    }

    /**
     * set vector value by UByte3
     *
     * @param a
     */
    public void set(UByte3 a) {
        this.x = a.x;
        this.y = a.y;
        this.z = a.z;
    }

    /**
     * get vector length
     *
     * @return
     */
    public int length() {
        return 3;
    }

    /**
     * return the element sum of vector
     *
     * @return
     */
    public UByte elementSum() {
        UByte aChar = UByte.add(x, y);
        UByte bChar = UByte.add(z, aChar);

        return bChar;
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
        case 2:
            return z;
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
        case 2:
            z = value;
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
        case 2:
            z.add(value);
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
    public void setValues(UByte x, UByte y, UByte z, UByte w) {
        this.x = x;
        this.y = y;
        this.z = z;
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
        data[offset + 2] = z;
    }
}
