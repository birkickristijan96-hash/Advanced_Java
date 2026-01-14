package com.itacademy.four.io.reader;

/**
 * da bi kreira Reader moram imati neki input parametar moramo definissati nekakav tip Readera
 *
 * SVE OVO ISPOD JE FACTORY DESIGN PATTERN
 * jeda tip factory dizajn sablona
 *
 * obicno factory metoda ima neki parametar po kojem ce raditi distinkciju
 * ReaderFactory -> ima princip da se razdvaja kreiranje objekata od njihovog koristenja
 */
public class ReaderFactory {

    //vraca varijabli tipa Reader --> koju ne znamo
    public static Reader createReader(ReaderType readerType) {
        //javaa 7 -> input u switch moze biti i enumerirani tip
        switch (readerType){
            case BYTE:
                return new ByteReader();
            case CHAR:
                return new CharacterReader();
            case LINE:
                return new LineReader();
            case OBJECT:
                return new ObjectReader();
            default:
                throw new IllegalArgumentException("Unknown reader type %s".formatted(readerType.getName()));
        }
    }

}




//        if (type == null || type.isBlank()) {
//            throw new IllegalArgumentException("type can not be null or empty");
//        }
//        switch (type.toUpperCase()){
//            case "BYTE":
//                return new ByteReader();
//            case "CHAR":
//                return new CharacterReader();
//            case "LINE":
//                return new LineReader();
//            case "OBJECT":
//                return new ObjectReader();
//            default:
//                throw new IllegalArgumentException("Unknown reader type %s".formatted(type));
//        }

