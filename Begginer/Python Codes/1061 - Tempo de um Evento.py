# Name of the problem: Tempo de um Evento
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1061

diaInicio = str(input())
trash, dia_ini = diaInicio.split(" ")
dia_ini = int(dia_ini)
horario_ini = str(input())
hora_ini, minuto_ini, seg_ini = horario_ini.split(" : ")
hora_ini = int(hora_ini)
minuto_ini = int(minuto_ini)
seg_ini = int(seg_ini)

diaFim = str(input())
trash, dia_fim = diaFim.split(" ")
dia_fim = int(dia_fim)
horario_fim = str(input())
hora_fim, minuto_fim, seg_fim = horario_fim.split(" : ")
hora_fim = int(hora_fim)
minuto_fim = int(minuto_fim)
seg_fim = int(seg_fim)

segundos = seg_fim - seg_ini
minutos = minuto_fim - minuto_ini
horas = hora_fim - hora_ini
dias = dia_fim - dia_ini

if(segundos < 0):
    segundos += 60
    minutos -= 1

if(minutos < 0):
    minutos += 60
    horas -= 1

if(horas < 0):
    horas += 24
    dias -= 1

print(str(dias)+' dia(s)')
print(str(horas)+' hora(s)')
print(str(minutos)+' minuto(s)')
print(str(segundos)+' segundo(s)')    