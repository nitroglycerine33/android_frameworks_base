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
 * Vector version of the basic unsigned integer type.
 * Provides two unsigned integer fields packed.
 */
public final class UInt2 {
    public UInt x;
    public UInt y;

    public UInt2() {
    }

    public UInt2(UInt2 data) {
        this.x = data.x;
        this.y = data.y;
    }

    public UInt2(UInt x, UInt y) {
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
    public static UInt2 add(UInt2 a, UInt2 b) {
        UInt2 res = new UInt2();
        res.x = UInt.add(a.x, b.x);
        res.y = UInt.add(a.y, b.y);

        return res;
    }

    /**
     * Vector add
     *
     * @param value
     */
    public void add(UInt2 value) {
        x.add(value.x);
        y.add(value.y);
    }

    /**
     * Vector add
     *
     * @param value
     */
    public void add(UInt value) {
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
    public static UInt2 add(UInt2 a, UInt b) {
        UInt2 res = new UInt2();
        res.x = UInt.add(a.x, b);
        res.y = UInt.add(a.y, b);

        return res;
    }

    /**
     * Vector subtraction
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt2 sub(UInt2 a, UInt2 b) {
        UInt2 res = new UInt2();
        res.x = UInt.sub(a.x, b.x);
        res.y = UInt.sub(a.y, b.y);

        return res;
    }

    /**
     * Vector subtraction
     *
     * @param value
     */
    public void sub(UInt2 value) {
        x.sub(value.x);
        y.sub(value.y);
    }

    /**
     * Vector subtraction
     *
     * @param value
     */
    public void sub(UInt value) {
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
    public static UInt2 sub(UInt2 a, UInt b) {
        UInt2 res = new UInt2();
        res.x = UInt.sub(a.x, b);
        res.y = UInt.sub(a.y, b);

        return res;
    }

    /**
     * Vector multiplication
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt2 mul(UInt2 a, UInt2 b) {
        UInt2 res = new UInt2();
        res.x = UInt.mul(a.x, b.y);
        res.y = UInt.mul(a.y, b.y);

        return res;
    }

    /**
     * Vector multiplication
     *
     * @param value
     */
    public void mul(UInt2 value) {
        x.mul(value.x);
        y.mul(value.y);
    }

    /**
     * Vector multiplication
     *
     * @param value
     */
    public void mul(UInt value) {
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
    public static UInt2 mul(UInt2 a, UInt b) {
        UInt2 res = new UInt2();
        res.x = UInt.mul(a.x, b);
        res.y = UInt.mul(a.y, b);

        return res;
    }

    /**
     * Vector division
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt2 div(UInt2 a, UInt2 b) {
        UInt2 res = new UInt2();
        res.x = UInt.div(a.x, b.x);
        res.y = UInt.div(a.y, b.y);

        return res;
    }

    /**
     * Vector division
     *
     * @param value
     */
    public void div(UInt2 value) {
        x.div(value.x);
        y.div(value.y);
    }

    /**
     * Vector division
     *
     * @param value
     */
    public void div(UInt value) {
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
    public static UInt2 div(UInt2 a, UInt b) {
        UInt2 res = new UInt2();
        res.x = UInt.div(a.x, b);
        res.y = UInt.div(a.y, b);

        return res;
    }

    /**
     * Vector dot product
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt dotProduct(UInt2 a, UInt2 b) {
        return UInt.add(UInt.mul(a.x, b.x), UInt.mul(a.y, b.y));
    }

    /**
     * Vector dot product
     *
     * @param a
     * @return
     */
    public UInt dotProduct(UInt2 a) {
        return UInt.add(UInt.mul(x, a.x), UInt.mul(y, a.y));
    }

    /**
     * Vector add Multiple
     *
     * @param a
     * @param factor
     */
    public void addMultiple(UInt2 a, UInt factor) {
        x.add(UInt.mul(a.x, factor));
        y.add(UInt.mul(a.y, factor));
    }

    /**
     * Set vector value by UInt2
     *
     * @param a
     */
    public void set(UInt2 a) {
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
    public UInt elementSum() {
        return UInt.add(x, y);
    }

    /**
     * Get the vector field value by index
     *
     * @param i
     * @return
     */
    public UInt get(int i) {
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
    public void setAt(int i, UInt value) {
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
    public void addAt(int i, UInt value) {
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
    public void setValues(UInt x, UInt y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Copy the vector to UInt array
     *
     * @param data
     * @param offset
     */
    public void copyTo(UInt[] data, int offset) {
        data[offset] = x;
        data[offset + 1] = y;
    }
}
