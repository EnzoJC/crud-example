create database [test-conin];

CREATE TABLE [detalleProgramacion]
(
    [id]            INT IDENTITY (1, 1) not null primary key,
    [CodEmpresa]    INT                 null,
    [NomRuta]       VARCHAR(50)         null,
    [NomEmpresa]    VARCHAR(50)         null,
    [Fecha]         DATE                null default SYSUTCDATETIME(),
    [HoraInicio]    DATETIME            null default SYSUTCDATETIME(),
    [HoraFin]       DATETIME            null,
    [OrigenDestino] VARCHAR(50)         null
);

--select * from detalleProgramacion;

INSERT INTO [detalleProgramacion](CodEmpresa,
                                  NomRuta,
                                  NomEmpresa,
                                  Fecha,
                                  HoraInicio,
                                  HoraFin,
                                  OrigenDestino)
VALUES (25, 301, 'PRUEBAS', '25/04/2022', '08:00:00', '17:30:00', 'SANTO DOMINGO'),
       (25, 301, 'PRUEBAS', '26/04/2022', '08:00:00', '17:30:00', 'SANTO DOMINGO'),
       (25, 301, 'PRUEBAS', '27/04/2022', '07:00:00', '16:00:00', 'SANTO DOMINGO'),
       (25, 301, 'PRUEBAS', '28/04/2022', '06:00:00', '14:00:00', 'SANTO DOMINGO'),
       (25, 301, 'PRUEBAS', '29/04/2022', '05:00:00', '13:00:00', 'SANTO DOMINGO'),
       (25, 301, 'PRUEBAS', '30/04/2022', '05:00:00', '13:00:00', 'SANTO DOMINGO');

GO

CREATE PROCEDURE spListarProgramacionSemanal
AS
BEGIN
    DECLARE @Json nvarchar(MAX) = (
        SELECT CodEmpresa,
               NomRuta,
               NomEmpresa,
               Fecha,
               HoraInicio,
               HoraFin,
               OrigenDestino
        FROM detalleProgramacion
        FOR JSON PATH, ROOT('DetalleProgramacion'));

    SET @Json = '{"Programacion": ' + @Json + '}';

    select @Json;
END;
GO

exec spListarProgramacionSemanal