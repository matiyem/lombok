package com.example.lombok.intro;

/*
    created by Atiye Mousavi
    Date: 2/28/2022
    Time: 5:12 PM
*/

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import java.net.URL;
import java.time.Duration;
import java.time.Instant;

@RequiredArgsConstructor
@Accessors(fluent = true)
@Getter
@EqualsAndHashCode(of = {"authToken"})
public class LoginResult {
//    هنگامی که حاشیه نویسی @RequiredArgsConstructor را اضافه می کنیم، یک سازنده برای تمام فیلدهای نهایی در کلاس، درست همانطور که آنها را اعلام کردیم، دریافت خواهیم کرد. افزودن @NonNull به صفت‌ها باعث می‌شود سازنده ما پوچ‌پذیری را بررسی کند و NullPointerExceptions را بر اساس آن پرتاب کند. همچنین اگر فیلدها غیر نهایی بودند و @Setter را برای آنها اضافه می کردیم، این اتفاق می افتاد.
//
//آیا ما فرم خسته کننده get*() را برای ویژگی های خود می خواهیم؟ از آنجایی که ما @Accessors(fluent=true) را در این مثال اضافه کردیم، "getters" همان نام متد را با ویژگی ها خواهد داشت. getAuthToken() به سادگی تبدیل به authToken ().
//
//این فرم "روان" برای فیلدهای غیر نهایی برای تنظیم‌کننده‌های ویژگی اعمال می‌شود، و همچنین امکان تماس‌های زنجیره‌ای را فراهم می‌کند:

//    زمان که متد ()toString کاربر خود را فراخوانی می‌کنیم، کل لیست رویدادها حذف شود، فقط به این دلیل که از حاشیه‌نویسی @ToString استفاده کرده‌ایم. درعوض، می‌توانیم آن را مانند این پارامتر کنیم، @ToString(exclude = {“رویدادها”})، و این اتفاق نخواهد افتاد. این همچنین برای جلوگیری از ارجاعات دایره ای مفید است اگر، برای مثال، UserEvents ارجاعی به یک کاربر داشته باشد.
//
//برای مثال LoginResult، ممکن است بخواهیم برابری و محاسبه کد هش را فقط بر اساس خود توکن و نه سایر ویژگی‌های نهایی کلاس خود تعریف کنیم. سپس می توانیم به سادگی چیزی مانند @EqualsAndHashCode (of = {“authToken”}) بنویسیم.
    private final @NonNull Instant loginTs;
    private final @NonNull String authToken;
    private final @NonNull Duration tokenValidity;
    private final @NonNull URL tokenRefreshUrl;
}
