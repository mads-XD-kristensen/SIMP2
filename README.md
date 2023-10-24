# SIMP2

## Authors:

Kasper, Mathias, Maria og Mads

## Task B

Vi har prøvet at lave en løsning med Camunda til task b, handling of customer complaints.

Diagrammet herunder viser et scenario af, hvordan en klage bliver indtastet. Alt efter hvilke requirements der er til
klager, så er der måske brug for noget mere information (kommer an på kravene der er sat af virksomheden).

Måske skal en manager endda kigge på klagen, og de kan muligvis løse den, eller måske kan klagen løses uden problemer
af en medarbejder. Alt efter hvordan klagen kommer igennem flowet, er der to forskellige udfald (klage løst eller klage
ikke løst). I begge tilfælde vil indberetteren af klagen bliver gjort opmærksom via mail omkring, hvad der så kommer til
at ske.

![image](https://github.com/mads-XD-kristensen/SIMP2/assets/56347572/66eddb44-e0e3-4302-9607-ea8da3f85212)
