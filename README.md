# 🎲 Dice App
![메인화면](https://github.com/user-attachments/assets/420d4ba8-3e3b-40ba-a4a0-44092b59a19e)

간단한 2개 주사위 앱입니다.  
버튼을 누르면 두 개의 주사위가 랜덤하게 굴러가며, 결과가 화면에 표시됩니다.

---

## 주요 구현 포인트

### 1. DataBinding 사용

- **build.gradle 설정**  
  `android` 블록에 dataBinding을 활성화해야 합니다.
```
android {
...
    dataBinding {
        enable = true
    }
}
```
- **레이아웃 최상단에 `<layout>` 태그**  
DataBinding을 사용하려면 레이아웃 XML 파일의 최상단을 `<layout>` 태그로 감싸야 합니다.
![image](https://github.com/user-attachments/assets/4bdc7158-784e-4477-88ac-18b976eb18ec)

### 2. Log 찍는 법
- 디버깅을 위해 Log 사용
```
Log.d("MainActivity", number1.toString())
Log.d("MainActivity", number2.toString())
```
<img width="422" alt="image" src="https://github.com/user-attachments/assets/db75babf-3687-4b01-9ac5-16c9b863f600" />

- Logcat에서 태그("MainActivity")로 주사위 숫자 결과 확인 가능

### 3. layout_weight와 weightSum으로 간격 벌리기
```
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="200dp"
    android:weightSum="2">

    <ImageView
        android:id="@+id/dice1"
        ...
        android:layout_weight="1"/>

    <ImageView
        android:id="@+id/dice2"
        ...
        android:layout_weight="1"/>
</LinearLayout>

```
![메인화면](https://github.com/user-attachments/assets/25a1b026-510d-44df-9ca9-a3b3bc270c44)

- weightSum="2" : 전체 LinearLayout의 가중치 합을 2로 설정

- 각 ImageView에 layout_weight="1" : 두 이미지가 동일한 비율로 공간을 차지

### 4. AppCompatButton 사용
```
<androidx.appcompat.widget.AppCompatButton
    android:id="@+id/diceStartBtn"
    android:text="인생 고고"
    android:layout_width="match_parent"
    android:background="@color/black"
    android:textColor="@color/white"
    android:layout_margin="50dp"
    android:layout_height="50dp"/>

```
- AppCompatButton을 사용하면 android:background 속성이 머티리얼 테마에서도 정상적으로 동작
# References
[왕초보편] 앱 8개를 만들면서 배우는 안드로이드 코틀린(Android Kotlin)
https://www.inflearn.com/course/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EC%BD%94%ED%8B%80%EB%A6%B0-%EB%AA%A8%EB%B0%94%EC%9D%BC%EC%95%B1/dashboard
