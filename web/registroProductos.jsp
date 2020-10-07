
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>productos</title>
    </head>
    <body>
    <from action="Producto" method="post">
        <center> <table border="0" cellspacing="1">
                <tr>
                <h1 colspain="12" align="center">Registro de productos</h1> 
                </tr>

                <tr>
                    <td>producto</td>
                    <td><input type="text" name="producto"></td>               
                </tr>

                <tr>
                    <td>existencia:</td>
                    <td><input type="text" name="existencia"></td>               
                </tr>
                
                <tr>
                    <td>categoria</td>
                    <td><select name="categoria"
                    <option>ingles</option>
                    <option>aymara</option>
                    <option selected>chino mandarin></option>
                    </select>
                    </td>     
                </tr>
                <tr>
                    <td>precio:</td>
                    <td><input typoe="float" name=´precio></td>
                </tr>
                <tr>
                    <td colspain="2" align="center"><input typoe="submit" value=´Enbiar> </td>
                </tr>
                
            </table>

        </center>

    </from>
</body>
</html>
