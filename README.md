# Dakar Terrain (NeoForge 1.21.1)
Compilar:  gradle wrapper (o copia gradlew de la MDK oficial) y luego  ./gradlew build
El jar queda en build/libs/. Ponerlo en /mods y elegir el tipo de mundo "Rally Dakar (Terreno suave)".

Ajustes rapidos (src/main/resources/data/dakar_terrain/worldgen/):
- density_function/terrain_raw.json: "argument1": 1.2 = altura de las colinas (menor = mas plano); 0.03 = micro-relieve.
- noise/hills.json: firstOctave -9 = ondas de 512 bloques (-10 = 1024, aun mas suave).
- noise/temperature|vegetation.json: firstOctave -13 = biomas enormes (-14 = el doble).
- density_function/temperature.json: 0.5 = base de temperatura (mas alto = mas desierto/sabana).

Montanas suaves:
- density_function/mountains.json: "argument1": 14.0 = altura maxima (14 ~ 40 bloques; 25 ~ 70). El resultado es siempre de pendiente baja.
- noise/mountains.json: firstOctave -11 = macizos de ~2000 bloques de ancho (-12 = aun mas anchos y suaves).
- Si quieres menos montanas, sube el -0.08 (ej. 0.1): aparecen menos macizos.
