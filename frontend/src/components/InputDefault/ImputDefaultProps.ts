import { InputHTMLAttributes, ReactNode } from "react";

export interface ImputDefaultProps
  extends InputHTMLAttributes<
    HTMLInputElement | HTMLSelectElement | HTMLTextAreaElement
  > {
  id?: string;
  label: string;
  type: "text" | "password" | "number" | "textarea" | "select" | "search";
  iscolor?: boolean;
  icon?: boolean;
  isbgcolor?: string;
  hasError?: boolean;
  children?: ReactNode;
  className?: string;
}
