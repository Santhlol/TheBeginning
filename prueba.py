import pandas as pd
df = pd.read_csv('resultados (1).csv')
def resultados_Saber11_2019_2S(df: pd.DataFrame):
    # Calcular promedio nacional en matemáticas
    nacional_math = df['PUNT_MATEMATICAS'].mean()

    # Calcular promedio en matemáticas en Barranquilla
    barranquilla_math = df[df['ESTU_DEPTO_RESIDE'] == 'ATLANTICO']['PUNT_MATEMATICAS'].mean()

    # Calcular quiénes obtuvieron mejor resultado en matemáticas, colegios oficiales o no oficiales
    promedio_oficiales = df[df['COLE_DEPTO_UBICACION'] == df['ESTU_DEPTO_RESIDE']]['PUNT_MATEMATICAS'].mean()
    promedio_no_oficiales = df[df['COLE_DEPTO_UBICACION'] != df['ESTU_DEPTO_RESIDE']]['PUNT_MATEMATICAS'].mean()

    if promedio_oficiales > promedio_no_oficiales:
        mejor_resultado = (promedio_oficiales, 'oficial')
    else:
        mejor_resultado = (promedio_no_oficiales, 'no oficial')

    # Determinar si el mayor promedio es local o nacional
        performance_math = (max(nacional_math, barranquilla_math), 'nacional' if nacional_math > barranquilla_math else 'local')
        
    # Crear el diccionario de resultados y retornarlo
    resultados = {'nacional_math': nacional_math, 'performance_math': performance_math, 'mejor_resultado': mejor_resultado}
    return resultados 

resultados = resultados_Saber11_2019_2S(df)
print(resultados)





