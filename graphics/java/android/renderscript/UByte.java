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
 * Basic UByte type.
 */
public final class UByte {

    private byte x;

    public UByte() {
    }

    public UByte(char value) {
        setValue(fixValue(value));
    }

    private char fixValue(char value) {
        int oraValue = (int) value;
        if (oraValue > 255) {
            oraValue = oraValue % 256;
        }
        return (char) oraValue;
    }

    private void setValue(char value) {
        value = fixValue(value);
        x = (byte) (value & 0xff);
    }

    public char getValue() {
        return (char) (x & 0x00FF);
    }

    public UByte(UByte data) {
        x = data.x;
    }

    /**
     * UByte add
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte add(UByte a, UByte b) {
        char cValue = (char) (a.getValue() + b.getValue());
        UByte res = new UByte(cValue);

        return res;
    }

    /**
     * UByte add
     *
     * @param value
     */
    public void add(UByte value) {
        char cValue = (char) (value.getValue() + getValue());
        setValue(cValue);
    }

    /**
     * UByte subtraction
     *
     * @param value
     */
    public void sub(UByte value) {
        char cValue = (char) (getValue() - value.getValue());
        setValue(cValue);
    }

    /**
     * UByte subtraction
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte sub(UByte a, UByte b) {
        char cValue = (char) (a.getValue() - b.getValue());
        UByte res = new UByte(cValue);

        return res;
    }

    /**
     * UByte multiplication
     *
     * @param value
     */
    public void mul(UByte value) {
        char cValue = (char) (getValue() * value.getValue());
        setValue(cValue);
    }

    /**
     * UByte multiplication
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte mul(UByte a, UByte b) {
        char cValue = (char) (a.getValue() * b.getValue());
        UByte res = new UByte(cValue);

        return res;
    }

    /**
     * UByte division
     *
     * @param value
     */
    public void div(UByte value) {
        char cValue = (char) (getValue() / value.getValue());
        setValue(cValue);
    }

    /**
     * UByte division
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte div(UByte a, UByte b) {
        char cValue = (char) (a.getValue() / b.getValue());
        UByte res = new UByte(cValue);

        return res;
    }

    /**
     * set UByte value by UByte
     *
     * @param a
     */
    public void set(UByte a) {
        this.x = a.x;
    }

}
