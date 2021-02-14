<template>
  <div>Hello World.</div>
  <HelloWorld msg="Hi!" />
</template>

<script lang="ts">
import { defineComponent } from 'vue'
import HelloWorld from '@/components/HelloWorld.vue'

export default defineComponent({
  name: 'Signup',
  components: HelloWorld,
})
</script>
