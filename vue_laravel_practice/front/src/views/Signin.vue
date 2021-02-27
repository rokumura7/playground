<template>
  <div class="h-full flex justify-center items-center">
    <div class="border rounded">
      <CardHeader label="SIGN IN" />
      <form class="p-5 space-y-5">
        <div>
          <MyInput
            type="email"
            placeholder="email"
            @change-value="changeEmail"
          />
        </div>
        <div>
          <MyInput
            type="password"
            placeholder="password"
            @change-value="changePassword"
          />
        </div>
        <div class="text-right">
          <MyButton label="SIGN IN" @click="signin" />
        </div>
        <div class="text-right border-t pt-5">
          <router-link to="/signup"><MyButton label="SIGN UP" /></router-link>
        </div>
      </form>
    </div>
  </div>
</template>

<script lang="ts">
import { defineComponent, reactive } from 'vue'
import { useRouter } from 'vue-router'
import { MyButton, MyInput, CardHeader } from '@/components/atoms'
import { post } from '@/helpers/Http'

export default defineComponent({
  name: 'Signin',
  components: { MyButton, MyInput, CardHeader },
  setup() {
    const router = useRouter()
    const state = reactive({
      email: '',
      password: '',
    })

    const changeEmail = (email: string) => (state.email = email)
    const changePassword = (password: string) => (state.password = password)

    const signin = async () => {
      const res = await post('login', state)
      if (res.status === 200) {
        router.push('/home')
      }
    }
    return {
      state,
      changeEmail,
      changePassword,
      signin,
    }
  },
})
</script>
