import  { useState } from 'react'
import styles from './Tarjeta.module.css';

const Tarjeta = ({ fotos, nombre, direccion, genero, edad }) => {
  const imagen = fotos.length > 0 ? fotos[0] : '/perro.jpg'; // Imagen por defecto si no hay fotos

  return (
    <div className={styles.tarjeta}>
      <img src={imagen} alt={nombre} className={styles.foto} />
      <div className={styles.info}>
        <h2 className={styles.nombre}>{nombre}</h2>
        <p className={styles.direccion}><strong>Dirección:</strong> {direccion}</p>
        <p className={styles.genero}><strong>Tipo:</strong> {genero}</p>
        <p className={styles.edad}><strong>Edad:</strong> {edad} años</p>
      </div>
    </div>
  );
};


export default Tarjeta;
