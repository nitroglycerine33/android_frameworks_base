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
 * Basic ULong type.
 */
public final class ULong {

    private long x;

    public ULong() {
    }

    public ULong(long x) {
        if (x < 0) {
            throw new IllegalArgumentException();
        }
        this.x = (long)x;
    }

    private long fixValue(long value) {
        long oraValue = value;
        if (oraValue > 9223372036854775807L) {
            oraValue = oraValue % (4294967296L * 2147483648L);
        }
        return oraValue;
    }

    private void setValue(long value) {
        value = fixValue(value);
        x = value & 0xFFFFFFFFFFFFFFFFL;
    }

    public long getValue() {
        return x & 0xFFFFFFFFFFFFFFFFL;
    }

    public ULong(ULong data) {
        x = data.x;
    }

    /**
     * ULong add
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong add(ULong a, ULong b) {
        long lValue = a.getValue() + b.getValue();
        ULong res = new ULong(lValue);

        return res;
    }

    /**
     * ULong add
     *
     * @param value
     */
    public void add(ULong value) {
        long lValue = value.getValue() + getValue();
        setValue(lValue);
    }

    /**
     * ULong subtraction
     *
     * @param value
     */
    public void sub(ULong value) {
        long lValue = getValue() - value.getValue();
        setValue(lValue);
    }

    /**
     * ULong subtraction
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong sub(ULong a, ULong b) {
        long lValue = a.getValue() - b.getValue();
        ULong res = new ULong(lValue);

        return res;
    }

    /**
     * ULong multiplication
     *
     * @param value
     */
    public void mul(ULong value) {
        long lValue = getValue() * value.getValue();
        setValue(lValue);
    }

    /**
     * ULong multiplication
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong mul(ULong a, ULong b) {
        long lValue = a.getValue() * b.getValue();
        ULong res = new ULong(lValue);

        return res;
    }

    /**
     * ULong division
     *
     * @param value
     */
    public void div(ULong value) {
        long lValue = getValue() / value.getValue();
        setValue(lValue);
    }

    /**
     * ULong division
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong div(ULong a, ULong b) {
        long lValue = a.getValue() / b.getValue();
        ULong res = new ULong(lValue);

        return res;
    }

    /**
     * Set ULong value by ULong
     *
     * @param a
     */
    public void set(ULong a) {
        this.x = a.x;
    }
}
