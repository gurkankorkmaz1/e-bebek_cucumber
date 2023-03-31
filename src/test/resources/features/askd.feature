Feature: E-bebekk
  Scenario: Sepete urun ekleyip kayit olma
    Given Uygulamayı ac
    And Kategoriye tiklanir
    And Giyim tekstil tiklanir
    And Bebek coraplari tiklanir
    And Filtrelere tiklanir
    And Filtrele tiklanir
    And Stoktakilere tiklanir
    And Uygulaya tiklanir
    And Urunleri gor tiklanir
    And Ilk urune tiklanir
    And Ilk beden secilip sepete eklenir
    And Urun sayisi bir arttirilir
    And Sepete gidilir
    And Urun sayisi bir arttitilirr
    And Alisverisi tamamlaya tiklanir
    And Uyeliksiz alisverise gidip bilgiler doldurulur
    And uye olmadan devam et tiklanir
    And Yeni adres ekleye tiklanir
    And Adres bilgileri girilir kaydedilir
    And Faturami teslimat adresine gondere tiklanip devam et tiklanir
    When Odeme bilgileri girilir
    Then sozlesme kabul et tiklanir
