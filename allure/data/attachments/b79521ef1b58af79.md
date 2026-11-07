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
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-53c3719f-14cf-4408-867d-19ab711f5999` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-9f333eb2-051f-47f4-94cb-0d0fc729407a` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-71b1b591-f849-4f35-a698-6e1998664dc8` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-baab63fb-3d6b-423c-a28f-dede3f2b2ac7` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 22 | `qa-8d7f9b62-1f13-44ea-9d2a-85fe511c24a7` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 9 | `qa-6bbcc592-55e3-433f-8424-54796a0ebf9b` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-c8bf8d21-2b8b-4593-9b87-07a56cac5337` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 5 | `qa-10d67e63-799a-4d3e-9061-bcc8ff7630c2` |
| 9 | `GET /v1/credits/balance` | 200 | 12 | `qa-bb662564-8290-45a2-8abd-a221e393aa93` |
| 10 | `POST /v1/conversations` | 402 | 12 | `qa-1af61c9d-12de-43f8-a25f-46db1c6169b6` |
| 11 | `GET /v1/credits/ledger` | 200 | 9 | `qa-73d98e7d-3183-427b-bda8-72de5970d234` |
| 12 | `POST /v1/auth/token` | 200 | 16 | `qa-4de3f39c-e2cc-44e5-afa6-af3a57df6e74` |
| 13 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-9f1f07b3-7206-4137-973e-78ffc78c6ee3` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-025fb24a-4d90-448a-bdc6-cf9aba1d81dc` |
| 15 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-23c18d2a-08fc-4d19-8205-c0431c10caf7` |
| 16 | `POST /v1/auth/token` | 401 | 5 | `qa-c106b00c-b4d3-4c7b-a767-4fb55445c93a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-53c3719f-14cf-4408-867d-19ab711f5999

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53c3719f-14cf-4408-867d-19ab711f5999
Content-Type: application/json

--- request body ---
{"handle":"qa-bcfe8b1e2cd3","displayName":"QA bcfe8b1e2cd3","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-53c3719f-14cf-4408-867d-19ab711f5999
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 8
Location: /v1/accounts/qa-bcfe8b1e2cd3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c3f6ccee-ebc9-43c6-b46f-652e240ccfac","handle":"qa-bcfe8b1e2cd3","displayName":"QA bcfe8b1e2cd3","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.985652350Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9f333eb2-051f-47f4-94cb-0d0fc729407a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f333eb2-051f-47f4-94cb-0d0fc729407a
Content-Type: application/json

--- request body ---
{"handle":"qa-7e436b5ac575","displayName":"QA 7e436b5ac575","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f333eb2-051f-47f4-94cb-0d0fc729407a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 8
Location: /v1/accounts/qa-7e436b5ac575
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9f3002e8-e991-489e-9d63-e8f8ac84c036","handle":"qa-7e436b5ac575","displayName":"QA 7e436b5ac575","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.000708835Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-71b1b591-f849-4f35-a698-6e1998664dc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71b1b591-f849-4f35-a698-6e1998664dc8
Content-Type: application/json

--- request body ---
{"handle":"qa-bcfe8b1e2cd3","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-71b1b591-f849-4f35-a698-6e1998664dc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c3f6ccee-ebc9-43c6-b46f-652e240ccfac"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-baab63fb-3d6b-423c-a28f-dede3f2b2ac7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-baab63fb-3d6b-423c-a28f-dede3f2b2ac7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7e436b5ac575","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-baab63fb-3d6b-423c-a28f-dede3f2b2ac7
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
Location: /v1/conversations/cnv_d0f537e6-3b89-4724-b369-c9c43d589129
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d0f537e6-3b89-4724-b369-c9c43d589129","subject":"Error contract","status":"open","region":"eu","participants":["qa-bcfe8b1e2cd3","qa-7e436b5ac575"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:59.055095405Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_d0f537e6-3b89-4724-b369-c9c43d589129/messages
correlation: qa-8d7f9b62-1f13-44ea-9d2a-85fe511c24a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d7f9b62-1f13-44ea-9d2a-85fe511c24a7
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 22 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d7f9b62-1f13-44ea-9d2a-85fe511c24a7
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

{"id":"msg_321276d2-25da-41b7-83a3-14ea6145a364","conversationId":"cnv_d0f537e6-3b89-4724-b369-c9c43d589129","sender":"qa-bcfe8b1e2cd3","body":"2","createdAt":"2026-11-07T08:54:59.083713859Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_d0f537e6-3b89-4724-b369-c9c43d589129/messages
correlation: qa-6bbcc592-55e3-433f-8424-54796a0ebf9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bbcc592-55e3-433f-8424-54796a0ebf9b
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bbcc592-55e3-433f-8424-54796a0ebf9b
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

{"id":"msg_f3b24ac5-f12e-4129-8499-5fd70b2a7bf3","conversationId":"cnv_d0f537e6-3b89-4724-b369-c9c43d589129","sender":"qa-bcfe8b1e2cd3","body":"3","createdAt":"2026-11-07T08:54:59.101858754Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_d0f537e6-3b89-4724-b369-c9c43d589129/messages
correlation: qa-c8bf8d21-2b8b-4593-9b87-07a56cac5337

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8bf8d21-2b8b-4593-9b87-07a56cac5337
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8bf8d21-2b8b-4593-9b87-07a56cac5337
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

{"id":"msg_f8d9dad0-40f8-47cd-8c59-20dde58d1611","conversationId":"cnv_d0f537e6-3b89-4724-b369-c9c43d589129","sender":"qa-bcfe8b1e2cd3","body":"4","createdAt":"2026-11-07T08:54:59.113435673Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_d0f537e6-3b89-4724-b369-c9c43d589129/messages
correlation: qa-10d67e63-799a-4d3e-9061-bcc8ff7630c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10d67e63-799a-4d3e-9061-bcc8ff7630c2
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-10d67e63-799a-4d3e-9061-bcc8ff7630c2
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

{"id":"msg_e8e73245-41b8-463c-89cf-0700cfaf8385","conversationId":"cnv_d0f537e6-3b89-4724-b369-c9c43d589129","sender":"qa-bcfe8b1e2cd3","body":"5","createdAt":"2026-11-07T08:54:59.129972887Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-bb662564-8290-45a2-8abd-a221e393aa93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb662564-8290-45a2-8abd-a221e393aa93
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb662564-8290-45a2-8abd-a221e393aa93
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

{"balance":0,"currency":"credits","accountId":"acc_c3f6ccee-ebc9-43c6-b46f-652e240ccfac"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-1af61c9d-12de-43f8-a25f-46db1c6169b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1af61c9d-12de-43f8-a25f-46db1c6169b6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7e436b5ac575","subject":"One more","message":"Hi"}

--- response: 402 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1af61c9d-12de-43f8-a25f-46db1c6169b6
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-1af61c9d-12de-43f8-a25f-46db1c6169b6"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-73d98e7d-3183-427b-bda8-72de5970d234

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73d98e7d-3183-427b-bda8-72de5970d234
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-73d98e7d-3183-427b-bda8-72de5970d234
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

{"items":[{"id":"led_d1eaaa16-8059-4f26-a9ff-5e343a56346b","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-07T08:54:58.985659912Z"},{"id":"led_1795ea92-9c72-4b8d-a110-aaae50ddb902","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_d0f537e6-3b89-4724-b369-c9c43d589129","createdAt":"2026-11-07T08:54:59.055074623Z"},{"id":"led_3bc1ab76-37ef-4e9f-af73-023b86a03d73","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_321276d2-25da-41b7-83a3-14ea6145a364","createdAt":"2026-11-07T08:54:59.083699277Z"},{"id":"led_66a6a95b-e206-4b55-9147-21ab2f56cd96","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_f3b24ac5-f12e-4129-8499-5fd70b2a7bf3","createdAt":"2026-11-07T08:54:59.101851332Z"},{"id":"led_10e88cf3-7a8a-4af9-9467-d6bf612fa5b7","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_f8d9dad0-40f8-47cd-8c59-20dde58d1611","createdAt":"2026-11-07T08:54:59.113427651Z"},{"id":"led_903b2751-27a2-442b-bc75-3bc248656b83","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_e8e73245-41b8-463c-89cf-0700cfaf8385","createdAt":"2026-11-07T08:54:59.129964214Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-4de3f39c-e2cc-44e5-afa6-af3a57df6e74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4de3f39c-e2cc-44e5-afa6-af3a57df6e74
Content-Type: application/json

--- request body ---
{"handle":"qa-7e436b5ac575","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-4de3f39c-e2cc-44e5-afa6-af3a57df6e74
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9f3002e8-e991-489e-9d63-e8f8ac84c036"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9f1f07b3-7206-4137-973e-78ffc78c6ee3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f1f07b3-7206-4137-973e-78ffc78c6ee3
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9f1f07b3-7206-4137-973e-78ffc78c6ee3
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
correlation: qa-025fb24a-4d90-448a-bdc6-cf9aba1d81dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-025fb24a-4d90-448a-bdc6-cf9aba1d81dc
Content-Type: application/json

--- request body ---
{"handle":"qa-7e436b5ac575","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-025fb24a-4d90-448a-bdc6-cf9aba1d81dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-025fb24a-4d90-448a-bdc6-cf9aba1d81dc"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-23c18d2a-08fc-4d19-8205-c0431c10caf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23c18d2a-08fc-4d19-8205-c0431c10caf7
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-23c18d2a-08fc-4d19-8205-c0431c10caf7
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
correlation: qa-c106b00c-b4d3-4c7b-a767-4fb55445c93a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c106b00c-b4d3-4c7b-a767-4fb55445c93a
Content-Type: application/json

--- request body ---
{"handle":"qa-bcfe8b1e2cd3","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c106b00c-b4d3-4c7b-a767-4fb55445c93a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c106b00c-b4d3-4c7b-a767-4fb55445c93a"}
```
