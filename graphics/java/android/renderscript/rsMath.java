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

/** @hide */
public final class rsMath {

    /**
     * Return the inverse cosine of float2.
     *
     * @param data
     * @return
     */
    public static Float2 acos(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.acos(dx);
        dy = Math.acos(dy);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the inverse cosine of float3.
     *
     * @param data
     * @return
     */
    public static Float3 acos(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.acos(dx);
        dy = Math.acos(dy);
        dz = Math.acos(dz);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the inverse cosine of float4.
     *
     * @param data
     * @return
     */
    public static Float4 acos(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.acos(dx);
        dy = Math.acos(dy);
        dz = Math.acos(dz);
        dw = Math.acos(dw);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the inverse hyperbolic cosine of float2.
     *
     * @param data
     * @return
     */
    public static Float2 acosh(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.log(dx + Math.sqrt(dx * dx - 1));
        dy = Math.log(dy + Math.sqrt(dy * dy - 1));

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the inverse hyperbolic cosine of float3.
     *
     * @param data
     * @return
     */
    public static Float3 acosh(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.log(dx + Math.sqrt(dx * dx - 1));
        dy = Math.log(dy + Math.sqrt(dy * dy - 1));
        dz = Math.log(dz + Math.sqrt(dz * dz - 1));

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the inverse hyperbolic cosine of float4.
     *
     * @param data
     * @return
     */
    public static Float4 acosh(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.log(dx + Math.sqrt(dx * dx - 1));
        dy = Math.log(dy + Math.sqrt(dy * dy - 1));
        dz = Math.log(dz + Math.sqrt(dz * dz - 1));
        dw = Math.log(dw + Math.sqrt(dw * dw - 1));

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the value of inverse cosine divided by PI of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 acospi(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.acos(dx) / Math.PI;
        dy = Math.acos(dy) / Math.PI;

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the value of inverse cosine divided by PI of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 acospi(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.acos(dx) / Math.PI;
        dy = Math.acos(dy) / Math.PI;
        dz = Math.acos(dz) / Math.PI;

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the value of inverse cosine divided by PI of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 acospi(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.acos(dx) / Math.PI;
        dy = Math.acos(dy) / Math.PI;
        dz = Math.acos(dz) / Math.PI;
        dw = Math.acos(dw) / Math.PI;

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the inverse sine of float2.
     *
     * @param data
     * @return
     */
    public static Float2 asin(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.asin(dx);
        dy = Math.asin(dy);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the inverse sine of float3.
     *
     * @param data
     * @return
     */
    public static Float3 asin(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.asin(dx);
        dy = Math.asin(dy);
        dz = Math.asin(dz);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the inverse sine of float4.
     *
     * @param data
     * @return
     */
    public static Float4 asin(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.asin(dx);
        dy = Math.asin(dy);
        dz = Math.asin(dz);
        dw = Math.asin(dw);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the inverse hyperbolic sine of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 asinh(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.log(dx + Math.sqrt(dx * dx + 1));
        dy = Math.log(dy + Math.sqrt(dy * dy + 1));

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the inverse hyperbolic sine of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 asinh(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.log(dx + Math.sqrt(dx * dx + 1));
        dy = Math.log(dy + Math.sqrt(dy * dy + 1));
        dz = Math.log(dz + Math.sqrt(dz * dz + 1));

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the inverse hyperbolic sine of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 asinh(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.log(dx + Math.sqrt(dx * dx + 1));
        dy = Math.log(dy + Math.sqrt(dy * dy + 1));
        dz = Math.log(dz + Math.sqrt(dz * dz + 1));
        dw = Math.log(dw + Math.sqrt(dw * dw + 1));

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the value of inverse sine divided by PI of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 asinpi(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.asin(dx) / Math.PI;
        dy = Math.asin(dy) / Math.PI;

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the value of inverse sine divided by PI of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 asinpi(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.asin(dx) / Math.PI;
        dy = Math.asin(dy) / Math.PI;
        dz = Math.asin(dz) / Math.PI;

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the value of inverse sine divided by PI of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 asinpi(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.asin(dx) / Math.PI;
        dy = Math.asin(dy) / Math.PI;
        dz = Math.asin(dz) / Math.PI;
        dw = Math.asin(dw) / Math.PI;

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the inverse tangent of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 atan(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.atan(dx);
        dy = Math.atan(dy);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the inverse tangent of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 atan(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.atan(dx);
        dy = Math.atan(dy);
        dz = Math.atan(dz);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the inverse tangent of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 atan(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.atan(dx);
        dy = Math.atan(dy);
        dz = Math.atan(dz);
        dw = Math.atan(dw);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the atan2 value of Float2.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float2 atan2(Float2 a, Float2 b) {
        double dx, dy;

        dx = Math.atan2((double)a.x, (double)b.x);
        dy = Math.atan2((double)a.y, (double)b.y);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the atan2 value of Float3.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float3 atan2(Float3 a, Float3 b) {
        double dx, dy, dz;

        dx = Math.atan2((double)a.x, (double)b.x);
        dy = Math.atan2((double)a.y, (double)b.y);
        dz = Math.atan2((double)a.z, (double)b.z);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the atan2 value of Float4.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float4 atan2(Float4 a, Float4 b) {
        double dx, dy, dz, dw;

        dx = Math.atan2((double)a.x, (double)b.x);
        dy = Math.atan2((double)a.y, (double)b.y);
        dz = Math.atan2((double)a.z, (double)b.z);
        dw = Math.atan2((double)a.w, (double)b.w);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the inverse hyperbolic tangent of float2.
     *
     * @param data
     * @return
     */
    public static Float2 atanh(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.log(Math.sqrt(1 - dx * dx) / (1 - dx));
        dy = Math.log(Math.sqrt(1 - dy * dy) / (1 - dy));

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the inverse hyperbolic tangent of float3.
     *
     * @param data
     * @return
     */
    public static Float3 atanh(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.log(Math.sqrt(1 - dx * dx) / (1 - dx));
        dy = Math.log(Math.sqrt(1 - dy * dy) / (1 - dy));
        dz = Math.log(Math.sqrt(1 - dz * dz) / (1 - dz));

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the inverse hyperbolic tangent of float4.
     *
     * @param data
     * @return
     */
    public static Float4 atanh(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.log(Math.sqrt(1 - dx * dx) / (1 - dx));
        dy = Math.log(Math.sqrt(1 - dy * dy) / (1 - dy));
        dz = Math.log(Math.sqrt(1 - dz * dz) / (1 - dz));
        dw = Math.log(Math.sqrt(1 - dw * dw) / (1 - dw));

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the value of inverse tangent divided by PI of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 atanpi(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.atan(dx) / Math.PI;
        dy = Math.atan(dy) / Math.PI;

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the value of inverse tangent divided by PI of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 atanpi(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.atan(dx) / Math.PI;
        dy = Math.atan(dy) / Math.PI;
        dz = Math.atan(dz) / Math.PI;

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the value of inverse tangent divided by PI of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 atanpi(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.atan(dx) / Math.PI;
        dy = Math.atan(dy) / Math.PI;
        dz = Math.atan(dz) / Math.PI;
        dw = Math.atan(dw) / Math.PI;

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the inverse tangent with 2 parameters divided by PI of Float2.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float2 atan2pi(Float2 a, Float2 b) {
        double dx, dy;

        dx = Math.atan2((double)a.x, (double)b.x) / Math.PI;
        dy = Math.atan2((double)a.y, (double)b.y) / Math.PI;

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the inverse tangent with 2 parameters divided by PI of Float3.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float3 atan2pi(Float3 a, Float3 b) {
        double dx, dy, dz;

        dx = Math.atan2((double)a.x, (double)b.x) / Math.PI;
        dy = Math.atan2((double)a.y, (double)b.y) / Math.PI;
        dz = Math.atan2((double)a.z, (double)b.z) / Math.PI;

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the inverse tangent with 2 parameters divided by PI of Float4.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float4 atan2pi(Float4 a, Float4 b) {
        double dx, dy, dz, dw;

        dx = Math.atan2((double)a.x, (double)b.x) / Math.PI;
        dy = Math.atan2((double)a.y, (double)b.y) / Math.PI;
        dz = Math.atan2((double)a.z, (double)b.z) / Math.PI;
        dw = Math.atan2((double)a.w, (double)b.w) / Math.PI;

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the cube root of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 cbrt(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.cbrt(dx);
        dy = Math.cbrt(dy);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the cube root of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 cbrt(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.cbrt(dx);
        dy = Math.cbrt(dy);
        dz = Math.cbrt(dz);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the cube root of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 cbrt(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.cbrt(dx);
        dy = Math.cbrt(dy);
        dz = Math.cbrt(dz);
        dw = Math.cbrt(dw);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the double value greater or equal to the Float2.
     *
     * @param data
     * @return
     */
    public static Float2 ceil(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.ceil(dx);
        dy = Math.ceil(dy);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the double value greater or equal to the Float3.
     *
     * @param data
     * @return
     */
    public static Float3 ceil(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.ceil(dx);
        dy = Math.ceil(dy);
        dz = Math.ceil(dz);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the double value greater or equal to the Float4.
     *
     * @param data
     * @return
     */
    public static Float4 ceil(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.ceil(dx);
        dy = Math.ceil(dy);
        dz = Math.ceil(dz);
        dw = Math.ceil(dw);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Copy the sign bit from b to a of Float2.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float2 copysign(Float2 a, Float2 b) {
        float dx, dy;

        dx = Math.copySign(a.x, b.x);
        dy = Math.copySign(a.y, b.y);

        return new Float2(dx, dy);
    }

    /**
     * Copy the sign bit from b to a of Float3.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float3 copysign(Float3 a, Float3 b) {
        float dx, dy, dz;

        dx = Math.copySign(a.x, b.x);
        dy = Math.copySign(a.y, b.y);
        dz = Math.copySign(a.z, b.z);

        return new Float3(dx, dy, dz);
    }

    /**
     * Copy the sign bit from b to a of Float4.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float4 copysign(Float4 a, Float4 b) {
        float dx, dy, dz, dw;

        dx = Math.copySign(a.x, b.x);
        dy = Math.copySign(a.y, b.y);
        dz = Math.copySign(a.z, b.z);
        dw = Math.copySign(a.w, b.w);

        return new Float4(dx, dy, dz, dw);
    }

    /**
     * Return the cosine value of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 cos(Float2 data) {
        double dx, dy;

        dx = Math.cos(data.x);
        dy = Math.cos(data.y);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the cosine value of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 cos(Float3 data) {
        double dx, dy, dz;

        dx = Math.cos(data.x);
        dy = Math.cos(data.y);
        dz = Math.cos(data.z);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the cosine value of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 cos(Float4 data) {
        double dx, dy, dz, dw;

        dx = Math.cos(data.x);
        dy = Math.cos(data.y);
        dz = Math.cos(data.z);
        dw = Math.cos(data.w);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the hyperbolic cosine of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 cosh(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.cosh(dx);
        dy = Math.cosh(dy);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the hyperbolic cosine of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 cosh(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.cosh(dx);
        dy = Math.cosh(dy);
        dz = Math.cosh(dz);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the hyperbolic cosine of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 cosh(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.cosh(dx);
        dy = Math.cosh(dy);
        dz = Math.cosh(dz);
        dw = Math.cosh(dw);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the cosine of the value multiplied by PI of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 cospi(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.cos(Math.PI * dx);
        dy = Math.cos(Math.PI * dy);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the cosine of the value multiplied by PI of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 cospi(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.cos(Math.PI * dx);
        dy = Math.cos(Math.PI * dy);
        dz = Math.cos(Math.PI * dz);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the cosine of the value multiplied by PI of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 cospi(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.cos(Math.PI * dx);
        dy = Math.cos(Math.PI * dy);
        dz = Math.cos(Math.PI * dz);
        dw = Math.cos(Math.PI * dw);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the vector distance of Float2.
     *
     * @param a
     * @param b
     * @return
     */
    public static float distance(Float2 a, Float2 b) {
        double lx, ly, lr;
        lx = a.x - b.x;
        ly = a.y - b.y;

        lr = Math.sqrt(lx * lx + ly * ly);

        return (float)lr;
    }

    /**
     * Return the vector distance of Float3.
     *
     * @param a
     * @param b
     * @return
     */
    public static float distance(Float3 a, Float3 b) {
        double lx, ly, lz, lr;
        lx = a.x - b.x;
        ly = a.y - b.y;
        lz = a.z - b.z;

        lr = Math.sqrt(lx * lx + ly * ly + lz * lz);

        return (float)lr;
    }

    /**
     * Return the vector distance of Float4.
     *
     * @param a
     * @param b
     * @return
     */
    public static float distance(Float4 a, Float4 b) {
        double lx, ly, lz, lw, lr;
        lx = a.x - b.y;
        ly = a.y - b.y;
        lz = a.z - b.z;
        lw = a.w - b.w;

        lr = Math.sqrt(lx * lx + ly * ly + lz * lz + lw * lw);

        return (float)lr;
    }


    /**
     * Return the dot product Float2.
     *
     * @param a
     * @param b
     * @return
     */
    public static float dot(Float2 a, Float2 b) {
        return a.x * b.x + a.y * b.y;
    }

    /**
     * Return the dot product Float3.
     *
     * @param a
     * @param b
     * @return
     */
    public static float dot(Float3 a, Float3 b) {
        return a.x * b.x + a.y * b.y + a.z * b.z;
    }

    /**
     * Return the dot product Float4.
     *
     * @param a
     * @param b
     * @return
     */
    public static float dot(Float4 a, Float4 b) {
        return a.x * b.x + a.y * b.y + a.z * b.z + a.w * b.w;
    }

    /**
     * Convert from radians to degrees of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 degrees(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = 180 * dx / Math.PI;
        dy = 180 * dy / Math.PI;

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Convert from radians to degrees of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 degrees(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = 180 * dx / Math.PI;
        dy = 180 * dy / Math.PI;
        dz = 180 * dz / Math.PI;

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Convert from radians to degrees of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 degrees(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = 180 * dx / Math.PI;
        dy = 180 * dy / Math.PI;
        dz = 180 * dz / Math.PI;
        dw = 180 * dw / Math.PI;

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    public static float erf(float data) {
        double dx = data;
        double t = 1.0 / (1.0 + 0.5 * Math.abs(dx));

        // use Horner's method
        double ans = 1 - t * Math.exp(-dx * dx - 1.26551223
                + t * (1.00002368 + t * (0.37409196
                + t * (0.09678418 + t * (-0.18628806
                + t * (0.27886807 + t * (-1.13520398
                + t * (1.48851587 + t * (-0.82215223
                + t * (0.17087277))))))))));

        if (dx >= 0) {
            return  (float)ans;
        } else {
            return  (float)-ans;
        }
    }

    /**
     * Return the error function of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 erf(Float2 data) {
        float dx, dy;

        dx = erf(data.x);
        dy = erf(data.y);

        return new Float2(dx, dy);
    }

    /**
     * Return the error function of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 erf(Float3 data) {
        float dx, dy, dz;

        dx = erf(data.x);
        dy = erf(data.y);
        dz = erf(data.z);

        return new Float3(dx, dy, dz);
    }

    /**
     * Return the error function of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 erf(Float4 data) {
        float dx, dy, dz, dw;

        dx = erf(data.x);
        dy = erf(data.y);
        dz = erf(data.z);
        dw = erf(data.w);

        return new Float4(dx, dy, dz, dw);
    }

    /**
     * Return the complementary error function of Float.
     *
     * @param data
     * @return
     */
    public static float erfc(float data) {
        float dx;

        dx = 1 - erf(data);

        return dx;
    }

    /**
     * Return the complementary error function of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 erfc(Float2 data) {
        float dx, dy;

        dx = 1 - erf(data.x);
        dy = 1 - erf(data.x);

        return new Float2(dx, dy);
    }

    /**
     * Return the complementary error function of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 erfc(Float3 data) {
        float dx, dy, dz;

        dx = 1 - erf(data).x;
        dy = 1 - erf(data).y;
        dz = 1 - erf(data).z;

        return new Float3(dx, dy, dz);
    }

    /**
     * Return the complementary error function of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 erfc(Float4 data) {
        float dx, dy, dz, dw;

        dx = 1 - erf(data).x;
        dy = 1 - erf(data).y;
        dz = 1 - erf(data).z;
        dw = 1 - erf(data).w;

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }


    /**
     * Returns Euler's number e raised to the power of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 exp(Float2 data) {
        double dx, dy;

        dx = Math.exp(data.x);
        dy = Math.exp(data.y);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Returns Euler's number e raised to the power of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 exp(Float3 data) {
        double dx, dy, dz;

        dx = Math.exp(data.x);
        dy = Math.exp(data.y);
        dz = Math.exp(data.z);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Returns Euler's number e raised to the power of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 exp(Float4 data) {
        double dx, dy, dz, dw;

        dx = Math.exp(data.x);
        dy = Math.exp(data.y);
        dz = Math.exp(data.z);
        dw = Math.exp(data.w);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Returns 2 raised to the power of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 exp2(Float2 data) {
        double dx, dy;

        dx = Math.pow(2, data.x);
        dy = Math.pow(2, data.y);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Returns 2 raised to the power of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 exp2(Float3 data) {
        double dx, dy, dz;

        dx = Math.pow(2, data.x);
        dy = Math.pow(2, data.y);
        dz = Math.pow(2, data.z);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Returns 2 raised to the power of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 exp2(Float4 data) {
        double dx, dy, dz, dw;

        dx = Math.pow(2, data.x);
        dy = Math.pow(2, data.y);
        dz = Math.pow(2, data.z);
        dw = Math.pow(2, data.w);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Calculates Float2 raised to the power of "exponent".
     *
     * @param data
     * @param exponent
     * @return
     */
    public static Float2 pow(Float2 data, float exponent) {
        double dx, dy;

        dx = Math.pow(data.x, exponent);
        dy = Math.pow(data.y, exponent);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Calculates Float3 raised to the power of "exponent".
     *
     * @param data
     * @param exponent
     * @return
     */
    public static Float3 pow(Float3 data, float exponent) {
        double dx, dy, dz;

        dx = Math.pow(data.x, exponent);
        dy = Math.pow(data.y, exponent);
        dz = Math.pow(data.z, exponent);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Calculates Float4 raised to the power of "exponent".
     *
     * @param data
     * @param exponent
     * @return
     */
    public static Float4 pow(Float4 data, float exponent) {
        double dx, dy, dz, dw;

        dx = Math.pow(data.x, exponent);
        dy = Math.pow(data.y, exponent);
        dz = Math.pow(data.z, exponent);
        dw = Math.pow(data.w, exponent);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return ten raised to the power of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 exp10(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.pow(10, dx);
        dy = Math.pow(10, dy);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return ten raised to the power of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 exp10(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.pow(10, dx);
        dy = Math.pow(10, dy);
        dz = Math.pow(10, dz);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return ten raised to the power of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 exp10(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.pow(10, dx);
        dy = Math.pow(10, dy);
        dz = Math.pow(10, dz);
        dw = Math.pow(10, dw);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return e raised to the power of Float2 and then minus one.
     *
     * @param data
     * @return
     */
    public static Float2 expm1(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.expm1(dx);
        dy = Math.expm1(dy);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return e raised to the power of Float3 and then minus one.
     *
     * @param data
     * @return
     */
    public static Float3 expm1(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.expm1(dx);
        dy = Math.expm1(dy);
        dz = Math.expm1(dz);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return e raised to the power of Float4 and then minus one.
     *
     * @param data
     * @return
     */
    public static Float4 expm1(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.expm1(dx);
        dy = Math.expm1(dy);
        dz = Math.expm1(dz);
        dw = Math.expm1(dw);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the fast distance value of Float.
     * If the member of a is smaller than the member of b, return a negative value.
     *
     * @param a
     * @param b
     * @return
     */
    public static float fast_distance(float a, float b) {
        float mF = a-b;

        return mF;
    }

    public static float fast_distance(Float2 a, Float2 b) {
        double dx;
        Float2 mF = Float2.sub(a, b);

        dx = Math.sqrt((double)mF.x * (double)mF.x + (double)mF.y * (double)mF.y);

        return (float)dx;
    }

    /**
     * Return the fast distance value of Float3.
     *
     * @param a
     * @param b
     * @return
     */
    public static float fast_distance(Float3 a, Float3 b) {
        double dx;
        Float3 mF = Float3.sub(a, b);

        dx = Math.sqrt((double)mF.x * (double)mF.x + (double)mF.y * (double)mF.y
                + (double)mF.z * (double)mF.z);

        return (float)dx;
    }

    /**
     * Return the fast distance value of Float4.
     *
     * @param a
     * @param b
     * @return
     */
    public static float fast_distance(Float4 a, Float4 b) {
        double dx;
        Float4 mF = Float4.sub(a, b);

        dx = Math.sqrt((double)mF.x * (double)mF.x + (double)mF.y * (double)mF.y
                + (double)mF.z * (double)mF.z + (double)mF.w * (double)mF.w);

        return (float)dx;
    }

    /**
     * Return the clamp to a specified high-Float and low-Float bound of Float.
     *
     * @param data
     * @param low
     * @param high
     * @return
     */
    public static float clamp(float data, float low, float high) {
        float dx;

        dx = data < low ? low : (data > high ? high : data);

        return (float)dx;
    }

    /**
     * Return the clamp to a specified high-Float and low-Float bound of Float2.
     *
     * @param data
     * @param low
     * @param high
     * @return
     */
    public static Float2 clamp(Float2 data, float low, float high) {
        float dx, dy;

        dx = data.x < low ? low : (data.x > high ? high : data.x);
        dy = data.y < low ? low : (data.y > high ? high : data.y);

        return new Float2(dx, dy);
    }

    /**
     * Return the clamp to a specified high-Float and low-Float bound of Float3.
     *
     * @param data
     * @param low
     * @param high
     * @return
     */
    public static Float3 clamp(Float3 data, float low, float high) {
        float dx, dy, dz;

        dx = data.x < low ? low : (data.x > high ? high : data.x);
        dy = data.y < low ? low : (data.y > high ? high : data.y);
        dz = data.z < low ? low : (data.z > high ? high : data.z);

        return new Float3(dx, dy, dz);
    }

    /**
     * Return the clamp to a specified high-Float and low-Float bound of Float4.
     *
     * @param data
     * @param low
     * @param high
     * @return
     */
    public static Float4 clamp(Float4 data, float low, float high) {
        float dx, dy, dz, dw;

        dx = data.x < low ? low : (data.x > high ? high : data.x);
        dy = data.y < low ? low : (data.y > high ? high : data.y);
        dz = data.z < low ? low : (data.z > high ? high : data.z);
        dw = data.w < low ? low : (data.w > high ? high : data.w);

        return new Float4(dx, dy, dz, dw);
    }

    /**
     * Return the clamp to a specified high-Float2 and low-Float2 bound of Float2.
     *
     * @param data
     * @param low
     * @param high
     * @return
     */
    public static Float2 clamp(Float2 data, Float2 low, Float2 high) {
        float dx, dy;

        dx = data.x < low.x ? low.x : (data.x > high.x ? high.x : data.x);
        dy = data.y < low.y ? low.y : (data.y > high.y ? high.y : data.y);

        return new Float2(dx, dy);
    }

    /**
     * Return the clamp to a specified high-Float3 and low-Float3 bound of Float3.
     *
     * @param data
     * @param low
     * @param high
     * @return
     */
    public static Float3 clamp(Float3 data, Float3 low, Float3 high) {
        float dx, dy, dz;

        dx = data.x < low.x ? low.x : (data.x > high.x ? high.x : data.x);
        dy = data.y < low.y ? low.y : (data.y > high.y ? high.y : data.y);
        dz = data.z < low.z ? low.z : (data.z > high.z ? high.z : data.z);

        return new Float3(dx, dy, dz);
    }

    /**
     * Return the clamp to a specified high-Float4 and low-Float4 bound of Float4.
     *
     * @param data
     * @param low
     * @param high
     * @return
     */
    public static Float4 clamp(Float4 data, Float4 low, Float4 high) {
        float dx, dy, dz, dw;

        dx = data.x < low.x ? low.x : (data.x > high.x ? high.x : data.x);
        dy = data.y < low.y ? low.y : (data.y > high.y ? high.y : data.y);
        dz = data.z < low.z ? low.z : (data.z > high.z ? high.z : data.z);
        dw = data.w < low.w ? low.w : (data.w > high.w ? high.w : data.w);

        return new Float4(dx, dy, dz, dw);
    }

    /**
     * Compute the approximate length of the Float.
     *
     * @param data
     * @return
     */
    public static float fast_length(float data) {
        return data;
    }

    /**
     * Compute the approximate length of the Float2.
     *
     * @param data
     * @return
     */
    public static float fast_length(Float2 data) {
        double dr;

        dr = data.x * data.x + data.y * data.y;
        dr = Math.sqrt(dr);

        return (float)dr;
    }

    /**
     * Compute the approximate length of the Float3.
     *
     * @param data
     * @return
     */
    public static float fast_length(Float3 data) {
        double dr;

        dr = data.x * data.x + data.y * data.y + data.z * data.z;
        dr = Math.sqrt(dr);

        return (float)dr;
    }

    /**
     * Compute the approximate length of the Float4.
     *
     * @param data
     * @return
     */
    public static float fast_length(Float4 data) {
        double dr;

        dr = data.x * data.x + data.y * data.y +
                data.z * data.z + data.w + data.w;
        dr = Math.sqrt(dr);

        return (float)dr;
    }

    /**
     * Approximately normalize the Float.
     *
     * @param data
     * @return
     */
    public static float fast_normalize(float data) {
        return 1.0f;
    }

    /**
     * Approximately normalize the Float2.
     *
     * @param data
     * @return
     */
    public static Float2 fast_normalize(Float2 data) {
        double dx, dy, dr;

        dx = data.x;
        dy = data.y;
        dr = 1 / Math.sqrt(data.x * data.x + data.y * data.y);
        dx *= dr;
        dy *= dr;

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Approximately normalize the Float3.
     *
     * @param data
     * @return
     */
    public static Float3 fast_normalize(Float3 data) {
        double dx, dy, dz, dr;

        dx = data.x;
        dy = data.y;
        dz = data.z;
        dr = 1 / Math.sqrt(data.x * data.x + data.y * data.y +
                data.z * data.z);
        dx *= dr;
        dy *= dr;
        dz *= dr;

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Approximately normalize the Float4.
     *
     * @param data
     * @return
     */
    public static Float4 fast_normalize(Float4 data) {
        double dx, dy, dz, dw, dr;

        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;
        dr = 1 / Math.sqrt(data.x * data.x + data.y * data.y +
                data.z * data.z + data.w * data.w);
        dx *= dr;
        dy *= dr;
        dz *= dr;
        dw *= dr;

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the absolute value of Float.
     *
     * @param data
     * @return
     */
    public static float fabs(float data) {
        float dx;

        dx = Math.abs(data);

        return (float)dx;
    }

    /**
     * Return the absolute value of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 fabs(Float2 data) {
        float dx, dy;

        dx = Math.abs(data.x);
        dy = Math.abs(data.y);

        return new Float2(dx, dy);
    }

    /**
     * Return the absolute value of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 fabs(Float3 data) {
        float dx, dy, dz;

        dx = Math.abs(data.x);
        dy = Math.abs(data.y);
        dz = Math.abs(data.z);

        return new Float3(dx, dy, dz);
    }

    /**
     * Return the absolute value of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 fabs(Float4 data) {
        float dx, dy, dz, dw;

        dx = Math.abs(data.x);
        dy = Math.abs(data.y);
        dz = Math.abs(data.z);
        dw = Math.abs(data.w);

        return new Float4(dx, dy, dz, dw);
    }

    /**
     * Return the positive difference between two values of Float.
     *
     * @param a
     * @param b
     * @return
     */
    public static float fdim(float a, float b) {
        float c = a - b;

        c = c > 0 ? c : 0;

        return c;
    }

    /**
     * Return the positive difference between two values of Float2.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float2 fdim(Float2 a, Float2 b) {
        Float2 c = Float2.sub(a, b);

        c.x = c.x > 0 ? c.x : 0;
        c.y = c.y > 0 ? c.y : 0;

        return c;
    }

    /**
     * Return the positive difference between two values of Float3.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float3 fdim(Float3 a, Float3 b) {
        Float3 c = Float3.sub(a, b);

        c.x = c.x > 0 ? c.x : 0;
        c.y = c.y > 0 ? c.y : 0;
        c.z = c.z > 0 ? c.z : 0;

        return c;
    }

    /**
     * Return the positive difference between two values of Float4.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float4 fdim(Float4 a, Float4 b) {
        Float4 c = Float4.sub(a, b);

        c.x = c.x > 0 ? c.x : 0;
        c.y = c.y > 0 ? c.y : 0;
        c.z = c.z > 0 ? c.z : 0;
        c.w = c.w > 0 ? c.w : 0;

        return c;
    }

    /**
     * Return the smallest integer not greater than a value of Float.
     *
     * @param data
     * @return
     */
    public static float floor(float data) {
        double dx;

        dx = Math.floor(data);

        return (float)dx;
    }

    /**
     * Return the smallest integer not greater than a value of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 floor(Float2 data) {
        double dx, dy;

        dx = Math.floor(data.x);
        dy = Math.floor(data.y);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the smallest integer not greater than a value of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 floor(Float3 data) {
        double dx, dy, dz;

        dx = Math.floor(data.x);
        dy = Math.floor(data.y);
        dz = Math.floor(data.z);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the smallest integer not greater than a value of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 floor(Float4 data) {
        double dx, dy, dz, dw;

        dx = Math.floor(data.x);
        dy = Math.floor(data.y);
        dz = Math.floor(data.z);
        dw = Math.floor(data.w);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return a * b + c of Float.
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static float fma(float a, float b, float c) {
        double dx;

        dx = a * b + c;

        return (float)dx;
    }

    /**
     * Return a * b + c of Float2.
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static Float2 fma(Float2 a, Float2 b, Float2 c) {
        double dx, dy;

        dx = a.x * b.x + c.x;
        dy = a.y * b.y + c.y;

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return a * b + c of Float3.
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static Float3 fma(Float3 a, Float3 b, Float3 c) {
        double dx, dy, dz;

        dx = a.x * b.x + c.x;
        dy = a.y * b.y + c.y;
        dz = a.z * b.z + c.z;

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return a * b + c of Float4.
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static Float4 fma(Float4 a, Float4 b, Float4 c) {
        double dx, dy, dz, dw;

        dx = a.x * b.x + c.x;
        dy = a.y * b.y + c.y;
        dz = a.z * b.z + c.z;
        dw = a.w * b.w + c.w;

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the bigger one between params.
     *
     * @param v1
     * @param v2
     * @return
     */
    public static Float2 fmax(Float2 v1, Float2 v2) {
        float fx, fy;
        fx = Math.max(v1.x, v2.x);
        fy = Math.max(v1.y, v2.y);

        return new Float2(fx, fy);
    }

    /**
     * Return the bigger one between params.
     *
     * @param v1
     * @param v2
     * @return
     */
    public static Float3 fmax(Float3 v1, Float3 v2) {
        float fx, fy, fz;
        fx = Math.max(v1.x, v2.x);
        fy = Math.max(v1.y, v2.y);
        fz = Math.max(v1.z, v2.z);

        return new Float3(fx, fy, fz);
    }

    /**
     * Return the bigger one between params.
     *
     * @param v1
     * @param v2
     * @return
     */
    public static Float4 fmax(Float4 v1, Float4 v2) {
        float fx, fy, fz, fw;
        fx = Math.max(v1.x, v2.x);
        fy = Math.max(v1.y, v2.y);
        fz = Math.max(v1.z, v2.z);
        fw = Math.max(v1.w, v2.w);

        return new Float4(fx, fy, fz, fw);
    }

    /**
     * Compare v2 to each member of v1,
     * and return a new object contained bigger values.
     *
     * @param v1
     * @param v2
     * @return
     */
    public static Float2 fmax(Float2 v1, float v2) {
        float fx, fy;
        fx = Math.max(v1.x, v2);
        fy = Math.max(v1.y, v2);

        return new Float2(fx, fy);
    }

    /**
     * Compare v2 to each member of v1,
     * and return a new object contained bigger values.
     *
     * @param v1
     * @param v2
     * @return
     */
    public static Float3 fmax(Float3 v1, float v2) {
        float fx, fy, fz;
        fx = Math.max(v1.x, v2);
        fy = Math.max(v1.y, v2);
        fz = Math.max(v1.z, v2);

        return new Float3(fx, fy, fz);
    }

    /**
     * Compare v2 to each member of v1,
     * and return a new object contained bigger values.
     *
     * @param v1
     * @param v2
     * @return
     */
    public static Float4 fmax(Float4 v1, float v2) {
        float fx, fy, fz, fw;
        fx = Math.max(v1.x, v2);
        fy = Math.max(v1.y, v2);
        fz = Math.max(v1.z, v2);
        fw = Math.max(v1.w, v2);

        return new Float4(fx, fy, fz, fw);
    }

    /**
     * Return the smaller one between params.
     *
     * @param v1
     * @param v2
     * @return
     */
    public static Float2 fmin(Float2 v1, Float2 v2) {
        float fx, fy;
        fx = Math.min(v1.x, v2.x);
        fy = Math.min(v1.y, v2.y);

        return new Float2(fx, fy);
    }

    /**
     * Return the smaller one between params.
     *
     * @param v1
     * @param v2
     * @return
     */
    public static Float3 fmin(Float3 v1, Float3 v2) {
        float fx, fy, fz;
        fx = Math.min(v1.x, v2.x);
        fy = Math.min(v1.y, v2.y);
        fz = Math.min(v1.z, v2.z);

        return new Float3(fx, fy, fz);
    }

    /**
     * Return the smaller one between params.
     *
     * @param v1
     * @param v2
     * @return
     */
    public static Float4 fmin(Float4 v1, Float4 v2) {
        float fx, fy, fz, fw;
        fx = Math.min(v1.x, v2.x);
        fy = Math.min(v1.y, v2.y);
        fz = Math.min(v1.z, v2.z);
        fw = Math.min(v1.w, v2.w);

        return new Float4(fx, fy, fz, fw);
    }

    /**
     * Compare v2 to v1 with each member,
     * and return a new object contained smaller values.
     *
     * @param v1
     * @param v2
     * @return
     */
    public static Float2 fmin(Float2 v1, float v2) {
        float fx, fy;
        fx = Math.min(v1.x, v2);
        fy = Math.min(v1.y, v2);

        return new Float2(fx, fy);
    }

    /**
     * Compare v2 to v1 with each member,
     * and return a new object contained smaller values.
     *
     * @param v1
     * @param v2
     * @return
     */
    public static Float3 fmin(Float3 v1, float v2) {
        float fx, fy, fz;
        fx = Math.min(v1.x, v2);
        fy = Math.min(v1.y, v2);
        fz = Math.min(v1.z, v2);

        return new Float3(fx, fy, fz);
    }

    /**
     * Compare v2 to v1 with each member,
     * and return a new object contained smaller values.
     *
     * @param v1
     * @param v2
     * @return
     */
    public static Float4 fmin(Float4 v1, float v2) {
        float fx, fy, fz, fw;
        fx = Math.min(v1.x, v2);
        fy = Math.min(v1.y, v2);
        fz = Math.min(v1.z, v2);
        fw = Math.min(v1.w, v2);

        return new Float4(fx, fy, fz, fw);
    }


    /**
     * Return the remainder from v1 / v2.
     *
     * @param v1
     * @param v2
     * @return
     */
    public static Float2 fmod(Float2 v1, Float2 v2) {
        float fx, fy;
        fx = v1.x % v2.x;
        fy = v1.y % v2.y;

        return new Float2(fx, fy);
    }

    /**
     * Return the remainder from v1 / v2.
     *
     * @param v1
     * @param v2
     * @return
     */
    public static Float3 fmod(Float3 v1, Float3 v2) {
        float fx, fy, fz;
        fx = v1.x % v2.x;
        fy = v1.y % v2.y;
        fz = v1.z % v2.z;

        return new Float3(fx, fy, fz);
    }

    /**
     * Return the remainder from v1 / v2.
     *
     * @param v1
     * @param v2
     * @return
     */
    public static Float4 fmod(Float4 v1, Float4 v2) {
        float fx, fy, fz, fw;
        fx = v1.x % v2.x;
        fy = v1.y % v2.y;
        fz = v1.z % v2.z;
        fw = v1.w % v2.w;

        return new Float4(fx, fy, fz, fw);
    }

    /**
     * Return the fractional part of Float,
     * a[0] will be set to the floor of the data.
     *
     * @param data
     * @param a
     * @return
     */
    public static float fract(float data, int[] a) {
        double dx;
        a[0] = (int)(0);

        dx = Math.floor(data);
        a[0] = (int)dx;
        dx = Math.min(data - dx, 0x1.fffffep-1f);

        return (float)dx;
    }

    /**
     * Return the fractional part of Float2,
     * a[0] will be set to the floor of the data.
     *
     * @param data
     * @param a
     * @return
     */
    public static Float2 fract(Float2 data, Int2[] a) {
        double dx, dy;
        a[0] = new Int2(0, 0);

        dx = Math.floor(data.x);
        dy = Math.floor(data.y);
        a[0].x = (int)dx;
        a[0].y = (int)dy;
        dx = Math.min(data.x - dx, 0x1.fffffep-1f);
        dy = Math.min(data.y - dy, 0x1.fffffep-1f);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the fractional part of Float3,
     * a[0] will be set to the floor of the data.
     *
     * @param data
     * @param a
     * @return
     */
    public static Float3 fract(Float3 data, Int3[] a) {
        double dx, dy, dz;
        a[0] = new Int3(0, 0, 0);

        dx = Math.floor(data.x);
        dy = Math.floor(data.y);
        dz = Math.floor(data.z);
        a[0].x = (int)dx;
        a[0].y = (int)dy;
        a[0].z = (int)dz;
        dx = Math.min(data.x - dx, 0x1.fffffep-1f);
        dy = Math.min(data.y - dy, 0x1.fffffep-1f);
        dz = Math.min(data.z - dz, 0x1.fffffep-1f);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the fractional part of Float4,
     * a[0] will be set to the floor of the data.
     *
     * @param data
     * @param a
     * @return
     */
    public static Float4 fract(Float4 data, Int4[] a) {
        double dx, dy, dz, dw;
        a[0] = new Int4(0, 0, 0, 0);

        dx = Math.floor(data.x);
        dy = Math.floor(data.y);
        dz = Math.floor(data.z);
        dw = Math.floor(data.w);
        a[0].x = (int)dx;
        a[0].y = (int)dy;
        a[0].z = (int)dz;
        a[0].w = (int)dw;
        dx = Math.min(data.x - dx, 0x1.fffffep-1f);
        dy = Math.min(data.y - dy, 0x1.fffffep-1f);
        dz = Math.min(data.z - dz, 0x1.fffffep-1f);
        dw = Math.min(data.w - dw, 0x1.fffffep-1f);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the mantissa of float and place the exponent into a[0].
     *
     * @param data
     * @param a
     * @return
     */
    public static float frexp(float data, int[] a) {
        double dx;
        dx = data;
        a[0] = (int)(0);

        while (Math.abs(dx) >= 1) {
            dx = dx / 2;
            a[0] = a[0] + 1;
        }

        return (float)dx;
    }

    /**
     * Return the mantissa of Float2 and place the exponent into a[0].
     *
     * @param data
     * @param a
     * @return
     */
    public static Float2 frexp(Float2 data, Int2[] a) {
        double dx, dy;
        dx = data.x;
        dy = data.y;
        a[0] = new Int2(0, 0);

        while (Math.abs(dx) >= 1) {
            dx = dx / 2;
            a[0].x = a[0].x + 1;
        }
        while (Math.abs(dy) >= 1) {
            dy = dy / 2;
            a[0].y = a[0].y + 1;
        }

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the mantissa of Float3 and place the exponent into a[0].
     *
     * @param data
     * @param a
     * @return
     */
    public static Float3 frexp(Float3 data, Int3[] a) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        a[0] = new Int3(0, 0, 0);

        while (Math.abs(dx) >= 1) {
            dx = dx / 2;
            a[0].x = a[0].x + 1;
        }
        while (Math.abs(dy) >= 1) {
            dy = dy / 2;
            a[0].y = a[0].y + 1;
        }
        while (Math.abs(dz) >= 1) {
            dz = dz / 2;
            a[0].z = a[0].z + 1;
        }

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the mantissa of Float4 and place the exponent into a[0].
     *
     * @param data
     * @param a
     * @return
     */
    public static Float4 frexp(Float4 data, Int4[] a) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;
        a[0] = new Int4(0, 0, 0, 0);

        while (Math.abs(dx) >= 1) {
            dx = dx / 2;
            a[0].x = a[0].x + 1;
        }
        while (Math.abs(dy) >= 1) {
            dy = dy / 2;
            a[0].y = a[0].y + 1;
        }
        while (Math.abs(dz) >= 1) {
            dz = dz / 2;
            a[0].z = a[0].z + 1;
        }
        while (Math.abs(dw) >= 1) {
            dw = dw / 2;
            a[0].w = a[0].w + 1;
        }

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the reciprocal of the square root of Float.
     *
     * @param data
     * @return
     */
    public static float half_rsqrt(float data) {
        double dx;
        dx = data;
        dx = 1.0f / Math.sqrt(dx);

        return (float)dx;
    }

    /**
     * Return the reciprocal of the square root of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 half_rsqrt(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = 1.0f / Math.sqrt(dx);
        dy = 1.0f / Math.sqrt(dy);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the reciprocal of the square root of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 half_rsqrt(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = 1.0f / Math.sqrt(dx);
        dy = 1.0f / Math.sqrt(dy);
        dz = 1.0f / Math.sqrt(dz);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the reciprocal of the square root of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 half_rsqrt(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = 1.0f / Math.sqrt(dx);
        dy = 1.0f / Math.sqrt(dy);
        dz = 1.0f / Math.sqrt(dz);
        dw = 1.0f / Math.sqrt(dw);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the square root of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 half_sqrt(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.sqrt(dx);
        dy = Math.sqrt(dy);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the square root of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 half_sqrt(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.sqrt(dx);
        dy = Math.sqrt(dy);
        dz = Math.sqrt(dz);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the square root of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 half_sqrt(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.sqrt(dx);
        dy = Math.sqrt(dy);
        dz = Math.sqrt(dz);
        dw = Math.sqrt(dw);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the reciprocal value of Float.
     *
     * @param data
     * @return
     */
    public static float half_recip(float data) {
        double dx;
        dx = data;

        dx = 1.0f / dx;

        return (float)dx;
    }

    /**
     * Return the reciprocal value of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 half_recip(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = 1.0f / dx;
        dy = 1.0f / dy;

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the reciprocal value of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 half_recip(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = 1.0f / dx;
        dy = 1.0f / dy;
        dz = 1.0f / dz;

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the reciprocal value of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 half_recip(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = 1.0f / dx;
        dy = 1.0f / dy;
        dz = 1.0f / dz;
        dw = 1.0f / dw;

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the hypotenuse value of Float.
     *
     * @param a
     * @param b
     * @return
     */
    public static float hypot(float a, float b) {
        double dx;

        dx = Math.hypot(a, b);

        return (float)dx;
    }

    /**
     * Return the hypotenuse value of Float2.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float2 hypot(Float2 a, Float2 b) {
        double dx, dy;

        dx = Math.hypot(a.x, b.x);
        dy = Math.hypot(a.y, b.y);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the hypotenuse value of Float3.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float3 hypot(Float3 a, Float3 b) {
        double dx, dy, dz;

        dx = Math.hypot(a.x, b.x);
        dy = Math.hypot(a.y, b.y);
        dz = Math.hypot(a.z, b.z);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the hypotenuse value of Float4.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float4 hypot(Float4 a, Float4 b) {
        double dx, dy, dz, dw;

        dx = Math.hypot(a.x, b.x);
        dy = Math.hypot(a.y, b.y);
        dz = Math.hypot(a.z, b.z);
        dw = Math.hypot(a.w, b.w);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the integer exponent of a value.
     *
     * @param data
     * @return
     */
    public static int ilogb(float data) {
        float fret = logb(data);

        return (int)(fret);
    }

    /**
     * Return the integer exponent of a value.
     *
     * @param data
     * @return
     */
    public static Int2 ilogb(Float2 data) {
        Float2 fret = logb(data);

        return new Int2((int)fret.x, (int)fret.y);
    }

    /**
     * Return the integer exponent of a value.
     *
     * @param data
     * @return
     */
    public static Int3 ilogb(Float3 data) {
        Float3 fret = logb(data);

        return new Int3((int)fret.x, (int)fret.y, (int)fret.z);
    }

    /**
     * Return the integer exponent of a value.
     *
     * @param data
     * @return
     */
    public static Int4 ilogb(Float4 data) {
        Float4 fret = logb(data);

        return new Int4((int)fret.x, (int)fret.y, (int)fret.z, (int)fret.w);
    }

    /**
     * Return the value of "v1 * 2^v2".
     *
     * @param v1 1,2,3,4 components.
     * @param v2 single component or matching with v1.
     * @return
     */
    public static float ldexp(float v1, int v2) {
        return (float)(v1 * Math.pow(2, v2));
    }

    /**
     * Return the value of "v1 * 2^v2".
     *
     * @param v1 1,2,3,4 components.
     * @param v2 single component or matching with v1.
     * @return
     */
    public static Float2 ldexp(Float2 v1, int v2) {
        double dx, dy;
        dx = v1.x * Math.pow(2, v2);
        dy = v1.y * Math.pow(2, v2);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the value of "v1 * 2^v2".
     *
     * @param v1 1,2,3,4 components.
     * @param v2 single component or matching with v1.
     * @return
     */
    public static Float3 ldexp(Float3 v1, int v2) {
        double dx, dy, dz;
        dx = v1.x * Math.pow(2, v2);
        dy = v1.y * Math.pow(2, v2);
        dz = v1.z * Math.pow(2, v2);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the value of "v1 * 2^v2".
     *
     * @param v1 1,2,3,4 components.
     * @param v2 single component or matching with v1.
     * @return
     */
    public static Float4 ldexp(Float4 v1, int v2) {
        double dx, dy, dz, dw;
        dx = v1.x * Math.pow(2, v2);
        dy = v1.y * Math.pow(2, v2);
        dz = v1.z * Math.pow(2, v2);
        dw = v1.w * Math.pow(2, v2);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the value of "v1 * 2^v2".
     *
     * @param v1 1,2,3,4 components.
     * @param v2 single component or matching with v1.
     * @return
     */
    public static Float2 ldexp(Float2 v1, Int2 v2) {
        double dx, dy;
        dx = v1.x * Math.pow(2, v2.x);
        dy = v1.y * Math.pow(2, v2.y);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the value of "v1 * 2^v2".
     *
     * @param v1 1,2,3,4 components.
     * @param v2 single component or matching with v1.
     * @return
     */
    public static Float3 ldexp(Float3 v1, Int3 v2) {
        double dx, dy, dz;
        dx = v1.x * Math.pow(2, v2.x);
        dy = v1.y * Math.pow(2, v2.y);
        dz = v1.z * Math.pow(2, v2.z);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the value of "v1 * 2^v2".
     *
     * @param v1 1,2,3,4 components.
     * @param v2 single component or matching with v1.
     * @return
     */
    public static Float4 ldexp(Float4 v1, Int4 v2) {
        double dx, dy, dz, dw;
        dx = v1.x * Math.pow(2, v2.x);
        dy = v1.y * Math.pow(2, v2.y);
        dz = v1.z * Math.pow(2, v2.z);
        dw = v1.w * Math.pow(2, v2.w);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Compute the length of a vector.
     *
     * @param data
     * @return
     */
    public static float length(float data) {
        return Math.abs(data);
    }

    /**
     * Compute the length of a vector.
     *
     * @param data
     * @return
     */
    public static float length(Float2 data) {
        double dx = data.x * data.x + data.y * data.y;
        dx = Math.sqrt(dx);

        return (float)dx;
    }

    /**
     * Compute the length of a vector.
     *
     * @param data
     * @return
     */
    public static float length(Float3 data) {
        double dx = data.x * data.x +
                data.y * data.y +
                data.z * data.z;
        dx = Math.sqrt(dx);

        return (float)dx;
    }

    /**
     * Compute the length of a vector.
     *
     * @param data
     * @return
     */
    public static float length(Float4 data) {
        double dx = data.x * data.x +
                data.y * data.y +
                data.z * data.z +
                data.w * data.w;
        dx = Math.sqrt(dx);

        return (float)dx;
    }

    /**
     * Return the natural logarithm of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 log(Float2 data) {
        double dx, dy;

        dx = Math.log(data.x);
        dy = Math.log(data.y);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the natural logarithm of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 log(Float3 data) {
        double dx, dy, dz;

        dx = Math.log(data.x);
        dy = Math.log(data.y);
        dz = Math.log(data.z);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the natural logarithm of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 log(Float4 data) {
        double dx, dy, dz, dw;

        dx = Math.log(data.x);
        dy = Math.log(data.y);
        dz = Math.log(data.z);
        dw = Math.log(data.w);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the base 10 logarithm of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 log10(Float2 data) {
        double dx, dy;

        dx = Math.log10(data.x);
        dy = Math.log10(data.y);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the base 10 logarithm of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 log10(Float3 data) {
        double dx, dy, dz;

        dx = Math.log10(data.x);
        dy = Math.log10(data.y);
        dz = Math.log10(data.z);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the base 10 logarithm of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 log10(Float4 data) {
        double dx, dy, dz, dw;

        dx = Math.log10(data.x);
        dy = Math.log10(data.y);
        dz = Math.log10(data.z);
        dw = Math.log10(data.w);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * This is a private function and just used in this file.
     * Function just used in the private function _lgamma.
     * It is the basic algorithm for the function log gamma.
     *
     * @param x
     * @return
     */
    private static double sin_pi(double x) {
        final double zero = 0.00000000000000000000e+00,
                two52 = 4.50359962737049600000e+15, /* 0x43300000, 0x00000000 */
                one = 1.00000000000000000000e+00, /* 0x3FF00000, 0x00000000 */
                pi = 3.14159265358979311600e+00; /* 0x400921FB, 0x54442D18 */

        double y, z;
        int n = 0, ix;
        long tmpl = java.lang.Double.doubleToLongBits(x);

        ix = (int)(tmpl >> 32);
        ix &= 0x7fffffff;

        if (ix < 0x3fd00000) {
            return Math.sin(pi * x);
        }
        y = -x; /* x is assume negative */

        /*
         * argument reduction, make sure inexact flag not raised if input is an
         * integer
         */
        z = Math.floor(y);

        if (z != y) { /* inexact anyway */
            y *= 0.5;
            y = 2.0 * (y - Math.floor(y)); /* y = |x| mod 2.0 */
            n = (int)(y * 4.0);
        } else {
            if (ix >= 0x43400000) {
                y = zero;
                n = 0; /* y must be even */
            } else {
                if (ix < 0x43300000)
                    z = y + two52; /* exact */
                tmpl = java.lang.Double.doubleToLongBits(z);
                n = (int)(tmpl << 32) >> 32;
                n &= 1;
                y = n;
                n <<= 2;
            }
        }
        switch (n) {
        case 0:
            y = Math.sin(pi * y);
            break;
        case 1:
        case 2:
            y = Math.cos(pi * (0.5 - y));
            break;
        case 3:
        case 4:
            y = Math.sin(pi * (one - y));
            break;
        case 5:
        case 6:
            y = -Math.cos(pi * (y - 1.5));
            break;
        default:
            y = Math.sin(pi * (y - 2.0));
            break;
        }
        return -y;
    }

    /**
     * This is a private function and just use in this file.
     * The function used in the function of lgamma.
     * This is the main algorithm of log gamma.
     *
     * @param x
     * @param signgamp
     * @return
     */
    private static double _lgamma(double x, int[] signgamp)
    {
        final double zero = 0.00000000000000000000e+00, /* 0x00000000, 0x00000000 */
                half = 5.00000000000000000000e-01, /* 0x3FE00000, 0x00000000 */
                one = 1.00000000000000000000e+00, /* 0x3FF00000, 0x00000000 */
                pi = 3.14159265358979311600e+00, /* 0x400921FB, 0x54442D18 */
                a0 = 7.72156649015328655494e-02, /* 0x3FB3C467,0xE37DB0C8 */
                a1 = 3.22467033424113591611e-01, /* 0x3FD4A34C, 0xC4A60FAD */
                a2 = 6.73523010531292681824e-02, /* 0x3FB13E00, 0x1A5562A7 */
                a3 = 2.05808084325167332806e-02, /* 0x3F951322, 0xAC92547B */
                a4 = 7.38555086081402883957e-03, /* 0x3F7E404F, 0xB68FEFE8 */
                a5 = 2.89051383673415629091e-03, /* 0x3F67ADD8, 0xCCB7926B */
                a6 = 1.19270763183362067845e-03, /* 0x3F538A94, 0x116F3F5D */
                a7 = 5.10069792153511336608e-04, /* 0x3F40B6C6, 0x89B99C00 */
                a8 = 2.20862790713908385557e-04, /* 0x3F2CF2EC, 0xED10E54D */
                a9 = 1.08011567247583939954e-04, /* 0x3F1C5088, 0x987DFB07 */
                a10 = 2.52144565451257326939e-05, /* 0x3EFA7074, 0x428CFA52 */
                a11 = 4.48640949618915160150e-05, /* 0x3F07858E, 0x90A45837 */
                tc = 1.46163214496836224576e+00, /* 0x3FF762D8, 0x6356BE3F */
                tf = -1.21486290535849611461e-01, /* 0xBFBF19B9, 0xBCC38A42 */
                /* tt = -(tail of tf) */
                tt = -3.63867699703950536541e-18, /* 0xBC50C7CA, 0xA48A971F */
                t0 = 4.83836122723810047042e-01, /* 0x3FDEF72B, 0xC8EE38A2 */
                t1 = -1.47587722994593911752e-01, /* 0xBFC2E427, 0x8DC6C509 */
                t2 = 6.46249402391333854778e-02, /* 0x3FB08B42, 0x94D5419B */
                t3 = -3.27885410759859649565e-02, /* 0xBFA0C9A8, 0xDF35B713 */
                t4 = 1.79706750811820387126e-02, /* 0x3F9266E7, 0x970AF9EC */
                t5 = -1.03142241298341437450e-02, /* 0xBF851F9F, 0xBA91EC6A */
                t6 = 6.10053870246291332635e-03, /* 0x3F78FCE0, 0xE370E344 */
                t7 = -3.68452016781138256760e-03, /* 0xBF6E2EFF, 0xB3E914D7 */
                t8 = 2.25964780900612472250e-03, /* 0x3F6282D3, 0x2E15C915 */
                t9 = -1.40346469989232843813e-03, /* 0xBF56FE8E, 0xBF2D1AF1 */
                t10 = 8.81081882437654011382e-04, /* 0x3F4CDF0C, 0xEF61A8E9 */
                t11 = -5.38595305356740546715e-04, /* 0xBF41A610, 0x9C73E0EC */
                t12 = 3.15632070903625950361e-04, /* 0x3F34AF6D, 0x6C0EBBF7 */
                t13 = -3.12754168375120860518e-04, /* 0xBF347F24, 0xECC38C38 */
                t14 = 3.35529192635519073543e-04, /* 0x3F35FD3E, 0xE8C2D3F4 */
                u0 = -7.72156649015328655494e-02, /* 0xBFB3C467, 0xE37DB0C8 */
                u1 = 6.32827064025093366517e-01, /* 0x3FE4401E, 0x8B005DFF */
                u2 = 1.45492250137234768737e+00, /* 0x3FF7475C, 0xD119BD6F */
                u3 = 9.77717527963372745603e-01, /* 0x3FEF4976, 0x44EA8450 */
                u4 = 2.28963728064692451092e-01, /* 0x3FCD4EAE, 0xF6010924 */
                u5 = 1.33810918536787660377e-02, /* 0x3F8B678B, 0xBF2BAB09 */
                v1 = 2.45597793713041134822e+00, /* 0x4003A5D7, 0xC2BD619C */
                v2 = 2.12848976379893395361e+00, /* 0x40010725, 0xA42B18F5 */
                v3 = 7.69285150456672783825e-01, /* 0x3FE89DFB, 0xE45050AF */
                v4 = 1.04222645593369134254e-01, /* 0x3FBAAE55, 0xD6537C88 */
                v5 = 3.21709242282423911810e-03, /* 0x3F6A5ABB, 0x57D0CF61 */
                s0 = -7.72156649015328655494e-02, /* 0xBFB3C467, 0xE37DB0C8 */
                s1 = 2.14982415960608852501e-01, /* 0x3FCB848B, 0x36E20878 */
                s2 = 3.25778796408930981787e-01, /* 0x3FD4D98F, 0x4F139F59 */
                s3 = 1.46350472652464452805e-01, /* 0x3FC2BB9C, 0xBEE5F2F7 */
                s4 = 2.66422703033638609560e-02, /* 0x3F9B481C, 0x7E939961 */
                s5 = 1.84028451407337715652e-03, /* 0x3F5E26B6, 0x7368F239 */
                s6 = 3.19475326584100867617e-05, /* 0x3F00BFEC, 0xDD17E945 */
                r1 = 1.39200533467621045958e+00, /* 0x3FF645A7, 0x62C4AB74 */
                r2 = 7.21935547567138069525e-01, /* 0x3FE71A18, 0x93D3DCDC */
                r3 = 1.71933865632803078993e-01, /* 0x3FC601ED, 0xCCFBDF27 */
                r4 = 1.86459191715652901344e-02, /* 0x3F9317EA, 0x742ED475 */
                r5 = 7.77942496381893596434e-04, /* 0x3F497DDA, 0xCA41A95B */
                r6 = 7.32668430744625636189e-06, /* 0x3EDEBAF7, 0xA5B38140 */
                w0 = 4.18938533204672725052e-01, /* 0x3FDACFE3, 0x90C97D69 */
                w1 = 8.33333333333329678849e-02, /* 0x3FB55555, 0x5555553B */
                w2 = -2.77777777728775536470e-03, /* 0xBF66C16C, 0x16B02E5C */
                w3 = 7.93650558643019558500e-04, /* 0x3F4A019F, 0x98CF38B6 */
                w4 = -5.95187557450339963135e-04, /* 0xBF4380CB, 0x8C0FE741 */
                w5 = 8.36339918996282139126e-04, /* 0x3F4B67BA, 0x4CDAD5D1 */
                w6 = -1.63092934096575273989e-03; /* 0xBF5AB89D, 0x0B9E43E4 */
        double t, y, z, nadj = 0, p, p1, p2, p3, q, r, w;
        int hx;
        int i, lx, ix;

        long tmpl = java.lang.Double.doubleToLongBits(x);
        hx = (int)(tmpl >> 32);
        lx = (int)((tmpl << 32) >> 32);

        /* purge off +-inf, NaN, +-0, tiny and negative arguments */
        signgamp[0] = 1;
        ix = hx & 0x7fffffff;
        if (ix >= 0x7ff00000) {
            return x * x;
        }
        if ((ix | lx) == 0) {
            return one / zero;
        }
        if (ix < 0x3b900000) { /* |x|<2**-70, return -log(|x|) */
            if (hx < 0) {
                signgamp[0] = -1;
                return -Math.log(-x);
            } else {
                return -Math.log(x);
            }
        }
        if (hx < 0) {
            if (ix >= 0x43300000) { /* |x|>=2**52, must be -integer */
                return one / zero;
            }
            t = sin_pi(x);
            if (t == zero) {
                return one / zero; /* -integer */
            }
            nadj = Math.log(pi / Math.abs(t * x));
            if (t < zero) {
                signgamp[0] = -1;
            }
            x = -x;
        }

        /* purge off 1 and 2 */
        if ((((ix - 0x3ff00000) | lx) == 0) || (((ix - 0x40000000) | lx) == 0)) {
            r = 0;
        } else if (ix < 0x40000000) {
            if (ix <= 0x3feccccc) { /* lgamma(x) = lgamma(x+1)-log(x) */
                r = -Math.log(x);
                if (ix >= 0x3FE76944) {
                    y = one - x;
                    i = 0;
                } else if (ix >= 0x3FCDA661) {
                    y = x - (tc - one);
                    i = 1;
                } else {
                    y = x;
                    i = 2;
                }
            } else {
                r = zero;
                if (ix >= 0x3FFBB4C3) {
                    y = 2.0 - x;
                    i = 0;
                } else if (ix >= 0x3FF3B4C4) {
                    y = x - tc;
                    i = 1;
                } else {
                    y = x - one;
                    i = 2;
                }
            }
            switch (i) {
            case 0:
                z = y * y;
                p1 = a0 + z * (a2 + z * (a4 + z * (a6 + z * (a8 + z * a10))));
                p2 = z * (a1 + z * (a3 + z * (a5 + z * (a7 + z * (a9 + z * a11)))));
                p = y * p1 + p2;
                r += (p - 0.5 * y);
                break;
            case 1:
                z = y * y;
                w = z * y;
                p1 = t0 + w * (t3 + w * (t6 + w * (t9 + w * t12)));
                p2 = t1 + w * (t4 + w * (t7 + w * (t10 + w * t13)));
                p3 = t2 + w * (t5 + w * (t8 + w * (t11 + w * t14)));
                p = z * p1 - (tt - w * (p2 + y * p3));
                r += (tf + p);
                break;
            case 2:
                p1 = y * (u0 + y * (u1 + y * (u2 + y * (u3 + y * (u4 + y * u5)))));
                p2 = one + y * (v1 + y * (v2 + y * (v3 + y * (v4 + y * v5))));
                r += (-0.5 * y + p1 / p2);
            }
        } else if (ix < 0x40200000) { /* x < 8.0 */
            i = (int)x;
            y = x - (double)i;
            p = y * (s0 + y * (s1 + y * (s2 + y * (s3 + y * (s4 + y * (s5 + y * s6))))));
            q = one + y * (r1 + y * (r2 + y * (r3 + y * (r4 + y * (r5 + y * r6)))));
            r = half * y + p / q;
            z = one; /* lgamma(1+s) = log(s) + lgamma(s) */
            switch (i) {
            case 7:
                z *= (y + 6.0); /* FALLTHRU */
            case 6:
                z *= (y + 5.0); /* FALLTHRU */
            case 5:
                z *= (y + 4.0); /* FALLTHRU */
            case 4:
                z *= (y + 3.0); /* FALLTHRU */
            case 3:
                z *= (y + 2.0); /* FALLTHRU */
                r += Math.log(z);
                break;
            }
            /* 8.0 <= x < 2**58 */
        } else if (ix < 0x43900000) {
            t = Math.log(x);
            z = one / x;
            y = z * z;
            w = w0 + z * (w1 + y * (w2 + y * (w3 + y * (w4 + y * (w5 + y * w6)))));
            r = (x - half) * (t - one) + w;
        } else {
            r = x * (Math.log(x) - one);
        }

        if (hx < 0) {
            r = nadj - r;
        }

        return r;
    }

    /**
     * Return the log gamma of Float.
     *
     * @param data
     * @return
     */
    public static float lgamma(float data) {
        double dx;
        int[] sign = new int[1];

        dx = _lgamma(data, sign);

        return (float)dx;
    }

    /**
     * Return the log gamma of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 lgamma(Float2 data) {
        double dx, dy;
        int[] sign = new int[1];

        dx = _lgamma(data.x, sign);
        dy = _lgamma(data.y, sign);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the log gamma of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 lgamma(Float3 data) {
        double dx, dy, dz;
        int[] sign = new int[1];

        dx = _lgamma(data.x, sign);
        dy = _lgamma(data.y, sign);
        dz = _lgamma(data.z, sign);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the log gamma of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 lgamma(Float4 data) {
        double dx, dy, dz, dw;
        int[] sign = new int[1];

        dx = _lgamma(data.x, sign);
        dy = _lgamma(data.y, sign);
        dz = _lgamma(data.z, sign);
        dw = _lgamma(data.w, sign);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the log gamma and sign of Float.
     *
     * @param data
     * @return
     */
    public static float lgamma(float data, int[] signgamp) {
        double dx;
        int[] sign = new int[1];

        dx = _lgamma(data, sign);
        signgamp[0] = sign[0];

        return (float)dx;
    }

    /**
     * Return the base 2 logarithm of Float.
     *
     * @param data
     * @return
     */
    public static float log2(float data) {
        double dx;
        dx = data;

        dx = Math.log10(dx) / Math.log10(2.0f);

        return (float)dx;
    }

    /**
     * Return the base 2 logarithm of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 log2(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.log10(dx) / Math.log10(2.0f);
        dy = Math.log10(dy) / Math.log10(2.0f);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the base 2 logarithm of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 log2(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.log10(dx) / Math.log10(2.0f);
        dy = Math.log10(dy) / Math.log10(2.0f);
        dz = Math.log10(dz) / Math.log10(2.0f);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the base 2 logarithm of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 log2(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.log10(dx) / Math.log10(2.0f);
        dy = Math.log10(dy) / Math.log10(2.0f);
        dz = Math.log10(dz) / Math.log10(2.0f);
        dw = Math.log10(dw) / Math.log10(2.0f);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the natural logarithm of (v + 1.0f) of Float.
     *
     * @param data
     * @return
     */
    public static float log1p(float data) {
        double dx;
        dx = data;

        dx = Math.log1p(dx);

        return (float)dx;
    }

    /**
     * Return the natural logarithm of (v + 1.0f) of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 log1p(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.log1p(dx);
        dy = Math.log1p(dy);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the natural logarithm of (v + 1.0f) of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 log1p(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.log1p(dx);
        dy = Math.log1p(dy);
        dz = Math.log1p(dz);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the natural logarithm of (v + 1.0f) of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 log1p(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.log1p(dx);
        dy = Math.log1p(dy);
        dz = Math.log1p(dz);
        dw = Math.log1p(dw);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Compute the exponent of the value of Float.
     *
     * @param data
     * @return
     */
    public static float logb(float data) {
        return floor(log2(fabs(data)));
    }

    /**
     * Compute the exponent of the value of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 logb(Float2 data) {
        Float2 dr = floor(log2(fabs(data)));

        return dr;
    }

    /**
     * Compute the exponent of the value of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 logb(Float3 data) {
        Float3 dr = floor(log2(fabs(data)));

        return dr;
    }

    /**
     * Compute the exponent of the value of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 logb(Float4 data) {
        Float4 dr = floor(log2(fabs(data)));

        return dr;
    }

    /**
     * Return the next floating point number from a towards b.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float2 nextafter(Float2 a, Float2 b) {
        float dx, dy;

        dx = Math.nextAfter(a.x, b.x);
        dy = Math.nextAfter(a.y, b.y);

        return new Float2(dx, dy);
    }

    /**
     * Return the next floating point number from a towards b.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float3 nextafter(Float3 a,Float3 b) {
        float dx, dy, dz;

        dx = Math.nextAfter(a.x, b.x);
        dy = Math.nextAfter(a.y, b.y);
        dz = Math.nextAfter(a.z, b.z);

        return new Float3(dx, dy, dz);
    }

    /**
     * Return the next floating point number from a towards b.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float4 nextafter(Float4 a, Float4 b) {
        float dx, dy, dz, dw;

        dx = Math.nextAfter(a.x, b.x);
        dy = Math.nextAfter(a.y, b.y);
        dz = Math.nextAfter(a.z, b.z);
        dw = Math.nextAfter(a.w, b.w);

        return new Float4(dx, dy, dz, dw);
    }

    /**
     * Normalize a vector.
     *
     * @param data
     * @return
     */
    public static float normalize(float data) {
        return 1.0f;
    }

    /**
     * Normalize a vector.
     *
     * @param data
     * @return
     */
    public static Float2 normalize(Float2 data) {
        data.div(length(data));

        return data;
    }

    /**
     * Normalize a vector.
     *
     * @param data
     * @return
     */
    public static Float3 normalize(Float3 data) {
        data.div(length(data));

        return data;
    }

    /**
     * Normalize a vector.
     *
     * @param data
     * @return
     */
    public static Float4 normalize(Float4 data) {
        data.div(length(data));

        return data;
    }

    /**
     * Return NaN of UInt.
     *
     * @param data
     * @return
     */
    public static float nan(UInt data ) {

        int or = (int)(data.getValue() | 0x7FC00000);
        float dr = java.lang.Float.intBitsToFloat(or);

        return dr;
    }

    /**
     * Return vector data ^ n of Float2.
     *
     * @param data
     * @param n
     * @return
     */
    public static Float2 pown(Float2 data, int n) {
        double dx, dy;

        dx = Math.pow(data.x, n);
        dy = Math.pow(data.y, n);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return vector data ^ n of Float3.
     *
     * @param data
     * @param n
     * @return
     */
    public static Float3 pown(Float3 data, int n) {
        double dx, dy, dz;

        dx = Math.pow(data.x, n);
        dy = Math.pow(data.y, n);
        dz = Math.pow(data.z, n);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return vector data ^ n of Float4.
     *
     * @param data
     * @param n
     * @return
     */
    public static Float4 pown(Float4 data, int n) {
        double dx, dy, dz, dw;

        dx = Math.pow(data.x, n);
        dy = Math.pow(data.y, n);
        dz = Math.pow(data.z, n);
        dw = Math.pow(data.w, n);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Convert from degrees to radians of Float.
     *
     * @param degrees
     * @return
     */
    public static float radians(float degrees) {
        double dx;

        dx = degrees * Math.PI / 180;

        return (float)dx;
    }

    /**
     * Convert from degrees to radians of Float2.
     *
     * @param degrees
     * @return
     */
    public static Float2 radians(Float2 degrees) {
        double dx, dy;

        dx = degrees.x * Math.PI / 180;
        dy = degrees.y * Math.PI / 180;

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Convert from degrees to radians of Float3.
     *
     * @param degrees
     * @return
     */
    public static Float3 radians(Float3 degrees) {
        double dx, dy, dz;

        dx = degrees.x * Math.PI / 180;
        dy = degrees.y * Math.PI / 180;
        dz = degrees.z * Math.PI / 180;

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Convert from degrees to radians of Float4.
     *
     * @param degrees
     * @return
     */
    public static Float4 radians(Float4 degrees) {
        double dx, dy, dz, dw;

        dx = degrees.x * Math.PI / 180;
        dy = degrees.y * Math.PI / 180;
        dz = degrees.z * Math.PI / 180;
        dw = degrees.w * Math.PI / 180;

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return round a / b to the nearest integer then compute the remainder of Float.
     *
     * @param a
     * @param b
     * @return
     */
    public static float remainder(float a, float b) {
        double dx;

        double ax = a;
        double bx = b;

        dx = (b == 0.0f) ? java.lang.Double.NaN : ax - Math.round(ax / bx) * bx;

        return (float)dx;
    }

    /**
     * Return round a / b to the nearest integer then compute the remainder of Float2.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float2 remainder(Float2 a, Float2 b) {
        double dx, dy;

        double ax = a.x;
        double ay = a.y;
        double bx = b.x;
        double by = b.y;

        dx = (b.x == 0.0f) ? java.lang.Double.NaN : ax - Math.round(ax / bx) * bx;
        dy = (b.y == 0.0f) ? java.lang.Double.NaN : ay - Math.round(ay / by) * by;

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return round a / b to the nearest integer then compute the remainder of Float3.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float3 remainder(Float3 a, Float3 b) {
        double dx, dy, dz;

        double ax = a.x;
        double ay = a.y;
        double az = a.z;
        double bx = b.x;
        double by = b.y;
        double bz = b.z;

        dx = (b.x == 0.0f) ? java.lang.Double.NaN : ax - Math.round(ax / bx) * bx;
        dy = (b.y == 0.0f) ? java.lang.Double.NaN : ay - Math.round(ay / by) * by;
        dz = (b.z == 0.0f) ? java.lang.Double.NaN : az - Math.round(az / bz) * bz;

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return round a / b to the nearest integer then compute the remainder of Float4.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float4 remainder(Float4 a, Float4 b) {
        double dx, dy, dz, dw;

        double ax = a.x;
        double ay = a.y;
        double az = a.z;
        double aw = a.w;
        double bx = b.x;
        double by = b.y;
        double bz = b.z;
        double bw = b.w;

        dx = (b.x == 0.0f) ? java.lang.Double.NaN : ax - Math.round(ax / bx) * bx;
        dy = (b.y == 0.0f) ? java.lang.Double.NaN : ay - Math.round(ay / by) * by;
        dz = (b.z == 0.0f) ? java.lang.Double.NaN : az - Math.round(az / bz) * bz;
        dw = (b.w == 0.0f) ? java.lang.Double.NaN : aw - Math.round(aw / bw) * bw;

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return round to the nearest integral value of Float.
     * Half values are rounded away from zero.
     *
     * @param data
     * @return
     */
    public static float round(float data) {
        double dx;
        dx = data;

        dx = Math.round(dx);
        if ((dx <= 0) && ((dx - data) == 0.5)) {
            dx = dx - 1;
        }

        return (float)dx;
    }

    /**
     * Return round to the nearest integral value of Float2.
     * Half values are rounded away from zero.
     *
     * @param data
     * @return
     */
    public static Float2 round(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.round(dx);
        dy = Math.round(dy);
        if ((dx <= 0) && ((dx - data.x)) == 0.5) {
            dx = dx - 1;
        }
        if ((dy <= 0) && ((dy - data.y)) == 0.5) {
            dy = dy - 1;
        }

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return round to the nearest integral value of Float3.
     * Half values are rounded away from zero.
     *
     * @param data
     * @return
     */
    public static Float3 round(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.round(dx);
        dy = Math.round(dy);
        dz = Math.round(dz);
        if ((dx <= 0) && ((dx - data.x)) == 0.5) {
            dx = dx - 1;
        }
        if ((dy <= 0) && ((dy - data.y)) == 0.5) {
            dy = dy - 1;
        }
        if ((dz <= 0) && ((dz - data.z)) == 0.5) {
            dz = dz - 1;
        }

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return round to the nearest integral value of Float4.
     * Half values are rounded away from zero.
     *
     * @param data
     * @return
     */
    public static Float4 round(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.round(dx);
        dy = Math.round(dy);
        dz = Math.round(dz);
        dw = Math.round(dw);
        if ((dx <= 0) && ((dx - data.x) == 0.5)) {
            dx = dx - 1;
        }
        if ((dy <= 0) && ((dy - data.y) == 0.5)) {
            dy = dy - 1;
        }
        if ((dz <= 0) && ((dz - data.z) == 0.5)) {
            dz = dz - 1;
        }
        if ((dw <= 0) && ((dw - data.w) == 0.5)) {
            dw = dw - 1;
        }

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the square root of Float.
     *
     * @param data
     * @return
     */
    public static float sqrt(float data) {
        double dx;
        dx = data;
        dx = Math.sqrt(dx);

        return (float)dx;
    }

    /**
     * Return the square root of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 sqrt(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.sqrt(dx);
        dy = Math.sqrt(dy);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the square root of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 sqrt(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.sqrt(dx);
        dy = Math.sqrt(dy);
        dz = Math.sqrt(dz);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the square root of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 sqrt(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.sqrt(dx);
        dy = Math.sqrt(dy);
        dz = Math.sqrt(dz);
        dw = Math.sqrt(dw);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the reciprocal of the square root of Float.
     *
     * @param data
     * @return
     */
    public static float rsqrt(float data) {
        double dx;
        dx = data;
        dx = 1.0f / Math.sqrt(dx);

        return (float)dx;
    }

    /**
     * Return the reciprocal of the square root of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 rsqrt(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = 1.0f / Math.sqrt(dx);
        dy = 1.0f / Math.sqrt(dy);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the reciprocal of the square root of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 rsqrt(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = 1.0f / Math.sqrt(dx);
        dy = 1.0f / Math.sqrt(dy);
        dz = 1.0f / Math.sqrt(dz);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the reciprocal of the square root of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 rsqrt(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = 1.0f / Math.sqrt(dx);
        dy = 1.0f / Math.sqrt(dy);
        dz = 1.0f / Math.sqrt(dz);
        dw = 1.0f / Math.sqrt(dw);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the sine of float2.
     *
     * @param data
     * @return
     */
    public static Float2 sin(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.sin(dx);
        dy = Math.sin(dy);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the sine of float3.
     *
     * @param data
     * @return
     */
    public static Float3 sin(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.sin(dx);
        dy = Math.sin(dy);
        dz = Math.sin(dz);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the sine of float4.
     *
     * @param data
     * @return
     */
    public static Float4 sin(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.sin(dx);
        dy = Math.sin(dy);
        dz = Math.sin(dz);
        dw = Math.sin(dw);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the sign of Float.
     *
     * @param data
     * @return
     */
    public static float sign(float data) {
        float res;
        res = data > 0 ? 1 : (data < 0 ? -1 : 0);

        return res;
    }

    /**
     * Return the sign of float2.
     *
     * @param data
     * @return
     */
    public static Float2 sign(Float2 data) {
        Float2 res = new Float2();
        res.x = data.x > 0 ? 1 : (data.x < 0 ? -1 : 0);
        res.y = data.y > 0 ? 1 : (data.y < 0 ? -1 : 0);

        return res;
    }

    /**
     * Return the sign of float3.
     *
     * @param data
     * @return
     */
    public static Float3 sign(Float3 data) {
        Float3 res = new Float3();
        res.x = data.x > 0 ? 1 : (data.x < 0 ? -1 : 0);
        res.y = data.y > 0 ? 1 : (data.y < 0 ? -1 : 0);
        res.z = data.z > 0 ? 1 : (data.z < 0 ? -1 : 0);

        return res;
    }

    /**
     * Return the sign of float4.
     *
     * @param data
     * @return
     */
    public static Float4 sign(Float4 data) {
        Float4 res = new Float4();
        res.x = data.x > 0 ? 1 : (data.x < 0 ? -1 : 0);
        res.y = data.y > 0 ? 1 : (data.y < 0 ? -1 : 0);
        res.z = data.z > 0 ? 1 : (data.z < 0 ? -1 : 0);
        res.w = data.w > 0 ? 1 : (data.w < 0 ? -1 : 0);

        return res;
    }

    /**
     * Return the sin value of Float.
     * Cos value of the data will be kept in a[0].
     *
     * @param data
     * @param a
     * @return
     */
    public static float sincos(float data, float[] a) {
        double dx;

        a[0] = (float)(Math.cos(data));
        dx = Math.sin(data);

        return (float)dx;
    }

    /**
     * Return the sin value of Float2.
     * Cos value of the data will be kept in a[0].
     *
     * @param data
     * @param a
     * @return
     */
    public static Float2 sincos(Float2 data, Float2[] a) {
        double dx, dy;
        a[0] = new Float2();

        a[0].x = (float)(Math.cos(data.x));
        a[0].y = (float)(Math.cos(data.y));
        dx = Math.sin(data.x);
        dy = Math.sin(data.y);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the sin value of Float3.
     * Cos value of the data will be kept in a[0].
     *
     * @param data
     * @param a
     * @return
     */
    public static Float3 sincos(Float3 data, Float3[] a) {
        double dx, dy, dz;
        a[0] = new Float3();

        a[0].x = (float)(Math.cos(data.x));
        a[0].y = (float)(Math.cos(data.y));
        a[0].z = (float)(Math.cos(data.z));
        dx = Math.sin(data.x);
        dy = Math.sin(data.y);
        dz = Math.sin(data.z);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the sin value of Float4
     * Cos value of the data will be kept in a[0]
     *
     * @param data
     * @param a
     * @return
     */
    public static Float4 sincos(Float4 data, Float4[] a) {
        double dx, dy, dz, dw;
        a[0] = new Float4();

        a[0].x = (float)(Math.cos(data.x));
        a[0].y = (float)(Math.cos(data.y));
        a[0].z = (float)(Math.cos(data.z));
        a[0].w = (float)(Math.cos(data.w));
        dx = Math.sin(data.x);
        dy = Math.sin(data.y);
        dz = Math.sin(data.z);
        dw = Math.sin(data.w);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the hyperbolic sin of Float.
     *
     * @param data
     * @return
     */
    public static float sinh(float data) {
        double dx;
        dx = data;

        dx = Math.sinh(dx);

        return (float)dx;
    }

    /**
     * Return the hyperbolic sin of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 sinh(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.sinh(dx);
        dy = Math.sinh(dy);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the hyperbolic sin of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 sinh(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.sinh(dx);
        dy = Math.sinh(dy);
        dz = Math.sinh(dz);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the hyperbolic sin of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 sinh(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.sinh(dx);
        dy = Math.sinh(dy);
        dz = Math.sinh(dz);
        dw = Math.sinh(dw);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the value of sine divided by PI of Float.
     *
     * @param data
     * @return
     */
    public static float sinpi(float data) {
        double dx;
        dx = data;

        dx = Math.sin(dx) / Math.PI;

        return (float)dx;
    }

    /**
     * Return the value of sine divided by PI of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 sinpi(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.sin(dx) / Math.PI;
        dy = Math.sin(dy) / Math.PI;

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the value of sine divided by PI of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 sinpi(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.sin(dx) / Math.PI;
        dy = Math.sin(dy) / Math.PI;
        dz = Math.sin(dz) / Math.PI;

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the value of sine divided by PI of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 sinpi(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.sin(dx) / Math.PI;
        dy = Math.sin(dy) / Math.PI;
        dz = Math.sin(dz) / Math.PI;
        dw = Math.sin(dw) / Math.PI;

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

     /**
     * Return the value of step of Float.
     *
     * @param edge
     * @param data
     * @return
     */
    public static float step(float edge, float data) {
        double dx;

        dx = data < edge ? 0.0 : 1.0;

        return (float)dx;
    }

    /**
     * Return the value of step of Float2.
     *
     * @param edge
     * @param data
     * @return
     */
    public static Float2 step(Float2 edge, Float2 data) {
        double dx, dy;

        dx = data.x < edge.x ? 0.0 : 1.0;
        dy = data.y < edge.y ? 0.0 : 1.0;

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the value of step of Float3.
     *
     * @param edge
     * @param data
     * @return
     */
    public static Float3 step(Float3 edge, Float3 data) {
        double dx, dy, dz;

        dx = data.x < edge.x ? 0.0 : 1.0;
        dy = data.y < edge.y ? 0.0 : 1.0;
        dz = data.z < edge.z ? 0.0 : 1.0;

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the value of step of Float4.
     *
     * @param edge
     * @param data
     * @return
     */
    public static Float4 step(Float4 edge, Float4 data) {
        double dx, dy, dz, dw;

        dx = data.x < edge.x ? 0.0 : 1.0;
        dy = data.y < edge.y ? 0.0 : 1.0;
        dz = data.z < edge.z ? 0.0 : 1.0;
        dw = data.w < edge.w ? 0.0 : 1.0;

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return start + ((stop - start) * amount) of Float
     *
     * @param start
     * @param stop
     * @param amount
     * @return
     */
    public static float mix(float start, float stop, float amount) {
        float sub = stop - start;
        float mul = sub * amount;

        return mul + start;
    }

    /**
     * Return start + ((stop - start) * amount) of Float2
     *
     * @param start
     * @param stop
     * @param amount
     * @return
     */
    public static Float2 mix(Float2 start, Float2 stop, Float2 amount) {
        Float2 sub = Float2.sub(stop, start);
        Float2 mul = Float2.mul(sub, amount);

        return Float2.add(mul, start);
    }

    /**
     * Return start + ((stop - start) * amount) of Float3
     *
     * @param start
     * @param stop
     * @param amount
     * @return
     */
    public static Float3 mix(Float3 start, Float3 stop, Float3 amount) {
        Float3 sub = Float3.sub(stop, start);
        Float3 mul = Float3.mul(sub, amount);

        return Float3.add(mul, start);
    }

    /**
     * Return start + ((stop - start) * amount) of Float4
     *
     * @param start
     * @param stop
     * @param amount
     * @return
     */
    public static Float4 mix(Float4 start, Float4 stop, Float4 amount) {
        Float4 sub = Float4.sub(stop, start);
        Float4 mul = Float4.mul(sub, amount);

        return Float4.add(mul, start);
    }

    /**
     * Return start + ((stop - start) * amount) of Float2
     *
     * @param start
     * @param stop
     * @param amount
     * @return
     */
    public static Float2 mix(Float2 start, Float2 stop, float amount) {
        Float2 sub = Float2.sub(stop, start);
        Float2 mul = Float2.mul(sub, amount);

        return Float2.add(mul, start);
    }

    /**
     * Return start + ((stop - start) * amount) of Float3
     *
     * @param start
     * @param stop
     * @param amount
     * @return
     */
    public static Float3 mix(Float3 start, Float3 stop, float amount) {
        Float3 sub = Float3.sub(stop, start);
        Float3 mul = Float3.mul(sub, amount);

        return Float3.add(mul, start);
    }

    /**
     * Return start + ((stop - start) * amount) of Float4
     *
     * @param start
     * @param stop
     * @param amount
     * @return
     */
    public static Float4 mix(Float4 start, Float4 stop, float amount) {
        Float4 sub = Float4.sub(stop, start);
        Float4 mul = Float4.mul(sub, amount);

        return Float4.add(mul, start);
    }

    /**
     * Return (a * b) + c of Float
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static float mad(float a, float b, float c) {
        return a*b+c;
    }

    /**
     * Return (a * b) + c of Float2
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static Float2 mad(Float2 a, Float2 b, Float2 c) {
        return Float2.add(Float2.mul(a, b), c);
    }

    /**
     * Return (a * b) + c of Float3
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static Float3 mad(Float3 a, Float3 b, Float3 c) {
        return Float3.add(Float3.mul(a, b), c);
    }

    /**
     * Return (a * b) + c of Float4
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static Float4 mad(Float4 a, Float4 b, Float4 c) {
        return Float4.add(Float4.mul(a, b), c);
    }

    /**
     * Return the integral and fractional components of a number
     * Float2.x is integral,Float2.y is fractional
     *
     * @param a
     * @return
     */
    public static Float2 modf(float a) {
        Float2 ret = new Float2();
        double value = Math.abs(a);
        double intPart = Math.floor(value);
        double dotPart = value - intPart;
        float fIpart = (float) intPart;
        float fdpart = (float) dotPart;
        if (a < 0) {
            fIpart -= fIpart;
            fdpart -= fdpart;
        }
        ret.setAt(0, fIpart);
        ret.setAt(1, fdpart);

        return ret;
    }

    /**
     * Return the integral and fractional components of a number
     * Float2.x is integral,Float2.y is fractional
     *
     * @param a
     * @return
     */
    public static Float2[] modf(Float2 a) {
        Float2[] ret = new Float2[2];
        ret[0] = modf(new Float(a.x));
        ret[1] = modf(new Float(a.y));

        return ret;
    }

    /**
     * Return the integral and fractional components of a number
     * Float2.x is integral,Float2.y is fractional
     *
     * @param a
     * @return
     */
    public static Float2[] modf(Float3 a) {
        Float2[] ret = new Float2[3];
        ret[0] = modf(new Float(a.x));
        ret[1] = modf(new Float(a.y));
        ret[2] = modf(new Float(a.z));

        return ret;
    }

    /**
     * Return the integral and fractional components of a number
     * Float2.x is integral,Float2.y is fractional
     *
     * @param a
     * @return
     */
    public static Float2[] modf(Float4 a) {
        Float2[] ret = new Float2[4];
        ret[0] = modf(new Float(a.x));
        ret[1] = modf(new Float(a.y));
        ret[2] = modf(new Float(a.z));
        ret[3] = modf(new Float(a.w));

        return ret;
    }

    /**
     * Computes the same remainder as a REM b.
     *
     * @param a
     * @param b
     * @param quo
     * @return
     */
    public static float remquo(float a, float b, int[] quo) {
        quo[0] = (int)(0);
        quo[0] = (int)(Math.abs(a / b) / (a / b))
                * Math.abs((int)(a / b));

        return remainder(a, b);
    }

    /**
     * Computes the same remainder as a REM b.
     *
     * @param a
     * @param b
     * @param quo
     * @return
     */
    public static Float2 remquo(Float2 a, Float2 b, Int2[] quo) {
        quo[0] = new Int2(0, 0);
        quo[0].x = (int)(Math.abs(a.x / b.x) / (a.x / b.x))
                * Math.abs((int)(a.x / b.x));
        quo[0].y = (int)(Math.abs(a.y / b.y) / (a.y / b.y))
                * Math.abs((int)(a.y / b.y));

        return remainder(a, b);
    }

    /**
     * Computes the same remainder as a REM b.
     *
     * @param a
     * @param b
     * @param quo
     * @return
     */
    public static Float3 remquo(Float3 a, Float3 b, Int3[] quo) {
        quo[0] = new Int3(0, 0, 0);
        quo[0].x = (int)(Math.abs(a.x / b.x) / (a.x / b.x))
                * Math.abs((int)(a.x / b.x));
        quo[0].y = (int)(Math.abs(a.y / b.y) / (a.y / b.y))
                * Math.abs((int)(a.y / b.y));
        quo[0].z = (int)(Math.abs(a.z / b.z) / (a.z / b.z))
                * Math.abs((int)(a.z / b.z));

        return remainder(a, b);
    }

    /**
     * Computes the same remainder as a REM b.
     *
     * @param a
     * @param b
     * @param quo
     * @return
     */
    public static Float4 remquo(Float4 a, Float4 b, Int4[] quo) {
        quo[0] = new Int4(0, 0, 0, 0);
        quo[0].x = (int)(Math.abs(a.x / b.x) / (a.x / b.x))
                * Math.abs((int)(a.x / b.x));
        quo[0].y = (int)(Math.abs(a.y / b.y) / (a.y / b.y))
                * Math.abs((int)(a.y / b.y));
        quo[0].z = (int)(Math.abs(a.z / b.z) / (a.z / b.z))
                * Math.abs((int)(a.z / b.z));
        quo[0].w = (int)(Math.abs(a.w / b.w) / (a.w / b.w))
                * Math.abs((int)(a.w / b.w));

        return remainder(a, b);
    }

    /**
     * Round to the nearest integral value.
     *
     * @param data
     * @return
     */
    public static Float2 rint(Float2 data) {
        double dx, dy;
        dx = Math.rint(data.x);
        dy = Math.rint(data.y);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Round to the nearest integral value.
     *
     * @param data
     * @return
     */
    public static Float3 rint(Float3 data) {
        double dx, dy, dz;
        dx = Math.rint(data.x);
        dy = Math.rint(data.y);
        dz = Math.rint(data.z);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Round to the nearest integral value.
     *
     * @param data
     * @return
     */
    public static Float4 rint(Float4 data) {
        double dx, dy, dz, dw;
        dx = Math.rint(data.x);
        dy = Math.rint(data.y);
        dz = Math.rint(data.z);
        dw = Math.rint(data.w);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Compute the Nth root of a value.
     *
     * @param data
     * @param n
     * @return
     */
    public static float rootn(float data, int n) {
        double[] dv = new double[] {data};
        double[] dr = new double[1];
        for (int i = 0; i < 1; i++) {
            if (dv[i] > 0) {
                if (n != 0) {
                    dr[i] = Math.pow(dv[i], 1.f / n);
                } else {
                    dr[i] = java.lang.Double.NaN;
                }
            }

            if (dv[i] == 0.0) {
                if (n > 0) {
                    dr[i] = 0.f;
                } else if (n == 0) {
                    dr[i] = java.lang.Double.NaN;
                } else {
                    dr[i] = java.lang.Double.POSITIVE_INFINITY;
                }
            }

            if (dv[i] < 0) {
                if ((n % 2) == 0.f) {
                    dr[i] = java.lang.Double.NaN;
                } else {
                    dr[i] = -1 * Math.pow(-1 * dv[i], 1.f / n);
                }
            }
        }

        return (float)dr[0];
    }

    /**
     * Compute the Nth root of a value.
     *
     * @param data
     * @param n
     * @return
     */
    public static Float2 rootn(Float2 data, int n) {
        double[] dv = new double[] {data.x, data.y};
        double[] dr = new double[2];
        for (int i = 0; i < 2; i++) {
            if (dv[i] > 0) {
                if (n != 0) {
                    dr[i] = Math.pow(dv[i], 1.f / n);
                } else {
                    dr[i] = java.lang.Double.NaN;
                }
            }

            if (dv[i] == 0.0) {
                if (n > 0) {
                    dr[i] = 0.f;
                } else if (n == 0) {
                    dr[i] = java.lang.Double.NaN;
                } else {
                    dr[i] = java.lang.Double.POSITIVE_INFINITY;
                }
            }

            if (dv[i] < 0) {
                if ((n % 2) == 0.f) {
                    dr[i] = java.lang.Double.NaN;
                } else {
                    dr[i] = -1 * Math.pow(-1 * dv[i], 1.f / n);
                }
            }
        }

        return new Float2((float)dr[0], (float)dr[1]);
    }

    /**
     * Compute the Nth root of a value.
     *
     * @param data
     * @param n
     * @return
     */
    public static Float3 rootn(Float3 data, int n) {
        double[] dv = new double[] {data.x, data.y, data.z};
        double[] dr = new double[3];
        for (int i = 0; i < 3; i++) {
            if (dv[i] > 0) {
                if (n != 0) {
                    dr[i] = Math.pow(dv[i], 1.f / n);
                } else {
                    dr[i] = java.lang.Double.NaN;
                }
            }

            if (dv[i] == 0.0) {
                if (n > 0) {
                    dr[i] = 0.f;
                } else if (n == 0) {
                    dr[i] = java.lang.Double.NaN;
                } else {
                    dr[i] = java.lang.Double.POSITIVE_INFINITY;
                }
            }

            if (dv[i] < 0) {
                if ((n % 2) == 0.f) {
                    dr[i] = java.lang.Double.NaN;
                } else {
                    dr[i] = -1 * Math.pow(-1 * dv[i], 1.f / n);
                }
            }
        }

        return new Float3((float)dr[0], (float)dr[1], (float)dr[2]);
    }

    /**
     * Compute the Nth root of a value.
     *
     * @param data
     * @param n
     * @return
     */
    public static Float4 rootn(Float4 data, int n) {
        double[] dv = new double[] {data.x, data.y, data.z, data.w};
        double[] dr = new double[4];
        for (int i = 0; i < 4; i++) {
            if (dv[i] > 0) {
                if (n != 0) {
                    dr[i] = Math.pow(dv[i], 1.f / n);
                } else {
                    dr[i] = java.lang.Double.NaN;
                }
            }

            if (dv[i] == 0.0) {
                if (n > 0) {
                    dr[i] = 0.f;
                } else if (n == 0) {
                    dr[i] = java.lang.Double.NaN;
                } else {
                    dr[i] = java.lang.Double.POSITIVE_INFINITY;
                }
            }

            if (dv[i] < 0) {
                if ((n % 2) == 0.f) {
                    dr[i] = java.lang.Double.NaN;
                } else {
                    dr[i] = -1 * Math.pow(-1 * dv[i], 1.f / n);
                }
            }
        }

        return new Float4((float)dr[0], (float)dr[1], (float)dr[2], (float)dr[3]);
    }

    /**
     * Compute the Nth root of a value.
     *
     * @param data
     * @param n
     * @return
     */
    public static Float2 rootn(Float2 data, Int2 n) {
        double[] dv = new double[] {data.x, data.y};
        int[] in = new int[] {n.x, n.y};
        double[] dr = new double[2];
        for (int i = 0; i < 2; i++) {
            if (dv[i] > 0) {
                if (in[i] != 0) {
                    dr[i] = Math.pow(dv[i], 1.f / in[i]);
                } else {
                    dr[i] = java.lang.Double.NaN;
                }
            }

            if (dv[i] == 0.0) {
                if (in[i] > 0) {
                    dr[i] = 0.f;
                } else if (in[i] == 0) {
                    dr[i] = java.lang.Double.NaN;
                } else {
                    dr[i] = java.lang.Double.POSITIVE_INFINITY;
                }
            }

            if (dv[i] < 0) {
                if ((in[i] % 2) == 0.f) {
                    dr[i] = java.lang.Double.NaN;
                } else {
                    dr[i] = -1 * Math.pow(-1 * dv[i], 1.f / in[i]);
                }
            }
        }

        return new Float2((float)dr[0], (float)dr[1]);
    }

    /**
     * Compute the Nth root of a value.
     *
     * @param data
     * @param n
     * @return
     */
    public static Float3 rootn(Float3 data, Int3 n) {
        double[] dv = new double[] {data.x, data.y, data.z};
        int[] in = new int[] {n.x, n.y, n.z};
        double[] dr = new double[3];
        for (int i = 0; i < 3; i++) {
            if (dv[i] > 0) {
                if (in[i] != 0) {
                    dr[i] = Math.pow(dv[i], 1.f / in[i]);
                } else {
                    dr[i] = java.lang.Double.NaN;
                }
            }

            if (dv[i] == 0.0) {
                if (in[i] > 0) {
                    dr[i] = 0.f;
                } else if (in[i] == 0) {
                    dr[i] = java.lang.Double.NaN;
                } else {
                    dr[i] = java.lang.Double.POSITIVE_INFINITY;
                }
            }

            if (dv[i] < 0) {
                if ((in[i] % 2) == 0.f) {
                    dr[i] = java.lang.Double.NaN;
                } else {
                    dr[i] = -1 * Math.pow(-1 * dv[i], 1.f / in[i]);
                }
            }
        }

        return new Float3((float)dr[0], (float)dr[1], (float)dr[2]);
    }

    /**
     * Compute the Nth root of a value.
     *
     * @param data
     * @param n
     * @return
     */
    public static Float4 rootn(Float4 data, Int4 n) {
        double[] dv = new double[] {data.x, data.y, data.z, data.w};
        int[] in = new int[] {n.x, n.y, n.z, n.w};
        double[] dr = new double[4];
        for (int i = 0; i < 4; i++) {
            if (dv[i] > 0) {
                if (in[i] != 0) {
                    dr[i] = Math.pow(dv[i], 1.f / in[i]);
                } else {
                    dr[i] = java.lang.Double.NaN;
                }
            }

            if (dv[i] == 0.0) {
                if (in[i] > 0) {
                    dr[i] = 0.f;
                } else if (in[i] == 0) {
                    dr[i] = java.lang.Double.NaN;
                } else {
                    dr[i] = java.lang.Double.POSITIVE_INFINITY;
                }
            }

            if (dv[i] < 0) {
                if ((in[i] % 2) == 0.f) {
                    dr[i] = java.lang.Double.NaN;
                } else {
                    dr[i] = -1 * Math.pow(-1 * dv[i], 1.f / in[i]);
                }
            }
        }

        return new Float4((float)dr[0], (float)dr[1], (float)dr[2], (float)dr[3]);
    }

    /**
     * Return the bigger one between Float2.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float2 max(Float2 a, Float2 b) {
        float dx, dy;

        dx = a.x > b.x ? a.x : b.x;
        dy = a.y > b.y ? a.y : b.y;

        return new Float2(dx, dy);
    }

    /**
     * Return the bigger one between Float3.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float3 max(Float3 a, Float3 b) {
        float dx, dy, dz;

        dx = a.x > b.x ? a.x : b.x;
        dy = a.y > b.y ? a.y : b.y;
        dz = a.z > b.z ? a.z : b.z;

        return new Float3(dx, dy, dz);
    }

    /**
     * Return the bigger one between Float4.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float4 max(Float4 a, Float4 b) {
        float dx, dy, dz, dw;

        dx = a.x > b.x ? a.x : b.x;
        dy = a.y > b.y ? a.y : b.y;
        dz = a.z > b.z ? a.z : b.z;
        dw = a.w > b.w ? a.w : b.w;

        return new Float4(dx, dy, dz, dw);
    }

    /**
     * Compare Float to each member of Float2,
     * and return a new object contained bigger values.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float2 max(Float2 a, float b) {
        float dx, dy;

        dx = a.x > b ? a.x : b;
        dy = a.y > b ? a.y : b;

        return new Float2(dx, dy);
    }

    /**
     * Compare Float to each member of Float3,
     * and return a new object contained bigger values.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float3 max(Float3 a, float b) {
        float dx, dy, dz;

        dx = a.x > b ? a.x : b;
        dy = a.y > b ? a.y : b;
        dz = a.z > b ? a.z : b;

        return new Float3(dx, dy, dz);
    }

    /**
     * Compare Float to each member of Float4,
     * and return a new object contained bigger values.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float4 max(Float4 a, float b) {
        float dx, dy, dz, dw;

        dx = a.x > b ? a.x : b;
        dy = a.y > b ? a.y : b;
        dz = a.z > b ? a.z : b;
        dw = a.w > b ? a.w : b;

        return new Float4(dx, dy, dz, dw);
    }

    /**
     * Return the bigger one between UByte.
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte max(UByte a, UByte b) {

        UByte dx = new UByte(a.getValue() > b.getValue() ? a.getValue() : b.getValue());

        return new UByte(dx);
    }

    /**
     * Return the bigger one between UByte2.
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte2 max(UByte2 a, UByte2 b) {

        UByte dx = new UByte(max(a.x, b.x));
        UByte dy = new UByte(max(a.y, b.y));

        return new UByte2(dx, dy);
    }

    /**
     * Return the bigger one between UByte3.
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte3 max(UByte3 a, UByte3 b) {

        UByte dx = new UByte(max(a.x, b.x));
        UByte dy = new UByte(max(a.y, b.y));
        UByte dz = new UByte(max(a.z, b.z));

        return new UByte3(dx, dy, dz);
    }

    /**
     * Return the bigger one between UByte4.
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte4 max(UByte4 a, UByte4 b) {

        UByte dx = new UByte(max(a.x, b.x));
        UByte dy = new UByte(max(a.y, b.y));
        UByte dz = new UByte(max(a.z, b.z));
        UByte dw = new UByte(max(a.w, b.w));

        return new UByte4(dx, dy, dz, dw);
    }

    /**
     * Return the bigger one between byte.
     *
     * @param a
     * @param b
     * @return
     */
    public static byte max(byte a, byte b) {
        byte dx;

        dx = a > b ? a : b;

        return dx;
    }

    /**
     * Return the bigger one between Byte2.
     *
     * @param a
     * @param b
     * @return
     */
    public static Byte2 max(Byte2 a, Byte2 b) {
        byte dx, dy;

        dx = a.x > b.x ? a.x : b.x;
        dy = a.y > b.y ? a.y : b.y;

        return new Byte2(dx, dy);
    }

    /**
     * Return the bigger one between Byte3.
     *
     * @param a
     * @param b
     * @return
     */
    public static Byte3 max(Byte3 a, Byte3 b) {
        byte dx, dy, dz;

        dx = a.x > b.x ? a.x : b.x;
        dy = a.y > b.y ? a.y : b.y;
        dz = a.z > b.z ? a.z : b.z;

        return new Byte3(dx, dy, dz);
    }

    /**
     * Return the bigger one between Byte4.
     *
     * @param a
     * @param b
     * @return
     */
    public static Byte4 max(Byte4 a, Byte4 b) {
        byte dx, dy, dz, dw;

        dx = a.x > b.x ? a.x : b.x;
        dy = a.y > b.y ? a.y : b.y;
        dz = a.z > b.z ? a.z : b.z;
        dw = a.w > b.w ? a.w : b.w;

        return new Byte4(dx, dy, dz, dw);
    }

    /**
     * Return the bigger one between UShort.
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort max(UShort a, UShort b) {

        UShort dx = new UShort(a.getValue() > b.getValue() ? a.getValue() : b.getValue());

        return new UShort(dx);
    }

    /**
     * Return the bigger one between UShort2.
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort2 max(UShort2 a, UShort2 b) {

        UShort dx = new UShort(max(a.x, b.x));
        UShort dy = new UShort(max(a.y, b.y));

        return new UShort2(dx, dy);
    }

    /**
     * Return the bigger one between UShort3.
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort3 max(UShort3 a, UShort3 b) {

        UShort dx = new UShort(max(a.x, b.x));
        UShort dy = new UShort(max(a.y, b.y));
        UShort dz = new UShort(max(a.z, b.z));

        return new UShort3(dx, dy, dz);
    }

    /**
     * Return the bigger one between UShort4.
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort4 max(UShort4 a, UShort4 b) {

        UShort dx = new UShort(max(a.x, b.x));
        UShort dy = new UShort(max(a.y, b.y));
        UShort dz = new UShort(max(a.z, b.z));
        UShort dw = new UShort(max(a.w, b.w));

        return new UShort4(dx, dy, dz, dw);
    }

    /**
     * Return the bigger one between Short2.
     *
     * @param a
     * @param b
     * @return
     */
    public static Short2 max(Short2 a, Short2 b) {
        short dx, dy;

        dx = a.x > b.x ? a.x : b.x;
        dy = a.y > b.y ? a.y : b.y;

        return new Short2(dx, dy);
    }

    /**
     * Return the bigger one between Short3.
     *
     * @param a
     * @param b
     * @return
     */
    public static Short3 max(Short3 a, Short3 b) {
        short dx, dy, dz;

        dx = a.x > b.x ? a.x : b.x;
        dy = a.y > b.y ? a.y : b.y;
        dz = a.z > b.z ? a.z : b.z;

        return new Short3(dx, dy, dz);
    }

    /**
     * Return the bigger one between Short4.
     *
     * @param a
     * @param b
     * @return
     */
    public static Short4 max(Short4 a, Short4 b) {
        short dx, dy, dz, dw;

        dx = a.x > b.x ? a.x : b.x;
        dy = a.y > b.y ? a.y : b.y;
        dz = a.z > b.z ? a.z : b.z;
        dw = a.w > b.w ? a.w : b.w;

        return new Short4(dx, dy, dz, dw);
    }

    /**
     * Return the bigger one between UInt.
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt max(UInt a, UInt b) {

        UInt dx = new UInt(a.getValue() > b.getValue() ? a.getValue() : b.getValue());

        return new UInt(dx);
    }

    /**
     * Return the bigger one between UInt2.
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt2 max(UInt2 a, UInt2 b) {

        UInt dx = new UInt(max(a.x, b.x));
        UInt dy = new UInt(max(a.y, b.y));

        return new UInt2(dx, dy);
    }

    /**
     * Return the bigger one between UInt3.
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt3 max(UInt3 a, UInt3 b) {

        UInt dx = new UInt(max(a.x, b.x));
        UInt dy = new UInt(max(a.y, b.y));
        UInt dz = new UInt(max(a.z, b.z));

        return new UInt3(dx, dy, dz);
    }

    /**
     * Return the bigger one between UInt4.
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt4 max(UInt4 a, UInt4 b) {

        UInt dx = new UInt(max(a.x, b.x));
        UInt dy = new UInt(max(a.y, b.y));
        UInt dz = new UInt(max(a.z, b.z));
        UInt dw = new UInt(max(a.w, b.w));

        return new UInt4(dx, dy, dz, dw);
    }

    /**
     * Return the bigger one between UInt.
     *
     * @param a
     * @param b
     * @return
     */

    /**
     * Return the bigger one between Int2.
     *
     * @param a
     * @param b
     * @return
     */
    public static Int2 max(Int2 a, Int2 b) {
        int dx, dy;

        dx = a.x > b.x ? a.x : b.x;
        dy = a.y > b.y ? a.y : b.y;

        return new Int2(dx, dy);
    }

    /**
     * Return the bigger one between Int3.
     *
     * @param a
     * @param b
     * @return
     */
    public static Int3 max(Int3 a, Int3 b) {
        int dx, dy, dz;

        dx = a.x > b.x ? a.x : b.x;
        dy = a.y > b.y ? a.y : b.y;
        dz = a.z > b.z ? a.z : b.z;

        return new Int3(dx, dy, dz);
    }

    /**
     * Return the bigger one between Int4.
     *
     * @param a
     * @param b
     * @return
     */
    public static Int4 max(Int4 a, Int4 b) {
        int dx, dy, dz, dw;

        dx = a.x > b.x ? a.x : b.x;
        dy = a.y > b.y ? a.y : b.y;
        dz = a.z > b.z ? a.z : b.z;
        dw = a.w > b.w ? a.w : b.w;

        return new Int4(dx, dy, dz, dw);
    }


    /**
     * Return the smaller one between Float2.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float2 min(Float2 a, Float2 b) {
        float dx, dy;

        dx = a.x < b.x ? a.x : b.x;
        dy = a.y < b.y ? a.y : b.y;

        return new Float2(dx, dy);
    }

    /**
     * Return the smaller one between Float3.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float3 min(Float3 a, Float3 b) {
        float dx, dy, dz;

        dx = a.x < b.x ? a.x : b.x;
        dy = a.y < b.y ? a.y : b.y;
        dz = a.z < b.z ? a.z : b.z;

        return new Float3(dx, dy, dz);
    }

    /**
     * Return the smaller one between Float4.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float4 min(Float4 a, Float4 b) {
        float dx, dy, dz, dw;

        dx = a.x < b.x ? a.x : b.x;
        dy = a.y < b.y ? a.y : b.y;
        dz = a.z < b.z ? a.z : b.z;
        dw = a.w < b.w ? a.w : b.w;

        return new Float4(dx, dy, dz, dw);
    }

    /**
     * Compare Float to each member of Float2,
     * and return a new object contained smaller values.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float2 min(Float2 a, float b) {
        float dx, dy;

        dx = a.x < b ? a.x : b;
        dy = a.y < b ? a.y : b;

        return new Float2(dx, dy);
    }

    /**
     * Compare Float to each member of Float3,
     * and return a new object contained smaller values.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float3 min(Float3 a, float b) {
        float dx, dy, dz;

        dx = a.x < b ? a.x : b;
        dy = a.y < b ? a.y : b;
        dz = a.z < b ? a.z : b;

        return new Float3(dx, dy, dz);
    }

    /**
     * Compare Float to each member of Float4,
     * and return a new object contained smaller values.
     *
     * @param a
     * @param b
     * @return
     */
    public static Float4 min(Float4 a, float b) {
        float dx, dy, dz, dw;

        dx = a.x < b ? a.x : b;
        dy = a.y < b ? a.y : b;
        dz = a.z < b ? a.z : b;
        dw = a.w < b ? a.w : b;

        return new Float4(dx, dy, dz, dw);
    }

    /**
     * Return the smaller one between UByte.
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte min(UByte a, UByte b) {

        UByte dx = new UByte(a.getValue() < b.getValue() ? a.getValue() : b.getValue());

        return new UByte(dx);
    }

    /**
     * Return the smaller one between UByte2.
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte2 min(UByte2 a, UByte2 b) {

        UByte dx = new UByte(min(a.x, b.x));
        UByte dy = new UByte(min(a.y, b.y));

        return new UByte2(dx, dy);
    }

    /**
     * Return the smaller one between UByte3.
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte3 min(UByte3 a, UByte3 b) {

        UByte dx = new UByte(min(a.x, b.x));
        UByte dy = new UByte(min(a.y, b.y));
        UByte dz = new UByte(min(a.z, b.z));

        return new UByte3(dx, dy, dz);
    }

    /**
     * Return the smaller one between UByte4.
     *
     * @param a
     * @param b
     * @return
     */
    public static UByte4 min(UByte4 a, UByte4 b) {

        UByte dx = new UByte(min(a.x, b.x));
        UByte dy = new UByte(min(a.y, b.y));
        UByte dz = new UByte(min(a.z, b.z));
        UByte dw = new UByte(min(a.w, b.w));

        return new UByte4(dx, dy, dz, dw);
    }

    /**
     * Return the smaller one between Char.
     *
     * @param a
     * @param b
     * @return
     */
    public static byte min(byte a, byte b) {
        byte dx;

        dx = a < b ? a : b;

        return dx;
    }

    /**
     * Return the smaller one between Byte2.
     *
     * @param a
     * @param b
     * @return
     */
    public static Byte2 min(Byte2 a, Byte2 b) {
        byte dx, dy;

        dx = a.x < b.x ? a.x : b.x;
        dy = a.y < b.y ? a.y : b.y;

        return new Byte2(dx, dy);
    }

    /**
     * Return the smaller one between Byte3.
     *
     * @param a
     * @param b
     * @return
     */
    public static Byte3 min(Byte3 a, Byte3 b) {
        byte dx, dy, dz;

        dx = a.x < b.x ? a.x : b.x;
        dy = a.y < b.y ? a.y : b.y;
        dz = a.z < b.z ? a.z : b.z;

        return new Byte3(dx, dy, dz);
    }

    /**
     * Return the smaller one between Byte4.
     *
     * @param a
     * @param b
     * @return
     */
    public static Byte4 min(Byte4 a, Byte4 b) {
        byte dx, dy, dz, dw;

        dx = a.x < b.x ? a.x : b.x;
        dy = a.y < b.y ? a.y : b.y;
        dz = a.z < b.z ? a.z : b.z;
        dw = a.w < b.w ? a.w : b.w;

        return new Byte4(dx, dy, dz, dw);
    }

    /**
     * Return the smaller one between UShort.
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort min(UShort a, UShort b) {

        UShort dx = new UShort(a.getValue() < b.getValue() ? a.getValue() : b.getValue());

        return new UShort(dx);
    }

    /**
     * Return the smaller one between UShort2.
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort2 min(UShort2 a, UShort2 b) {

        UShort dx = new UShort(min(a.x, b.x));
        UShort dy = new UShort(min(a.y, b.y));

        return new UShort2(dx, dy);
    }

    /**
     * Return the smaller one between UShort3.
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort3 min(UShort3 a, UShort3 b) {

        UShort dx = new UShort(min(a.x, b.x));
        UShort dy = new UShort(min(a.y, b.y));
        UShort dz = new UShort(min(a.z, b.z));

        return new UShort3(dx, dy, dz);
    }

    /**
     * Return the smaller one between UShort4.
     *
     * @param a
     * @param b
     * @return
     */
    public static UShort4 min(UShort4 a, UShort4 b) {

        UShort dx = new UShort(min(a.x, b.x));
        UShort dy = new UShort(min(a.y, b.y));
        UShort dz = new UShort(min(a.z, b.z));
        UShort dw = new UShort(min(a.w, b.w));

        return new UShort4(dx, dy, dz, dw);
    }

    /**
     * Return the smaller one between Short2.
     *
     * @param a
     * @param b
     * @return
     */
    public static Short2 min(Short2 a, Short2 b) {
        short dx, dy;

        dx = a.x < b.x ? a.x : b.x;
        dy = a.y < b.y ? a.y : b.y;

        return new Short2(dx, dy);
    }

    /**
     * Return the smaller one between Short3.
     *
     * @param a
     * @param b
     * @return
     */
    public static Short3 min(Short3 a, Short3 b) {
        short dx, dy, dz;

        dx = a.x < b.x ? a.x : b.x;
        dy = a.y < b.y ? a.y : b.y;
        dz = a.z < b.z ? a.z : b.z;

        return new Short3(dx, dy, dz);
    }

    /**
     * Return the smaller one between Short4.
     *
     * @param a
     * @param b
     * @return
     */
    public static Short4 min(Short4 a, Short4 b) {
        short dx, dy, dz, dw;

        dx = a.x < b.x ? a.x : b.x;
        dy = a.y < b.y ? a.y : b.y;
        dz = a.z < b.z ? a.z : b.z;
        dw = a.w < b.w ? a.w : b.w;

        return new Short4(dx, dy, dz, dw);
    }

    /**
     * Return the smaller one between UInt.
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt min(UInt a, UInt b) {

        UInt dx = new UInt(a.getValue() < b.getValue() ? a.getValue() : b.getValue());

        return new UInt(dx);
    }

    /**
     * Return the smaller one between UInt2.
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt2 min(UInt2 a, UInt2 b) {

        UInt dx = new UInt(min(a.x, b.x));
        UInt dy = new UInt(min(a.y, b.y));

        return new UInt2(dx, dy);
    }

    /**
     * Return the smaller one between UInt3.
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt3 min(UInt3 a, UInt3 b) {

        UInt dx = new UInt(min(a.x, b.x));
        UInt dy = new UInt(min(a.y, b.y));
        UInt dz = new UInt(min(a.z, b.z));

        return new UInt3(dx, dy, dz);
    }

    /**
     * Return the smaller one between UInt4.
     *
     * @param a
     * @param b
     * @return
     */
    public static UInt4 min(UInt4 a, UInt4 b) {

        UInt dx = new UInt(min(a.x, b.x));
        UInt dy = new UInt(min(a.y, b.y));
        UInt dz = new UInt(min(a.z, b.z));
        UInt dw = new UInt(min(a.w, b.w));

        return new UInt4(dx, dy, dz, dw);
    }

    /**
     * Return the smaller one between Int2.
     *
     * @param a
     * @param b
     * @return
     */
    public static Int2 min(Int2 a, Int2 b) {
        int dx, dy;

        dx = a.x < b.x ? a.x : b.x;
        dy = a.y < b.y ? a.y : b.y;

        return new Int2(dx, dy);
    }

    /**
     * Return the smaller one between Int3.
     *
     * @param a
     * @param b
     * @return
     */
    public static Int3 min(Int3 a, Int3 b) {
        int dx, dy, dz;

        dx = a.x < b.x ? a.x : b.x;
        dy = a.y < b.y ? a.y : b.y;
        dz = a.z < b.z ? a.z : b.z;

        return new Int3(dx, dy, dz);
    }

    /**
     * Return the smaller one between Int4.
     *
     * @param a
     * @param b
     * @return
     */
    public static Int4 min(Int4 a, Int4 b) {
        int dx, dy, dz, dw;

        dx = a.x < b.x ? a.x : b.x;
        dy = a.y < b.y ? a.y : b.y;
        dz = a.z < b.z ? a.z : b.z;
        dw = a.w < b.w ? a.w : b.w;

        return new Int4(dx, dy, dz, dw);
    }

    /**
     * Return the tangent value of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 tan(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.tan(dx);
        dy = Math.tan(dy);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the tangent value of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 tan(Float3 data) {
        double dx, dy ,dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.tan(dx);
        dy = Math.tan(dy);
        dz = Math.tan(dz);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the tangent value of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 tan(Float4 data) {
        double dx, dy ,dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.tan(dx);
        dy = Math.tan(dy);
        dz = Math.tan(dz);
        dw = Math.tan(dw);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the hyperbolic tangent  of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 tanh(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.tanh(dx);
        dy = Math.tanh(dy);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the hyperbolic tangent  of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 tanh(Float3 data) {
        double dx, dy ,dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.tanh(dx);
        dy = Math.tanh(dy);
        dz = Math.tanh(dz);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the hyperbolic tangent  of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 tanh(Float4 data) {
        double dx, dy ,dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.tanh(dx);
        dy = Math.tanh(dy);
        dz = Math.tanh(dz);
        dw = Math.tanh(dw);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Return the tangent of the value multiplied by PI of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 tanpi(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.tan(dx * Math.PI);
        dy = Math.tan(dy * Math.PI);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Return the tangent of the value multiplied by PI of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 tanpi(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.tan(dx * Math.PI);
        dy = Math.tan(dy * Math.PI);
        dz = Math.tan(dz * Math.PI);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Return the tangent of the value multiplied by PI of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 tanpi(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.tan(dx * Math.PI);
        dy = Math.tan(dy * Math.PI);
        dz = Math.tan(dz * Math.PI);
        dw = Math.tan(dw * Math.PI);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Returns the absolute value of Int2.
     *
     * @param data
     * @return
     */
    public static Int2 abs(Int2 data) {
        int dx, dy;

        dx = Math.abs(data.x);
        dy = Math.abs(data.y);

        return new Int2(dx, dy);
    }

    /**
     * Returns the absolute value of Int3.
     *
     * @param data
     * @return
     */
    public static Int3 abs(Int3 data) {
        int dx, dy, dz;

        dx = Math.abs(data.x);
        dy = Math.abs(data.y);
        dz = Math.abs(data.z);

        return new Int3(dx, dy, dz);
    }

    /**
     * Returns the absolute value of Int4.
     *
     * @param data
     * @return
     */
    public static Int4 abs(Int4 data) {
        int dx, dy, dz, dw;

        dx = Math.abs(data.x);
        dy = Math.abs(data.y);
        dz = Math.abs(data.z);
        dw = Math.abs(data.w);

        return new Int4(dx, dy, dz, dw);
    }

    /**
     * Returns the absolute value of Short2.
     *
     * @param data
     * @return
     */
    public static Short2 abs(Short2 data) {
        short dx = data.x;
        short dy = data.y;

        dx = (short)(dx < 0 ? -dx : dx);
        dy = (short)(dy < 0 ? -dy : dy);

        return new Short2(dx, dy);
    }

    /**
     * Returns the absolute value of Short3.
     *
     * @param data
     * @return
     */
    public static Short3 abs(Short3 data) {
        short dx = data.x;
        short dy = data.y;
        short dz = data.z;

        dx = (short)(dx < 0 ? -dx : dx);
        dy = (short)(dy < 0 ? -dy : dy);
        dz = (short)(dz < 0 ? -dz : dz);

        return new Short3(dx, dy, dz);
    }

    /**
     * Returns the absolute value of Short4.
     *
     * @param data
     * @return
     */
    public static Short4 abs(Short4 data) {
        short dx = data.x;
        short dy = data.y;
        short dz = data.z;
        short dw = data.w;

        dx = (short)(dx < 0 ? -dx : dx);
        dy = (short)(dy < 0 ? -dy : dy);
        dz = (short)(dz < 0 ? -dz : dz);
        dw = (short)(dw < 0 ? -dw : dw);

        return new Short4(dx, dy, dz, dw);
    }

    /**
     * Returns the absolute value of Byte2.
     *
     * @param data
     * @return
     */
    public static Byte2 abs(Byte2 data) {
        byte dx = data.x;
        byte dy = data.y;

        dx = (byte)(dx < 0 ? -dx : dx);
        dy = (byte)(dy < 0 ? -dy : dy);

        return new Byte2(dx, dy);
    }

    /**
     * Returns the absolute value of Byte3.
     *
     * @param data
     * @return
     */
    public static Byte3 abs(Byte3 data) {
        byte dx = data.x;
        byte dy = data.y;
        byte dz = data.z;

        dx = (byte)(dx < 0 ? -dx : dx);
        dy = (byte)(dy < 0 ? -dy : dy);
        dz = (byte)(dz < 0 ? -dz : dz);

        return new Byte3(dx, dy, dz);
    }

    /**
     * Returns the absolute value of Byte4.
     *
     * @param data
     * @return
     */
    public static Byte4 abs(Byte4 data) {
        byte dx = data.x;
        byte dy = data.y;
        byte dz = data.z;
        byte dw = data.w;

        dx = (byte)(dx < 0 ? -dx : dx);
        dy = (byte)(dy < 0 ? -dy : dy);
        dz = (byte)(dz < 0 ? -dz : dz);
        dw = (byte)(dw < 0 ? -dw : dw);

        return new Byte4(dx, dy, dz, dw);
    }

    /**
     * Compute the gamma function of Float2.
     *
     * @param data
     * @return
     */
    public static Float2 tgamma(Float2 data) {
        double dx, dy;
        dx = data.x;
        dy = data.y;

        dx = Math.sqrt(2*Math.PI/dx)*Math.pow((dx/Math.E), dx);
        dy = Math.sqrt(2*Math.PI/dy)*Math.pow((dy/Math.E), dy);

        return new Float2((float)dx, (float)dy);
    }

    /**
     * Compute the gamma function of Float3.
     *
     * @param data
     * @return
     */
    public static Float3 tgamma(Float3 data) {
        double dx, dy, dz;
        dx = data.x;
        dy = data.y;
        dz = data.z;

        dx = Math.sqrt(2*Math.PI/dx)*Math.pow((dx/Math.E), dx);
        dy = Math.sqrt(2*Math.PI/dy)*Math.pow((dy/Math.E), dy);
        dz = Math.sqrt(2*Math.PI/dz)*Math.pow((dz/Math.E), dz);

        return new Float3((float)dx, (float)dy, (float)dz);
    }

    /**
     * Compute the gamma function of Float4.
     *
     * @param data
     * @return
     */
    public static Float4 tgamma(Float4 data) {
        double dx, dy, dz, dw;
        dx = data.x;
        dy = data.y;
        dz = data.z;
        dw = data.w;

        dx = Math.sqrt(2*Math.PI/dx)*Math.pow((dx/Math.E), dx);
        dy = Math.sqrt(2*Math.PI/dy)*Math.pow((dy/Math.E), dy);
        dz = Math.sqrt(2*Math.PI/dz)*Math.pow((dz/Math.E), dz);
        dw = Math.sqrt(2*Math.PI/dw)*Math.pow((dw/Math.E), dw);

        return new Float4((float)dx, (float)dy, (float)dz, (float)dw);
    }

    /**
     * Round Float to integral using truncation.
     *
     * @param data
     * @return
     */
    public static float trunc(float data) {
        int ix;
        ix = (int)data;

        return (float)ix;
    }

    /**
     * Round Float2 to integral using truncation.
     *
     * @param data
     * @return
     */
    public static Float2 trunc(Float2 data) {
        int ix, iy;
        ix = (int)data.x;
        iy = (int)data.y;

        return new Float2((float)ix, (float)iy);
    }

    /**
     * Round Float3 to integral using truncation.
     *
     * @param data
     * @return
     */
    public static Float3 trunc(Float3 data) {
        int ix, iy, iz;
        ix = (int)data.x;
        iy = (int)data.y;
        iz = (int)data.z;

        return new Float3((float)ix, (float)iy, (float)iz);
    }

    /**
     * Round Float4 to integral using truncation.
     *
     * @param data
     * @return
     */
    public static Float4 trunc(Float4 data) {
        int ix, iy, iz, iw;
        ix = (int)data.x;
        iy = (int)data.y;
        iz = (int)data.z;
        iw = (int)data.w;

        return new Float4((float)ix, (float)iy, (float)iz, (float)iw);
    }

    /**
     * Return the bigger one between ULong.
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong max(ULong a, ULong b) {

        ULong dx = new ULong(a.getValue() > b.getValue() ? a.getValue() : b.getValue());

        return new ULong(dx);
    }

    /**
     * Return the bigger one between ULong2.
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong2 max(ULong2 a, ULong2 b) {

        ULong dx = new ULong(max(a.x, b.x));
        ULong dy = new ULong(max(a.y, b.y));

        return new ULong2(dx, dy);
    }

    /**
     * Return the bigger one between ULong3.
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong3 max(ULong3 a, ULong3 b) {

        ULong dx = new ULong(max(a.x, b.x));
        ULong dy = new ULong(max(a.y, b.y));
        ULong dz = new ULong(max(a.z, b.z));

        return new ULong3(dx, dy, dz);
    }

    /**
     * Return the bigger one between ULong4.
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong4 max(ULong4 a, ULong4 b) {

        ULong dx = new ULong(max(a.x, b.x));
        ULong dy = new ULong(max(a.y, b.y));
        ULong dz = new ULong(max(a.z, b.z));
        ULong dw = new ULong(max(a.w, b.w));

        return new ULong4(dx, dy, dz, dw);
    }

    /**
     * Return the smaller one between Long2.
     *
     * @param a
     * @param b
     * @return
     */
    public static Long2 max(Long2 a, Long2 b) {
        long dx, dy;

        dx = a.x > b.x ? a.x : b.x;
        dy = a.y > b.y ? a.y : b.y;

        return new Long2(dx, dy);
    }

    /**
     * Return the smaller one between Long3.
     *
     * @param a
     * @param b
     * @return
     */
    public static Long3 max(Long3 a, Long3 b) {
        long dx, dy, dz;

        dx = a.x > b.x ? a.x : b.x;
        dy = a.y > b.y ? a.y : b.y;
        dz = a.z > b.z ? a.z : b.z;

        return new Long3(dx, dy, dz);
    }

    /**
     * Return the smaller one between Long4.
     *
     * @param a
     * @param b
     * @return
     */
    public static Long4 max(Long4 a, Long4 b) {
        long dx, dy, dz, dw;

        dx = a.x > b.x ? a.x : b.x;
        dy = a.y > b.y ? a.y : b.y;
        dz = a.z > b.z ? a.z : b.z;
        dw = a.w > b.w ? a.w : b.w;

        return new Long4(dx, dy, dz, dw);
    }

    /**
     * Return the smaller one between ULong.
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong min(ULong a, ULong b) {

        ULong dx = new ULong(a.getValue() < b.getValue() ? a.getValue() : b.getValue());

        return new ULong(dx);
    }

    /**
     * Return the smaller one between ULong2.
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong2 min(ULong2 a, ULong2 b) {

        ULong dx = new ULong(min(a.x, b.x));
        ULong dy = new ULong(min(a.y, b.y));

        return new ULong2(dx, dy);
    }

    /**
     * Return the smaller one between ULong3.
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong3 min(ULong3 a, ULong3 b) {

        ULong dx = new ULong(min(a.x, b.x));
        ULong dy = new ULong(min(a.y, b.y));
        ULong dz = new ULong(min(a.z, b.z));

        return new ULong3(dx, dy, dz);
    }

    /**
     * Return the smaller one between ULong4.
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong4 min(ULong4 a, ULong4 b) {

        ULong dx = new ULong(min(a.x, b.x));
        ULong dy = new ULong(min(a.y, b.y));
        ULong dz = new ULong(min(a.z, b.z));
        ULong dw = new ULong(min(a.w, b.w));

        return new ULong4(dx, dy, dz, dw);
    }

    /**
     * Return the smaller one between Long2.
     *
     * @param a
     * @param b
     * @return
     */
    public static Long2 min(Long2 a, Long2 b) {
        long dx, dy;

        dx = a.x < b.x ? a.x : b.x;
        dy = a.y < b.y ? a.y : b.y;

        return new Long2(dx, dy);
    }

    /**
     * Return the smaller one between Long3.
     *
     * @param a
     * @param b
     * @return
     */
    public static Long3 min(Long3 a, Long3 b) {
        long dx, dy, dz;

        dx = a.x < b.x ? a.x : b.x;
        dy = a.y < b.y ? a.y : b.y;
        dz = a.z < b.z ? a.z : b.z;

        return new Long3(dx, dy, dz);
    }

    /**
     * Return the smaller one between Long4.
     *
     * @param a
     * @param b
     * @return
     */
    public static Long4 min(Long4 a, Long4 b) {
        long dx, dy, dz, dw;

        dx = a.x < b.x ? a.x : b.x;
        dy = a.y < b.y ? a.y : b.y;
        dz = a.z < b.z ? a.z : b.z;
        dw = a.w < b.w ? a.w : b.w;

        return new Long4(dx, dy, dz, dw);
    }

    /**
     * Returns the number of leading 0-bits in x.
     *
     * @param x
     * @return
     */
    public static int clz(int x) {
        int sum = 0;
        for (int i = 1; i <= 32; i++) {
            if ((x & 0x1) == 0) {
                sum++;
            }
            x = x >> 1;
        }

        return sum;
    }

    /**
     * Returns the number of leading 0-bits in Int2.
     *
     * @param data
     * @return
     */
    public static Int2 clz(Int2 data) {
        int dx, dy;
        dx = clz(data.x);
        dy = clz(data.y);

        return new Int2(dx, dy);
    }

    /**
     * Returns the number of leading 0-bits in Int3.
     *
     * @param data
     * @return
     */
    public static Int3 clz(Int3 data) {
        int dx, dy, dz;
        dx = clz(data.x);
        dy = clz(data.y);
        dz = clz(data.z);

        return new Int3(dx, dy, dz);
    }

    /**
     * Returns the number of leading 0-bits in Int4.
     *
     * @param data
     * @return
     */
    public static Int4 clz(Int4 data) {
        int dx, dy, dz, dw;
        dx = clz(data.x);
        dy = clz(data.y);
        dz = clz(data.z);
        dw = clz(data.w);

        return new Int4(dx, dy, dz, dw);
    }

    /**
     * Returns the number of leading 0-bits in x.
     *
     * @param x
     * @return
     */
    public static short clz(short x) {
        short sum = 0;
        for (int i = 1; i <= 16; i++) {
            if ((x & 0x1) == 0) {
                sum++;
            }
            x = (short)(x >> 1);
        }

        return sum;
    }

    /**
     * Returns the number of leading 0-bits in Short2.
     *
     * @param data
     * @return
     */
    public static Short2 clz(Short2 data) {
        short dx, dy;
        dx = clz(data.x);
        dy = clz(data.y);

        return new Short2(dx, dy);
    }

    /**
     * Returns the number of leading 0-bits in Short3.
     *
     * @param data
     * @return
     */
    public static Short3 clz(Short3 data) {
        short dx, dy, dz;
        dx = clz(data.x);
        dy = clz(data.y);
        dz = clz(data.z);

        return new Short3(dx, dy, dz);
    }

    /**
     * Returns the number of leading 0-bits in Short4.
     *
     * @param data
     * @return
     */
    public static Short4 clz(Short4 data) {
        short dx, dy, dz, dw;
        dx = clz(data.x);
        dy = clz(data.y);
        dz = clz(data.z);
        dw = clz(data.w);

        return new Short4(dx, dy, dz, dw);
    }

    /**
     * Returns the number of leading 0-bits in x.
     *
     * @param x
     * @return
     */
    public static byte clz(byte x) {
        byte sum = 0;
        for (int i = 1; i <= 8; i++) {
            if ((x & 0x1) == 0) {
                sum++;
            }
            x = (byte)(x >> 1);
        }

        return sum;
    }

    /**
     * Returns the number of leading 0-bits in Byte2.
     *
     * @param data
     * @return
     */
    public static Byte2 clz(Byte2 data) {
        byte dx, dy;
        dx = clz(data.x);
        dy = clz(data.y);

        return new Byte2(dx, dy);
    }

    /**
     * Returns the number of leading 0-bits in Byte3.
     *
     * @param data
     * @return
     */
    public static Byte3 clz(Byte3 data) {
        byte dx, dy, dz;
        dx = clz(data.x);
        dy = clz(data.y);
        dz = clz(data.z);

        return new Byte3(dx, dy, dz);
    }

    /**
     * Returns the number of leading 0-bits in Byte4.
     *
     * @param data
     * @return
     */
    public static Byte4 clz(Byte4 data) {
        byte dx, dy, dz, dw;
        dx = clz(data.x);
        dy = clz(data.y);
        dz = clz(data.z);
        dw = clz(data.w);

        return new Byte4(dx, dy, dz, dw);
    }

    /**
     * Returns the number of leading 0-bits in UByte.
     *
     * @param data
     * @return
     */
    public static UByte clz(UByte data) {
        char dx = 0;
        char temp = data.getValue();
        for (int i = 1; i <= 8; i++) {
            if ((temp & 0x1) == 0) {
                dx++;
            }
            temp = (char)(temp >> 1);
        }

        return new UByte(dx);
    }

    /**
     * Returns the number of leading 0-bits in UByte2.
     *
     * @param data
     * @return
     */
    public static UByte2 clz(UByte2 data) {
        UByte dx, dy;
        dx = clz(data.x);
        dy = clz(data.y);

        return new UByte2(dx, dy);
    }

    /**
     * Returns the number of leading 0-bits in UByte3.
     *
     * @param data
     * @return
     */
    public static UByte3 clz(UByte3 data) {
        UByte dx, dy, dz;
        dx = clz(data.x);
        dy = clz(data.y);
        dz = clz(data.z);

        return new UByte3(dx, dy, dz);
    }

    /**
     * Returns the number of leading 0-bits in UByte4.
     *
     * @param data
     * @return
     */
    public static UByte4 clz(UByte4 data) {
        UByte dx, dy, dz, dw;
        dx = clz(data.x);
        dy = clz(data.y);
        dz = clz(data.z);
        dw = clz(data.w);

        return new UByte4(dx, dy, dz, dw);
    }

    /**
     * Returns the number of leading 0-bits in UInt.
     *
     * @param data
     * @return
     */
    public static UInt clz(UInt data) {
        long dx = 0;
        long temp = data.getValue();
        for (int i = 1; i <= 32; i++) {
            if ((temp & 0x1) == 0) {
                dx++;
            }
            temp = temp >> 1;
        }

        return new UInt(dx);
    }

    /**
     * Returns the number of leading 0-bits in UInt2.
     *
     * @param data
     * @return
     */
    public static UInt2 clz(UInt2 data) {
        UInt dx, dy;
        dx = clz(data.x);
        dy = clz(data.y);

        return new UInt2(dx, dy);
    }

    /**
     * Returns the number of leading 0-bits in UInt3.
     *
     * @param data
     * @return
     */
    public static UInt3 clz(UInt3 data) {
        UInt dx, dy, dz;
        dx = clz(data.x);
        dy = clz(data.y);
        dz = clz(data.z);

        return new UInt3(dx, dy, dz);
    }

    /**
     * Returns the number of leading 0-bits in UInt4.
     *
     * @param data
     * @return
     */
    public static UInt4 clz(UInt4 data) {
        UInt dx, dy, dz, dw;
        dx = clz(data.x);
        dy = clz(data.y);
        dz = clz(data.z);
        dw = clz(data.w);

        return new UInt4(dx, dy, dz, dw);
    }

    /**
     * Returns the number of leading 0-bits in UShort.
     *
     * @param data
     * @return
     */
    public static UShort clz(UShort data) {
        int dx = 0;
        int temp = data.getValue();
        for (int i = 1; i <= 16; i++) {
            if ((temp & 0x1) == 0) {
                dx++;
            }
            temp = temp >> 1;
        }

        return new UShort(dx);
    }

    /**
     * Returns the number of leading 0-bits in UShort2.
     *
     * @param data
     * @return
     */
    public static UShort2 clz(UShort2 data) {
        UShort dx, dy;
        dx = clz(data.x);
        dy = clz(data.y);

        return new UShort2(dx, dy);
    }

    /**
     * Returns the number of leading 0-bits in UShort3.
     *
     * @param data
     * @return
     */
    public static UShort3 clz(UShort3 data) {
        UShort dx, dy, dz;
        dx = clz(data.x);
        dy = clz(data.y);
        dz = clz(data.z);

        return new UShort3(dx, dy, dz);
    }

    /**
     * Returns the number of leading 0-bits in UShort4.
     *
     * @param data
     * @return
     */
    public static UShort4 clz(UShort4 data) {
        UShort dx, dy, dz, dw;
        dx = clz(data.x);
        dy = clz(data.y);
        dz = clz(data.z);
        dw = clz(data.w);

        return new UShort4(dx, dy, dz, dw);
    }
}
