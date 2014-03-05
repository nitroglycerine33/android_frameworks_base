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
 * Provides four unsigned integer fields packed.
 */
public final class UInt4 {
    public UInt x;
    public UInt y;
    public UInt z;
    public UInt w;

    public UInt4() {
    }

    public UInt4(UInt4 data) {
        this.x = data.x;
        this.y = data.y;
        this.z = data.z;
        this.w = data.w;
    }

    public UInt4(UInt x, UInt y, UInt z, UInt w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    /**
     * Vector add
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt4 add(UInt4 a, UInt4 b) {
        UInt4 res = new UInt4();
        res.x = UInt.add(a.x, b.x);
        res.y = UInt.add(a.y, b.y);
        res.z = UInt.add(a.z, b.z);
        res.w = UInt.add(a.w, b.w);

        return res;
    }

    /**
     * Vector add
     *
     * @param value
     */
    public void add(UInt4 value) {
        x.add(value.x);
        y.add(value.y);
        z.add(value.z);
        w.add(value.w);
    }

    /**
     * Vector add
     *
     * @param value
     */
    public void add(UInt value) {
        x.add(value);
        y.add(value);
        z.add(value);
        w.add(value);
    }

    /**
     * Vector add
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt4 add(UInt4 a, UInt b) {
        UInt4 res = new UInt4();
        res.x = UInt.add(a.x, b);
        res.y = UInt.add(a.y, b);
        res.z = UInt.add(a.z, b);
        res.w = UInt.add(a.w, b);

        return res;
    }

    /**
     * Vector subtraction
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt4 sub(UInt4 a, UInt b) {
        UInt4 res = new UInt4();
        res.x = UInt.sub(a.x, b);
        res.y = UInt.sub(a.y, b);
        res.z = UInt.sub(a.z, b);
        res.w = UInt.sub(a.w, b);

        return res;
    }

    /**
     * Vector subtraction
     *
     * @param value
     */
    public void sub(UInt4 value) {
        x.sub(value.x);
        y.sub(value.y);
        z.sub(value.z);
        w.sub(value.w);
    }

    /**
     * Vector subtraction
     *
     * @param value
     */
    public void sub(UInt value) {
        x.sub(value);
        y.sub(value);
        z.sub(value);
        w.sub(value);
    }

    /**
     * Vector subtraction
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt4 sub(UInt4 a, UInt4 b) {
        UInt4 res = new UInt4();
        res.x = UInt.sub(a.x, b.x);
        res.y = UInt.sub(a.y, b.y);
        res.z = UInt.sub(a.z, b.z);
        res.w = UInt.sub(a.w, b.w);

        return res;
    }

    /**
     * Vector multiplication
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt4 mul(UInt4 a, UInt4 b) {
        UInt4 res = new UInt4();
        res.x = UInt.mul(a.x, b.x);
        res.y = UInt.mul(a.y, b.y);
        res.z = UInt.mul(a.z, b.z);
        res.w = UInt.mul(a.w, b.w);

        return res;
    }

    /**
     * Vector multiplication
     *
     * @param value
     */
    public void mul(UInt4 value) {
        x.mul(value.x);
        y.mul(value.y);
        z.mul(value.z);
        w.mul(value.w);
    }

    /**
     * Vector multiplication
     *
     * @param value
     */
    public void mul(UInt value) {
        x.mul(value);
        y.mul(value);
        z.mul(value);
        w.mul(value);
    }

    /**
     * Vector multiplication
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt4 mul(UInt4 a, UInt b) {
        UInt4 res = new UInt4();
        res.x = UInt.mul(a.x, b);
        res.y = UInt.mul(a.y, b);
        res.z = UInt.mul(a.z, b);
        res.w = UInt.mul(a.w, b);

        return res;
    }

    /**
     * Vector division
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt4 div(UInt4 a, UInt b) {
        UInt4 res = new UInt4();
        res.x = UInt.div(a.x, b);
        res.y = UInt.div(a.y, b);
        res.z = UInt.div(a.z, b);
        res.w = UInt.div(a.w, b);

        return res;
    }

    /**
     * Vector division
     *
     * @param value
     */
    public void div(UInt4 value) {
        x.div(value.x);
        y.div(value.y);
        z.div(value.z);
        w.div(value.w);
    }

    /**
     * Vector division
     *
     * @param value
     */
    public void div(UInt value) {
        x.div(value);
        y.div(value);
        z.div(value);
        w.div(value);
    }

    /**
     * Vector division
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt4 div(UInt4 a, UInt4 b) {
        UInt4 res = new UInt4();
        res.x = UInt.div(a.x, b.x);
        res.y = UInt.div(a.y, b.y);
        res.z = UInt.div(a.z, b.z);
        res.w = UInt.div(a.w, b.w);

        return res;
    }

    /**
     * Vector dot Product
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt dotProduct(UInt4 a, UInt4 b) {
        return UInt.add(UInt.add(UInt.add(UInt.mul(a.x, b.x), UInt.mul(a.y, b.y)),
                UInt.mul(a.z, b.z)), UInt.mul(a.w, b.w));
    }

    /**
     * Vector dot Product
     *
     * @param a
     * @return
     */
    public UInt dotProduct(UInt4 a) {
        return UInt.add(UInt.add(UInt.add(UInt.mul(x, a.x), UInt.mul(y, a.y)),
                UInt.mul(z, a.z)), UInt.mul(w, a.w));
    }

    /**
     * Vector add Multiple
     *
     * @param a
     * @param factor
     */
    public void addMultiple(UInt4 a, UInt factor) {
        x.add(UInt.mul(a.x, factor));
        y.add(UInt.mul(a.y, factor));
        z.add(UInt.mul(a.z, factor));
        w.add(UInt.mul(a.w, factor));
    }

    /**
     * Set vector value by float4
     *
     * @param a
     */
    public void set(UInt4 a) {
        this.x = a.x;
        this.y = a.y;
        this.z = a.z;
        this.w = a.w;
    }

    /**
     * Get vector length
     *
     * @return
     */
    public int length() {
        return 4;
    }

    /**
     * Return the element sum of vector
     *
     * @return
     */
    public UInt elementSum() {
        return UInt.add(UInt.add(UInt.add(x, y), z), w);
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
        case 2:
            return z;
        case 3:
            return w;
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
        case 2:
            z = value;
            return;
        case 3:
            w = value;
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
        case 2:
            z.add(value);
            return;
        case 3:
            w.add(value);
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
     * @param z
     * @param w
     */
    public void setValues(UInt x, UInt y, UInt z, UInt w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
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
        data[offset + 2] = z;
        data[offset + 3] = w;
    }
}
