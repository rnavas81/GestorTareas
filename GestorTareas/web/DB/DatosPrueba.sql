/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  rodrigo
 * Created: 9 oct. 2020
 */

INSERT INTO Tareas.Auxiliar (`tipo`,`nombre`,`descripcion`)
VALUES
(1,'Técnico','Nivel básico de usuario'),
(1,'Administrador','Nivel avanzado de usuario'),
(2,'Básico','Nivel de dificultad mas bajo'),
(2,'Medio','Nivel de dificultad medio'),
(2,'Avanzado','Nivel de dificultad mas alto');

INSERT INTO Tareas.Usuarios (`dni`,`tipo`,`username`,`nombre`)
VALUES
('1A',   1, 'Israel',     'Israel'),
('2B',   2, 'Alejandro',  'Alejandro'),
('3C',   1, 'Nestor',     'Nestor'),
('4D',   2, 'Belen',      'Belen'),
('5E',   1, 'Luis',       'Luis'),
('6F',   2, 'Jonathan',   'Jonathan'),
('7G',   1, 'Dario',      'Dario'),
('8H',   2, 'Jorge',      'Jorge'),
('9I',   1, 'Maria',      'Maria'),
('10J',  2, 'Daniel',     'Daniel'),
('11K',  2, 'Rodrigo',    'Rodrigo');

INSERT INTO Tareas.Tareas (`descripcion`,`usuario`,`horasPrev`,`horasEmpl`,`nivelDiff`,`finalizado`)
VALUES 
('Tarea 1',null,0,null,1,0),
('Tarea 2',null,0,null,1,0),
('Tarea 3',null,0,null,1,0),
('Tarea 2','11K',0,null,1,0);

INSERT INTO Tareas.Tareas_Historico (`idTarea`,`usuario`,`fechaInicio`)
VALUES 
(1,null,'2020-09-01'),
(2,'1A','2020-09-01'),
(3,'2B','2020-09-01'),
(4,null,'2020-09-01');

INSERT INTO Tareas.Tareas_Historico (`idTarea`,`usuario`,`fechaInicio`,`fechaFin`,`horasEmpl`)
VALUES 
(4,'7G','2020-09-02','2020-09-02',4),
(4,'8H','2020-09-03','2020-09-04',4),
(4,'8H','2020-09-05',null,null);
