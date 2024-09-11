import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min.js';
import React, { useState, useEffect } from 'react';
import { useParams } from 'react-router-dom';
import axios from 'axios';
import Swal from 'sweetalert2';
import { format, parseISO } from 'date-fns';
import { es } from 'date-fns/locale';

const formatDate = (dateString) => {
    const date = parseISO(dateString);
    return format(date, "eeee d MMMM yyyy", { locale: es });
};

const Detail = () => {
    // Petición al backend de una publicación
    const { id } = useParams();
    const [publicacion, setPublicacion] = useState(null);

    useEffect(() => {
        console.log('ID:', id);
        if (id) {
            const fetchData = async () => {
                try {
                    const response = await axios.get(`http://localhost:3000/api/v1/publications/findById/${id}`);
                    console.log('Publicación:', response.data);
                    setPublicacion(response.data);
                } catch (error) {
                    console.error('Error fetching data:', error);
                }
            };

            fetchData();
        } else {
            console.error('ID is undefined');
        }
    }, [id]);

    // Configuración del Modal
    const handleContact = () => {
        Swal.fire({
            title: "<strong>debe estar Registrado</strong>",
            icon: "info",
            showCloseButton: true,
            showCancelButton: true,
            focusConfirm: false,
            confirmButtonText: `Entrar`,
            confirmButtonAriaLabel: "Thumbs up, great!",
            cancelButtonText: `Registrarme`,
            cancelButtonAriaLabel: "Thumbs down"
        });
    };

    // Retorno temprano si `publicacion` es null
    if (!publicacion) {
        return <div>Cargando publicación...</div>;
    }

    const fechaFormateada = formatDate(publicacion.fecha);

    // Detalle de la publicación
    return (
        <div className="container d-flex justify-content-center">
            <div className="card m-3" style={{ maxWidth: '540px' }}>
                <div className="row g-0">

                    <div className="col-md-4">
                        <div id="carouselExampleFade" className="carousel slide carousel-fade">
                            <div className="carousel-inner">
                                {publicacion.fotos && publicacion.fotos.map((foto, index) => (
                                    <div className={`carousel-item ${index === 0 ? 'active' : ''}`} key={index}>
                                        <img src={foto} className="d-block w-100" alt={`Foto ${index}`} />
                                    </div>
                                ))}

                                {!publicacion.fotos && (
                                    <div className="carousel-item active">
                                        <img src="/mascota-home.jpg" className="d-block w-100" alt="Imagen por defecto" />
                                    </div>
                                )}
                            </div>
                            <button className="carousel-control-prev" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="prev">
                                <span className="carousel-control-prev-icon" aria-hidden="true"></span>
                                <span className="visually-hidden">Previous</span>
                            </button>
                            <button className="carousel-control-next" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="next">
                                <span className="carousel-control-next-icon" aria-hidden="true"></span>
                                <span className="visually-hidden">Next</span>
                            </button>
                        </div>
                    </div>

                    <div className="col-md-8">
                        <div className="card-body">
                            <h5 className="card-title">Mi nombre es {publicacion.mascota_nombre}</h5>
                            <p className="card-text">
                                {publicacion.mascota_descripcion}
                            </p>
                            <p className="card-text">
                                <small className="text-body-secondary">Se perdio: {fechaFormateada}</small>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
};

export default Detail;