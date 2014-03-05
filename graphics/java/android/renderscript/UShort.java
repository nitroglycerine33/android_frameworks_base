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
 * Basic unsigned short type.
 * Provides unsigned short field packed.
 */
public final class UShort {
    private short x;

    public UShort() {
    }

    public UShort(int x) {
        if (x < 0) {
            throw new IllegalArgumentException();
        }
        this.x = (short)x;
    }

    public UShort(UShort data) {
        this.x = (short)(data.getValue());
    }

    /**
     * UShort add
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort add(UShort a, UShort b) {
        UShort res = new UShort();
        res.x = (short)(a.getValue() + b.getValue());

        return res;
    }

    /**
     * UShort add
     *
     * @param value
     */
    public void add(UShort value) {
        x += value.getValue();
    }

    /**
     * UShort subtraction
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort sub(UShort a, UShort b) {
        UShort res = new UShort();
        res.x = (short)(a.getValue() - b.getValue());

        return res;
    }

    /**
     * UShort subtraction
     *
     * @param value
     */
    public void sub(UShort value) {
        x -= value.getValue();
    }

    /**
     * UShort multiplication
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort mul(UShort a, UShort b) {
        UShort res = new UShort();
        res.x = (short)(a.getValue() * b.getValue());

        return res;
    }

    /**
     * UShort multiplication
     *
     * @param value
     */
    public void mul(UShort value) {
        x *= value.getValue();
    }

    /**
     * UShort division
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort div(UShort a, UShort b) {
        UShort res = new UShort();
        res.x = (short)(a.getValue() / b.getValue());

        return res;
    }

    /**
     * UShort division
     *
     * @param value
     */
    public void div(UShort value) {
        x /= value.getValue();
    }

    /**
     * Set value by UShort
     *
     * @param a
     */
    public void set(UShort a) {
        this.x = (short)(a.getValue());
    }

    /**
     * Get value
     *
     * @return
     */
    public int getValue() {
        return x & 0xFFFF;
    }
}
