import Tarjeta from './Tarjeta';
import styles from './Tarjeta.module.css';

const ListaDeTarjetas = ({ animales }) => {
  return (
    <div className={styles.lista}>
      {animales.map((animal, index) => (
        <Tarjeta 
          key={index}
          fotos={animal.fotos}
          nombre={animal.nombre}
          direccion={animal.zona}  
          genero={animal.mascotaEspecie}
          edad={animal.mascotaEdad}
        />
      ))}
    </div>
  );
};

export default ListaDeTarjetas;
