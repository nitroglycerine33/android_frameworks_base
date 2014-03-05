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
 * Provides three unsigned integer fields packed.
 */
public final class UInt3 {
    public UInt x;
    public UInt y;
    public UInt z;

    public UInt3() {
    }

    public UInt3(UInt3 data) {
        this.x = data.x;
        this.y = data.y;
        this.z = data.z;
    }

    public UInt3(UInt x, UInt y, UInt z) {
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
    public static UInt3 add(UInt3 a, UInt3 b) {
        UInt3 res = new UInt3();
        res.x = UInt.add(a.x, b.x);
        res.y = UInt.add(a.y, b.y);
        res.z = UInt.add(a.z, b.z);

        return res;
    }

    /**
     * Vector add
     *
     * @param value
     */
    public void add(UInt3 value) {
        x.add(value.x);
        y.add(value.y);
        z.add(value.z);
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
    }

    /**
     * Vector add
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt3 add(UInt3 a, UInt b) {
        UInt3 res = new UInt3();
        res.x = UInt.add(a.x, b);
        res.y = UInt.add(a.y, b);
        res.z = UInt.add(a.z, b);

        return res;
    }

    /**
     * Vector subtraction
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt3 sub(UInt3 a, UInt3 b) {
        UInt3 res = new UInt3();
        res.x = UInt.sub(a.x, b.x);
        res.y = UInt.sub(a.y, b.y);
        res.z = UInt.sub(a.z, b.z);

        return res;
    }

    /**
     * Vector subtraction
     *
     * @param value
     */
    public void sub(UInt3 value) {
        x.sub(value.x);
        y.sub(value.y);
        z.sub(value.z);
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
    }

    /**
     * Vector subtraction
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt3 sub(UInt3 a, UInt b) {
        UInt3 res = new UInt3();
        res.x = UInt.sub(a.x, b);
        res.y = UInt.sub(a.y, b);
        res.z = UInt.sub(a.z, b);

        return res;
    }

    /**
     * Vector multiplication
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt3 mul(UInt3 a, UInt3 b) {
        UInt3 res = new UInt3();
        res.x = UInt.mul(a.x, b.x);
        res.y = UInt.mul(a.y, b.y);
        res.z = UInt.mul(a.z, b.z);

        return res;
    }

    /**
     * Vector multiplication
     *
     * @param value
     */
    public void mul(UInt3 value) {
        x.mul(value.x);
        y.mul(value.y);
        z.mul(value.z);
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
    }

    /**
     * Vector multiplication
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt3 mul(UInt3 a, UInt b) {
        UInt3 res = new UInt3();
        res.x = UInt.mul(a.x, b);
        res.y = UInt.mul(a.y, b);
        res.z = UInt.mul(a.z, b);

        return res;
    }

    /**
     * Vector division
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt3 div(UInt3 a, UInt3 b) {
        UInt3 res = new UInt3();
        res.x = UInt.div(a.x, b.x);
        res.y = UInt.div(a.y, b.y);
        res.z = UInt.div(a.z, b.z);

        return res;
    }

    /**
     * Vector division
     *
     * @param value
     */
    public void div(UInt3 value) {
        x.div(value.x);
        y.div(value.y);
        z.div(value.z);
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
    }

    /**
     * Vector division
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt3 div(UInt3 a, UInt b) {
        UInt3 res = new UInt3();
        res.x = UInt.div(a.x, b);
        res.y = UInt.div(a.y, b);
        res.z = UInt.div(a.z, b);

        return res;
    }

    /**
     * Vector dot Product
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt dotProduct(UInt3 a, UInt3 b) {
        return UInt.add(UInt.add(UInt.mul(a.x, b.x), UInt.mul(a.y, b.y)), UInt.mul(a.z, b.z));
    }

    /**
     * Vector dot Product
     *
     * @param a
     * @return
     */
    public UInt dotProduct(UInt3 a) {
        return UInt.add(UInt.add(UInt.mul(x, a.x), UInt.mul(y, a.y)), UInt.mul(z, a.z));
    }

    /**
     * Vector add Multiple
     *
     * @param a
     * @param factor
     */
    public void addMultiple(UInt3 a, UInt factor) {
        x.add(UInt.mul(a.x, factor));
        y.add(UInt.mul(a.y, factor));
        z.add(UInt.mul(a.z, factor));
    }

    /**
     * Set vector value by float3
     *
     * @param a
     */
    public void set(UInt3 a) {
        this.x = a.x;
        this.y = a.y;
        this.z = a.z;
    }

    /**
     * Get vector length
     *
     * @return
     */
    public int length() {
        return 3;
    }

    /**
     * Return the element sum of vector
     *
     * @return
     */
    public UInt elementSum() {
        return UInt.add(UInt.add(x, y), z);
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
     */
    public void setValues(UInt x, UInt y, UInt z) {
        this.x = x;
        this.y = y;
        this.z = z;
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
    }
}
