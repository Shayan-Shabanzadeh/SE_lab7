## گزارش کار : 

#### در این آزمایش مطابق با پروژه نمونه قرار داده شده، در ابتدا تعدادی تست به پروژه از پیش اماده افزودیم. این تست ها عبارت اند از تست های service و تست های repository
#### در این پروژه ترتیب تست ها حائز اهمیت بود چرا که در ابتدا توابع service اجرا می شوند و در هنگام اجرای این توابع متعلق به service، توابع repository فراخوانی می شوند. توابع repository در صورت نیاز باقی توابع را فراخوانی می کنند.

#### از این رو در ابتدای امر تست های مربوط به service را کامل کردیم. به این صورت که service دارای چهار تابع است. این توابع عبارت بودند از update، delete، get، insert. از بین این چهار تابع تنها برای تابع insert تست نویسی شده بود که ما برای سه تابع دیگر تست نویسی را کامل کردیم

#### دو نوع تست در این پروژه لحاظ شد که یکی برای مواقعی است که تمام موارد عملکرد صحیح داشته باشند و دیگری برای ناموفق بودن تست ها. به عبارتی هم تست های موفق برای pass شدن و هم ناموفق برای fail شدن قرار داده شده اند
#### در گام دوم، همین روند را برای repositoriy اجرا کردیم. یعنی در ابتدا تست های لازم برای pass شدن و موفق بودن توابع به پروژه اضافه شدند و سپس تست های لازم برای ناموفق بودن و fail شدن تست ها به پروژه افزوده شدند

#### در نهایت با بالا رفتن پوشش تعداد تست این دو کلاس، میزان پوشش دهی با تست پروژه افزایش یافت و تغییر چشم گیری داشت. تغییرات اعمال شده به شکل مستند، مربوط به قبل و بعد تست نویسی پروژه در فایلی مجزا به نام pictures در کنار پروژه افزوده شده و همچنین در فایلی به نام coverage-report گزارشی از پوشش تست قرار داده شده است.


---
## نویسندگان:
 - شایان شعبانزاده ۹۸۱۷۰۸۸۴
 - عطا رحیم زاده ۹۸۱۷۰۸۰۵


