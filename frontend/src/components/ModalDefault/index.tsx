import Styles from "./styles.module.scss";
import { FaTimes } from "react-icons/fa";
import { ReactNode } from "react";
import { ButtonDefault } from "../ButtonDefault";

type ModalDefault = {
  children: ReactNode;
  title: string;
  subtitle?: string;
  openModal?: () => void;
  handleCloseModal: () => void;
  id?: string;
  className?: string;
};

const ModalDefault: React.FC<ModalDefault> = ({
  children,
  className,
  title,
  subtitle,
  id = "modal",
  handleCloseModal,
}) => {
  const handleOutSideClick = (e: any) => {
    if (e.target.id === id) handleCloseModal();
  };
  return (
    <>
      <div
        onClick={handleOutSideClick}
        id={id}
        className={`${Styles.modal__container_background}`}
      >
        <div className={`${Styles.modal__container} ${className}`}>
          <div className={`${Styles.modal__header} ${className}`}>
            <h3 className={`${className}`}>{title}</h3>
            <ButtonDefault
              id="close"
              type="button"
              size="full"
              onClick={handleCloseModal}
              className={`${className}`}
            >
              <FaTimes className="fa fa-times"></FaTimes>
            </ButtonDefault>
          </div>
          <div className={`${Styles.modal__content} ${className}`}>
            <p className={`${className}`}>{subtitle ? subtitle : ""}</p>
            <form className={`${Styles.modal__form}`}>{children}</form>
          </div>
        </div>
      </div>
    </>
  );
};

export { ModalDefault };
