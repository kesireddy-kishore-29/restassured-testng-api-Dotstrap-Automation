# Transcript: With no credits left, starting a conversation is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#startingAConversationWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-85156f06-8133-4241-94a6-98dd72797b62` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-f8828d6a-0fc7-40c8-8f21-94883d22402a` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-58c1437d-d9d5-4a19-9a36-b4988946476a` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-33e122f2-3a9e-4733-afd5-469b79ad8686` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 21 | `qa-217eba41-5a09-4238-81e5-77ca66a8859e` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 35 | `qa-374eee02-8812-4b83-b8c5-7961994d8d99` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 23 | `qa-ae203127-19fc-40a2-8f17-d1b202b3e25c` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 21 | `qa-5bb20f76-1008-4d63-94dd-06d77305644a` |
| 9 | `GET /v1/credits/balance` | 200 | 22 | `qa-7d1d021a-a8a8-4899-9eb0-b71d576bd026` |
| 10 | `POST /v1/conversations` | 402 | 7 | `qa-cefa6640-0fba-4740-b063-067530f068a5` |
| 11 | `GET /v1/credits/ledger` | 200 | 12 | `qa-6edb6175-50d0-4874-a7c5-0d2ea6cdebdc` |
| 12 | `POST /v1/auth/token` | 200 | 13 | `qa-fc55d542-bba2-46ee-b2d6-f2099922dd00` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-797a15ed-a6dd-47c8-b873-2e2a1e5be8fe` |
| 14 | `POST /v1/auth/token` | 401 | 5 | `qa-9d9cef7e-6061-4202-a7b5-52a7f767bbce` |
| 15 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-3fda021f-e0eb-4d67-99b9-494ce776b8fe` |
| 16 | `POST /v1/auth/token` | 401 | 15 | `qa-707dfc74-a92d-4e13-97be-a57e661fde02` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-85156f06-8133-4241-94a6-98dd72797b62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85156f06-8133-4241-94a6-98dd72797b62
Content-Type: application/json

