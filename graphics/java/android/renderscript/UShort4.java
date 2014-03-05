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
 * Vector version of the basic short type.
 * Provides four short fields packed.
 */
public final class UShort4 {
    public UShort x;
    public UShort y;
    public UShort z;
    public UShort w;

    public UShort4() {
    }

    public UShort4(UShort4 data) {
        this.x = data.x;
        this.y = data.y;
        this.z = data.z;
        this.w = data.w;
    }

    public UShort4(UShort x, UShort y, UShort z, UShort w) {
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
    public static UShort4 add(UShort4 a, UShort4 b) {
        UShort4 res = new UShort4();
        res.x = UShort.add(a.x, b.x);
        res.y = UShort.add(a.y, b.y);
        res.z = UShort.add(a.z, b.z);
        res.w = UShort.add(a.w, b.w);

        return res;
    }

    /**
     * Vector add
     *
     * @param value
     */
    public void add(UShort4 value) {
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
    public void add(UShort value) {
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
    public static UShort4 add(UShort4 a, UShort b) {
        UShort4 res = new UShort4();
        res.x = UShort.add(a.x, b);
        res.y = UShort.add(a.y, b);
        res.z = UShort.add(a.z, b);
        res.w = UShort.add(a.w, b);

        return res;
    }

    /**
     * Vector subtraction
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort4 sub(UShort4 a, UShort b) {
        UShort4 res = new UShort4();
        res.x = UShort.sub(a.x, b);
        res.y = UShort.sub(a.y, b);
        res.z = UShort.sub(a.z, b);
        res.w = UShort.sub(a.w, b);

        return res;
    }

    /**
     * Vector subtraction
     *
     * @param value
     */
    public void sub(UShort4 value) {
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
    public void sub(UShort value) {
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
    public static UShort4 sub(UShort4 a, UShort4 b) {
        UShort4 res = new UShort4();
        res.x = UShort.sub(a.x, b.x);
        res.y = UShort.sub(a.y, b.y);
        res.z = UShort.sub(a.z, b.z);
        res.w = UShort.sub(a.w, b.w);

        return res;
    }

    /**
     * Vector multiplication
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort4 mul(UShort4 a, UShort4 b) {
        UShort4 res = new UShort4();
        res.x = UShort.mul(a.x, b.x);
        res.y = UShort.mul(a.y, b.y);
        res.z = UShort.mul(a.z, b.z);
        res.w = UShort.mul(a.w, b.w);

        return res;
    }

    /**
     * Vector multiplication
     *
     * @param value
     */
    public void mul(UShort4 value) {
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
    public void mul(UShort value) {
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
    public static UShort4 mul(UShort4 a, UShort b) {
        UShort4 res = new UShort4();
        res.x = UShort.mul(a.x, b);
        res.y = UShort.mul(a.y, b);
        res.z = UShort.mul(a.z, b);
        res.w = UShort.mul(a.w, b);

        return res;
    }

    /**
     * Vector division
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort4 div(UShort4 a, UShort b) {
        UShort4 res = new UShort4();
        res.x = UShort.div(a.x, b);
        res.y = UShort.div(a.y, b);
        res.z = UShort.div(a.z, b);
        res.w = UShort.div(a.w, b);

        return res;
    }

    /**
     * Vector division
     *
     * @param value
     */
    public void div(UShort4 value) {
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
    public void div(UShort value) {
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
    public static UShort4 div(UShort4 a, UShort4 b) {
        UShort4 res = new UShort4();
        res.x = UShort.div(a.x, b.x);
        res.y = UShort.div(a.y, b.y);
        res.z = UShort.div(a.z, b.z);
        res.w = UShort.div(a.w, b.w);

        return res;
    }

    /**
     * Vector dot Product
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort dotProduct(UShort4 a, UShort4 b) {
        return UShort.add(UShort.add(UShort.add(UShort.mul(a.x, b.x), UShort.mul(a.y, b.y)),
                UShort.mul(a.z, b.z)), UShort.mul(a.w, b.w));
    }

    /**
     * Vector dot Product
     *
     * @param a
     * @return
     */
    public UShort dotProduct(UShort4 a) {
        return UShort.add(UShort.add(UShort.add(UShort.mul(x, a.x), UShort.mul(y, a.y)),
                UShort.mul(z, a.z)), UShort.mul(w, a.w));
    }

    /**
     * Vector add Multiple
     *
     * @param a
     * @param factor
     */
    public void addMultiple(UShort4 a, UShort factor) {
        x.add(UShort.mul(a.x, factor));
        y.add(UShort.mul(a.y, factor));
        z.add(UShort.mul(a.z, factor));
        w.add(UShort.mul(a.w, factor));
    }

    /**
     * Set vector value by float4
     *
     * @param a
     */
    public void set(UShort4 a) {
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
    public UShort elementSum() {
        return UShort.add(UShort.add(UShort.add(x, y), z), w);
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
    public void setValues(UShort x, UShort y, UShort z, UShort w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
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
        data[offset + 3] = w;
    }
}
