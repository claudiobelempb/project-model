import Router, { useRouter } from 'next/router';

import axios, { AxiosRequestConfig } from 'axios';

import { HeaderDsMovie } from 'components/HeaderDsMovie';
import { ButtonDefault } from 'components/ButtonDefault';
import { toast } from 'react-toastify';

import styles from './styles.module.scss';

import { InputDefault } from 'components/InputDefault';
import { Movie } from 'types/Movie';
import { FormEvent, useEffect, useState } from 'react';
import { api } from 'services/api';
import { validateEmail } from 'utils/validateEmail';

const Valuation: React.FC = () => {
  const router = useRouter();

  const { id } = router.query;
  const [movie, setMovie] = useState<Movie>();

  useEffect(() => {
    if (!id) {
      return;
    }

    const fetchSomethingById = async () => {
      api.get(`/movies/${id}`).then(resp => {
        const data = resp.data as Movie;
        setMovie(data);
      });
    };
    fetchSomethingById();
  }, [id]);

  const handleSubmit = (event: FormEvent) => {
    event.preventDefault();

    const email = (event.target as any).email.value;
    const score = (event.target as any).score.value;

    if (!validateEmail(email)) {
      toast.error('Email inválido!');
      return;
    }

    const config: AxiosRequestConfig = {
      baseURL: `https://surb-sdmovie.herokuapp.com/api`,
      method: 'PUT',
      url: `/scores/${id}`,
      data: {
        email,
        id,
        score
      }
    };

    axios(config)
      .then(resp => {
        toast.success('Avaliação realizada com sucesso!');
        Router.push('/');
        return;
      })
      .catch(errr => {
        toast.error('Error tente novamente!');
      });
  };

  return (
    <div className=''>
      <HeaderDsMovie title='Avaliação' />
      <main className={`container`}>
        <section className={`content ${styles.valuation__container}`}>
          <article className={`${styles.valuation__container_card}`}>
            <img src={movie?.image} alt={movie?.title} />
            <div className={`${styles.valuation__container_card_content}`}>
              <h2>
                {movie?.title} - {movie?.id}
              </h2>

              <form onSubmit={handleSubmit}>
                <InputDefault
                  label='Informe seu email'
                  type='text'
                  className='bgcolor__gray_200 bgcolor__gray_200_border'
                  placeholder='Informe seu email'
                  id='email'
                />
                <InputDefault
                  label='Informe sua avaliação'
                  type='select'
                  className='bgcolor__gray_200 bgcolor__gray_200_border'
                  placeholder='Informe sua avaliação'
                  id='score'
                >
                  <option value='1'>1</option>
                  <option value='2'>2</option>
                  <option value='3'>3</option>
                  <option value='4'>4</option>
                  <option value='5'>5</option>
                </InputDefault>

                <ButtonDefault
                  title='Salvar'
                  size='small'
                  type='submit'
                  className='bgcolor__blue_400'
                />
              </form>
              <ButtonDefault
                title='Cancelar'
                size='link'
                type='button'
                className='bgcolor__blue_400'
                href={'/'}
              />
            </div>
          </article>
        </section>
      </main>
    </div>
  );
};

export default Valuation;