--- request body ---
{"handle":"qa-5cca2deba65a","displayName":"QA 5cca2deba65a","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-85156f06-8133-4241-94a6-98dd72797b62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 9
Location: /v1/accounts/qa-5cca2deba65a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a5f3ec7-9987-4138-b0be-11ceab98edd3","handle":"qa-5cca2deba65a","displayName":"QA 5cca2deba65a","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.948427540Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f8828d6a-0fc7-40c8-8f21-94883d22402a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8828d6a-0fc7-40c8-8f21-94883d22402a
Content-Type: application/json

--- request body ---
{"handle":"qa-b77439abbc3f","displayName":"QA b77439abbc3f","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8828d6a-0fc7-40c8-8f21-94883d22402a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 8
Location: /v1/accounts/qa-b77439abbc3f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d664ff9-8fa7-4e46-9e77-4f952ea0c6ea","handle":"qa-b77439abbc3f","displayName":"QA b77439abbc3f","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.980934397Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-58c1437d-d9d5-4a19-9a36-b4988946476a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58c1437d-d9d5-4a19-9a36-b4988946476a
Content-Type: application/json

--- request body ---
{"handle":"qa-5cca2deba65a","password":"****"}

--- response: 200 in 29 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-58c1437d-d9d5-4a19-9a36-b4988946476a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9a5f3ec7-9987-4138-b0be-11ceab98edd3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-33e122f2-3a9e-4733-afd5-469b79ad8686

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33e122f2-3a9e-4733-afd5-469b79ad8686
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b77439abbc3f","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-33e122f2-3a9e-4733-afd5-469b79ad8686
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_cd219a68-56e8-46e3-95c0-9487e8d85178
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cd219a68-56e8-46e3-95c0-9487e8d85178","subject":"Error contract","status":"open","region":"eu","participants":["qa-5cca2deba65a","qa-b77439abbc3f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:03.052094803Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_cd219a68-56e8-46e3-95c0-9487e8d85178/messages
correlation: qa-217eba41-5a09-4238-81e5-77ca66a8859e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-217eba41-5a09-4238-81e5-77ca66a8859e
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-217eba41-5a09-4238-81e5-77ca66a8859e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_2328fa5f-c052-4a12-b963-beffa577e18c","conversationId":"cnv_cd219a68-56e8-46e3-95c0-9487e8d85178","sender":"qa-5cca2deba65a","body":"2","createdAt":"2026-11-04T09:28:03.085342673Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_cd219a68-56e8-46e3-95c0-9487e8d85178/messages
correlation: qa-374eee02-8812-4b83-b8c5-7961994d8d99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-374eee02-8812-4b83-b8c5-7961994d8d99
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 35 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-374eee02-8812-4b83-b8c5-7961994d8d99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_e19a5a35-aa96-4262-b8a1-34b4714fa18e","conversationId":"cnv_cd219a68-56e8-46e3-95c0-9487e8d85178","sender":"qa-5cca2deba65a","body":"3","createdAt":"2026-11-04T09:28:03.119668708Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_cd219a68-56e8-46e3-95c0-9487e8d85178/messages
correlation: qa-ae203127-19fc-40a2-8f17-d1b202b3e25c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae203127-19fc-40a2-8f17-d1b202b3e25c
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae203127-19fc-40a2-8f17-d1b202b3e25c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_ea4f65a4-7332-46d3-9d1c-9a8e930ea551","conversationId":"cnv_cd219a68-56e8-46e3-95c0-9487e8d85178","sender":"qa-5cca2deba65a","body":"4","createdAt":"2026-11-04T09:28:03.174251097Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_cd219a68-56e8-46e3-95c0-9487e8d85178/messages
correlation: qa-5bb20f76-1008-4d63-94dd-06d77305644a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bb20f76-1008-4d63-94dd-06d77305644a
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bb20f76-1008-4d63-94dd-06d77305644a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_658e551a-5d77-4287-a926-b888541c9e6d","conversationId":"cnv_cd219a68-56e8-46e3-95c0-9487e8d85178","sender":"qa-5cca2deba65a","body":"5","createdAt":"2026-11-04T09:28:03.207381735Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-7d1d021a-a8a8-4899-9eb0-b71d576bd026

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d1d021a-a8a8-4899-9eb0-b71d576bd026
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d1d021a-a8a8-4899-9eb0-b71d576bd026
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":0,"currency":"credits","accountId":"acc_9a5f3ec7-9987-4138-b0be-11ceab98edd3"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-cefa6640-0fba-4740-b063-067530f068a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cefa6640-0fba-4740-b063-067530f068a5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b77439abbc3f","subject":"One more","message":"Hi"}

--- response: 402 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cefa6640-0fba-4740-b063-067530f068a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 270

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-cefa6640-0fba-4740-b063-067530f068a5"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-6edb6175-50d0-4874-a7c5-0d2ea6cdebdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6edb6175-50d0-4874-a7c5-0d2ea6cdebdc
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6edb6175-50d0-4874-a7c5-0d2ea6cdebdc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 1169

{"items":[{"id":"led_d009449a-4ce5-42dd-bea8-23c9014771c6","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-04T09:28:02.948436083Z"},{"id":"led_9a5cf146-5419-4af1-83fa-360ddba5b1ed","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_cd219a68-56e8-46e3-95c0-9487e8d85178","createdAt":"2026-11-04T09:28:03.052074703Z"},{"id":"led_8b2450f8-c538-4c75-8550-944d9bc5ad6e","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_2328fa5f-c052-4a12-b963-beffa577e18c","createdAt":"2026-11-04T09:28:03.085335081Z"},{"id":"led_60d6be1b-3b21-4348-94b2-0a559708962c","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_e19a5a35-aa96-4262-b8a1-34b4714fa18e","createdAt":"2026-11-04T09:28:03.119655198Z"},{"id":"led_b73cd69b-142f-4154-90be-54f9582f8d6d","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_ea4f65a4-7332-46d3-9d1c-9a8e930ea551","createdAt":"2026-11-04T09:28:03.174236064Z"},{"id":"led_a67fd219-00b5-48b4-ae2d-4c17f556d15d","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_658e551a-5d77-4287-a926-b888541c9e6d","createdAt":"2026-11-04T09:28:03.207376106Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-fc55d542-bba2-46ee-b2d6-f2099922dd00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc55d542-bba2-46ee-b2d6-f2099922dd00
Content-Type: application/json

--- request body ---
{"handle":"qa-b77439abbc3f","password":"****"}

--- response: 200 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc55d542-bba2-46ee-b2d6-f2099922dd00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5d664ff9-8fa7-4e46-9e77-4f952ea0c6ea"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-797a15ed-a6dd-47c8-b873-2e2a1e5be8fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-797a15ed-a6dd-47c8-b873-2e2a1e5be8fe
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-797a15ed-a6dd-47c8-b873-2e2a1e5be8fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-9d9cef7e-6061-4202-a7b5-52a7f767bbce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d9cef7e-6061-4202-a7b5-52a7f767bbce
Content-Type: application/json

--- request body ---
{"handle":"qa-b77439abbc3f","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d9cef7e-6061-4202-a7b5-52a7f767bbce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9d9cef7e-6061-4202-a7b5-52a7f767bbce"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3fda021f-e0eb-4d67-99b9-494ce776b8fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fda021f-e0eb-4d67-99b9-494ce776b8fe
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3fda021f-e0eb-4d67-99b9-494ce776b8fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
```

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-707dfc74-a92d-4e13-97be-a57e661fde02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-707dfc74-a92d-4e13-97be-a57e661fde02
Content-Type: application/json

--- request body ---
{"handle":"qa-5cca2deba65a","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-707dfc74-a92d-4e13-97be-a57e661fde02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-707dfc74-a92d-4e13-97be-a57e661fde02"}
```
