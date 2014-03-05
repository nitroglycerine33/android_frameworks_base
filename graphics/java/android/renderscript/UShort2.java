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

/** @hide
 * Vector version of the basic unsigned short type.
 * Provides two unsigned short fields packed.
 */
public final class UShort2 {
    public UShort x;
    public UShort y;

    public UShort2() {
    }

    public UShort2(UShort2 data) {
        this.x = data.x;
        this.y = data.y;
    }

    public UShort2(UShort x, UShort y) {
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
    public static UShort2 add(UShort2 a, UShort2 b) {

        UShort2 res = new UShort2();
        res.x = UShort.add(a.x, b.x);
        res.y = UShort.add(a.y, b.y);

        return res;
    }

    /**
     * Vector add
     *
     * @param value
     */
    public void add(UShort2 value) {
        x.add(value.x);
        y.add(value.y);
    }

    /**
     * Vector add
     *
     * @param value
     */
    public void add(UShort value) {
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
    public static UShort2 add(UShort2 a, UShort b) {
        UShort2 res = new UShort2();
        res.x = UShort.add(a.x, b);
        res.y = UShort.add(a.y, b);

        return res;
    }

    /**
     * Vector subtraction
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort2 sub(UShort2 a, UShort2 b) {
        UShort2 res = new UShort2();
        res.x = UShort.sub(a.x, b.x);
        res.y = UShort.sub(a.y, b.y);

        return res;
    }

    /**
     * Vector subtraction
     *
     * @param value
     */
    public void sub(UShort2 value) {
        x.sub(value.x);
        y.sub(value.y);
    }

    /**
     * Vector subtraction
     *
     * @param value
     */
    public void sub(UShort value) {
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
    public static UShort2 sub(UShort2 a, UShort b) {
        UShort2 res = new UShort2();
        res.x = UShort.sub(a.x, b);
        res.y = UShort.sub(a.y, b);

        return res;
    }

    /**
     * Vector multiplication
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort2 mul(UShort2 a, UShort2 b) {
        UShort2 res = new UShort2();
        res.x = UShort.mul(a.x, b.y);
        res.y = UShort.mul(a.y, b.y);

        return res;
    }

    /**
     * Vector multiplication
     *
     * @param value
     */
    public void mul(UShort2 value) {
        x.mul(value.x);
        y.mul(value.y);
    }

    /**
     * Vector multiplication
     *
     * @param value
     */
    public void mul(UShort value) {
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
    public static UShort2 mul(UShort2 a, UShort b) {
        UShort2 res = new UShort2();
        res.x = UShort.mul(a.x, b);
        res.y = UShort.mul(a.y, b);

        return res;
    }

    /**
     * Vector division
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort2 div(UShort2 a, UShort2 b) {
        UShort2 res = new UShort2();
        res.x = UShort.div(a.x, b.x);
        res.y = UShort.div(a.y, b.y);

        return res;
    }

    /**
     * Vector division
     *
     * @param value
     */
    public void div(UShort2 value) {
        x.div(value.x);
        y.div(value.y);
    }

    /**
     * Vector division
     *
     * @param value
     */
    public void div(UShort value) {
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
    public static UShort2 div(UShort2 a, UShort b) {
        UShort2 res = new UShort2();
        res.x = UShort.div(a.x, b);
        res.y = UShort.div(a.y, b);

        return res;
    }

    /**
     * Vector dot product
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort dotProduct(UShort2 a, UShort2 b) {
        return UShort.add(UShort.mul(a.x, b.x), UShort.mul(a.y, b.y));
    }

    /**
     * Vector dot product
     *
     * @param a
     * @return
     */
    public UShort dotProduct(UShort2 a) {
        return UShort.add(UShort.mul(x, a.x), UShort.mul(y, a.y));
    }

    /**
     * Vector add Multiple
     *
     * @param a
     * @param factor
     */
    public void addMultiple(UShort2 a, UShort factor) {
        x.add(UShort.mul(a.x, factor));
        y.add(UShort.mul(a.y, factor));
    }

    /**
     * Set vector value by UShort2
     *
     * @param a
     */
    public void set(UShort2 a) {
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
    public UShort elementSum() {
        return UShort.add(x, y);
    }

    /**
     * Get the vector field value by index
     *
     * @param i
     * @return
     */
    public UShort get(int i) {
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
    public void setAt(int i, UShort value) {
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
    public void addAt(int i, UShort value) {
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
    public void setValues(UShort x, UShort y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Copy the vector to UShort array
     *
     * @param data
     * @param offset
     */
    public void copyTo(UShort[] data, int offset) {
        data[offset] = x;
        data[offset + 1] = y;
    }
}
