import axios, { AxiosResponse } from 'axios'

type Method = 'GET' | 'POST' | 'PUT' | 'DELETE'

const client = axios.create({
  baseURL: 'http://127.0.0.1:8000/api/v1',
})
client.interceptors.request.use((config) => {
  config.headers['X-CSRF-TOKEN'] = window.Laravel.csrfToken
  config.headers['X-Requested-With'] = 'XMLHttpRequest'
  config.headers['Authorization'] = `Bearer ${localStorage.getItem(
    'jwt-token'
  )}`
  return config
})
axios.interceptors.response.use(
  (response) => {
    const token = response.headers['Authorization'] || response.data['token']
    if (token) {
      localStorage.setItem('jwt-token', token)
    }
    return response
  },
  (error) => {
    console.log(error)
    return Promise.reject(error)
  }
)

export const get = async <T>(uri: string): Promise<AxiosResponse> =>
  await client.get<T>(uri)

export const post = async (
  uri: string,
  json: { [key: string]: string }
): Promise<AxiosResponse> => await client.post(uri, json)

export const put = async (
  uri: string,
  json: { [key: string]: string }
): Promise<AxiosResponse> => await client.put(uri, json)

export const del = async (
  uri: string,
  json: { [key: string]: string }
): Promise<AxiosResponse> => await client.delete(uri, json)
