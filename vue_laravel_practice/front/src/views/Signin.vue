<template>
  <div class="h-full flex justify-center items-center">
    <div class="border rounded">
      <CardHeader label="SIGN IN" />
      <form class="p-5 space-y-5">
        <div>
          <MyInput type="email" placeholder="email" />
        </div>
        <div>
          <MyInput type="password" placeholder="password" />
        </div>
        <div class="text-right">
          <MyButton label="SIGN IN" />
        </div>
        <div class="text-right border-t pt-5">
          <router-link to="/signup"><MyButton label="SIGN UP" /></router-link>
        </div>
      </form>
    </div>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue'
import { MyButton, MyInput, CardHeader } from '@/components/atoms'

export default defineComponent({
  name: 'Signin',
  components: { MyButton, MyInput, CardHeader },
})
</script>
