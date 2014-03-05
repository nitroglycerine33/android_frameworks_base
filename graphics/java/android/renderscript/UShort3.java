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
 * Provides three unsigned short fields packed.
 */
public final class UShort3 {
    public UShort x;
    public UShort y;
    public UShort z;

    public UShort3() {
    }

    public UShort3(UShort3 data) {
        this.x = data.x;
        this.y = data.y;
        this.z = data.z;
    }

    public UShort3(UShort x, UShort y, UShort z) {
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
    public static UShort3 add(UShort3 a, UShort3 b) {
        UShort3 res = new UShort3();
        res.x = UShort.add(a.x, b.x);
        res.y = UShort.add(a.y, b.y);
        res.z = UShort.add(a.z, b.z);

        return res;
    }

    /**
     * Vector add
     *
     * @param value
     */
    public void add(UShort3 value) {
        x.add(value.x);
        y.add(value.y);
        z.add(value.z);
    }

    /**
     * Vector add
     *
     * @param value
     */
    public void add(UShort value) {
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
    public static UShort3 add(UShort3 a, UShort b) {
        UShort3 res = new UShort3();
        res.x = UShort.add(a.x, b);
        res.y = UShort.add(a.y, b);
        res.z = UShort.add(a.z, b);

        return res;
    }

    /**
     * Vector subtraction
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort3 sub(UShort3 a, UShort3 b) {
        UShort3 res = new UShort3();
        res.x = UShort.sub(a.x, b.x);
        res.y = UShort.sub(a.y, b.y);
        res.z = UShort.sub(a.z, b.z);

        return res;
    }

    /**
     * Vector subtraction
     *
     * @param value
     */
    public void sub(UShort3 value) {
        x.sub(value.x);
        y.sub(value.y);
        z.sub(value.z);
    }

    /**
     * Vector subtraction
     *
     * @param value
     */
    public void sub(UShort value) {
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
    public static UShort3 sub(UShort3 a, UShort b) {
        UShort3 res = new UShort3();
        res.x = UShort.sub(a.x, b);
        res.y = UShort.sub(a.y, b);
        res.z = UShort.sub(a.z, b);

        return res;
    }

    /**
     * Vector multiplication
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort3 mul(UShort3 a, UShort3 b) {
        UShort3 res = new UShort3();
        res.x = UShort.mul(a.x, b.x);
        res.y = UShort.mul(a.y, b.y);
        res.z = UShort.mul(a.z, b.z);

        return res;
    }

    /**
     * Vector multiplication
     *
     * @param value
     */
    public void mul(UShort3 value) {
        x.mul(value.x);
        y.mul(value.y);
        z.mul(value.z);
    }

    /**
     * Vector multiplication
     *
     * @param value
     */
    public void mul(UShort value) {
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
    public static UShort3 mul(UShort3 a, UShort b) {
        UShort3 res = new UShort3();
        res.x = UShort.mul(a.x, b);
        res.y = UShort.mul(a.y, b);
        res.z = UShort.mul(a.z, b);

        return res;
    }

    /**
     * Vector division
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort3 div(UShort3 a, UShort3 b) {
        UShort3 res = new UShort3();
        res.x = UShort.div(a.x, b.x);
        res.y = UShort.div(a.y, b.y);
        res.z = UShort.div(a.z, b.z);

        return res;
    }

    /**
     * Vector division
     *
     * @param value
     */
    public void div(UShort3 value) {
        x.div(value.x);
        y.div(value.y);
        z.div(value.z);
    }

    /**
     * Vector division
     *
     * @param value
     */
    public void div(UShort value) {
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
    public static UShort3 div(UShort3 a, UShort b) {
        UShort3 res = new UShort3();
        res.x = UShort.div(a.x, b);
        res.y = UShort.div(a.y, b);
        res.z = UShort.div(a.z, b);

        return res;
    }

    /**
     * Vector dot Product
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort dotProduct(UShort3 a, UShort3 b) {
        return UShort.add(UShort.add(UShort.mul(a.x, b.x),
                UShort.mul(a.y, b.y)), UShort.mul(a.z, b.z));
    }

    /**
     * Vector dot Product
     *
     * @param a
     * @return
     */
    public UShort dotProduct(UShort3 a) {
        return UShort.add(UShort.add(UShort.mul(x, a.x), UShort.mul(y, a.y)), UShort.mul(z, a.z));
    }

    /**
     * Vector add Multiple
     *
     * @param a
     * @param factor
     */
    public void addMultiple(UShort3 a, UShort factor) {
        x.add(UShort.mul(a.x, factor));
        y.add(UShort.mul(a.y, factor));
        z.add(UShort.mul(a.z, factor));
    }

    /**
     * Set vector value by float3
     *
     * @param a
     */
    public void set(UShort3 a) {
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
    public UShort elementSum() {
        return UShort.add(UShort.add(x, y), z);
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
    public void setAt(int i, UShort value) {
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
    public void addAt(int i, UShort value) {
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
    public void setValues(UShort x, UShort y, UShort z) {
        this.x = x;
        this.y = y;
        this.z = z;
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
        data[offset + 2] = z;
    }
}
