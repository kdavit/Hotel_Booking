import Models.Hotel;
import Models.Room;
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
            Hotel hotel = new Hotel();

            for (int cn = 1; cn < row.getLastCellNum(); cn++) {
                Cell c = row.getCell(cn);
                switch (cn) {
                    case 1:
                        hotel.setName(c.getStringCellValue());
                        break;
                    case 2:
                        hotel.setCountry(c.getStringCellValue());
                        break;
                    case 3:
                        hotel.setCity(c.getStringCellValue());
                        break;
                   case 4:
                        hotel.setStars(c.getNumericCellValue());
                        break;
                }
            }
            hotelList.add(hotel);
        }

        Sheet sheetR = workbook.getSheetAt(1);
        for(int rn = 1; rn <= sheetR.getLastRowNum(); rn++)
        {
            Row row = sheetR.getRow(rn);
            Room room = new Room();

            for(int cn = 0;cn < row.getLastCellNum(); cn++)
            {
                Cell c = row.getCell(cn);
                switch (cn)
                {
                    case 0:
                        room.setNumber(c.getNumericCellValue());
                        break;
                    case 1:
                        room.setPrice(c.getNumericCellValue());
                        break;
                    case 2:
                        hotelList.get(((int)Math.floor(c.getNumericCellValue()-1))).addRoom(room);
                        break;
                }
            }
        }

        workbook.close();
        return hotelList;
    }

}
