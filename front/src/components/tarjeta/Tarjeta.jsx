import  { useState } from 'react'
import styles from './Tarjeta.module.css';
import { Link } from 'react-router-dom';

const Tarjeta = ({ publicacion }) => {


  
  return (
		<Link to={`/detail/${publicacion.id}`} className={styles.tarjeta}>
			<img src={publicacion.fotos[0]} alt={publicacion.mascota_nombre} className={styles.foto} />
			<div className={styles.info}>
				<h2 className={styles.nombre}>{publicacion.mascota_nombre}</h2>
				<p className={styles.direccion}>
					<strong>Dirección:</strong> {publicacion.zona}
				</p>
				{/* <p className={styles.genero}>
						<strong>Tipo:</strong> {publicacion.mascota_especie}
					</p> */}
				{/* <p className={styles.edad}>
						<strong>Edad:</strong> {edad} años
					</p> */}
				<p className={styles.edad}>
					
					<strong>Fecha:</strong> {publicacion.fecha}
				</p>
			</div>
		</Link>
	)

};


export default Tarjeta;
