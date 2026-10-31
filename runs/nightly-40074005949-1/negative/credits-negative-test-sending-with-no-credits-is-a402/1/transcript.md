# Transcript: With no credits left, a message is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#sendingWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-048111e7-aa89-4b5b-b949-30dcadf3b235` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-0013c06e-9b41-492b-82ee-e5fe810a27d3` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-192ac28c-e30e-4d8c-9c38-4c21c57fafa6` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-0f9db1d0-4bd7-431a-8ae4-d0bc988e35cb` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 15 | `qa-2dacccd8-13e2-46bd-ac16-774c40684c15` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-feebaa2e-28bf-4d10-8bc2-c02e4b67905b` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 8 | `qa-c21f6ca7-5c75-4a5e-a512-23165e34aa81` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 21 | `qa-81842b6a-7269-4f8d-a36a-db72ae20dbd9` |
| 9 | `GET /v1/credits/balance` | 200 | 5 | `qa-b32b4021-3223-4f11-bfc2-537a744de3d4` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 11 | `qa-429ca953-58b2-4919-9b13-0a67558e935e` |
| 11 | `GET /v1/credits/ledger` | 200 | 28 | `qa-0195d2f7-5f87-4ee1-a268-5a5a97abe97f` |
| 12 | `POST /v1/auth/token` | 200 | 10 | `qa-e7bfa43c-9571-4978-baa4-6451e84f706d` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-c501cdb2-0257-4a00-b65b-93fba533d7c9` |
| 14 | `POST /v1/auth/token` | 401 | 7 | `qa-5015b304-5f7f-4cf7-9258-c12d37ad82f9` |
| 15 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-19b8ad25-3b13-4733-8fb6-55b80f39d877` |
| 16 | `POST /v1/auth/token` | 401 | 13 | `qa-0b1e3071-027a-4ede-a19d-aebdaab5f7c7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-048111e7-aa89-4b5b-b949-30dcadf3b235

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-048111e7-aa89-4b5b-b949-30dcadf3b235
Content-Type: application/json

--- request body ---
{"handle":"qa-ab2cdeaa6e47","displayName":"QA ab2cdeaa6e47","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-048111e7-aa89-4b5b-b949-30dcadf3b235
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 9
Location: /v1/accounts/qa-ab2cdeaa6e47
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bbd15d81-942c-4bea-aaeb-5118f9bb9c12","handle":"qa-ab2cdeaa6e47","displayName":"QA ab2cdeaa6e47","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.483862685Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0013c06e-9b41-492b-82ee-e5fe810a27d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0013c06e-9b41-492b-82ee-e5fe810a27d3
Content-Type: application/json

--- request body ---
{"handle":"qa-99931de87d17","displayName":"QA 99931de87d17","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0013c06e-9b41-492b-82ee-e5fe810a27d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Location: /v1/accounts/qa-99931de87d17
X-Served-Region: eu
Content-Length: 181

{"id":"acc_94324476-a1ca-47f3-b11c-ad510c9534a7","handle":"qa-99931de87d17","displayName":"QA 99931de87d17","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.506582786Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-192ac28c-e30e-4d8c-9c38-4c21c57fafa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-192ac28c-e30e-4d8c-9c38-4c21c57fafa6
Content-Type: application/json

--- request body ---
{"handle":"qa-ab2cdeaa6e47","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-192ac28c-e30e-4d8c-9c38-4c21c57fafa6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bbd15d81-942c-4bea-aaeb-5118f9bb9c12"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0f9db1d0-4bd7-431a-8ae4-d0bc988e35cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f9db1d0-4bd7-431a-8ae4-d0bc988e35cb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-99931de87d17","subject":"Many messages","message":"1"}

--- response: 201 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f9db1d0-4bd7-431a-8ae4-d0bc988e35cb
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
Location: /v1/conversations/cnv_65f15d12-f1e0-4bf7-bd7e-2bb4d682d058
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_65f15d12-f1e0-4bf7-bd7e-2bb4d682d058","subject":"Many messages","status":"open","region":"eu","participants":["qa-ab2cdeaa6e47","qa-99931de87d17"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:02.579439713Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_65f15d12-f1e0-4bf7-bd7e-2bb4d682d058/messages
correlation: qa-2dacccd8-13e2-46bd-ac16-774c40684c15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dacccd8-13e2-46bd-ac16-774c40684c15
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-2dacccd8-13e2-46bd-ac16-774c40684c15
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

{"id":"msg_4796ff16-4a1d-48fa-b809-17227e17f052","conversationId":"cnv_65f15d12-f1e0-4bf7-bd7e-2bb4d682d058","sender":"qa-ab2cdeaa6e47","body":"2","createdAt":"2026-10-24T07:25:02.620662236Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_65f15d12-f1e0-4bf7-bd7e-2bb4d682d058/messages
correlation: qa-feebaa2e-28bf-4d10-8bc2-c02e4b67905b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-feebaa2e-28bf-4d10-8bc2-c02e4b67905b
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-feebaa2e-28bf-4d10-8bc2-c02e4b67905b
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

{"id":"msg_c326309a-8ae0-478a-9e72-388978452c84","conversationId":"cnv_65f15d12-f1e0-4bf7-bd7e-2bb4d682d058","sender":"qa-ab2cdeaa6e47","body":"3","createdAt":"2026-10-24T07:25:02.646551983Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_65f15d12-f1e0-4bf7-bd7e-2bb4d682d058/messages
correlation: qa-c21f6ca7-5c75-4a5e-a512-23165e34aa81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c21f6ca7-5c75-4a5e-a512-23165e34aa81
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c21f6ca7-5c75-4a5e-a512-23165e34aa81
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

{"id":"msg_e2eca2e1-576b-44cf-ad94-26a538b428d7","conversationId":"cnv_65f15d12-f1e0-4bf7-bd7e-2bb4d682d058","sender":"qa-ab2cdeaa6e47","body":"4","createdAt":"2026-10-24T07:25:02.661044361Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_65f15d12-f1e0-4bf7-bd7e-2bb4d682d058/messages
correlation: qa-81842b6a-7269-4f8d-a36a-db72ae20dbd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81842b6a-7269-4f8d-a36a-db72ae20dbd9
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 21 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-81842b6a-7269-4f8d-a36a-db72ae20dbd9
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

{"id":"msg_8f17815f-f0d6-45fb-85f9-f4d030161ac3","conversationId":"cnv_65f15d12-f1e0-4bf7-bd7e-2bb4d682d058","sender":"qa-ab2cdeaa6e47","body":"5","createdAt":"2026-10-24T07:25:02.682125420Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-b32b4021-3223-4f11-bfc2-537a744de3d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b32b4021-3223-4f11-bfc2-537a744de3d4
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-b32b4021-3223-4f11-bfc2-537a744de3d4
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

{"balance":0,"currency":"credits","accountId":"acc_bbd15d81-942c-4bea-aaeb-5118f9bb9c12"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_65f15d12-f1e0-4bf7-bd7e-2bb4d682d058/messages
correlation: qa-429ca953-58b2-4919-9b13-0a67558e935e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-429ca953-58b2-4919-9b13-0a67558e935e
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-429ca953-58b2-4919-9b13-0a67558e935e
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
Content-Length: 320

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_65f15d12-f1e0-4bf7-bd7e-2bb4d682d058/messages","correlationId":"qa-429ca953-58b2-4919-9b13-0a67558e935e"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-0195d2f7-5f87-4ee1-a268-5a5a97abe97f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0195d2f7-5f87-4ee1-a268-5a5a97abe97f
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0195d2f7-5f87-4ee1-a268-5a5a97abe97f
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

{"items":[{"id":"led_3e02bc36-81ff-4d2b-9861-a8b6adba0044","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-24T07:25:02.483876597Z"},{"id":"led_07e3d539-7e72-4dc2-bc0f-c7980d9b7f2c","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_65f15d12-f1e0-4bf7-bd7e-2bb4d682d058","createdAt":"2026-10-24T07:25:02.579188872Z"},{"id":"led_d557cd90-4084-49d9-a05c-d6f1f7bc0dea","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_4796ff16-4a1d-48fa-b809-17227e17f052","createdAt":"2026-10-24T07:25:02.620637908Z"},{"id":"led_8316c4fd-d7da-41c0-8670-8c568f7d1961","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_c326309a-8ae0-478a-9e72-388978452c84","createdAt":"2026-10-24T07:25:02.646527865Z"},{"id":"led_51316b3d-73fc-4bbe-ac28-98712c60fd2a","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_e2eca2e1-576b-44cf-ad94-26a538b428d7","createdAt":"2026-10-24T07:25:02.661015176Z"},{"id":"led_f944a70e-37cb-434f-91db-f619d651dc5e","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_8f17815f-f0d6-45fb-85f9-f4d030161ac3","createdAt":"2026-10-24T07:25:02.682096344Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-e7bfa43c-9571-4978-baa4-6451e84f706d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7bfa43c-9571-4978-baa4-6451e84f706d
Content-Type: application/json

--- request body ---
{"handle":"qa-99931de87d17","password":"****"}

--- response: 200 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7bfa43c-9571-4978-baa4-6451e84f706d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_94324476-a1ca-47f3-b11c-ad510c9534a7"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c501cdb2-0257-4a00-b65b-93fba533d7c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c501cdb2-0257-4a00-b65b-93fba533d7c9
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c501cdb2-0257-4a00-b65b-93fba533d7c9
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
correlation: qa-5015b304-5f7f-4cf7-9258-c12d37ad82f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5015b304-5f7f-4cf7-9258-c12d37ad82f9
Content-Type: application/json

--- request body ---
{"handle":"qa-99931de87d17","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5015b304-5f7f-4cf7-9258-c12d37ad82f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5015b304-5f7f-4cf7-9258-c12d37ad82f9"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-19b8ad25-3b13-4733-8fb6-55b80f39d877

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19b8ad25-3b13-4733-8fb6-55b80f39d877
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-19b8ad25-3b13-4733-8fb6-55b80f39d877
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
correlation: qa-0b1e3071-027a-4ede-a19d-aebdaab5f7c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b1e3071-027a-4ede-a19d-aebdaab5f7c7
Content-Type: application/json

--- request body ---
{"handle":"qa-ab2cdeaa6e47","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0b1e3071-027a-4ede-a19d-aebdaab5f7c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0b1e3071-027a-4ede-a19d-aebdaab5f7c7"}
```
