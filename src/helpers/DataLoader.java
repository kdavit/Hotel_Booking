package helpers;

import model.Hotel;
import model.Room;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {

    public static List<Hotel> listLoader() throws IOException {
        Workbook workbook = WorkbookFactory.create(new File("C:/Users/David/Desktop/Hotel-Booking.xlsx"));
        List<Hotel> hotelList = new ArrayList<>();
        Sheet sheet = workbook.getSheetAt(0);

        for (int rn = 1; rn <= sheet.getLastRowNum(); rn++) {
            Row row = sheet.getRow(rn);
            hotelList.add(new Hotel(row.getCell(1).getStringCellValue(),
                    row.getCell(2).getStringCellValue(),
                    row.getCell(3).getStringCellValue(),
                    row.getCell(4).getNumericCellValue()));
            }


        Sheet sheetR = workbook.getSheetAt(1);
        for(int rn = 1; rn <= sheetR.getLastRowNum(); rn++)
        {
            Row row = sheetR.getRow(rn);
            Room room = new Room();

            room.setNumber(row.getCell(0).getNumericCellValue());
            room.setPrice(row.getCell(1).getNumericCellValue());
            hotelList.get(((int)row.getCell(2).getNumericCellValue()-1)).addRoom(room);

        }

        workbook.close();
        return hotelList;
    }

}

