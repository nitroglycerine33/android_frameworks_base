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
 * Basic unsigned integer type.
 */
public final class UInt {
    private int x;

    public UInt() {
    }

    public UInt(long x) {
        if (x < 0) {
            throw new IllegalArgumentException();
        }
        this.x = (int)x;
    }

    public UInt(UInt data) {
        this.x = (int)(data.getValue());
    }

    /**
     * UInt add
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt add(UInt a, UInt b) {
        UInt res = new UInt();
        res.x = (int)(a.getValue() + b.getValue());

        return res;
    }

    /**
     * UInt add
     *
     * @param value
     */
    public void add(UInt value) {
        x += value.getValue();
    }

    /**
     * UInt subtraction
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt sub(UInt a, UInt b) {
        UInt res = new UInt();
        res.x = (int)(a.getValue() - b.getValue());

        return res;
    }

    /**
     * UInt subtraction
     *
     * @param value
     */
    public void sub(UInt value) {
        x -= value.getValue();
    }

    /**
     * UInt multiplication
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt mul(UInt a, UInt b) {
        UInt res = new UInt();
        res.x = (int)(a.getValue() * b.getValue());

        return res;
    }

    /**
     * UInt multiplication
     *
     * @param value
     */
    public void mul(UInt value) {
        x *= value.getValue();
    }

    /**
     * UInt division
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt div(UInt a, UInt b) {
        UInt res = new UInt();
        res.x = (int)(a.getValue() / b.getValue());

        return res;
    }

    /**
     * UInt division
     *
     * @param value
     */
    public void div(UInt value) {
        x /= value.getValue();
    }

    /**
     * Set value by UInt
     *
     * @param a
     */
    public void set(UInt a) {
        this.x = (int)(a.getValue());
    }

    /**
     * Get value
     *
     * @return
     */
    public long getValue() {
        return x & 0xFFFFFFFFL;
    }
}
