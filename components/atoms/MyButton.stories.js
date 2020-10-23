export default {
  title: 'Button',
}

export const Default = () => '<MyButton label="default" />'
export const Primary = () => '<MyButton label="primary" color="primary" />'
export const Success = () => '<MyButton label="success" color="success" />'
export const Warning = () => '<MyButton label="warning" color="warning" />'
export const Danger = () => '<MyButton label="danger" color="danger" />'

export const BorderedDefault = () =>
  '<MyButton label="default" :bordered="true" />'
export const BorderedPrimary = () =>
  '<MyButton label="primary" :bordered="true" color="primary" />'
export const BorderedSuccess = () =>
  '<MyButton label="success" :bordered="true" color="success" />'
export const BorderedWarning = () =>
  '<MyButton label="warning" :bordered="true" color="warning" />'
export const BorderedDanger = () =>
  '<MyButton label="danger" :bordered="true" color="danger" />'
